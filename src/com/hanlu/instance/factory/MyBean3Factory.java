package com.hanlu.instance.factory;

/**
 * @author HMY
 * @date 2018/11/27-23:55
 */
public class MyBean3Factory {
    public MyBean3Factory() {
        System.out.println("bean3 工厂实例化中");
    }

    public Bean3 createBean() {
        return new Bean3();
    }
}
