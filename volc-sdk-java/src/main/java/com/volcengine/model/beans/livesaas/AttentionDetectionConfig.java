package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.livesaas.request.UpdateAttentionDetectionConfigRequest;
import lombok.Data;

@Data
public class AttentionDetectionConfig {
    @JSONField(name = "AttentionDetectionType")
    Integer AttentionDetectionType;

    @JSONField(name = "IsOpen")
    Integer IsOpen;

    @JSONField(name = "ReminderCopy")
    String ReminderCopy;

    @JSONField(name = "DetectionRule")
    DetectionRule DetectionRule;
}
