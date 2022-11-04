package com.volcengine.model.video_aiot.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.HashMap;

@Data
public class Device {
    @JSONField(name = "SpaceID")
    String spaceID;
    @JSONField(name = "Type")
    String type;
    @JSONField(name = "DeviceName")
    String deviceName;
    @JSONField(name = "DeviceID")
    String deviceID;
    @JSONField(name = "DeviceNSID")
    String deviceNSID;
    @JSONField(name = "Username")
    String userName;
    @JSONField(name = "Password")
    String password;
    @JSONField(name = "Description")
    String description;
    @JSONField(name = "AutoPullAfterRegiter")
    boolean autoPullAfterRegister;
    @JSONField(name = "CreatedAt")
    String createAt;
    @JSONField(name = "UpdatedAt")
    String updateAt;
    @JSONField(name = "Manufactory")
    String manufactory;
    @JSONField(name = "AlertNotification")
    AlertNotification alertNotification;
    @JSONField(name = "DeviceStreams")
    HashMap<String, DeviceStreams> deviceStreams;
    @JSONField(name = "Status")
    String status;
    @JSONField(name = "ChannelNum")
    int channelNum;
    @JSONField(name = "RtpTransportTcp")
    boolean rtpTransportTcp;
    @JSONField(name = "Location")
    String location;
    @JSONField(name = "Coordinates")
    Coordinates coordinates;

    @Data
    public static class AlertNotification {
        @JSONField(name = "Enabled")
        boolean enabled;
        @JSONField(name = "Phone")
        boolean phone;
        @JSONField(name = "Device")
        boolean device;
        @JSONField(name = "SMS")
        boolean sms;
        @JSONField(name = "GPS")
        boolean gps;
        @JSONField(name = "Video")
        boolean video;
        @JSONField(name = "DeviceFault")
        boolean deviceFault;
        @JSONField(name = "Other")
        boolean other;
    }

    @Data
    public static class Coordinates {
        @JSONField(name = "Longitude")
        double longitude;
        @JSONField(name = "Latitude")
        double latitude;
    }

    @Data
    public static class DeviceStreams {
        @JSONField(name = "StreamID")
        String streamID;
        @JSONField(name = "PullUrls")
        String[] pullUrls;
        @JSONField(name = "PushUrl")
        String pushUrl;
    }
}
