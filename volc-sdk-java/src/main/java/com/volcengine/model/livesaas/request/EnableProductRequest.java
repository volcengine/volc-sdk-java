package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class EnableProductRequest {
    @JSONField(name = "EnableStatus")
    Integer EnableStatus;
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "ProductId")
    Long ProductId;
}