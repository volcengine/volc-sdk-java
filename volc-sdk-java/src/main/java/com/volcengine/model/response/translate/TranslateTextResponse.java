package com.volcengine.model.response.translate;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class TranslateTextResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "TranslationList")
    List<Translation> translationList;

    @Data
    public static class Translation {
        @JSONField(name = "Translation")
        String translation;
        @JSONField(name = "DetectedSourceLanguage")
        String detectedSourceLanguage;
        @JSONField(name = "Extra")
        Map<String, String> extra;
    }
}
