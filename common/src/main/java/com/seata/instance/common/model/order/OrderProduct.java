package com.seata.instance.common.model.order;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author wyh
 * @Description
 * @createTime 2022年10月20日 20:41:00
 */
@Data
@TableName(value = "order_product")
public class OrderProduct {
    @TableId(value = "id",type = IdType.AUTO)
    private Long id;

    @TableField(value = "order_id")
    private Long orderId;

    @TableField(value = "sku_id")
    private Long skuId;
}
