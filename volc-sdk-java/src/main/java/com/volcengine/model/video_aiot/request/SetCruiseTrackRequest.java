package com.volcengine.model.video_aiot.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class SetCruiseTrackRequest {
    @JSONField(name = "DeviceNSID")
    private String deviceNSID;
    @JSONField(name = "ChannelID")
    private String channelID;
    @JSONField(name = "TrackID")
    private int trackID;
    @JSONField(name = "TrackList")
    private List<CruisePoint> trackList;
    @JSONField(name = "Speed")
    private int speed;
    @JSONField(name = "StaySeconds")
    private int staySeconds;

    @Data
    public static class CruisePoint {
        @JSONField(name = "PresetID")
        private int PresetID;
        @JSONField(name = "PresetName")
        private String PresetName;
    }
}
