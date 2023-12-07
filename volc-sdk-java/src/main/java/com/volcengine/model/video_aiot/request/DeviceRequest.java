package com.volcengine.model.video_aiot.request;

import lombok.Data;

@Data
public class DeviceRequest {
    @Deprecated
    String spaceID;
    String deviceID;
}
