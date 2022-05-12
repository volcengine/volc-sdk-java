package com.volcengine.model.live.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class DescribeLiveMetricBandwidthDataResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    DescribeLiveMetricBandwidthDataOutput Result;

    @Data
    public static class DescribeLiveMetricBandwidthDataOutput {
        @JSONField(name = "DomainList")
        private List<String> DomainList;
        @JSONField(name = "Domain")
        private String Domain;
        @JSONField(name = "App")
        private String App;
        @JSONField(name = "Stream")
        private String Stream;
        @JSONField(name = "ProtocolList")
        private List<String> ProtocolList;
        @JSONField(name = "ISPList")
        private List<String> ISPList;
        @JSONField(name = "IPList")
        private List<String> IPList;
        @JSONField(name = "RegionList")
        private List<Region> RegionList;
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
        private List<BandwidthData> BandwidthDataList;
        @JSONField(name = "BandwidthDetailDataList")
        private List<BandwidthDetailData> BandwidthDetailDataList;
    }

    @Data
    public static class Region {
        @JSONField(name = "Area")
        private String Area;
        @JSONField(name = "Country")
        private String Country;
        @JSONField(name = "Province")
        private String Province;
    }

    @Data
    public static class BandwidthData {
        @JSONField(name = "TimeStamp")
        private String TimeStamp;
        @JSONField(name = "UpBandwidth")
        private double UpBandwidth;
        @JSONField(name = "DownBandwidth")
        private double DownBandwidth;
    }

    @Data
    public static class BandwidthDetailData {
        @JSONField(name = "Protocol")
        private String Protocol;
        @JSONField(name = "PeakUpBandwidth")
        private double PeakUpBandwidth;
        @JSONField(name = "PeakDownBandwidth")
        private double PeakDownBandwidth;
        @JSONField(name = "BandwidthDataList")
        private List<BandwidthData> BandwidthDataList;
        @JSONField(name = "IP")
        private String IP;
        @JSONField(name = "ISP")
        private String ISP;
        @JSONField(name = "Region")
        private Region Region;
        @JSONField(name = "Domain")
        private String Domain;
    }
}
