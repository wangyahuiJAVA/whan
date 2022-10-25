package com.seata.instance.common.qo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author wyh
 * @Description
 * @createTime 2022年10月18日 13:53:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SkuListByIdsQO extends PageQO{
    private List<Long> ids;
}
