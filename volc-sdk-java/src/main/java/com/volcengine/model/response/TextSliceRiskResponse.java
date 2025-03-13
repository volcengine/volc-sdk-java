package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class TextSliceRiskResponse {
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
        @JSONField(name = "TextCount")
        private int textCount;
        @JSONField(name = "Decision")
        private String decision;
        @JSONField(name = "DecisionDetail")
        private String decisionDetail;
        @JSONField(name = "FinalLabel")
        private String finalLabel;
        @JSONField(name = "Results")
        private List<TextResult> result;
    }

    @Data
    public static class TextResult {
        @JSONField(name = "RiskText")
        private String riskText;
        @JSONField(name = "RTStartPos")
        private int rtStartPos;
        @JSONField(name = "RTEndPos")
        private int rtEndPos;
        @JSONField(name = "Labels")
        private List<Label> labels;
    }

    @Data
    public static class Label {
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
        @JSONField(name = "Positions")
        private List<Position> positions;
    }

    @Data
    public static class Position {
        @JSONField(name = "StartPos")
        private int startPos;
        @JSONField(name = "EndPos")
        private int endPos;
    }
}
