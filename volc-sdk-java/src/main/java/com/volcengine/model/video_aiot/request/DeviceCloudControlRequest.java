package com.volcengine.model.video_aiot.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class DeviceCloudControlRequest {
    //action
    public static final String ACTION_PTZ = "PTZControl";
    public static final String ACTION_FI = "FiControl";
    public static final String ACTION_PRESET = "PresetControl";
    //cmd
    //ptz
    public static final String PtzCmdStop = "stop";
    public static final String PtzCmdRight = "right";
    public static final String PtzCmdLeft = "left";
    public static final String PtzCmdDown = "down";
    public static final String PtzCmdUp = "up";
    public static final String PtzCmdRightUp = "rightup";
    public static final String PtzCmdRightDown = "rightdown";
    public static final String PtzCmdLeftUp = "leftup";
    public static final String PtzCmdLeftDown = "leftdown";
    public static final String PtzCmdZoomIn = "zoomin";
    public static final String PtzCmdZoomOut = "zoomout";
    //fi
    public static final String FiCmdStop = "stop";
    public static final String FiCmdFocusFar = "focusfar";
    public static final String FiCmdFocusNear = "focusnear";
    public static final String FiCmdIrisIn = "irisin";
    public static final String FiCmdIrisOut = "irisout";

    //preset
    public static final String PresetCmdSet = "set";
    public static final String PresetCmdGoto = "goto";
    public static final String PresetCmdRemove = "remove";

    @JSONField(serialize = false)
    private String sipID;
    @JSONField(name = "DeviceID")
    private String deviceNSID;
    @JSONField(name = "ChannelID")
    private String channelID;
    @JSONField(name = "Cmd")
    private String cmd;
    @JSONField(name = "action")
    private String action;//ACTION_PTZ or ACTION_FI or ACTION_PRESET
    @JSONField(name = "Para")
    // ptz range:
    //   for left/right/up/down: 0 ~ 255
    //   for zoomin/zoomout: 0 ~ 15
    ///fi
    //    range: 0~0xFF
    //preset
    //    range: 0x01~0xFF
    private int param;
}
