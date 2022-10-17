package com.seata.instance.common.qo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author wyh
 * @Description 分页查询基类
 * @createTime 2022年09月29日 15:09:00
 */
@Data
public class PageQO implements Serializable {

    // 页码
    private Long pageNum = 1L;

    // 条数
    private Long pageSize = 10L;
}
