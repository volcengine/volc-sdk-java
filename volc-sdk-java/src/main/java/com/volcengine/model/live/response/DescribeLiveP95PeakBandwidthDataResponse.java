package com.volcengine.model.live.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class DescribeLiveP95PeakBandwidthDataResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    DescribeLiveP95PeakBandwidthDataOutput Result;

    @Data
    public static class DescribeLiveP95PeakBandwidthDataOutput {
        @JSONField(name = "StartTime")
        private String StartTime;

        @JSONField(name = "EndTime")
        private String EndTime;

        @JSONField(name = "Aggregation")
        private int Aggregation;

        @JSONField(name = "P95PeakBandwidth")
        private double P95PeakBandwidth;
    }
}
