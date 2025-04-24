package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.InteractionScriptRecordConfig;

import lombok.Data;

@Data
public class UpdateInteractionScriptRecordConfigRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "Config")
    InteractionScriptRecordConfig Config;
}
