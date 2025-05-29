package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;


@Data
public class GetAudioLiveRiskResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    AudioLiveRiskDetectionResult result;

    @Data
    public static class AudioLiveRiskDetectionResult {
        @JSONField(name = "RequestId")
        private String requestId;
        @JSONField(name = "Code")
        private Integer code;
        @JSONField(name = "Message")
        private String message;
        @JSONField(name = "Data")
        private AudioLiveResult data;
    }

    @Data
    public static class AudioLiveResult {
        @JSONField(name = "Decision")
        private String decision;
        @JSONField(name = "Details")
        private List<AudioLiveDetail> details;
        @JSONField(name = "DataId")
        private String dataId;
        @JSONField(name = "AudioText")
        private String audioText;
        @JSONField(name = "PassThrough")
        private String passThrough;
        @JSONField(name = "FinalLabel")
        private String finalLabel;
        @JSONField(name = "DecisionLabel")
        private String decisionLabel;
    }

    @Data
    public static class AudioLiveDetail {
        @JSONField(name = "StartTime")
        private Integer startTime;
        @JSONField(name = "EndTime")
        private Integer endTime;
        @JSONField(name = "StartTimeStamp")
        private Long startTimeStamp;
        @JSONField(name = "EndTimeStamp")
        private Long endTimeStamp;
        @JSONField(name = "FrameUrl")
        private String frameUrl;
        @JSONField(name = "AudioText")
        private String audioText;
        @JSONField(name = "FrameID")
        private Integer frameId;
        @JSONField(name = "FrameResults")
        private List<FrameResult> frameResults;
        @JSONField(name = "UserId")
        private String UserId;
        @JSONField(name = "SliceId")
        private String SliceId;
        @JSONField(name = "Decision")
        private String Decision;
        @JSONField(name = "LiveFirstGetStreamTime")
        private long LiveFirstGetStreamTime;
        @JSONField(name = "FinalSubLabel")
        private String finalSubLabel;
        @JSONField(name = "DecisionSubLabel")
        private String decisionSubLabel;
    }

    @Data
    public static class FrameResult {
        @JSONField(name = "Label")
        private String label;
        @JSONField(name = "SubLabel")
        private String subLabel;
        @JSONField(name = "Decision")
        private String decision;
        @JSONField(name = "Contexts")
        private List<TextRiskResponse.Context> contexts;
    }

    @Data
    public static class Context {
        @JSONField(name = "MatchedWords")
        private List<String> matchedWords;
        @JSONField(name = "LibName")
        private String libName;
        @JSONField(name = "Positions")
        private List<TextRiskResponse.Position> positions;
    }

    public static class Position {
        @JSONField(name = "StartPos")
        private int startPos;
        @JSONField(name = "EndPos")
        private int endPos;
    }
}