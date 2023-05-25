package com.volcengine.service.visual.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class VisualHairStyleRequest {
    
    @JSONField(name = "image_base64")
    String imageBase64 = "";

    @JSONField(name = "hair_type")
    String hairType = "0";

    @JSONField(name = "do_risk")
    Boolean doRisk;

}