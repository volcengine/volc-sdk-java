package com.volcengine.model.live.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.live.PVA;
import lombok.Data;

@Data
public class DescribeSnapshotPresetDetailRequest {

    @JSONField(name = "PresetListTob")
    PVA[] PresetListTob;

}
