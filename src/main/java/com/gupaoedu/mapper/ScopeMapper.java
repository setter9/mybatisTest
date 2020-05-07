package com.gupaoedu.mapper;

import com.gupaoedu.domain.Blog;
import com.gupaoedu.domain.BlogExample;
import com.gupaoedu.domain.BusScope;
import com.gupaoedu.domain.associate.AuthorAndBlog;
import com.gupaoedu.domain.associate.BlogAndAuthor;
import com.gupaoedu.domain.associate.BlogAndComment;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * @Author: lld
 */
public interface ScopeMapper {
    /**
     * 根据主键查询
     * @param id
     * @return
     */
    public BusScope selectById(Integer id);


    /**
     * 新增
     * @param busScope
     * @return
     */
    public int insertScope(BusScope busScope);





}
