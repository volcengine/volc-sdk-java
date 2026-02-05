package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class PresetScriptArgs {
    @JSONField(name = "PresetScript")
    String PresetScript;
}
