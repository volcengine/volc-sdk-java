package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class EmbedImageHmResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    EmbedImageHmResponse.EmbedImageHmResultBean result;

    @Data
    public static class EmbedImageHmResultBean {
        @JSONField(name = "StoreUri")
        String storeUri;
    }
}
