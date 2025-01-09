package com.volcengine.service.vikingDB.common;

import com.volcengine.service.vikingDB.VikingDBException;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class SearchByVectorParam {
    private List<Double> vector = null;
    private Map<String, Object> filter = null;
    private Integer limit = 10;
    private List<String> outputFields = null;
    private Object partition = "default";
    private Map<String, Object> sparseVectors = null;
    private Double denseWeight = null;
    private List<Object> primaryKeyIn = null;
    private List<Object> primaryKeyNotIn = null;
    private Integer postProcessInputLimit = null;
    private List<Map<String, Object>> postProcessOps = null;
    private Integer isBuild = 0;
    private Boolean retry = false;

    public SearchByVectorParam setVector(List<Double> vector) {
        this.vector = vector;
        return this;
    }

    public SearchByVectorParam setFilter(Map<String, Object> filter) {
        this.filter = filter;
        return this;
    }

    public SearchByVectorParam setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    public SearchByVectorParam setOutputFields(List<String> outputFields) {
        this.outputFields = outputFields;
        return this;
    }

    public SearchByVectorParam setPartition(Object partition) {
        this.partition = partition;
        return this;
    }

    public SearchByVectorParam setSparseVectors(Map<String, Object> sparseVectors) {
        this.sparseVectors = sparseVectors;
        return this;
    }

    public SearchByVectorParam setDenseWeight(Double denseWeight) {
        this.denseWeight = denseWeight;
        return this;
    }

    public SearchByVectorParam setPrimaryKeyIn(List<Object> primaryKeyIn) {
        this.primaryKeyIn = primaryKeyIn;
        return this;
    }

    public SearchByVectorParam setPrimaryKeyNotIn(List<Object> primaryKeyNotIn) {
        this.primaryKeyNotIn = primaryKeyNotIn;
        return this;
    }

    public SearchByVectorParam setPostProcessInputLimit(Integer postProcessInputLimit) {
        this.postProcessInputLimit = postProcessInputLimit;
        return this;
    }

    public SearchByVectorParam setPostProcessOps(List<Map<String, Object>> postProcessOps) {
        this.postProcessOps = postProcessOps;
        return this;
    }

    public SearchByVectorParam setRetry(Boolean retry) {
        this.retry = retry;
        return this;
    }

    public SearchByVectorParam build() throws Exception {
        VikingDBException vikingDBException = new VikingDBException(1000030, null, "Params does not exist");
        if (this.vector == null) {
            throw vikingDBException.getErrorCodeException(1000030, null, "Vector does not exist");
        } else {
            this.isBuild = 1;
            return this;
        }
    }
}
