package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ExtractImageHmRequest {
    @JSONField(name = "ServiceId")
    String serviceId;
    @JSONField(name = "StoreUri")
    String storeUri;
    @JSONField(name = "Algorithm")
    String algorithm;
    @JSONField(name = "ImageUrl")
    String ImageUrl;
}
