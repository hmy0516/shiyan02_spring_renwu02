package com.hanlu.autowire;

import org.springframework.stereotype.Repository;

/**
 * @author HMY
 * @date 2018/11/28-22:48
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("userdao...save...");
    }
}
