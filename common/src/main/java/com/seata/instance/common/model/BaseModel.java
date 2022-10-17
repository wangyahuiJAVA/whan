package com.seata.instance.common.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.seata.instance.common.base.Constants;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author wyh
 * @Description 实体基类
 * @createTime 2022年10月06日 10:59:00
 */
@Data
public class BaseModel implements Serializable {
    // 主键
    @TableId(value = "id",type = IdType.AUTO)
    private Long id;

    // 创建人
    @TableField(value = "creator")
    private String creator;

    // 修改人
    @TableField(value = "updator")
    private String updator;

    // 创建时间
    @TableField(value = "create_time")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private LocalDateTime createTime;

    // 修改时间
    @TableField(value = "update_time")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private LocalDateTime updateTime;

    // 是否删除
    @TableField(value = "delete_flag")
    private Boolean deleteFlag;
}
