package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetImageSmartCropResultRequest {
    @JSONField(name = "ServiceId")
    private String serviceId;

    @JSONField(name = "StoreUri")
    private String storeUri;

    @JSONField(name = "Policy")
    private String policy;

    @JSONField(name = "Scene")
    private String scene;

    @JSONField(name = "Sigma")
    private Double sigma;

    @JSONField(name = "Width")
    private Integer width;

    @JSONField(name = "Height")
    private Integer height;

}
