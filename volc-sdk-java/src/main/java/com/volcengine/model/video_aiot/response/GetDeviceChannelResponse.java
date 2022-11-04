package com.volcengine.model.video_aiot.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetDeviceChannelResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    DeviceChannelInfo deviceChannelInfo;

    @Data
    public static class DeviceChannelInfo {
        @JSONField(name = "DeviceName")
        private String deviceName;
        @JSONField(name = "DeviceID")
        private String deviceID;
        @JSONField(name = "DeviceNSID")
        private String deviceNSID;
        @JSONField(name = "Channels")
        private DeviceChannel[] deviceChannels;
    }

    @Data
    public static class DeviceChannel {
        @JSONField(name = "DeviceItem")
        private DeviceItem deviceItem;
        @JSONField(name = "StreamID")
        private String streamID;
        @JSONField(name = "CreateAt")
        private String createAt;
    }

    @Data
    public static class DeviceItem {
        @JSONField(name = "DeviceID")
        private String deviceID;
        @JSONField(name = "Event")
        private String event;
        @JSONField(name = "Manufacturer")
        private String manufacturer;
        @JSONField(name = "Model")
        private String model;
        @JSONField(name = "Owner")
        private String owner;
        @JSONField(name = "CivilCode")
        private String civilCode;
        @JSONField(name = "Address")
        private String address;
        @JSONField(name = "Parental")
        private String parental;
        @JSONField(name = "ParentID")
        private String parentID;
        @JSONField(name = "RegisterWay")
        private String registerWay;
        @JSONField(name = "Secrecy")
        private String secrecy;
        @JSONField(name = "StreamNum")
        private String streamNum;
        @JSONField(name = "IPAddress")
        private String ipAddress;
        @JSONField(name = "Port")
        private String port;
        @JSONField(name = "Password")
        private String password;
        @JSONField(name = "Status")
        private String status;
        @JSONField(name = "CatalogItemInfo")
        private CatalogItemInfo catalogItemInfo;
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
