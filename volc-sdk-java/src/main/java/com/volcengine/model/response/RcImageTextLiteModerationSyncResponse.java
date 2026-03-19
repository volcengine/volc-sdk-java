package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class RcImageTextLiteModerationSyncResponse {

    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    RcImageTextLiteModerationResult result;

    @Data
    public static class RcImageTextLiteModerationResult {

        @JSONField(name = "RequestId")
        private String requestId;

        @JSONField(name = "Code")
        private Integer code;

        @JSONField(name = "Message")
        private String message;

        @JSONField(name = "Data")
        private RcImageTextLiteModerationData data;

    }

    @Data
    public static class RcImageTextLiteModerationData {

        @JSONField(name = "Decision")
        private String Decision;

        @JSONField(name = "DecisionLabel")
        private String DecisionLabel;

        @JSONField(name = "DecisionLabelName")
        private String DecisionLabelName;

        @JSONField(name = "HitLabels")
        private List<String> HitLabels;

        @JSONField(name = "HitLabelNames")
        private List<String> HitLabelNames;

        @JSONField(name = "PassThrough")
        private String PassThrough;

    }

}
