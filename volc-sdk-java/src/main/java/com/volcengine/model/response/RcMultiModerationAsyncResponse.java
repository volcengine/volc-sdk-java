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

        @JSONField(name="DecisionReason")
        private String DecisionReason;

        @JSONField(name = "DecisionLabel")
        private String DecisionLabel;

        @JSONField(name = "DecisionLabelName")
        private String DecisionLabelName;

        @JSONField(name ="DecisionRate")
        private Double DecisionRate;

        @JSONField(name = "HitLabels")
        private List<String> HitLabels;

        @JSONField(name = "DecisionDetail")
        private List<MultiModerationDecision> DecisionDetail;

        @JSONField(name = "DataId")
        private String DataId;

        @JSONField(name = "PassThrough")
        private String PassThrough;

    }

    @Data
    public static class MultiModerationDecision {

        @JSONField(name = "Content")
        private List<MultiModerationContent> Content;

        @JSONField(name = "Decision")
        private String Decision;

        @JSONField(name="DecisionReason")
        private String DecisionReason;

        @JSONField(name = "DecisionLabel")
        private String DecisionLabel;

        @JSONField(name = "DecisionLabelName")
        private String DecisionLabelName;

        @JSONField(name ="DecisionRate")
        private Double DecisionRate;
    }

    @Data
    public static class MultiModerationContent {
        @JSONField(name = "Type")
        private String Type;

        @JSONField(name="Tag")
        private String Tag;

        @JSONField(name = "Text")
        private String Text;

        @JSONField(name = "Image")
        private String Image;

        @JSONField(name = "UniqId")
        private String UniqId;
    }

}
