package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;


@Data
public class ActivationRiskCompleteSampleDataRequest {
    @JSONField
    Integer appId;
    @JSONField
    Integer scene;
    @JSONField
    String packageId;
    @JSONField
    Integer dataSize;
}
