package com.hanlu.instance.static_factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author HMY
 * @date 2018/11/27-23:50
 */
public class InstanceTest2 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans1.xml");
        Bean2 bean2 = applicationContext.getBean("bean2", Bean2.class);
        System.out.println(bean2);
    }
}
