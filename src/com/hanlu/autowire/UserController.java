package com.hanlu.autowire;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * @author HMY
 * @date 2018/11/28-22:54
 */
public class UserController {
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void save() {
        this.userService.save();
        System.out.println("userController...save");
    }
}
