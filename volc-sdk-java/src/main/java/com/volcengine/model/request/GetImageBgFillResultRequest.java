package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetImageBgFillResultRequest {
    @JSONField(name = "ServiceId")
    private String serviceId;

    @JSONField(name = "StoreUri")
    private String storeUri;

    @JSONField(name = "Model")
    private Integer model;

    @JSONField(name = "Top")
    private Double top;

    @JSONField(name = "Bottom")
    private Double bottom;

    @JSONField(name = "Left")
    private Double left;

    @JSONField(name = "Left")
    private Double right;
}
