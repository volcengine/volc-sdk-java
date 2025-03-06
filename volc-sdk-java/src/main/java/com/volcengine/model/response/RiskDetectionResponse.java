package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class RiskDetectionResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    RiskDetectionResult result;

    @Data
    public static class RiskDetectionResult {
        @JSONField(name = "RequestId")
        private String requestId;
        @JSONField(name = "Code")
        private Integer code;
        @JSONField(name = "Message")
        private String message;
        @JSONField(name = "Data")
        private DecisionData data;

    }

    @Data
    public static class DecisionData {
        @JSONField(name = "Score")
        private Integer score;
        @JSONField(name = "Tags")
        private List<Integer> tags;
        @JSONField(name = "Detail")
        private String detail;
        @JSONField(name = "DeviceInfo")
        private DeviceInfo deviceInfo;
    }

    @Data
    public static class DeviceInfo {
        @JSONField(name = "DevSecID")
        private String devSecId;
        @JSONField(name = "TokenCreateTs")
        private Integer tokenCreateTs;
        @JSONField(name = "AccDevSecID")
        private String accDevSecId;
    }
}
