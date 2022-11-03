package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetPrivateImageTypeRequest {
    @JSONField(name = "ServiceId")
    private String serviceId;

    @JSONField(name = "ImageUri")
    private String imageUri;

    @JSONField(name = "Method")
    private String method;

    @JSONField(name = "ThresFace")
    private Double thresFace;

    @JSONField(name = "ThresCloth")
    private Double thresCloth;
}
