package com.volcengine.model.video_aiot.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class UpdateAuthInSpaceRequest {
    @JSONField(name = "SpaceID")
    String spaceID;
    @JSONField(name = "Domain")
    String domain;
    @JSONField(name = "MainKey")
    String mainKey;
    @JSONField(name = "SpareKey")
    String spareKey;
    @JSONField(name = "ValidDuration")
    int validDuration;
}
