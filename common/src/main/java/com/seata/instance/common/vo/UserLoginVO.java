package com.seata.instance.common.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.seata.instance.common.model.auth.User;
import com.seata.instance.common.model.warehouse.Address;
import lombok.Data;

/**
 * @author wyh
 * @Description
 * @createTime 2022年10月30日 10:02:00
 */
@Data
public class UserLoginVO extends User {
    /** 登录名 */
    private String loginName;

    /** 密码 采用MD5加密方式 */
    private String password;

    /** token */
    private String AuthToken;

    /** 地址信息 */
    private Address address;
}
