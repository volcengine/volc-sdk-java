package com.volcengine.model.video_aiot.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.math.BigInteger;
import java.util.List;

@Data
public class Stream {
    @JSONField(name = "SpaceID")
    String spaceID;
    @JSONField(name = "SIPID")
    String sipID;
    @JSONField(name = "StreamName")
    String streamName;
    @JSONField(name = "StreamID")
    String streamID;
    @JSONField(name = "SpaceAccessType")
    String spaceAccessType;
    @JSONField(name = "DeviceID")
    String deviceID;
    @JSONField(name = "DeviceNSID")
    String deviceNSID;
    @JSONField(name = "ChannelID")
    String channelID;
    @JSONField(name = "Status")
    String status;
    @JSONField(name = "Description")
    String Description;
    @JSONField(name = "CreatedAt")
    String createAt;
    @JSONField(name = "UpdatedAt")
    String updateAt;
    @JSONField(name = "PushUrl")
    String pushUrl;
    @JSONField(name = "PullUrls")
    String[] pullUrls;
    @JSONField(name = "PushUrlDDL")
    int pushUrlDDL;
    @JSONField(name = "FailedTimes")
    int failedTimes;
    @JSONField(name = "RecentPushTs")
    String recentPushTs;
    @JSONField(name = "RtpTransportTcp")
    Boolean rtpTransportTcp;
    @JSONField(name = "Screenshot")
    StreamTemplate screenshot;
    @JSONField(name = "Record")
    StreamTemplate record;
    @JSONField(name = "AI")
    StreamTemplate ai;
    @JSONField(name = "Logs")
    List<LogInfo> logs;

    @Data
    public static class StreamTemplate {
        @JSONField(name = "TemplateName")
        String templateName;
        @JSONField(name = "TemplateID")
        String templateID;
    }

    @Data
    public static class LogInfo {
        @JSONField(name = "LogTime")
        BigInteger logTime;
        @JSONField(name = "LogLevel")
        String logLevel;
        @JSONField(name = "Message")
        String message;
    }
}