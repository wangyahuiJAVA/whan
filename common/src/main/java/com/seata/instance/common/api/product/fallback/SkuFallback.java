package com.seata.instance.common.api.product.fallback;

import com.seata.instance.common.api.AbstractBclFallbackFactory;
import com.seata.instance.common.api.product.SKuApi;
import com.seata.instance.common.base.Result;
import org.springframework.stereotype.Component;


/**
 * @author wyh
 * @Description
 * @createTime 2022年10月20日 19:40:00
 */
@Component
public class SkuFallback extends AbstractBclFallbackFactory<SKuApi> {
    @Override
    public SKuApi fallback(Result result) {
        return null;
    }
}
