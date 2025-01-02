package com.volcengine.service.vikingDB.common;

import lombok.Data;

import java.util.List;

@Data
public class FetchDataParam {
    private List<String> outputFields = null;
    private Object partition = "default";

    public FetchDataParam setOutputFields(List<String> outputFields) {
        this.outputFields = outputFields;
        return this;
    }

    public FetchDataParam setPartition(Object partition) {
        this.partition = partition;
        return this;
    }

    public FetchDataParam build() {
        return this;
    }

}
