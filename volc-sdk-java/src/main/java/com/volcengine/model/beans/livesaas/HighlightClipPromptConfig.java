package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class HighlightClipPromptConfig {
    @JSONField(name = "Scene")
    Integer Scene;
    @JSONField(name = "PromptMsg")
    String PromptMsg;
}
