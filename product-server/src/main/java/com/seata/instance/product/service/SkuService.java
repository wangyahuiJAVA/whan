package com.seata.instance.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.seata.instance.common.model.product.Sku;
import com.seata.instance.common.qo.SkuListByIdsQO;

import java.util.List;

/**
 * @author wyh
 * @Description
 * @createTime 2022年10月03日 12:12:00
 */
public interface SkuService extends IService<Sku> {
    /**
     * 根据id集合查询sku信息
     * @param skuListByIdsQO skuIds集合
     * @return sku集合信息
     */
    List<Sku> getSkuListByIds(SkuListByIdsQO skuListByIdsQO);
}
