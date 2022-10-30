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
    private String LoginName;

    private String password;

    private String captcha;

    private String captchaKey;
}
