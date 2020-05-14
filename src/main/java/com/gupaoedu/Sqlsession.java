package com.gupaoedu;


import com.github.pagehelper.util.StringUtil;

/**
 * autor:
 * 2020/5/1422:29
 */
public class Sqlsession {
    private Configuration configuration;
    private Executor executor;
    public <T> T selectOne(String statementID,Object parameter){
        String sql = Configuration.sqlMappers.getString(statementID);
        if(StringUtil.isNotEmpty(sql)){
            return executor.query(sql,parameter);
        }
        return null;
    }

    public Sqlsession(Configuration configuration,Executor executor){
        this.configuration = configuration;
        this.executor = executor;
    }
    public <T> T getMapper(Class clazz){
        return configuration.getMapper(clazz,this);
    }
}
