package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetImageQualityRequest {
    @JSONField(name = "ServiceId")
    private String serviceId;

    @JSONField(name = "ImageUrl")
    private String imageUrl;

    @JSONField(name = "VqType")
    private String vqType;
}
