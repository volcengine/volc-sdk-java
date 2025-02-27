package com.volcengine.service.vikingDB.common;

import com.volcengine.service.vikingDB.VikingDBException;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class SearchWithMultiModalParam {
    private String text = null;
    private String image = null;
    private Map<String, Object> filter = null;
    private Integer limit = 10;
    private List<String> outputFields = null;
    private Object partition = "default";
    private Double denseWeight = null;
    private Boolean needInstruction = null;
    private List<Object> primaryKeyIn = null;
    private List<Object> primaryKeyNotIn = null;
    private Integer postProcessInputLimit = null;
    private List<Map<String, Object>> postProcessOps = null;
    private Integer isBuild = 0;
    private Boolean retry = false;

    public SearchWithMultiModalParam setText(String text) {
        this.text = text;
        return this;
    }

    public SearchWithMultiModalParam setImage(String image) {
        this.image = image;
        return this;
    }

    public SearchWithMultiModalParam setFilter(Map<String, Object> filter) {
        this.filter = filter;
        return this;
    }

    public SearchWithMultiModalParam setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    public SearchWithMultiModalParam setOutputFields(List<String> outputFields) {
        this.outputFields = outputFields;
        return this;
    }

    public SearchWithMultiModalParam setPartition(Object partition) {
        this.partition = partition;
        return this;
    }

    public SearchWithMultiModalParam setDenseWeight(Double denseWeight) {
        this.denseWeight = denseWeight;
        return this;
    }

    public SearchWithMultiModalParam setNeedInstruction(Boolean needInstruction) {
        this.needInstruction = needInstruction;
        return this;
    }

    public SearchWithMultiModalParam setPrimaryKeyIn(List<Object> primaryKeyIn) {
        this.primaryKeyIn = primaryKeyIn;
        return this;
    }

    public SearchWithMultiModalParam setPrimaryKeyNotIn(List<Object> primaryKeyNotIn) {
        this.primaryKeyNotIn = primaryKeyNotIn;
        return this;
    }

    public SearchWithMultiModalParam setPostProcessInputLimit(Integer postProcessInputLimit) {
        this.postProcessInputLimit = postProcessInputLimit;
        return this;
    }

    public SearchWithMultiModalParam setPostProcessOps(List<Map<String, Object>> postProcessOps) {
        this.postProcessOps = postProcessOps;
        return this;
    }

    public SearchWithMultiModalParam setRetry(Boolean retry) {
        this.retry = retry;
        return this;
    }

    public SearchWithMultiModalParam build() throws Exception {
        VikingDBException vikingDBException = new VikingDBException(1000030, null, "Params does not exist");
        if (this.text == null && this.image == null) {
            throw vikingDBException.getErrorCodeException(1000030, null, "Not any modal data params exist");
        } else {
            this.isBuild = 1;
            return this;
        }
    }
}

