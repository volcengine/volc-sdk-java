package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class UpdateCallbackConfigRequest {
    @JSONField(name = "Id")
    Long Id;

    @JSONField(name = "CallbackUrls")
    String CallbackUrls;

    @JSONField(name = "SubAccountName")
    String SubAccountName;
}