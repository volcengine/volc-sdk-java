package com.volcengine.model.video_aiot.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.video_aiot.response.Stream;
import lombok.Data;

@Data
public class UpdateStreamRequest {
    @JSONField(name = "SpaceID")
    String spaceID;
    @JSONField(name = "StreamID")
    String streamID;
    @JSONField(name = "StreamName")
    String streamName;
    @JSONField(name = "Description")
    String description;
    @JSONField(name = "Screenshot")
    Stream.StreamTemplate screenshot;
    @JSONField(name = "Record")
    Stream.StreamTemplate Record;
    @JSONField(name = "Status")
    String status;
}
