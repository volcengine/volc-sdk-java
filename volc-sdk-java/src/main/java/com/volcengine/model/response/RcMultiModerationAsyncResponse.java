package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class RcMultiModerationAsyncResponse {

    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    MultiModerationResult result;

    @Data
    public static class MultiModerationResult {

        @JSONField(name = "RequestId")
        private String requestId;

        @JSONField(name = "Code")
        private Integer code;

        @JSONField(name = "Message")
        private String message;

        @JSONField(name = "Data")
        private MultiModerationData data;

    }

    @Data
    public static class MultiModerationData {

        @JSONField(name = "Decision")
        private String Decision;

        @JSONField(name = "DecisionLabel")
        private String DecisionLabel;

        @JSONField(name = "DataId")
        private String DataId;

        @JSONField(name = "HitLabels")
        private List<String> HitLabels;

        @JSONField(name = "PassThrough")
        private String PassThrough;

    }

}
