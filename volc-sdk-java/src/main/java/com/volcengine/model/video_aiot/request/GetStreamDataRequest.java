package com.volcengine.model.video_aiot.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetStreamDataRequest {
    @JSONField(name = "StreamID")
    String streamID;
    @JSONField(name = "StartTime")
    String startTime;
    @JSONField(name = "EndTime")
    String endTime;
}
