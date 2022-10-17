package com.seata.instance.order.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.seata.instance.common.model.order.Order;
import com.seata.instance.common.qo.OrderQO;
import com.seata.instance.common.vo.OrderVO;

/**
 * @author wyh
 * @Description
 * @createTime 2022年09月29日 15:19:00
 */
public interface OrderService extends IService<Order> {
    /**
     * 分页查询订单信息
     * @param orderQO 查询条件
     * @return 订单分页数据
     */
    IPage<OrderVO> getOrderList(OrderQO orderQO);
}
