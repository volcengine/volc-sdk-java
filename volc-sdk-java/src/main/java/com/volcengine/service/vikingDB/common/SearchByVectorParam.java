package com.volcengine.service.vikingDB.common;

import com.volcengine.service.vikingDB.VikingDBException;
import lombok.Data;

import java.util.Collections;
import java.util.HashMap;
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
    private Boolean needReturnVector = false;
    private Float scaleK = null;

    public SearchByVectorParam setScaleK(Float scaleK) {
        this.scaleK = scaleK;
        return this;
    }

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

    public SearchByVectorParam setNeedReturnVector(Boolean needReturnVector) {
        this.needReturnVector = needReturnVector;
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

    public HashMap<String, Object> toMap() {
        HashMap<String, Object> map = new HashMap<>();
        HashMap<String, Object> orderByVector = new HashMap<>();
        orderByVector.put("vectors", Collections.singletonList(this.vector));
        if (this.sparseVectors != null) {
            orderByVector.put("sparse_vectors", Collections.singletonList(this.sparseVectors));
        }
        map.put("order_by_vector", orderByVector);
        // 通用字段处理
        map.put("limit", limit);
        map.put("partition", partition);
        if (primaryKeyIn != null) map.put("primary_key_in", primaryKeyIn);
        if (primaryKeyNotIn != null) map.put("primary_key_not_in", primaryKeyNotIn);
        if (postProcessInputLimit != null) map.put("post_process_input_limit", postProcessInputLimit);
        if (postProcessOps != null) map.put("post_process_ops", postProcessOps);
        if (outputFields != null) map.put("output_fields", outputFields);
        if (filter != null) map.put("filter", filter);
        if (denseWeight != null) map.put("dense_weight", denseWeight);
        if (scaleK != null) map.put("scale_k", scaleK);

        return map;
    }
}
