package com.volcengine.model.video_aiot.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class UpdateSpaceRequest {
    @JSONField(name = "SpaceID")
    String spaceID;
    @JSONField(name = "SpaceName")
    String spaceName;
    @JSONField(name = "Description")
    String description;
    @JSONField(name = "Rtmp")
    CreateSpaceRequest.RtmpOptions rtmp;
    @JSONField(name = "GB")
    CreateSpaceRequest.GBOptions gb;
    @JSONField(name = "CallbackURL")
    String callback;
}
