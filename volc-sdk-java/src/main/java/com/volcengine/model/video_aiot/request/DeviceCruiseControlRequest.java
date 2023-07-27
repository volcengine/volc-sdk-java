package com.volcengine.model.video_aiot.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class DeviceCruiseControlRequest {
    public static final String Action_SetSpeed = "SetSpeed";
    public static final String Action_Add = "Add";
    public static final String Action_Remove = "Remove";
    public static final String Action_SetStay = "SetStay";
    public static final String Action_Start = "Start";
    public static final String Action_Stop = "Stop";

    @JSONField(name = "Action")
    private String action;
    @JSONField(name = "DeviceNSID")
    private String deviceNSID;
    @JSONField(name = "ChannelID")
    private String channelID;
    @JSONField(name = "TrackID")
    private int trackID;
    @JSONField(name = "PresetID")
    private int presetID;
    @JSONField(name = "Speed")
    private int speed;
    @JSONField(name = "StaySeconds")
    private int staySeconds;
}
