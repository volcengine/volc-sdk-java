package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class WithdrawCheckInRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "CheckInId")
    String CheckInId;
}
