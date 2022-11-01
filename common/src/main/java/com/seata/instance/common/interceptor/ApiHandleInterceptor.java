package com.seata.instance.common.interceptor;


import com.alibaba.fastjson.JSON;
import com.seata.instance.common.base.Constants;
import com.seata.instance.common.base.Result;
import com.seata.instance.common.enums.CodeEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author wyh
 */
@Component
@RefreshScope
public class ApiHandleInterceptor implements HandlerInterceptor {

    private Logger logger = LoggerFactory.getLogger(ApiHandleInterceptor.class);

//    @Autowired
//    UserLoginService iLoginService;

    // 开启是否走网关
    @Value("${config.env}")
    private String env = "false";

    /**
     * 当前环境
     */
    @Value("${spring.profiles.active}")
    private String profile;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 判断是否开启接口统一走网关进行请求验证
        if (!profile.equalsIgnoreCase("dev")) {
            if (env.equalsIgnoreCase(Boolean.TRUE.toString())) {
                // 如果走网关校验判断是否已经通过网关校验

            } else {
                // 不走网关自行进行校验
                String token = request.getHeader(Constants.TOKEN);
                if (token == null){
                    Result result = new Result(CodeEnum.TOKEN_ERROR.getCode(),CodeEnum.TOKEN_ERROR.getMsg());
                    reponseErr(response,result);
                    return false;
                }else {
                    // 去redis中通过token查询用户信息，判断token是否为有效数据
                }
            }
        }
        return true;
    }


    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView
            modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception
            ex) {

    }

    /**
     * 输出错误结果给客户端
     *
     * @param servletResponse
     */
    private void reponseErr(ServletResponse servletResponse, Result result) {
        servletResponse.setCharacterEncoding("UTF-8");
        servletResponse.setContentType("application/json; charset=utf-8");
        try {
            servletResponse.getWriter().write(JSON.toJSONString(result));
            servletResponse.getWriter().flush();
            servletResponse.getWriter().close();
        } catch (Exception e) {
            logger.error("response can not be written", e);
        }
    }

    /**
     * 判断本次请求的数据类型是否为json
     *
     * @param request request
     * @return boolean
     */
    private boolean isJson(HttpServletRequest request) {
        if (request.getContentType() != null) {
            return request.getContentType().contains(MediaType.APPLICATION_JSON_VALUE) ||
                    request.getContentType().equals(MediaType.APPLICATION_JSON_UTF8_VALUE);
        }

        return false;
    }

}
