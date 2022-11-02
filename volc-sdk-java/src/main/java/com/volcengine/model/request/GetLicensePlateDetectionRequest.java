package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetLicensePlateDetectionRequest {
    @JSONField(name = "ServiceId")
    private String serviceId;

    @JSONField(name = "ImageUri")
    private String imageUri;
}
