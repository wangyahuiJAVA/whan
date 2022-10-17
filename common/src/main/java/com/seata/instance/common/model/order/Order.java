package com.seata.instance.common.model.order;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.seata.instance.common.enums.OrderTypeEnum;
import com.seata.instance.common.model.BaseModel;
import com.seata.instance.common.model.product.Sku;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author wyh
 * @Description
 * @createTime 2022年09月29日 15:02:00
 */
@Data
@TableName(value = "`order`")
public class Order extends BaseModel {
    @TableField(value = "order_code")
    private String orderCode;

    @TableField(value = "total_num")
    private String totalNum;

    @TableField(value = "type")
    private OrderTypeEnum type;
}
