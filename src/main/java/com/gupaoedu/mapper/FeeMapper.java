package com.gupaoedu.mapper;

import com.gupaoedu.domain.BusScope;
import com.gupaoedu.domain.Fee;

import java.util.Date;
import java.util.List;

/**
 * @Author: lld
 */
public interface FeeMapper {
    /**
     * 根据时间查询
     * @param feeDate
     * @return
     */
    public List<Fee> selectByDate(Date feeDate);






}
