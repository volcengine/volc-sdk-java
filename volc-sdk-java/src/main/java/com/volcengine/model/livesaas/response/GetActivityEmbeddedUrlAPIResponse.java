package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

import java.util.List;
import java.util.Map;

@Data
public class GetActivityEmbeddedUrlAPIResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    Map<String, EmbeddedWebUrlAPIItem> result;

    @Data
    public static class EmbeddedWebUrlAPIItem {
        @JSONField(name = "Id")
        Long Id;
        @JSONField(name = "MobileUrl")
        String MobileUrl;
        @JSONField(name = "PCUrl")
        String PCUrl;
    }
}