package com.volcengine.model.live;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class PVA {
    @JSONField(name = "PresetName")
    String presetName;
    @JSONField(name = "Vhost")
    String vhost;
    @JSONField(name = "App")
    String app;

}
