package com.seata.instance.common.model.auth;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.seata.instance.common.model.BaseModel;
import com.seata.instance.common.model.warehouse.Address;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author wyh
 * @Description
 * @createTime 2022年10月06日 10:58:00
 */
@Data
@TableName(value = "user")
@ApiModel(value = "用户")
public class User extends BaseModel {

    @ApiModelProperty(value = "昵称")
    @TableField(value = "user_name")
    private String userName;

    @ApiModelProperty(value = "地址")
    @TableField(value = "address_id")
    private Long addressId;

    @ApiModelProperty(value = "备注")
    @TableField(value = "remark")
    private String remark;

}
