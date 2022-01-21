package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

public class VideoRiskResultResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ImageRiskDetectionResponse.ImageDetectionResult result;

    @Data
    public static class ImageDetectionResult  {
        @JSONField(name = "RequestId")
        private String requestId;
        @JSONField(name = "Code")
        private Integer code;
        @JSONField(name = "Message")
        private String message;
        @JSONField(name = "Data")
        private VideoLabelResult data;
    }

    @Data
    public static class VideoLabelResult {
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
        private String offset;
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
