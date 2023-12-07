package com.volcengine.model.video_aiot.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetDeviceChannelV2Response {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    DeviceChannelInfoV2 deviceChannelInfo;

    @Data
    public static class DeviceChannelInfoV2 {
        @JSONField(name = "DeviceName")
        private String deviceName;
        @JSONField(name = "DeviceID")
        private String deviceID;
        @JSONField(name = "DeviceNSID")
        private String deviceNSID;
        @JSONField(name = "Channels")
        private DeviceChannelV2[] deviceChannels;
    }

    @Data
    public static class DeviceChannelV2 {
        @JSONField(name = "DeviceItem")
        private DeviceItemV2 deviceItem;
        @JSONField(name = "StreamID")
        private String streamID;
        @JSONField(name = "CreateAt")
        private String createAt;
        @JSONField(name = "SubStreams")
        @Deprecated
        private String[] subStreams;
    }

    @Data
    public static class DeviceItemV2 {
        @JSONField(name = "ChannelID")
        private String channelID;
        @JSONField(name = "Name")
        private String name;
        @JSONField(name = "Manufacturer")
        private String manufacturer;
        @JSONField(name = "Model")
        private String model;
        @JSONField(name = "CivilCode")
        private String civilCode;
        @JSONField(name = "Parental")
        private String parental;
        @JSONField(name = "ParentID")
        private String parentID;
        @JSONField(name = "RegisterWay")
        private String registerWay;
        @JSONField(name = "Secrecy")
        private String secrecy;
        @JSONField(name = "IPAddress")
        private String ipAddress;
        @JSONField(name = "Port")
        private int port;
        @JSONField(name = "Longitude")
        private float longitude;
        @JSONField(name = "Latitude")
        private float latitude;
        @JSONField(name = "Status")
        private String status;

        @JSONField(name = "PTZType")
        private int ptzType;
        @JSONField(name = "DownloadSpeed")
        private String downloadSpeed;
        @JSONField(name = "Resolution")
        private String resolution;
    }

    @Data
    public static class CatalogItemInfo {
        @JSONField(name = "PTZType")
        private String ptzType;
        @JSONField(name = "Resolution")
        private String resolution;
        @JSONField(name = "DownloadSpeed")
        private String downloadSpeed;
    }
}
