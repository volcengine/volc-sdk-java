package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class TranscodeVidAPIInfo {
    @JSONField(name = "PlayUrl")
    String PlayUrl;
    @JSONField(name = "Format")
    String Format;
    @JSONField(name = "Definition")
    String Definition;
}