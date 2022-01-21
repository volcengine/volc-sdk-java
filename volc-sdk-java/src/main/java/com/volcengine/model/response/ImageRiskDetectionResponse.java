package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class ImageRiskDetectionResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ImageDetectionResult result;

    @Data
    public static class ImageDetectionResult  {
        @JSONField(name = "RequestId")
        private String requestId;
        @JSONField(name = "Code")
        private Integer code;
        @JSONField(name = "Message")
        private String message;
        @JSONField(name = "Results")
        private String results;
    }

    @Data
    public static class ImageLabelResult {
        @JSONField(name = "Label")
        private String label;
        @JSONField(name = "SubLabel")
        private String subLabel;
        @JSONField(name = "Detail")
        private List<String> detail;
        @JSONField(name = "Frames")
        private List<Object> frames;
    }
}
