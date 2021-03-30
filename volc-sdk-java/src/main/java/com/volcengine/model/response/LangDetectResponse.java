package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class LangDetectResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "DetectedLanguageList")
    List<DetectedLanguage> detectedLanguageList;

    @Data
    public static class DetectedLanguage {
        @JSONField(name = "Language")
        String language;
        @JSONField(name = "Confidence")
        double confidence;
    }
}
