package com.seata.instance.common.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author wyh
 * @Description 验证码返回实体
 * @createTime 2022年10月30日 10:33:00
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CaptchaVO implements Serializable {
    /** 验证码图片 */
    private String captchaBase;

    /** 验证码密钥 */
    private String captchaKey;

    /** 验证码 */
    private String captcha;
}
