package com.seata.instance.common.vo;

import com.seata.instance.common.model.order.Order;
import com.seata.instance.common.model.product.Sku;
import lombok.Data;

import java.util.List;

/**
 * @author wyh
 * @Description
 * @createTime 2022年09月29日 15:18:00
 */
@Data
public class OrderVO extends Order {
    private List<Sku> skuList;
}
