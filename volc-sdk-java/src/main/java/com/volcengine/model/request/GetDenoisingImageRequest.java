package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetDenoisingImageRequest {
    @JSONField(name = "ServiceId")
    private String serviceId;

    @JSONField(name = "StoreUri")
    private String storeUri;

    @JSONField(name = "ImageUrl")
    private String imageUrl;

    @JSONField(name = "OutFormat")
    private String outFormat;

    @JSONField(name = "Intensity")
    private Double intensity;

    @JSONField(name = "CanDemotion")
    private Boolean canDemotion;
}
