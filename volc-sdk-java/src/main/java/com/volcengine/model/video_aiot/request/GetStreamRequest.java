package com.volcengine.model.video_aiot.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetStreamRequest {
    @JSONField(serialize = false)
    String streamID;
    @JSONField(serialize = false)
    String freshExpiredPull;
    @JSONField(serialize = false)
    int streamingIndex;
    @JSONField(serialize = false)
    String resolution;
    boolean enableAudioTranscode;
}
