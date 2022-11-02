package com.seata.instance.common.model.order;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.seata.instance.common.enums.OrderTypeEnum;
import com.seata.instance.common.model.BaseModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * @author wyh
 * @Description
 * @createTime 2022年09月29日 15:02:00
 */
@Data
@TableName(value = "`order`")
@ApiModel(value = "订单信息")
public class Order extends BaseModel {
    // 订单编号
    @ApiModelProperty(value = "订单编号")
    @TableField(value = "order_code")
    private String orderCode;

    // 总件数
    @ApiModelProperty(value = "总件数")
    @TableField(value = "total_num")
    private String totalNum;

    // 订单类型
    @ApiModelProperty(value = "订单类型")
    @TableField(value = "type")
    private OrderTypeEnum type;
}
