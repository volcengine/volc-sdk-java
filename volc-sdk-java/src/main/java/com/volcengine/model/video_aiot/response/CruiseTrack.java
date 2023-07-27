package com.volcengine.model.video_aiot.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class CruiseTrack {
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
}
