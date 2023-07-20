package com.volcengine.model.ipaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class ListInstanceResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetaData responseMetadata;
    @JSONField(name = "Result")
    ListInstanceResponse.InstanceList result;

    @Data
    public static class InstanceList {
        @JSONField(name = "total")
        long total;
        @JSONField(name = "row")
        List<Instance> instances;
    }
}
