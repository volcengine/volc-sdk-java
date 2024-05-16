package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class ContentSecurityAccessConfigListResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    AccessConfigResult result;

    @Data
    public static class AccessConfigResult {
        @JSONField(name = "RequestId")
        private String requestId;
        @JSONField(name = "Code")
        private Integer code;
        @JSONField(name = "Message")
        private String message;
        @JSONField(name = "Data")
        private List<AccessConfigData> data;
    }

    @Data
    public static class AccessConfigData {
        @JSONField(name = "id")
        private Integer id;
        @JSONField(name = "biztype")
        private String biztype;
        @JSONField(name = "labels")
        private String labels;
        @JSONField(name = "name")
        private String name;
        @JSONField(name = "scene")
        private String scene;
        @JSONField(name = "status")
        private Integer status;
        @JSONField(name = "ocrLabels")
        private String ocrLabels;
        @JSONField(name = "asrLabels")
        private String asrLabels;
        @JSONField(name = "textLibs")
        private String textLibs;
        @JSONField(name = "imageLibs")
        private String imageLibs;
    }

}
