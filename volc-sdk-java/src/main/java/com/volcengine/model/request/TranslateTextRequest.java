package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class TranslateTextRequest {
    @JSONField(name = "TargetLanguage")
    String TargetLanguage;
    @JSONField(name = "TextList")
    List<String> textList;
}
