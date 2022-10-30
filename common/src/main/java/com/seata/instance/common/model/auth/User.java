package com.seata.instance.common.model.auth;

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
public class User extends BaseModel {

    private String userName;

    private Address address;

    private String remark;

}
