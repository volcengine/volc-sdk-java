package com.volcengine.model.video_aiot.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class SetAlarmGuardRequest {
    @JSONField(name = "DeviceNSID")
    String deviceNSID;
    @JSONField(name = "Enable")
    String enable;
    @JSONField(name = "ChannelID")
    String channelID;
    @JSONField(name = "SipID")
    String sipID;
}
