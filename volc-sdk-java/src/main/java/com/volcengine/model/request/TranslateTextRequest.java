package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class TranslateTextRequest {
    @JSONField(name = "SourceLanguage")
    String sourceLanguage;

    @JSONField(name = "TargetLanguage")
    String targetLanguage;

    @JSONField(name = "TextList")
    List<String> textList;
}
