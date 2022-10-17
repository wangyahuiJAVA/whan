package com.seata.instance.common.base;

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
}
