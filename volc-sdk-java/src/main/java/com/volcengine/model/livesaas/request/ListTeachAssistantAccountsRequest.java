package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ListTeachAssistantAccountsRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
}
