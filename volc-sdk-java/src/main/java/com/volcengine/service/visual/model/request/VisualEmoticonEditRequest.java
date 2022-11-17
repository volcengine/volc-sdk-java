package com.volcengine.service.visual.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class VisualEmoticonEditRequest {
    
    @JSONField(name = "image_base64")
    String imageBase64;

    @JSONField(name = "service_choice")
    Integer serviceChoice = 0;
}