package com.volcengine.model.video_aiot.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class CreateForwardRequest {
    @JSONField(name = "SpaceID")
    String spaceID;
    @JSONField(name = "Source")
    String source;
    @JSONField(name = "StreamName")
    String streamName;
    @JSONField(name = "Description")
    String description;
    @JSONField(name = "Expire")
    int expire;
    @JSONField(name = "Start")
    public Boolean start;
}
