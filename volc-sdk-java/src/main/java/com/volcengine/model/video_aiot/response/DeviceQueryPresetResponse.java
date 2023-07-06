package com.volcengine.model.video_aiot.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
public class DeviceQueryPresetResponse {
    @JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    private PresetInfo presetInfo;

    @NoArgsConstructor
    @Data
    public static class PresetInfo {
        @JSONField(name = "Num")
        public Integer num;
        @JSONField(name = "Items")
        public List<PresetItem> items;

    }

    public static class PresetItem {
        @JSONField(name = "PresetID")
        public Integer presetID;
        @JSONField(name = "PresetName")
        public String presetName;
    }
}
