package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ChangeActivityBonusTaskStatusRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;

    @JSONField(name = "Id")
    Long Id;

    @JSONField(name = "Start")
    Boolean Start;
}

