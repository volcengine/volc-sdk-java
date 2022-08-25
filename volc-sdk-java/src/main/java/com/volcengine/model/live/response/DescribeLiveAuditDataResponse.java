package com.volcengine.model.live.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class DescribeLiveAuditDataResponse {

    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    DescribeLiveAuditDataOutput Result;

    @Data
    public static class DescribeLiveAuditDataOutput{
        @JSONField(name = "DomainList")
        private List<String> DomainList;

        @JSONField(name = "StartTime")
        private String StartTime;

        @JSONField(name = "EndTime")
        private String EndTime;

        @JSONField(name = "Aggregation")
        private int Aggregation;

        @JSONField(name = "DetailField")
        private List<String> DetailField;

        @JSONField(name = "TotalCount")
        private Long TotalCount;

        @JSONField(name = "AuditDataList")
        private List<AuditData> AuditDataList;

        @JSONField(name = "AuditDetailDataList")
        private List<AuditDetailData> AuditDetailDataList;

    }

    @Data
    public static class AuditDetailData {

        @JSONField(name = "Domain")
        private String Domain;

        @JSONField(name = "TotalCount")
        private Long TotalCount;

        @JSONField(name = "AuditDataList")
        private List<AuditData> AuditDataList;
    }

    @Data
    public static class AuditData {
        @JSONField(name = "TimeStamp")
        private String TimeStamp;

        @JSONField(name = "Count")
        private Long Count;
    }
}


