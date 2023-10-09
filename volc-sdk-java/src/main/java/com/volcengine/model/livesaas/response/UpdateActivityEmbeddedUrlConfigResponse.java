package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

@Data
public class UpdateActivityEmbeddedUrlConfigResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    UpdateActivityEmbeddedUrlConfigResponseBody result;

    @Data
    public static class UpdateActivityEmbeddedUrlConfigResponseBody {
        @JSONField(name = "EmbeddedUrlConfig")
        EmbeddedUrlConfig EmbeddedUrlConfig;
        @JSONField(name = "VerticalIconUrl")
        String VerticalIconUrl;
    }

    @Data
    public static class EmbeddedUrlConfig {
        @JSONField(name = "MenuName")
        String MenuName;
        @JSONField(name = "Id")
        Long Id;
        @JSONField(name = "MobileUrl")
        String MobileUrl;
        @JSONField(name = "PCUrl")
        String PCUrl;
        @JSONField(name = "IsEnable")
        Boolean IsEnable;
    }
}