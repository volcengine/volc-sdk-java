package com.volcengine.model.request.translate;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class LangDetectRequest {
    @JSONField(name = "TextList")
    List<String> textList;
}
