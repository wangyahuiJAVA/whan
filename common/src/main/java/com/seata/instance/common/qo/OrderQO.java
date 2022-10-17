package com.seata.instance.common.qo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author wyh
 * @Description
 * @createTime 2022年09月29日 15:08:00
 */
@Data
public class OrderQO extends PageQO{
    private String orderCode;
}
