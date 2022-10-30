package com.seata.instance.auth.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.seata.instance.common.model.auth.User;
import com.seata.instance.common.qo.UserLoginQO;
import com.seata.instance.common.vo.CaptchaVO;
import com.seata.instance.common.vo.UserLoginVO;

/**
 * @author wyh
 * @Description
 * @createTime 2022年10月06日 10:57:00
 */
public interface LoginService extends IService<User> {

    /**
     * 登录
     * @param userLoginQO 请求参数
     * @return 用户信息
     */
    UserLoginVO login(UserLoginQO userLoginQO);

    /**
     * 获取验证码
     * @return 验证码信息
     */
    CaptchaVO getCaptcha();
}
