package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class DeleteOfficeConfigRequest {
    @JSONField(name = "OfficeId")
    String OfficeId;
}