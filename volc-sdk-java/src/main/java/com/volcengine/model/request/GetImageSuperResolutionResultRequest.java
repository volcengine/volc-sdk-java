package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetImageSuperResolutionResultRequest {
    @JSONField(name = "ServiceId")
    private String serviceId;

    @JSONField(name = "StoreUri")
    private String storeUri;

    @JSONField(name = "Multiple")
    private Double multiple;
}
