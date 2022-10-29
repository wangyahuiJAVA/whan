package com.seata.instance.common.model.product;

import com.seata.instance.common.model.BaseModel;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author wyh
 * @Description
 * @createTime 2022年09月29日 15:16:00
 */
@Data
public class Sku extends BaseModel {
    private String code;
    private String name;
    private String imgMaster;
    private Double weight;
}
