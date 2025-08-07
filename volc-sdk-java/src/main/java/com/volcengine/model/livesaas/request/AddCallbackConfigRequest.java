package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class AddCallbackConfigRequest {
    @JSONField(name = "CallbackType")
    Integer CallbackType;

    @JSONField(name = "CallbackUrls")
    String CallbackUrls;

    @JSONField(name = "SubAccountName")
    String SubAccountName;
}