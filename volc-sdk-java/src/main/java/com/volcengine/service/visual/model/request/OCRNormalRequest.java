package com.volcengine.service.visual.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class OCRNormalRequest {
    
    @JSONField(name = "image_base64")
    String imageBase64;

    @JSONField(name = "type")
    String type = "default";

    @JSONField(name = "approximate_pixel")
    String approximatePixel = "0";

    @JSONField(name = "mode")
    String mode = "default";

    @JSONField(name = "filter_thresh")
    String filterThresh = "80";
}