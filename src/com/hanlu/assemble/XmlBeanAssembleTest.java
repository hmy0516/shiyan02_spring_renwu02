package com.hanlu.assemble;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author HMY
 * @date 2018/11/28-22:37
 */
public class XmlBeanAssembleTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/hanlu/assemble/beans5.xml");
        User user1 = applicationContext.getBean("user1", User.class);
        User user2 = applicationContext.getBean("user2", User.class);
        System.out.println(user1);
        System.out.println(user2);
    }
}
