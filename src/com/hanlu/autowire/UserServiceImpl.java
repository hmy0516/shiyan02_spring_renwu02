package com.hanlu.autowire;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author HMY
 * @date 2018/11/28-22:50
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save() {
        this.userDao.save();
        System.out.println("userservice....save..");
    }
}
