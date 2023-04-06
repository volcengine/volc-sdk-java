package com.volcengine.model.video_aiot.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class PlaybackControlRequest {
    @JSONField(name = "StreamID")
    private String streamID;
    @JSONField(name = "Cmd")
    private int cmd;
    @JSONField(name = "Ntp")
    private String ntp;
    @JSONField(name = "Scale")
    private float scale;
}
