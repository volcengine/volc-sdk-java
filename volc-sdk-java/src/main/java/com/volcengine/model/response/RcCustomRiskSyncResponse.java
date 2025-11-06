package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class RcCustomRiskSyncResponse {

    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    CustomRiskResult result;

    @Data
    public static class CustomRiskResult {

        @JSONField(name = "RequestId")
        private String requestId;

        @JSONField(name = "Code")
        private Integer code;

        @JSONField(name = "Message")
        private String message;

        @JSONField(name = "Data")
        private CustomRiskData data;

    }

    @Data
    public static class CustomRiskData {

        @JSONField(name = "Decision")
        private String Decision;

        @JSONField(name = "DecisionLabel")
        private String DecisionLabel;

        @JSONField(name = "DecisionRate")
        private Double DecisionRate;

        @JSONField(name = "DecisionReason")
        private String DecisionReason;

    }

}
