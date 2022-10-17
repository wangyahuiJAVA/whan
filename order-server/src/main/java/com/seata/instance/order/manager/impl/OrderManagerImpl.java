package com.seata.instance.order.manager.impl;

import com.seata.instance.order.manager.OrderManager;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.io.Serializable;

/**
 * @author wyh
 * @Description
 * @createTime 2022年10月03日 19:23:00
 */
@Component
public class OrderManagerImpl implements OrderManager {
    @Resource
    RedisTemplate<String, Serializable> redisTemplate;
}
