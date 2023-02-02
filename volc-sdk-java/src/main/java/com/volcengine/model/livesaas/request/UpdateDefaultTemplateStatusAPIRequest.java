package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;


@Data
public class UpdateDefaultTemplateStatusAPIRequest {
    @JSONField(name = "TemplateId")
    Long TemplateId;
    @JSONField(name = "Status")
    Long Status;
}