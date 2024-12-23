package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetInviterTokenRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "UserId")
    Long UserId;
    @JSONField(name = "ExternalId")
    String ExternalId;
}
