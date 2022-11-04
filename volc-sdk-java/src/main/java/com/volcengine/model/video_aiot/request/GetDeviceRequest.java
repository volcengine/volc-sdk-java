package com.volcengine.model.video_aiot.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetDeviceRequest {
    @JSONField(name = "SpaceID")
    String spaceID;
    @JSONField(name = "DeviceID")
    String deviceID;
    @JSONField(name = "SipServerID")
    String sipServerID;
}
