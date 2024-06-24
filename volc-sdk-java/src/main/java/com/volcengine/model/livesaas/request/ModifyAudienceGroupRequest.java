package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ModifyAudienceGroupRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "AudienceGroupId")
    Long AudienceGroupId;
    @JSONField(name = "AudienceGroupName")
    String AudienceGroupName;
}