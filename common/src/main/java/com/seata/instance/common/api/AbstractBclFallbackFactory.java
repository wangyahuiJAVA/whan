package com.seata.instance.common.api;


import com.seata.instance.common.base.Result;
import com.seata.instance.common.enums.CodeEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FallbackFactory;



/**
 * 异常降级工厂
 *
 * @author wyh
 */
@Slf4j
public abstract class AbstractBclFallbackFactory<T> implements FallbackFactory<T> {

    @Override
    public T create(Throwable cause) {
        return fallback(getResponseDto(cause));
    }

    /**
     * Api的异常降级
     *
     * @param result 异常响应实体
     * @return 降级的api实体
     */
    public abstract T fallback(Result result);

    /**
     * 返回异常响应实体
     *
     * @param cause 异常
     * @return 异常响应实体
     */
    protected Result<?> getResponseDto(Throwable cause) {
        Result<?> result = new Result<>();
        result.setMsg(cause.getMessage());
        result.setCode(CodeEnum.INTERNAL_SERVER_ERROR.getCode());
        log.error("FeignClient调用："+result.getMsg());
        return result;
    }

}
