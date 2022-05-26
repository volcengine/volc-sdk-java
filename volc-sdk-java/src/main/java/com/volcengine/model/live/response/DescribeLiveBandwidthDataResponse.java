package com.volcengine.model.live.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class DescribeLiveBandwidthDataResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    DescribeLiveBandwidthDataOutput Result;

    @Data
    public static class DescribeLiveBandwidthDataOutput {

        @JSONField(name = "DomainList")
        private List<String> DomainList;

        @JSONField(name = "StartTime")
        private String StartTime;

        @JSONField(name = "EndTime")
        private String EndTime;

        @JSONField(name = "Aggregation")
        private int Aggregation;

        @JSONField(name = "PeakUpBandwidth")
        private double PeakUpBandwidth;

        @JSONField(name = "PeakDownBandwidth")
        private double PeakDownBandwidth;

        @JSONField(name = "BandwidthDataList")
        private List<BandwidthDataList> BandwidthDataList;
    }

    @Data
    public static class BandwidthDataList {
        @JSONField(name = "TimeStamp")
        private String TimeStamp;

        @JSONField(name = "UpBandwidth")
        private double UpBandwidth;

        @JSONField(name = "DownBandwidth")
        private double DownBandwidth;
    }
}
