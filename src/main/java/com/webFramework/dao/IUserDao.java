package com.webFramework.dao;


import com.webFramework.model.User;
/**
 * CreatedBy cx
 * CreateTime 2018/4/27 14:58
 * Description
 */
public interface IUserDao {
    User selectUser(long id);
}