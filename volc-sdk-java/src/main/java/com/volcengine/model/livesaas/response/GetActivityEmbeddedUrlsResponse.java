package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

import java.util.List;

@Data
public class GetActivityEmbeddedUrlsResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetActivityEmbeddedUrlsResponseBody result;

    @Data
    public static class GetActivityEmbeddedUrlsResponseBody {
        @JSONField(name = "EmbeddedUrlConfigs")
        List<EmbeddedUrlConfig> EmbeddedUrlConfigs;
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