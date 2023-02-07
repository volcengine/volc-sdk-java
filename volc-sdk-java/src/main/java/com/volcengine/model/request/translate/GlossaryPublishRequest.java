package com.volcengine.model.request.translate;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.Map;

@Data
public class GlossaryPublishRequest {
    @JSONField(name = "Name")
    String name;

    @JSONField(name = "SourceLanguage")
    String sourceLanguage;

    @JSONField(name = "TargetLanguage")
    String targetLanguage;

    @JSONField(name = "Entries")
    Map<String, String> entries;
}
