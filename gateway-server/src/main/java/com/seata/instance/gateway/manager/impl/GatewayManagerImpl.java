package com.seata.instance.gateway.manager.impl;

import com.seata.instance.gateway.manager.GatewayManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.time.Duration;

/**
 * @author wyh
 * @Description
 * @createTime 2022年11月01日 19:05:00
 */
@Component
@Slf4j
public class GatewayManagerImpl implements GatewayManager {
    @Autowired
    private RedisTemplate redisTemplate;
    @Override
    public Boolean saveHeadMessage(String id, String target) {
        redisTemplate.opsForValue().set(id,target, Duration.ofSeconds(60));
        return true;
    }
}
