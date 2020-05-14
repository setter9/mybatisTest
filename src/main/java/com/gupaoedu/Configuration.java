package com.gupaoedu;

import java.lang.reflect.Proxy;
import java.util.ResourceBundle;

/**
 * autor:
 * 2020/5/1422:31
 */
public class Configuration {

    public  static final ResourceBundle sqlMappers;

    static {
        sqlMappers = ResourceBundle.getBundle("v1sql");
    }

    public <T> T getMapper(Class clazz,Sqlsession sqlsession) {

        return (T)Proxy.newProxyInstance(this.getClass().getClassLoader(),new Class[]{clazz},new MapperProxy(sqlsession));
    }
}
