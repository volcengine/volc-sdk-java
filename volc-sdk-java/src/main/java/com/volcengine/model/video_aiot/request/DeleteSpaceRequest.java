package com.volcengine.model.video_aiot.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class DeleteSpaceRequest {
    @JSONField(name = "SpaceID")
    String spaceID;
}
