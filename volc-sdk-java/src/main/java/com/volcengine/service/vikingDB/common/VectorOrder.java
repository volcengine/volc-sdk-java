package com.volcengine.service.vikingDB.common;

import java.util.List;
import java.util.Map;

import lombok.Data;
@Data
public class VectorOrder {
    private Object id = null;
    private List<Double> vector = null;
    private Map<String, Object> sparseVectors = null;
    public VectorOrder setId(Object id) {
        this.id = id;
        return this;
    }
    public VectorOrder setVector(List<Double> vector) {
        this.vector = vector;
        return this;
    }
    public VectorOrder setSparseVectors(Map<String, Object> sparseVectors) {
        this.sparseVectors = sparseVectors;
        return this;
    }
    public VectorOrder build(){
        return this;
    }
}
