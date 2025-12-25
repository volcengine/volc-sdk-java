package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ActivationRiskCompleteBasePackageRequest {
    @JSONField(name = "AppId")
    Integer appId;
    @JSONField(name = "Scene")
    Integer scene; // 1: 首次上传 2: 补包
    @JSONField(name = "PackageId")
    String packageId;
    @JSONField(name = "DataSize")
    Long dataSize; // 包大小(MB
}
