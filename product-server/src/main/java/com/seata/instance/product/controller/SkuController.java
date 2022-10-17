package com.seata.instance.product.controller;

import com.seata.instance.product.service.SkuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wyh
 * @Description
 * @createTime 2022年10月03日 12:12:00
 */
@RestController
@RequestMapping(value = "/sku")
public class SkuController {
    @Autowired
    private SkuService skuService;
}
