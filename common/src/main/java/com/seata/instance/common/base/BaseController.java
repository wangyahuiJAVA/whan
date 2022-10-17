package com.seata.instance.common.base;

import com.seata.instance.common.enums.CodeEnum;
import lombok.extern.slf4j.Slf4j;
/**
 * @author wyh
 * @Description 通用基类
 * @createTime 2022年10月06日 11:18:00
 */
@Slf4j
public class BaseController {

    public Result setResult() {
        Result result = new Result();
        result.setCode(CodeEnum.SUCCESS.getCode());
        result.setMsg(CodeEnum.SUCCESS.getMsg() );
        result.setData("");
        return result;
    }

    public Result setResult(CodeEnum codeEnum) {
        Result result = new Result();
        result.setCode(codeEnum.getCode());
        result.setMsg(codeEnum.getMsg());
        result.setData("");

        return result;
    }

    public Result setResultFailed(String errorMsg) {
        Result result = new Result();
        result.setCode(CodeEnum.INTERNAL_SERVER_ERROR.getCode());
        result.setMsg(errorMsg);
        result.setData("");

        return result;
    }

    public Result setResult(Object data) {
        Result result = new Result();
        result.setCode(CodeEnum.SUCCESS.getCode());
        result.setMsg(CodeEnum.SUCCESS.getMsg() );
        if (data != null && !"".equals(data)) {
            result.setData(data);
        } else {
            result.setData("");
        }

        return result;
    }
}
