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
    private Boolean retry = false;

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
