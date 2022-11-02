package com.seata.instance.common.qo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author wyh
 * @Description
 * @createTime 2022年09月29日 15:08:00
 */
@Data
@ApiModel(value = "订单查询入参")
public class OrderQO extends PageQO{

    @ApiModelProperty("订单号")
    @NotNull(message = "订单号不能位空!")
    @Length(max = 32,message = "订单号长度不能超过32位!")
    private String orderCode;
}
