package com.volcengine.model.video_aiot.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetStreamDataRequest {
    @JSONField(serialize = false)
    String streamID;
    @JSONField(serialize = false)
    String startTime;
    @JSONField(serialize = false)
    String endTime;
    @JSONField(name = "StreamingIndex")
    int streamingIndex;
    @JSONField(name = "Resolution")
    String resolution;
}
