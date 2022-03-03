package com.volcengine.model.live.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class DeleteTranscodePresetRequest {
    @JSONField(name = "Preset")
    String Preset;
    @JSONField(name = "Vhost")
    String Vhost;
    @JSONField(name = "App")
    String App;
}
