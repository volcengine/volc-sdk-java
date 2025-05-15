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
    public static class ImageDetectionResult {
        @JSONField(name = "RequestId")
        private String requestId;
        @JSONField(name = "Code")
        private Integer code;
        @JSONField(name = "Message")
        private String message;
        @JSONField(name = "Data")
        private ImageDetectionData data;
    }

    @Data
    public static class ImageDetectionData {
        @JSONField(name = "DataId")
        private String dataId;
        @JSONField(name = "Decision")
        private String decision;
        @JSONField(name = "DecisionDetail")
        private String ocrText;
        @JSONField(name = "OcrText")
        private String decisionDetail;
        @JSONField(name = "Results")
        private List<ImageLabelResult> results;
        @JSONField(name = "OcrDetails")
        private List<ImageContentFrameDetail> ocrDetails;
        @JSONField(name = "QrcodeDetails")
        private  List<QrcodeData> qrcodeDetails;
        @JSONField(name = "PassThrough")
        private String passThrough;
    }

    @Data
    public static class ImageLabelResult {
        @JSONField(name = "Label")
        private String label;
        @JSONField(name = "SubLabel")
        private String subLabel;
        @JSONField(name = "Detail")
        private List<String> detail;
        @JSONField(name = "Decision")
        private String decision;
        @JSONField(name = "Frames")
        private List<ImageFramesResult> frames;
    }

    @Data
    public static class ImageFramesResult {
        @JSONField(name = "url")
        private String url;
        @JSONField(name = "id")
        private Double id;
    }
    @Data
    public static class ImageContentFrameDetail  {
        @JSONField(name = "Id")
        private Double id;
        @JSONField(name = "OcrFrameText")
        private String ocrFrameText;
        @JSONField(name = "Positions")
        private List<Positions> positions;
    }
    @Data
    public static class QrcodeData{
        @JSONField(name = "Id")
        private Double id;
        @JSONField(name = "QrcodeResult")
        private List<String> qrcodeResult;
    }

    @Data
    public static class Positions  {
        @JSONField(name = "DetPointsRelative")
        private List<DetPointsRelative> detPointsRelative;
        @JSONField(name = "Text")
        private String text;
    }
    @Data
    public static class DetPointsRelative  {
        @JSONField(name = "X")
        private Double x;
        @JSONField(name = "Y")
        private Double y;
    }
}
