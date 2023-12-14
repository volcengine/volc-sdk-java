package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.AttentionDetectionConfig;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class GetAttentionDetectionConfigResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    AttentionDetectionConfigArray result;

    @Data
    public static class AttentionDetectionConfigArray {
        @JSONField(name = "AttentionDetectionConfigArray")
        List<AttentionDetectionConfig> AttentionDetectionConfigArray;
    }
}
