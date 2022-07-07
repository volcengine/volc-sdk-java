package com.volcengine.model.live.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class DescribePullToPushBandwidthDataResponse {

    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    DescribePullToPushBandwidthDataOutput Result;

    @Data
    public static class DescribePullToPushBandwidthDataOutput{
        @JSONField(name = "DomainList")
        private List<String> DomainList;

        @JSONField(name = "DstAddrTypeList")
        private List<String> DstAddrTypeList;

        @JSONField(name = "StartTime")
        private String StartTime;

        @JSONField(name = "EndTime")
        private String EndTime;

        @JSONField(name = "Aggregation")
        private int Aggregation;

        @JSONField(name = "ShowDetail")
        private boolean ShowDetail;

        @JSONField(name = "PeakUpBandwidth")
        private double PeakUpBandwidth;

        @JSONField(name = "BandwidthDataList")
        private List<BandwidthData> BandwidthDataList;

        @JSONField(name = "BandwidthDetailDataList")
        private List<BandwidthDetailData> BandwidthDetailDataList;

    }

    @Data
    public static class BandwidthDetailData {

        @JSONField(name = "Domain")
        private String Domain;
        @JSONField(name = "DstAddrType")
        private String DstAddrType;

        @JSONField(name = "PeakUpBandwidth")
        private double PeakUpBandwidth;

        @JSONField(name = "BandwidthDataList")
        private List<BandwidthData> BandwidthDataList;
    }

    @Data
    public static class BandwidthData {
        @JSONField(name = "TimeStamp")
        private String TimeStamp;

        @JSONField(name = "UpBandwidth")
        private double UpBandwidth;
    }
}


