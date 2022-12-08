package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ExplainProductRequest {
    @JSONField(name = "ProductId")
    Long ProductId;
    @JSONField(name = "ExplainStatus")
    Integer ExplainStatus;
    @JSONField(name = "FloatingStatus")
    Integer FloatingStatus;
    @JSONField(name = "ActivityId")
    Long ActivityId;
}