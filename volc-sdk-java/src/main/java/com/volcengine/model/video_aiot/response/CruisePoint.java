package com.volcengine.model.video_aiot.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class CruisePoint {
    @JSONField(name = "PresetID")
    private int PresetID;
    @JSONField(name = "PresetName")
    private String PresetName;
}
