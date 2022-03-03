package com.volcengine.model.live.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class DeleteRecordPresetRequest {

    @JSONField(name = "Vhost")
    String vhost;
    @JSONField(name = "App")
    String app;
    @JSONField(name = "Preset")
    String preset;

}
