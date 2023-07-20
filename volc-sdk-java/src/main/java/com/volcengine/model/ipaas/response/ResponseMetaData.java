package com.volcengine.model.ipaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.video_aiot.response.ResponseMetadata;
import lombok.Data;

@Data
public class ResponseMetaData {
    @JSONField(name = "RequestId")
    private String requestId;
    @JSONField(name = "Action")
    private String action;
    @JSONField(name = "Version")
    private String version;
    @JSONField(name = "Service")
    private String service;
    @JSONField(name = "Region")
    private String region;
    @JSONField(name = "Error")
    private ResponseMetadata.Error error;

    @Data
    public static class Error {
        @JSONField(name = "CodeN")
        private int codeN;
        @JSONField(name = "Code")
        private String code;
        @JSONField(name = "Message")
        private String message;
    }
}
