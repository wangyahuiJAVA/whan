package com.seata.instance.common.exception;

import com.seata.instance.common.enums.CodeEnum;
import lombok.Data;

import java.io.Serializable;

/**
 * @author wyh
 * @Description 全局异常处理
 * @createTime 2022年10月06日 11:18:00
 */
@Data
public class GlobBaseException extends RuntimeException implements Serializable {
    private static final long serialVersionUID = -5596746509452155532L;

    private String code;
    private String message;
    private Throwable cause;

    public GlobBaseException(CodeEnum codeEnum) {
        this.setCode(codeEnum.getCode());
        this.setMessage(codeEnum.getMsg());
    }
    public GlobBaseException(CodeEnum codeEnum, String msg) {
        this.setCode(codeEnum.getCode());
        this.setMessage(msg);
    }
    public GlobBaseException(CodeEnum codeEnum, Throwable throwable) {
        this.setCode(codeEnum.getCode());
        this.setMessage(codeEnum.getMsg());
        this.setCause(throwable);
    }
    public GlobBaseException(String code, String msg) {
        this.setCode(code);
        this.setMessage(msg);
    }
}
