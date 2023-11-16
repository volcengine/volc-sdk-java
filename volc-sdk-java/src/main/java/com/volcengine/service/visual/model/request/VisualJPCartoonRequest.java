package com.volcengine.service.visual.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class VisualJPCartoonRequest {
    
    @JSONField(name = "image_base64")
    String imageBase64="";

    @JSONField(name = "image_url")
    String imageUrl;

    @JSONField(name = "cartoon_type")
    String cartoonType="jpcartoon";

    @JSONField(name = "rotation")
    Integer rotation = 0;

    @JSONField(name = "do_risk")
    Boolean doRisk=false;
}