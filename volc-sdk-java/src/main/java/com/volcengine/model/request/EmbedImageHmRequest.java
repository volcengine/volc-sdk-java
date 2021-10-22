package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class EmbedImageHmRequest {
    @JSONField(name = "ServiceId")
    String serviceId;
    @JSONField(name = "StoreUri")
    String storeUri;
    @JSONField(name = "Info")
    String info;
    @JSONField(name = "OutFormat")
    String outFormat;
    @JSONField(name = "OutQuality")
    int outQuality;
    @JSONField(name = "Strength")
    int strength;
}
