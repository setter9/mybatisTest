package com.gupaoedu;

import com.gupaoedu.mapper.BlogMapper;

/**
 * autor:
 * 2020/5/1423:13
 */
public class MybatisBoot {
    public static void main(String[] args) {
        Sqlsession sqlsession = new Sqlsession(new Configuration(),new Executor());
        BlogMapper blogMapper = sqlsession.getMapper(BlogMapper.class);
        blogMapper.selectBlogById(1);
    }

}
