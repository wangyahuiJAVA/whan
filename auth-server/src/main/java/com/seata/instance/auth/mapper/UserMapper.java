package com.seata.instance.auth.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.seata.instance.common.model.auth.User;
import org.springframework.stereotype.Repository;

/**
 * @author wyh
 * @Description
 * @createTime 2022年10月06日 11:10:00
 */
@Repository
public interface UserMapper extends BaseMapper<User> {
}
