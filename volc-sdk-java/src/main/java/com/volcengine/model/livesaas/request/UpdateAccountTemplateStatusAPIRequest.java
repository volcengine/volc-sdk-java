package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;


@Data
public class UpdateAccountTemplateStatusAPIRequest {
    @JSONField(name = "TemplateId")
    Long TemplateId;
    @JSONField(name = "Status")
    Integer Status;
}