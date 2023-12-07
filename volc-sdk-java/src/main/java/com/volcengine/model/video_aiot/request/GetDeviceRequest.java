package com.volcengine.model.video_aiot.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetDeviceRequest {
    @JSONField(serialize = false)
    @Deprecated
    String spaceID;
    @JSONField(serialize = false)
    String deviceID;
    @Deprecated
    @JSONField(serialize = false)
    String sipServerID;
}
