package com.volcengine.service.vikingDB.common;

import com.volcengine.service.vikingDB.VikingDBException;
import lombok.Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class SearchByIdParam {
    private Object id = null;
    private Map<String, Object> filter = null;
    private Integer limit = 10;
    private List<String> outputFields = null;
    private Object partition = "default";
    private Double denseWeight = null;
    private List<Object> primaryKeyIn = null;
    private List<Object> primaryKeyNotIn = null;
    private Integer postProcessInputLimit = null;
    private List<Map<String, Object>> postProcessOps = null;
    private Integer isBuild = 0;
    private Boolean retry = false;
    private Boolean needReturnVector = false;
    private Float scaleK = null;

    public SearchByIdParam setScaleK(Float scaleK) {
        this.scaleK = scaleK;
        return this;
    }

    public SearchByIdParam setId(Object id) {
        this.id = id;
        return this;
    }

    public SearchByIdParam setFilter(Map<String, Object> filter) {
        this.filter = filter;
        return this;
    }

    public SearchByIdParam setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    public SearchByIdParam setOutputFields(List<String> outputFields) {
        this.outputFields = outputFields;
        return this;
    }

    public SearchByIdParam setPartition(Object partition) {
        this.partition = partition;
        return this;
    }

    public SearchByIdParam setDenseWeight(Double denseWeight) {
        this.denseWeight = denseWeight;
        return this;
    }

    public SearchByIdParam setPrimaryKeyIn(List<Object> primaryKeyIn) {
        this.primaryKeyIn = primaryKeyIn;
        return this;
    }

    public SearchByIdParam setPrimaryKeyNotIn(List<Object> primaryKeyNotIn) {
        this.primaryKeyNotIn = primaryKeyNotIn;
        return this;
    }

    public SearchByIdParam setPostProcessInputLimit(Integer postProcessInputLimit) {
        this.postProcessInputLimit = postProcessInputLimit;
        return this;
    }

    public SearchByIdParam setPostProcessOps(List<Map<String, Object>> postProcessOps) {
        this.postProcessOps = postProcessOps;
        return this;
    }


    public SearchByIdParam setRetry(Boolean retry) {
        this.retry = retry;
        return this;
    }

    public SearchByIdParam setNeedReturnVector(Boolean needReturnVector) {
        this.needReturnVector = needReturnVector;
        return this;
    }

    public SearchByIdParam build() throws Exception {
        VikingDBException vikingDBException = new VikingDBException(1000030, null, "Params does not exist");
        if (this.id == null) {
            throw vikingDBException.getErrorCodeException(1000030, null, "ID does not exist");
        } else {
            this.isBuild = 1;
            return this;
        }
    }

    public HashMap<String, Object> toMap() {
        HashMap<String, Object> map = new HashMap<>();
        List<Object> idList = new ArrayList<>();
        idList.add(id);
        HashMap<String, Object> orderById = new HashMap<>();
        orderById.put("primary_keys", idList);
        map.put("order_by_vector", orderById);

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
