package com.blue.service.impl;

import com.blue.dao.UserMapper;
import com.blue.domain.User;
import com.blue.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by BlueBreeze on 2017/12/9.
 */
@Service("UserService")
public class UserServiceImpl implements IUserService {
    
    private UserMapper userMapper;

    public User getUserById(int userId) {
        return userMapper.selectByPrimaryKey(userId);
    }
}
