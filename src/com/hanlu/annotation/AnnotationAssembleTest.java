package com.hanlu.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author HMY
 * @date 2018/11/28-22:59
 */
public class AnnotationAssembleTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/hanlu/annotation/beans6.xml");
        UserController userController = applicationContext.getBean("userController", UserController.class);
        userController.save();
    }
}
