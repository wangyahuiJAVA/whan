package com.seata.instance.product.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.seata.instance.common.model.product.Sku;
import com.seata.instance.product.mapper.SkuMapper;
import com.seata.instance.product.service.SkuService;
import org.springframework.stereotype.Service;

/**
 * @author wyh
 * @Description
 * @createTime 2022年10月03日 12:14:00
 */
@Service
public class SkuServiceImpl extends ServiceImpl<SkuMapper, Sku> implements SkuService {
}
