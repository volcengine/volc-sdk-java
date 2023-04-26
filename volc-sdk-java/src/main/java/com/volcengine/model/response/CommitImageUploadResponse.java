package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.ImageInfo;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class CommitImageUploadResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    CommitImageUploadResultBean result;

    @Data
    public static class CommitImageUploadResultBean {
        @JSONField(name = "RequestId")
        String requestId;
        @JSONField(name = "Results")
        List<UploadImageResultBean> results;
        @JSONField(name = "PluginResult")
        List<ImageInfo> imageInfos;
    }

    @Data
    public static class UploadImageResultBean {
        @JSONField(name = "Uri")
        String uri;
        @JSONField(name = "UriStatus")
        Integer uriStatus;
        @JSONField(name = "Encryption")
        EncryptionBean encryption;
    }

    @Data
    public static class EncryptionBean {
        @JSONField(name = "Uri")
        String uri;
        @JSONField(name = "SecretKey")
        String secretKey;
        @JSONField(name = "Algorithm")
        String algorithm;
        @JSONField(name = "Version")
        String version;
        @JSONField(name = "SourceMd5")
        String sourceMd5;
        @JSONField(name = "Extra")
        Map<String, String> extra;
    }
}
