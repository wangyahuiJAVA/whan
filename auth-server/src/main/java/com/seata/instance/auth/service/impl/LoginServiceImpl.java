package com.seata.instance.auth.service.impl;

import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.LineCaptcha;
import cn.hutool.core.lang.UUID;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.seata.instance.auth.manager.LoginManager;
import com.seata.instance.auth.mapper.UserMapper;
import com.seata.instance.auth.service.LoginService;
import com.seata.instance.common.model.auth.User;
import com.seata.instance.common.qo.UserLoginQO;
import com.seata.instance.common.vo.CaptchaVO;
import com.seata.instance.common.vo.UserLoginVO;
import cn.hutool.captcha.generator.RandomGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

/**
 * @author wyh
 * @Description
 * @createTime 2022年10月06日 11:09:00
 */
@Service
public class LoginServiceImpl extends ServiceImpl<UserMapper, User> implements LoginService {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private LoginManager loginManager;

    @Override
    public UserLoginVO login(UserLoginQO userLoginQO) {
        // TODO 请完善以下需求
        // 校验验证码
        // 判断用户名是否存在
        // 判断密码是否正确
        // 查询权限信息（暂不做）
        // 生成authToken
        // 保存redis数据
        return null;
    }

    @Override
    public CaptchaVO getCaptcha() {
        String uuid = UUID.fastUUID().toString();
        RandomGenerator randomGenerator = new RandomGenerator("0123456789", 4);
        LineCaptcha lineCaptcha = CaptchaUtil.createLineCaptcha(200, 100);
        lineCaptcha.setGenerator(randomGenerator);
        // 把验证码存储到redis
        Boolean isSave = loginManager.setCaptcha(uuid,lineCaptcha.getCode());
        Assert.isTrue(isSave,"获取验证码失败！");
        CaptchaVO captchaVO = CaptchaVO.builder().captchaBase(lineCaptcha.getImageBase64()).captchaKey(uuid).captcha(lineCaptcha.getCode()).build();
        return captchaVO;
    }
}
