package com.hanlu.instance.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author HMY
 * @date 2018/11/27-23:59
 */
public class InstanceTest3 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans1.xml");
        Bean3 bean3 = applicationContext.getBean("bean3", Bean3.class);
        System.out.println(bean3);
    }
}
