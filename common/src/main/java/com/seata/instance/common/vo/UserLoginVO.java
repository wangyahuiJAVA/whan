package com.seata.instance.common.vo;

import com.seata.instance.common.model.auth.User;
import lombok.Data;

/**
 * @author wyh
 * @Description
 * @createTime 2022年10月30日 10:02:00
 */
@Data
public class UserLoginVO extends User {
    private String loginName;

    private String password;

    private String AuthToken;
}
