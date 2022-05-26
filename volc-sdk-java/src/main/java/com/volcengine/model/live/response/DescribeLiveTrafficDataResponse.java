package com.volcengine.model.live.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class DescribeLiveTrafficDataResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    DescribeLiveTrafficDataOutput Result;

    @Data
    public static class DescribeLiveTrafficDataOutput {
        @JSONField(name = "DomainList")
        private List<String> DomainList;

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
        private List<TrafficDataList> TrafficDataList;
    }

    @Data
    public static class TrafficDataList {
        @JSONField(name = "TimeStamp")
        private String TimeStamp;

        @JSONField(name = "UpTraffic")
        private double UpTraffic;

        @JSONField(name = "DownTraffic")
        private double DownTraffic;
    }
}
