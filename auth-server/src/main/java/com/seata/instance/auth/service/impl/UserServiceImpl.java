package com.seata.instance.auth.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.seata.instance.auth.mapper.UserMapper;
import com.seata.instance.auth.service.UserService;
import com.seata.instance.common.model.auth.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wyh
 * @Description
 * @createTime 2022年10月06日 11:09:00
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Autowired
    private UserMapper userMapper;
}
