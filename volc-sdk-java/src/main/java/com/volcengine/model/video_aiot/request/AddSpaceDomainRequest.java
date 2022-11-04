package com.volcengine.model.video_aiot.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class AddSpaceDomainRequest {
    @JSONField(name = "SpaceID")
    String spaceID;
    @JSONField(name = "Domain")
    String domain;
    @JSONField(name = "Type")
    String type;    //push or pull
}
