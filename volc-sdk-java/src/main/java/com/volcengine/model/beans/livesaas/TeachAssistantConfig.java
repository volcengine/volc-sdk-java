package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class TeachAssistantConfig {
    @JSONField(name = "Label")
    String Label;
    @JSONField(name = "Logo")
    String Logo;
}
