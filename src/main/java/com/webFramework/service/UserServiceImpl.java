package com.webFramework.service;

import com.webFramework.dao.IUserDao;
import com.webFramework.model.User;
import com.webFramework.service.impl.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * CreatedBy cx
 * CreateTime 2018/4/27 14:55
 * Description
 */
@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserDao userDao;

    @Override
    public User selectUser(long userId) {
        return this.userDao.selectUser(userId);
    }

}