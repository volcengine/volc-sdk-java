package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;


@Data
public class ActivationRiskUploadSampleDataRequest {

    @JSONField(name = "AppId")
    Integer appId;
    @JSONField(name = "Service")
    String service;
    @JSONField(name = "PackageId")
    String packageId;
    @JSONField(name = "TotalPackageNum")
    Integer totalPackageNum;
    @JSONField(name = "PackageSeq")
    Integer packageSeq;
    @JSONField(name = "BusinessType")
    String businessType;
    @JSONField(name = "DataType")
    String dataType;
    @JSONField(name = "Data")
    List<SampleData> data;
    @JSONField(name = "Scene")
    Integer scene; // 1: 种子 2.样本

    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    public static class SampleData {
        @JSONField(name = "Id")
        String id;
        @JSONField(name = "ReachType")
        String reachType;
        @JSONField(name = "Extra")
        String extra;
    }


}
