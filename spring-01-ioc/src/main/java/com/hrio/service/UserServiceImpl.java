package com.hrio.service;

import com.hrio.dao.UserDao;
import com.hrio.dao.UserDaoImpl;
import com.hrio.dao.UserDaoMysqlImpl;

/**
 * IOC原型
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    // 利用set进行动态实现值的注入
    // 之前：程序主动创建对象，控制权在程序员手上
    // 使用set注入后，程序不再具有主动性，而是被动的接收对象
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
