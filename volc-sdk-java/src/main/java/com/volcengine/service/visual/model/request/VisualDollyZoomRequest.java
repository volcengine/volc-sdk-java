package com.volcengine.service.visual.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class VisualDollyZoomRequest {
    
    @JSONField(name = "image_base64")
    String imageBase64 = "";

    @JSONField(name = "video_type")
    Integer videoType = 0;

    @JSONField(name = "device_type")
    Integer deviceType = 0;

    @JSONField(name = "video_length")
    Double videoLength = 2.5;
}