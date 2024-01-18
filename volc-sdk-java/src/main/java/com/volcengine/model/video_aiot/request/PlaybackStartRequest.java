package com.volcengine.model.video_aiot.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class PlaybackStartRequest {
    @JSONField(name = "StreamID")
    private String streamID;
    @JSONField(name = "DeviceID")
    private String deviceNSID;
    @JSONField(name = "ChannelID")
    private String channelID;
    @JSONField(name = "StartTime")
    private int startTime;
    @JSONField(name = "EndTime")
    private int endTime;
    @JSONField(name = "EnableAudioTranscode")
    private boolean enableAudioTranscode;
}
