package com.seata.instance.common.model.product;

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
 * @createTime 2022年09月29日 15:16:00
 */
@Data
@TableName(value = "`sku`")
@ApiModel(value = "sku信息")
public class Sku extends BaseModel {
    // 编码
    @ApiModelProperty(value = "sku编码")
    @TableField(value = "code")
    private String code;

    // 名称
    @ApiModelProperty(value = "名称")
    @TableField(value = "name")
    private String name;

    // 主图
    @ApiModelProperty(value = "主图")
    @TableField(value = "img_master")
    private String imgMaster;

    // 重量
    @ApiModelProperty(value = "重量")
    @TableField(value = "weight")
    private Double weight;
}
