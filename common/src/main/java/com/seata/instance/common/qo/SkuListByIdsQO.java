package com.seata.instance.common.qo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
@ApiModel(value = "查询sku集合入参")
public class SkuListByIdsQO extends PageQO{
    @ApiModelProperty(value = "id集合")
    private List<Long> ids;
}
