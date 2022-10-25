package com.seata.instance.order.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.seata.instance.common.model.order.OrderProduct;
import com.seata.instance.order.mapper.OrderProductMapper;
import com.seata.instance.order.service.OrderProductService;
import org.springframework.stereotype.Service;

/**
 * @author wyh
 * @Description
 * @createTime 2022年10月20日 20:44:00
 */
@Service
public class OrderProductServiceImpl extends ServiceImpl<OrderProductMapper, OrderProduct> implements OrderProductService {
}
