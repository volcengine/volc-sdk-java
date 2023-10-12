package com.volcengine.model.video_aiot.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class StatStreamRequest {
    @JSONField(name = "StreamID")
    String streamID;
    @JSONField(name = "StartTime")
    Long startTime;
    @JSONField(name = "EndTime")
    Long endTime;
    @JSONField(name = "Aggregation")
    Integer aggregation;
}
