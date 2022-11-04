package com.volcengine.model.video_aiot.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class DeleteTemplateRequest {
    @JSONField(name = "TemplateID")
    String templateID;
    @JSONField(name = "TemplateType")
    String templateType;
}
