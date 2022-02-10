package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class TextRiskResponse {
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
        @JSONField(name = "Decision")
        private String decision;
        @JSONField(name = "Result")
        private List<Result> result;
    }

    @Data
    public static class Result {
        @JSONField(name = "Label")
        private String label;
        @JSONField(name = "SubLabel")
        private String subLabel;
        @JSONField(name = "Decision")
        private String decision;
        @JSONField(name = "Contexts")
        private List<Context> contexts;
    }

    @Data
    public static class Context {
        @JSONField(name = "MatchedWords")
        private List<String> matchedWords;
        @JSONField(name = "LibName")
        private String libName;
        @JSONField(name = "positions")
        private List<Position> positions;
    }

    public static class Position {
        @JSONField(name = "StartPos")
        private int startPos;
        @JSONField(name = "EndPos")
        private int endPos;
    }
}
