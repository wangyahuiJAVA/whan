package com.seata.instance.auth.controller;

import com.seata.instance.auth.service.LoginService;
import com.seata.instance.common.base.BaseController;
import com.seata.instance.common.base.Result;
import com.seata.instance.common.qo.UserLoginQO;
import com.seata.instance.common.vo.CaptchaVO;
import com.seata.instance.common.vo.UserLoginVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author wyh
 * @Description
 * @createTime 2022年10月06日 10:56:00
 */
@RestController
@RequestMapping(value = "/user")
public class LoginController extends BaseController {
    @Autowired
    private LoginService loginService;

    @PostMapping(value = "/login")
    public Result<UserLoginVO> login(@RequestBody UserLoginQO userLoginQO){
        return setResult(loginService.login(userLoginQO));
    }

    @GetMapping(value = "/getCaptcha")
    public Result<CaptchaVO> getCaptcha(){
        return setResult(loginService.getCaptcha());
    }
}
