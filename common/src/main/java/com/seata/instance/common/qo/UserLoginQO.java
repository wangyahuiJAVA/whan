package com.seata.instance.common.qo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author wyh
 * @Description
 * @createTime 2022年10月30日 10:24:00
 */
@Data
public class UserLoginQO implements Serializable {
    /** 登录名 */
    private String LoginName;

    /** 密码 采用MD5加密方式 */
    private String password;

    /** 验证码 */
    private String captcha;

    /** 验证码密钥 */
    private String captchaKey;
}
