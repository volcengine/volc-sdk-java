package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class GetImageEnhanceResultRequest {
    @JSONField(name = "ServiceId")
    private String serviceId;

    @JSONField(name = "StoreUri")
    private String storeUri;

    @JSONField(name = "Model")
    private Integer model;

    @JSONField(name = "DisableAr")
    private Boolean disableAr;

    @JSONField(name = "DisableSharp")
    private Boolean disableSharp;

    @JSONField(name = "Resolution")
    private String resolution;

    @JSONField(name = "Actions")
    private List<String> actions;
}
