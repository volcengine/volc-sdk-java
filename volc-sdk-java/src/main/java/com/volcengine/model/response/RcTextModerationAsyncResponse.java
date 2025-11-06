package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class RcTextModerationAsyncResponse {

    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    TextModerationResult result;

    @Data
    public static class TextModerationResult {

        @JSONField(name = "RequestId")
        private String requestId;

        @JSONField(name = "Code")
        private Integer code;

        @JSONField(name = "Message")
        private String message;

        @JSONField(name = "Data")
        private TextModerationData data;

    }

    @Data
    public static class TextModerationData {

        @JSONField(name = "Decision")
        private String Decision;

        @JSONField(name = "DecisionLabel")
        private String DecisionLabel;

        @JSONField(name = "PassThrough")
        private String PassThrough;

        @JSONField(name = "DataId")
        private String DataId;
    }

}
