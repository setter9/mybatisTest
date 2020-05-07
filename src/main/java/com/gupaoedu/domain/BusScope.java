package com.gupaoedu.domain;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: lld
 */
public class BusScope implements Serializable{
    Integer id; //

    Object businessScope; // 经营范围

    public BusScope(Integer id, Object businessScope) {
        this.id = id;
        this.businessScope = businessScope;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Object getBusinessScope() {
        return businessScope;
    }

    public void setBusinessScope(Object businessScope) {
        this.businessScope = businessScope;
    }

    @Override
    public String toString() {
        return "BusScope{" +
                "id=" + id +
                ", businessScope=" + businessScope.toString() +
                '}';
    }
}
