package com.seata.instance.common.qo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author wyh
 * @Description
 * @createTime 2022年10月30日 10:24:00
 */
@Data
@ApiModel(value = "登录入参")
public class UserLoginQO implements Serializable {
    /** 登录名 */
    @ApiModelProperty(value = "账号")
    @NotNull(message = "账号不能为空!")
    private String LoginName;

    /** 密码 采用MD5加密方式 */
    @ApiModelProperty(value = "密码 采用MD5加密方式")
    @NotNull(message = "密码不能为空!")
    private String password;

    /** 验证码 */
    @ApiModelProperty(value = "验证码")
    @NotNull(message = "验证码不能为空!")
    private String captcha;

    /** 验证码密钥 */
    @ApiModelProperty(value = "验证码密钥")
    @NotNull(message = "验证码密钥不能为空!")
    private String captchaKey;
}
