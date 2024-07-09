package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
public class ActivateRiskSampleDataRequest {
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class SampleData{
        @JSONField(name = "Id")
        String id;
        @JSONField(name = "ReachType")
        String reachType;
        @JSONField(name = "LaunchStatus")
        String launchStatus;
        @JSONField(name = "Extra")
        String extra;
    }
    @JSONField(name = "PackageId")
    String packageId;
    @JSONField(name = "TotalPackageNum" )
    Integer  totalPackageNum;
    @JSONField(name = "PackageSeq")
    Integer packageSeq;
    @JSONField(name = "DataType")
    String dataType;
    @JSONField(name = "BusinessType")
    String businessType;
    @JSONField(name = "Data")
    List<SampleData> Data;
}


