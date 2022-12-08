package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class UpdateCustomizationViewPermissionAPIResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    UpdateCustomizationViewPermissionAPIResponseBody result;

    @Data
    public static class UpdateCustomizationViewPermissionAPIResponseBody {
        @JSONField(name = "SecretKey")
        String SecretKey;
    }
}