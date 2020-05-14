package com.gupaoedu.domain;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Author: lld
 */
public class Fee implements Serializable{
   private Integer id; //
   private BigDecimal feeAmt;
   private String feeDate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getFeeAmt() {
        return feeAmt;
    }

    public void setFeeAmt(BigDecimal feeAmt) {
        this.feeAmt = feeAmt;
    }

    public String getFeeDate() {
        return feeDate;
    }

    public void setFeeDate(String feeDate) {
        this.feeDate = feeDate;
    }
}
