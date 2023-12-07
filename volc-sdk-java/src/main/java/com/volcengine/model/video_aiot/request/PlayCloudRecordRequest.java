package com.volcengine.model.video_aiot.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class PlayCloudRecordRequest {
    @JSONField(name = "StreamID")
    String streamID;
    @JSONField(name = "StartTime")
    long startTime;
    @JSONField(name = "EndTime")
    long endTime;
    @JSONField(name = "TokenValid")
    int tokenValid;
    @JSONField(name = "StreamingIndex")
    int streamingIndex;
    @JSONField(name = "Resolution")
    String resolution;
    @JSONField(name = "WithSub")
    boolean withSub;
}
