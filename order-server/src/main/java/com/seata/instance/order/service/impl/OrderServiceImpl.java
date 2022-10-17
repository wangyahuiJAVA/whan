package com.seata.instance.order.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.seata.instance.common.model.order.Order;
import com.seata.instance.common.qo.OrderQO;
import com.seata.instance.common.vo.OrderVO;
import com.seata.instance.order.manager.OrderManager;
import com.seata.instance.order.mapper.OrderMapper;
import com.seata.instance.order.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

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

    private volatile Integer totalNum = 0;

    @Override
    public IPage<OrderVO> getOrderList(OrderQO orderQO) {
        IPage<OrderVO> orderVOPage = new Page<>();
        Page page = new Page<>(orderQO.getPageNum(),orderQO.getPageSize());
        LambdaQueryWrapper<Order> orderLambdaQueryWrapper = new LambdaQueryWrapper<>();
        orderLambdaQueryWrapper.eq(StringUtils.isNotEmpty(orderQO.getOrderCode()),Order::getOrderCode,orderQO.getOrderCode());
        IPage<Order> orderPage = this.page(page, orderLambdaQueryWrapper);
        BeanUtils.copyProperties(orderPage,orderVOPage);
        orderVOPage.setRecords(JSONArray.parseArray(JSONObject.toJSONString(orderPage.getRecords()),OrderVO.class));
        // Feign调用查询商品信息

        // 模拟产生的数据
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        // 线程同步--因为线程同步的时候才可以调用wait()方法
        synchronized (this){
            list.forEach(number->{
                if (totalNum < 10){
                    sendMsg(number);
                    totalNum ++;
                }else {
                    try {
                        log.info("线程等待开始");
                        this.wait(2000);
                        log.info("结束线程等待");
                        sendMsg(number);
                        totalNum = 0;
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        return orderVOPage;
    }

    public void sendMsg(int i){
        System.out.println(DateTimeFormatter.ofPattern("HH:mm:ss").format(LocalDateTime.now())
                +"---------"+i);
    }
}
