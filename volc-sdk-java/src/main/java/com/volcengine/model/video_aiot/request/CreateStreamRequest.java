package com.volcengine.model.video_aiot.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class CreateStreamRequest {
    @JSONField(name = "SpaceID")
    String spaceID;
    @JSONField(name = "StreamName")
    String streamName;
    @JSONField(name = "Description")
    String description;
}
