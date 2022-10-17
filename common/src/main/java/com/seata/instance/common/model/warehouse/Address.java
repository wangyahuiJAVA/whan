package com.seata.instance.common.model.warehouse;

import com.seata.instance.common.model.BaseModel;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author wyh
 * @Description
 * @createTime 2022年10月03日 11:57:00
 */
@Data
public class Address extends BaseModel {
    private String address;
}
