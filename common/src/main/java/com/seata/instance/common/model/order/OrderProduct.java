package com.seata.instance.common.model.order;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author wyh
 * @Description
 * @createTime 2022年10月20日 20:41:00
 */
@Data
@TableName(value = "order_product")
@ApiModel(value = "订单产品信息")
public class OrderProduct {

    @ApiModelProperty(value = "主键")
    @TableId(value = "id",type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "订单id")
    @TableField(value = "order_id")
    private Long orderId;

    @ApiModelProperty(value = "商品id")
    @TableField(value = "sku_id")
    private Long skuId;
}
