package com.seata.instance.order.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.seata.instance.common.api.product.SKuApi;
import com.seata.instance.common.base.Result;
import com.seata.instance.common.model.order.Order;
import com.seata.instance.common.model.order.OrderProduct;
import com.seata.instance.common.model.product.Sku;
import com.seata.instance.common.qo.OrderQO;
import com.seata.instance.common.qo.SkuListByIdsQO;
import com.seata.instance.common.vo.OrderVO;
import com.seata.instance.order.manager.OrderManager;
import com.seata.instance.order.mapper.OrderMapper;
import com.seata.instance.order.mapper.OrderProductMapper;
import com.seata.instance.order.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author wyh
 * @Description
 * @createTime 2022年09月29日 15:27:00
 */
@Service
@Slf4j
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private OrderManager orderManager;

    @Autowired
    private SKuApi sKuApi;

    @Autowired
    private OrderProductMapper orderProductMapper;

    @Override
    public IPage<OrderVO> getOrderList(OrderQO orderQO) {
        IPage<OrderVO> orderVOPage = new Page<>();
        Page page = new Page<>(orderQO.getPageNum(),orderQO.getPageSize());
        LambdaQueryWrapper<Order> orderLambdaQueryWrapper = new LambdaQueryWrapper<>();
        orderLambdaQueryWrapper.eq(StringUtils.isNotEmpty(orderQO.getOrderCode()),Order::getOrderCode,orderQO.getOrderCode());
        IPage<Order> orderPage = this.page(page, orderLambdaQueryWrapper);
        BeanUtils.copyProperties(orderPage,orderVOPage);
        orderVOPage.setRecords(JSONArray.parseArray(JSONObject.toJSONString(orderPage.getRecords()),OrderVO.class));
        if (orderPage.getRecords() != null && orderPage.getRecords().size() > 0) {
            // Feign调用查询商品信息
            LambdaQueryWrapper<OrderProduct> orderProductLambdaQueryWrapper = new LambdaQueryWrapper();
            orderProductLambdaQueryWrapper.select(OrderProduct::getOrderId,OrderProduct::getSkuId)
                    .in(OrderProduct::getOrderId, orderVOPage.getRecords().stream().map(OrderVO::getId).collect(Collectors.toList()));
            List<OrderProduct> orderProducts = orderProductMapper.selectList(orderProductLambdaQueryWrapper);
            Result<List<Sku>> skuListByIds = sKuApi.getSkuListByIds(new SkuListByIdsQO(new ArrayList<>(orderProducts.stream().map(OrderProduct::getSkuId).collect(Collectors.toSet()))));
//            skuListByIds.getData().stream()
        }
        return orderVOPage;
    }

}
