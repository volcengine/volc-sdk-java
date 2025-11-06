package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetActivityLoginSecretRequest {
    @JSONField(name = "ActivityId")
    private Long ActivityId;

    @JSONField(name = "Mode")
    private Integer Mode;
}