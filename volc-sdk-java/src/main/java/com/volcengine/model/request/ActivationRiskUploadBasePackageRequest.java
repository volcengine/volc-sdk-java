package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class ActivationRiskUploadBasePackageRequest {
    @JSONField(name = "AppId")
    Integer appId;
    @JSONField(name = "Scene")
    Integer scene;
    @JSONField(name = "ActivateCode")
    String activateCode;
    @JSONField(name = "PackageId")
    String packageId;
    @JSONField(name = "TotalPackageNum")
    Integer totalPackageNum;
    @JSONField(name = "PackageSeq")
    Integer packageSeq;
    @JSONField(name = "DataType")
    String dataType;
    @JSONField(name = "Data")
    List<String> data;
}
