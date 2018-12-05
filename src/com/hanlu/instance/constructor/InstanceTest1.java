package com.hanlu.instance.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author HMY
 * @date 2018/11/27-23:40
 */
public class InstanceTest1 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans1.xml");
        Bean1 bean1 = applicationContext.getBean("bean1", Bean1.class);
        System.out.println(bean1);
    }
}
