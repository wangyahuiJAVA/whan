package com.seata.instance.common.exception;

import cn.hutool.http.HttpException;
import com.seata.instance.common.base.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @author wyh
 * @Description 全局异常处理
 * @createTime 2022年10月30日 12:00:00
 */
@Slf4j
@ControllerAdvice
public class GlobalExceptionAdvice {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    @ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
    public Result methodArgumentNotValidException(HttpServletRequest request, MethodArgumentNotValidException e) {
        log.error("not found  error, "  + e.getMessage());
        return Result.failed(e.getBindingResult().getAllErrors().stream().findFirst().get().getDefaultMessage());
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    @ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
    public Result handlerException(HttpServletRequest request, Exception e) {
        log.error("not known  error, "  + e.getMessage());
        return Result.failed(e.getMessage());
    }

    @ExceptionHandler(HttpException.class)
    @ResponseBody
    public Result handlerHttpException(HttpServletRequest request, GlobBaseException e) {
        log.error("not found  error, "  + e.getMessage());
        return Result.failed(e.getCode(), e.getMessage());
    }



    // 预设全局参数绑定
    @ModelAttribute
    public void presetParam(Model model){
        model.addAttribute("globalAttr","this is a global attribute");
    }
}
