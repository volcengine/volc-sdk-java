package com.volcengine.model.live.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class DescribeLiveMetricTrafficDataResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    DescribeLiveMetricTrafficDataOutput Result;

    @Data
    public static class DescribeLiveMetricTrafficDataOutput {
        @JSONField(name = "DomainList")
        private List<String> DomainList;
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
        @JSONField(name = "TotalUpTraffic")
        private double TotalUpTraffic;
        @JSONField(name = "TotalDownTraffic")
        private double TotalDownTraffic;
        @JSONField(name = "TrafficDataList")
        private List<TrafficData> TrafficDataList;
        @JSONField(name = "TrafficDetailDataList")
        private List<TrafficDetailData> TrafficDetailDataList;
        @JSONField(name = "Domain")
        private String Domain;
        @JSONField(name = "App")
        private String App;
        @JSONField(name = "Stream")
        private String Stream;
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
    public static class TrafficData {
        @JSONField(name = "TimeStamp")
        private String TimeStamp;
        @JSONField(name = "UpTraffic")
        private double UpTraffic;
        @JSONField(name = "DownTraffic")
        private double DownTraffic;
    }

    @Data
    public static class TrafficDetailData {
        @JSONField(name = "Protocol")
        private String Protocol;
        @JSONField(name = "TotalUpTraffic")
        private double TotalUpTraffic;
        @JSONField(name = "TotalDownTraffic")
        private double TotalDownTraffic;
        @JSONField(name = "TrafficDataList")
        private List<TrafficData> TrafficDataList;
        @JSONField(name = "Domain")
        private String Domain;
        @JSONField(name = "ISP")
        private String ISP;
        @JSONField(name = "IP")
        private String IP;
        @JSONField(name = "Region")
        private Region Region;
    }
}
