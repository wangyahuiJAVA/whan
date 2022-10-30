package com.seata.instance.auth.manager;

/**
 * @author wyh
 * @Description
 * @createTime 2022年10月30日 10:51:00
 */
public interface LoginManager {
    /**
     * 存储验证码到redis
     * @param key key
     * @param captcha value
     */
    Boolean setCaptcha(String key,String captcha);
}
