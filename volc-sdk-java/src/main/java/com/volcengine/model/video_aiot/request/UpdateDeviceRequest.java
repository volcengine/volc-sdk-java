package com.volcengine.model.video_aiot.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.video_aiot.response.Device;
import lombok.Data;

@Data
public class UpdateDeviceRequest {
    @JSONField(name = "SpaceID")
    String spaceID;
    @JSONField(name = "DeviceID")
    String deviceID;
    @JSONField(name = "DeviceName")
    String deviceName;
    @JSONField(name = "UserName")
    String userName;
    @JSONField(name = "Password")
    String password;
    @JSONField(name = "Description")
    String description;
    @JSONField(name = "AutoPullAfterRegiter")
    boolean autoPullAfterRegister;
    @JSONField(name = "AlertNotification")
    Device.AlertNotification alertNotification;

    @JSONField(name = "Location")
    String location;
    @JSONField(name = "Coordinates")
    Device.Coordinates coordinates;
    @JSONField(name = "RtpTransportTcp")
    boolean rtpTransportTcp;
}
