package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ExtractImageHmResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ExtractImageHmResponse.ExtractImageHmResultBean result;

    @Data
    public static class ExtractImageHmResultBean {
        @JSONField(name = "Info")
        String info;
        @JSONField(name = "StatusCode")
        int statusCode;
    }
}

