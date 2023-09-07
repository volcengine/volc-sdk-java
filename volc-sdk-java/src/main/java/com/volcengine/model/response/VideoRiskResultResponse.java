package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class VideoRiskResultResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    VideoDetectionResult result;

    @Data
    public static class VideoDetectionResult {
        @JSONField(name = "RequestId")
        private String requestId;
        @JSONField(name = "Code")
        private Integer code;
        @JSONField(name = "Message")
        private String message;
        @JSONField(name = "Data")
        private VideoData data;
    }

    @Data
    public static class VideoData {
        @JSONField(name = "VideoResults")
        private VideoResults videoResults;
        @JSONField(name = "AudioResults")
        private GetAudioRiskResponse.AudioResult audioResults;
        @JSONField(name = "DataId")
        private String dataId;
        @JSONField(name = "PassThrough")
        private String passThrough;
    }

    @Data
    public static class VideoResults {
        @JSONField(name = "Decision")
        private String decision;
        @JSONField(name = "Frames")
        private List<Frame> frames;
    }

    @Data
    public static class Frame {
        @JSONField(name = "Url")
        private String url;
        @JSONField(name = "Offset")
        private float offset;
        @JSONField(name = "UserId")
        private String UserId;
        @JSONField(name = "SliceId")
        private String SliceId;
        @JSONField(name = "Decision")
        private String Decision;
        @JSONField(name = "Results")
        private List<FrameResult> results;
    }

    @Data
    public static class FrameResult {
        @JSONField(name = "Decision")
        private String decision;
        @JSONField(name = "Label")
        private String label;
        @JSONField(name = "SubLabel")
        private String subLabel;
        @JSONField(name = "Detail")
        private List<String> detail;
    }
}
