package com.bytedanceapi.model.response;


import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ResponseMetadata {
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
    private Error error;

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