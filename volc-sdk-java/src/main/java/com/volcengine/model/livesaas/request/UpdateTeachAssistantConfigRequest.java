package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.beans.livesaas.TeachAssistantConfig;

import java.util.List;

@Data
public class UpdateTeachAssistantConfigRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "TeachAssistantConfig")
    TeachAssistantConfig TeachAssistantConfig;
}
