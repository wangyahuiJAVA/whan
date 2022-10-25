package com.seata.instance.common.api.product;

import com.seata.instance.common.api.product.fallback.SkuFallback;
import com.seata.instance.common.base.Result;
import com.seata.instance.common.model.product.Sku;
import com.seata.instance.common.qo.SkuListByIdsQO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @author wyh
 * @Description
 * @createTime 2022年10月18日 14:28:00
 */
@FeignClient(value = "seata-product-server-dev", path = "/product/sku", fallbackFactory = SkuFallback.class)
public interface SKuApi {
    /**
     * 根据skuIds集合查询sku集合
     *
     * @param skuListByIdsQO skuId集合
     * @return sku集合信息
     */
    @PostMapping("getSkuListByIds")
    Result<List<Sku>> getSkuListByIds(@RequestBody SkuListByIdsQO skuListByIdsQO);

}
