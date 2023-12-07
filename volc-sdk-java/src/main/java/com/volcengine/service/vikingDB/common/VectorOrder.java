package com.volcengine.service.vikingDB.common;

import java.util.List;

import lombok.Data;
@Data
public class VectorOrder {
    private Object id = null;
    private List<Double> vector = null;
    public VectorOrder setId(Object id) {
        this.id = id;
        return this;
    }
    public VectorOrder setVector(List<Double> vector) {
        this.vector = vector;
        return this;
    }
    public VectorOrder build(){
        return this;
    }
}
