package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class GetUserTaskAwardResultAPIRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "ExternalId")
    String ExternalId;
    @JSONField(name = "TaskAwardId")
    String TaskAwardId;
    @JSONField(name = "TaskAwardItemId")
    String TaskAwardItemId;
    @JSONField(name = "AwardItemType")
    Integer AwardItemType;
}