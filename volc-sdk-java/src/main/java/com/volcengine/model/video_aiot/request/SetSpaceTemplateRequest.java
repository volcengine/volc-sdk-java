package com.volcengine.model.video_aiot.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class SetSpaceTemplateRequest {
    @JSONField(name = "SpaceID")
    String spaceID;
    @JSONField(name = "TemplateType")
    String templateType;
    @JSONField(name = "TemplateID")
    String templateID;
}
