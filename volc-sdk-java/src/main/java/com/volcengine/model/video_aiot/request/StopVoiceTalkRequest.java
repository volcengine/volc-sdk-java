package com.volcengine.model.video_aiot.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class StopVoiceTalkRequest {
    @JSONField(name = "SpaceID")
    String spaceID;
    @JSONField(name = "DeviceNSID")
    String deviceNSID;
}
