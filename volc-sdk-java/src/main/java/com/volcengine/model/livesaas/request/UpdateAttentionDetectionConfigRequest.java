package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.AttentionDetectionConfig;
import lombok.Data;

import java.util.List;

@Data
public class UpdateAttentionDetectionConfigRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;

    @JSONField(name = "AttentionDetectionConfigArray")
    List<AttentionDetectionConfig> AttentionDetectionConfigArray;
}
