package com.volcengine.service.vikingDB.common;

import com.volcengine.service.vikingDB.VikingDBException;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class SearchParam {
    private VectorOrder vectorOrder = null;
    private ScalarOrder scalarOrder = null;
    private Map<String, Object> filter = null;
    private Integer limit = 10;
    private List<String> outputFields = null;
    private Object partition = "default";
    private Integer isBuild = 0;
    private Double denseWeight = null;
    private List<Object> primaryKeyIn = null;
    private List<Object> primaryKeyNotIn = null;
    private Integer postProcessInputLimit = null;
    private List<Map<String, Object>> postProcessOps = null;
    private Boolean retry = false;
    private Integer offset = -1;
    private RawOrderParam rawOrder = null;

    public SearchParam setVectorOrder(VectorOrder vectorOrder) {
        this.vectorOrder = vectorOrder;
        return this;
    }

    public SearchParam setScalarOrder(ScalarOrder scalarOrder) {
        this.scalarOrder = scalarOrder;
        return this;
    }

    public SearchParam setFilter(Map<String, Object> filter) {
        this.filter = filter;
        return this;
    }

    public SearchParam setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    public SearchParam setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    public SearchParam setOutputFields(List<String> outputFields) {
        this.outputFields = outputFields;
        return this;
    }

    public SearchParam setPartition(Object partition) {
        this.partition = partition;
        return this;
    }

    public SearchParam setDenseWeight(Double denseWeight) {
        this.denseWeight = denseWeight;
        return this;
    }

    public SearchParam setPrimaryKeyIn(List<Object> primaryKeyIn) {
        this.primaryKeyIn = primaryKeyIn;
        return this;
    }

    public SearchParam setPrimaryKeyNotIn(List<Object> primaryKeyNotIn) {
        this.primaryKeyNotIn = primaryKeyNotIn;
        return this;
    }

    public SearchParam setPostProcessInputLimit(Integer postProcessInputLimit) {
        this.postProcessInputLimit = postProcessInputLimit;
        return this;
    }

    public SearchParam setPostProcessOps(List<Map<String, Object>> postProcessOps) {
        this.postProcessOps = postProcessOps;
        return this;
    }

    public SearchParam setRetry(Boolean retry) {
        this.retry = retry;
        return this;
    }

    public SearchParam build() throws Exception {
        VikingDBException vikingDBException = new VikingDBException(1000030, null, "Params does not exist");
        if (this.scalarOrder != null && this.scalarOrder.getIsBuild() == 0) {
            throw vikingDBException.getErrorCodeException(1000030, null, "scalarOrder does not build");
        }
        this.isBuild = 1;
        return this;
    }
}
