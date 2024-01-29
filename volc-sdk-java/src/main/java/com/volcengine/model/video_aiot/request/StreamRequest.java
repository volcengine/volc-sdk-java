package com.volcengine.model.video_aiot.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class StreamRequest {
    @JSONField(serialize = false)
    String streamID;
    @JSONField(name = "StreamingIndex")
    int streamingIndex;
    @JSONField(name = "Resolution")
    String resolution;
    @JSONField(serialize = false)
    String isSmart;
    @JSONField(serialize = false)
    boolean enableAudioTranscode;
    @JSONField(serialize = false)
    boolean ignoreAudio;
}
