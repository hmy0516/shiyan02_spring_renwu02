package com.hanlu.annotation;

import org.junit.Test;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author HMY
 * @date 2018/11/28-22:50
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource(name = "userDao")
    private UserDao userDao;

    public void save() {
        this.userDao.save();
        System.out.println("userservice....save..");
    }
}
