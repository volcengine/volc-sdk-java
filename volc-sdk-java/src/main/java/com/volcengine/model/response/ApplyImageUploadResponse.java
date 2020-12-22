package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class ApplyImageUploadResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    UploadImageResult result;

    @Data
    public static class UploadAddressBean {
        @JSONField(name = "SessionKey")
        private String sessionKey;
        @JSONField(name = "StoreInfos")
        private List<StoreInfosBean> storeInfos;
        @JSONField(name = "UploadHosts")
        private List<String> uploadHosts;
    }

    @Data
    public static class StoreInfosBean {
        @JSONField(name = "StoreUri")
        private String storeUri;
        @JSONField(name = "Auth")
        private String auth;
    }

    @Data
    public static class UploadImageResult {
        @JSONField(name = "UploadAddress")
        private UploadAddressBean uploadAddress;
        @JSONField(name = "RequestId")
        private String requestId;
    }
}
