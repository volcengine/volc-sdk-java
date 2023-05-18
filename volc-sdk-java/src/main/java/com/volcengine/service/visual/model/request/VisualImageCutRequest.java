package com.volcengine.service.visual.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class VisualImageCutRequest {
    
    @JSONField(name = "image_base64")
    String imageBase64 = "";

    @JSONField(name = "width")
    Integer width;

    @JSONField(name = "height")
    Integer height;

    @JSONField(name = "cut_method")
    String cutMethod = "";
}