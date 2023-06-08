package com.volcengine.service.visual.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class VisualFaceSwapRequest {
    
    @JSONField(name = "image_base64")
    String imageBase64;

    @JSONField(name = "image_url")
    String imageUrl;

    @JSONField(name = "template_base64")
    String templateBase64;

    @JSONField(name = "template_url")
    String templateUrl;

    @JSONField(name = "action_id")
    String actionId;

    @JSONField(name = "version")
    String version;

    @JSONField(name = "do_risk")
    Boolean doRisk;
}