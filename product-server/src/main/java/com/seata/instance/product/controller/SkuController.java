package com.seata.instance.product.controller;

import com.seata.instance.common.base.BaseController;
import com.seata.instance.common.base.Result;
import com.seata.instance.common.model.product.Sku;
import com.seata.instance.common.qo.SkuListByIdsQO;
import com.seata.instance.product.service.SkuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author wyh
 * @Description
 * @createTime 2022年10月03日 12:12:00
 */
@RestController
@RequestMapping(value = "/sku")
public class SkuController extends BaseController {
    @Autowired
    private SkuService skuService;

    @PostMapping(value = "/getSkuListByIds")
    private Result<List<Sku>> getSkuListByIds(@RequestBody SkuListByIdsQO skuListByIdsQO){
        return setResult(skuService.getSkuListByIds(skuListByIdsQO));
    }
}
