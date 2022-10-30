package com.seata.instance.common.base;

import com.seata.instance.common.enums.CodeEnum;
import lombok.Data;

import java.io.Serializable;

/**
 * @author wyh
 * @Description 通用返回值
 * @createTime 2022年10月06日 11:18:00
 */
@Data
public class Result<T> implements Serializable {

    private String code;

    private String msg;

    private T data;

    public Result(String code, String msg, T data){
        setCode(code);
        setMsg(msg);
        setData(data);
    }

    public Result(){
    }

    public Result(String code, String msg){
        setCode(code);
        setMsg(msg);
    }

    public static Result failed(String errorMsg) {
        Result result = new Result();
        result.setCode(CodeEnum.INTERNAL_SERVER_ERROR.getCode());
        result.setMsg(errorMsg);
        result.setData("");
        return result;
    }

    public static Result failed(String code,String errorMsg) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(errorMsg);
        result.setData("");
        return result;
    }

    public static Result success() {
        Result result = new Result();
        result.setCode(CodeEnum.SUCCESS.getCode());
        result.setMsg(CodeEnum.SUCCESS.getMsg());
        result.setData("");
        return result;
    }

    public static Result success(Object object) {
        Result result = new Result();
        result.setCode(CodeEnum.SUCCESS.getCode());
        result.setMsg(CodeEnum.SUCCESS.getMsg());
        result.setData(object);
        return result;
    }
}
