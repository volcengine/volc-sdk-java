package com.volcengine.model.request.translate;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class TranslateTextRequest {
    @JSONField(name = "SourceLanguage")
    String sourceLanguage;

    @JSONField(name = "TargetLanguage")
    String targetLanguage;

    @JSONField(name = "TextList")
    List<String> textList;

    @JSONField(name = "Options")
    Options options;

    @Data
    public static class Options {
        @JSONField(name = "MimeType")
        String mimeType;
        @JSONField(name = "Category")
        String category;
        @JSONField(name = "Extra")
        Map<String, String> extra;
    }
}
