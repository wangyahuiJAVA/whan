package com.seata.instance.auth.manager.impl;

import com.seata.instance.auth.manager.LoginManager;
import com.seata.instance.common.base.RedisKeyConstants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.time.Duration;


/**
 * @author wyh
 * @Description
 * @createTime 2022年10月30日 10:51:00
 */
@Component
@Slf4j
public class LoginManagerImpl implements LoginManager {
    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public Boolean setCaptcha(String key, String captcha) {
        key = RedisKeyConstants.CAPTCHA_PREFIX + key;
        redisTemplate.opsForValue().set(key,captcha, Duration.ofSeconds(RedisKeyConstants.CAPTCHA_TIMEOUT));
        return true;
    }
}
