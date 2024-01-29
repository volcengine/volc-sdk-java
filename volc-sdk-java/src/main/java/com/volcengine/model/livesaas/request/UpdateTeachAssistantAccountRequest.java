package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.TeachAssistantAccountReq;
import lombok.Data;

@Data
public class UpdateTeachAssistantAccountRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "TeachAssistantAccount")
    TeachAssistantAccountReq TeachAssistantAccount;
}
