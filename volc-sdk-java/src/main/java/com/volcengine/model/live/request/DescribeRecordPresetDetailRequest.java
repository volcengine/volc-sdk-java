package com.volcengine.model.live.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.live.PVA;
import lombok.Data;

@Data
public class DescribeRecordPresetDetailRequest {

    @JSONField(name = "PresetListTob")
    PVA[] PresetListTob;

//    @Data
//    private static class PVA {
//
//        @JSONField(name = "PresetName")
//        String presetName;
//        @JSONField(name = "Vhost")
//        String vhost;
//        @JSONField(name = "App")
//        String app;
//    }

}
