package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ActivationRiskAbortUploadBasePackageRequest {
    @JSONField(name = "AppId")
    Integer appId;
    @JSONField(name = "PackageId")
    String packageId;
}
