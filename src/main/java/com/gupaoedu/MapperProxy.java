package com.gupaoedu;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * autor:
 * 2020/5/1422:34
 */
public class MapperProxy implements InvocationHandler {
    private Sqlsession sqlsession;
    public MapperProxy(Sqlsession sqlsession) {
        this.sqlsession = sqlsession;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String mapperInterface = method.getDeclaringClass().getName();
        String methodName = method.getName();
        String statementId = mapperInterface + "." + methodName;
        return sqlsession.selectOne(statementId,args[0]);
    }
}
