package com.hanlu.annotation;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * @author HMY
 * @date 2018/11/28-22:54
 */
@Controller("userController")
public class UserController {
    @Resource(name = "userService")
    private UserService userService;

    public void save() {
        this.userService.save();
        System.out.println("userController...save");
    }
}
