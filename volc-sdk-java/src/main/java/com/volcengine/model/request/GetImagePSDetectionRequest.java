package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetImagePSDetectionRequest {
    @JSONField(name = "ServiceId")
    private String serviceId;

    @JSONField(name = "ImageUri")
    private String imageUri;

    @JSONField(name = "Method")
    private String method;
}
