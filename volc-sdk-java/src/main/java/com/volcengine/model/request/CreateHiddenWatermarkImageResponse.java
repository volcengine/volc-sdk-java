package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class CreateHiddenWatermarkImageResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    CreateHiddenWatermarkImageResponse.CreateHiddenWatermarkImageBean result;

    @Data
    public static class CreateHiddenWatermarkImageBean {
        @JSONField(name = "StoreUri")
        String storeUri;
    }
}
