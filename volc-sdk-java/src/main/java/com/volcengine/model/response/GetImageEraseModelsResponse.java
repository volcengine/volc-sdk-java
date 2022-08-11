package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetImageEraseModelsResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetImageEraseModelsResponse.GetImageEraseModelsResultBean result;

    @Data
    public static class GetImageEraseModelsResultBean{
        @JSONField(name = "Models")
        String[] models;
    }
}
