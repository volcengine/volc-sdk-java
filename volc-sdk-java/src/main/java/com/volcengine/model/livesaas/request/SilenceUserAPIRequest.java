package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class SilenceUserAPIRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "UserId")
    Long UserId;
    @JSONField(name = "Status")
    Boolean Status;
}