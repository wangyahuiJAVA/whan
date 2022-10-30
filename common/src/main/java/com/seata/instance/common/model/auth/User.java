package com.seata.instance.common.model.auth;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.seata.instance.common.model.BaseModel;
import com.seata.instance.common.model.warehouse.Address;
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
public class User extends BaseModel {

    @TableField(value = "昵称")
    private String userName;

    @TableField(value = "地址id")
    private Long addressId;

    @TableField(value = "备注")
    private String remark;

}
