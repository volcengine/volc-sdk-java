package com.volcengine.model.video_aiot.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.video_aiot.response.Device;
import lombok.Data;

@Data
public class CreateDeviceRequest {
    @JSONField(name = "SpaceID")
    String spaceID;
    @JSONField(name = "Type")
    String type;
    @JSONField(name = "DeviceName")
    String deviceName;
    @JSONField(name = "DeviceNSID")
    String deviceNSID;
    @JSONField(name = "UserName")
    String userName;
    @JSONField(name = "Password")
    String password;
    @JSONField(name = "Description")
    String description;
    @JSONField(name = "AutoPullAfterRegiter")
    boolean autoPullAfterRegister;
    @JSONField(name = "RtpTransportTcp")
    boolean rtpTransportTcp;
    @JSONField(name = "DownloadSpeed")
    int downloadSpeed;
    @JSONField(name = "Location")
    String location;
    @JSONField(name = "Coordinates")
    Device.Coordinates coordinates;
    @JSONField(name = "AlertNotification")
    Device.AlertNotification alertNotification;


}
