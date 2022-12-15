package com.volcengine.model.video_aiot.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetDataProjectWithBindWidthAndFlowRequest {
    @JSONField(name = "SpaceID")
    String spaceID;
    @JSONField(name = "StartTime")
    String startTime;
    @JSONField(name = "EndTime")
    String endTime;
    @JSONField(name = "Data")
    String data;

    @JSONField(name = "StreamName")
    String streamName;
}
