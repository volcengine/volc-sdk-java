package com.volcengine.model.video_aiot.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class DeviceQueryPresetRequest {
    @JSONField(serialize = false)
    private String sipID;
    @JSONField(name = "DeviceID")
    private String deviceID;
    @JSONField(name = "ChannelID")
    private String channelID;
    @JSONField(name = "TimeOut")
    private int timeout;
}
