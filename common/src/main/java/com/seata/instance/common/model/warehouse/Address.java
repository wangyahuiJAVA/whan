package com.seata.instance.common.model.warehouse;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.seata.instance.common.model.BaseModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author wyh
 * @Description
 * @createTime 2022年10月03日 11:57:00
 */
@Data
@TableName(value = "address")
@ApiModel(value = "地址信息")
public class Address extends BaseModel {
    // 省
    @ApiModelProperty(value = "省份")
    @TableField(value = "province")
    private String province;
}
