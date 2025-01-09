package com.volcengine.service.vikingDB.common;

import com.volcengine.service.vikingDB.VikingDBException;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class SearchByTextParam {
    private Text text = null;
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

    public SearchByTextParam setText(Text text) {
        this.text = text;
        return this;
    }

    public SearchByTextParam setFilter(Map<String, Object> filter) {
        this.filter = filter;
        return this;
    }

    public SearchByTextParam setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    public SearchByTextParam setOutputFields(List<String> outputFields) {
        this.outputFields = outputFields;
        return this;
    }

    public SearchByTextParam setPartition(Object partition) {
        this.partition = partition;
        return this;
    }

    public SearchByTextParam setDenseWeight(Double denseWeight) {
        this.denseWeight = denseWeight;
        return this;
    }

    public SearchByTextParam setPrimaryKeyIn(List<Object> primaryKeyIn) {
        this.primaryKeyIn = primaryKeyIn;
        return this;
    }

    public SearchByTextParam setPrimaryKeyNotIn(List<Object> primaryKeyNotIn) {
        this.primaryKeyNotIn = primaryKeyNotIn;
        return this;
    }

    public SearchByTextParam setPostProcessInputLimit(Integer postProcessInputLimit) {
        this.postProcessInputLimit = postProcessInputLimit;
        return this;
    }

    public SearchByTextParam setPostProcessOps(List<Map<String, Object>> postProcessOps) {
        this.postProcessOps = postProcessOps;
        return this;
    }

    public SearchByTextParam setRetry(Boolean retry) {
        this.retry = retry;
        return this;
    }

    public SearchByTextParam build() throws Exception {
        VikingDBException vikingDBException = new VikingDBException(1000030, null, "Params does not exist");
        if (this.text == null) {
            throw vikingDBException.getErrorCodeException(1000030, null, "Text does not exist");
        } else {
            this.isBuild = 1;
            return this;
        }
    }
}
