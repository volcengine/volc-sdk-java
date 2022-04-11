package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetImageSegmentRequest {
    @JSONField(name = "ServiceId")
    String serviceId;
    @JSONField(name = "Class")
    String Class;
    @JSONField(name = "Refine")
    Boolean Refine;
    @JSONField(name = "StoreUri")
    String StoreUri;
    @JSONField(name = "OutFormat")
    String OutFormat;
}