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

    @JSONField(serialize = false)
    private String sipID;
    @JSONField(name = "Action")
    private String action;
    @JSONField(name = "DeviceID")
    private String deviceID;
    @JSONField(name = "ChannelID")
    private String channelID;
    @JSONField(name = "GroupID")
    private String groupID;
    @JSONField(name = "PresetID")
    private int presetID;
    @JSONField(name = "Para")
    private int para;
}
