package com.seata.instance.common.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Data;
import lombok.Getter;

/**
 * @author wyh
 * @Description
 * @createTime 2022年09月29日 15:14:00
 */
@Getter
public enum OrderTypeEnum {
    SALE_ORDER(0, "销售单"),
    STOCK_ORDER(1, "现货单"),
    TAKE_OUT_ORDER(2, "外卖单");

    @EnumValue
    private Integer type;

    @JsonValue
    private String typeName;

    OrderTypeEnum(Integer type, String typeName){
        this.type = type;
        this.typeName = typeName;
    }

}
