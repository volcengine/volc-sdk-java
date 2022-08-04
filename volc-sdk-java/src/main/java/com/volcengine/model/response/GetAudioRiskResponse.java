package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class GetAudioRiskResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    AudioRiskDetectionResult result;

    @Data
    public static class AudioRiskDetectionResult  {
        @JSONField(name = "RequestId")
        private String requestId;
        @JSONField(name = "Code")
        private Integer code;
        @JSONField(name = "Message")
        private String message;
        @JSONField(name = "Data")
        private AudioResult data;
    }

    @Data
    public static class AudioResult {
        @JSONField(name = "Decision")
        private String decision;
        @JSONField(name = "Details")
        private List<AudioDetail> details;
        @JSONField(name = "DataId")
        private String dataId;
    }

    @Data public static class AudioDetail {
        @JSONField(name = "StartTime")
        private Float startTime;
        @JSONField(name = "EndTime")
        private Float endTime;
        @JSONField(name = "FrameUrl")
        private String frameUrl;
        @JSONField(name = "AudioText")
        private String audioText;
        @JSONField(name = "FrameID")
        private Integer frameId;
        @JSONField(name = "FrameResult")
        private List<FrameResult> frameResults;
    }

    @Data public static class FrameResult {
        @JSONField(name = "Label")
        private String label;
        @JSONField(name = "SubLabel")
        private String subLabel;
        @JSONField(name = "Decision")
        private String decision;
        @JSONField(name = "MatchedWords")
        private List<String> matchedWords;
        @JSONField(name = "LibId")
        private String libId;
        @JSONField(name = "LibName")
        private String libName;
    }
}
