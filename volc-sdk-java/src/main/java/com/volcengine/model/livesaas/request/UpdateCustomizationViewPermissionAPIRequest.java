package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;


@Data
public class UpdateCustomizationViewPermissionAPIRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "CustomUrl")
    String CustomUrl;
    @JSONField(name = "CustomApp")
    String CustomApp;
    @JSONField(name = "ErrorRedirectUrl")
    String ErrorRedirectUrl;
}