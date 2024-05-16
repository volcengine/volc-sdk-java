package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class ContentSecurityCustomLibListResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    CustomLibResult result;

    @Data
    public static class CustomLibResult {
        @JSONField(name = "RequestId")
        private String requestId;
        @JSONField(name = "Code")
        private Integer code;
        @JSONField(name = "Message")
        private String message;
        @JSONField(name = "Data")
        private List<CustomLibData> data;
    }

    @Data
    public static class CustomLibData {
        @JSONField(name = "status")
        private Integer status;
        @JSONField(name = "decision")
        private String decision;
        @JSONField(name = "name")
        private String name;
        @JSONField(name = "matchType")
        private String matchType;
        @JSONField(name = "biztypes")
        private String biztypes;
        @JSONField(name = "description")
        private String description;
        @JSONField(name = "count")
        private Integer count;
    }

}
