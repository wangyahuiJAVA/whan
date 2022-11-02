package com.seata.instance.common.base;

/**
 * @author wyh
 * @Description redis键前缀常量
 * @createTime 2022年10月30日 10:56:00
 */
public class RedisKeyConstants {
    /** 验证码前缀 */
    public static final String CAPTCHA_PREFIX = "captcha";
    /** 验证码超时时间 */
    public static final Long CAPTCHA_TIMEOUT = 300L;
    /** 网关超时时间 */
    public static final Long GATEWAY_TIMEOUT = 60L;
}
