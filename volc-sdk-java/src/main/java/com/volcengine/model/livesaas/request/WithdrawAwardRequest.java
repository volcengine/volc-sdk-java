package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class WithdrawAwardRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "Id")
    Long Id;
}
