package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class SendProductOrderMessageRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "ProductId")
    Long ProductId;
    @JSONField(name = "UserName")
    String UserName;
    @JSONField(name = "Amount")
    Integer Amount;
}
