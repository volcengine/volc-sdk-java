package com.volcengine.model.live.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class DescribePushStreamMetricsResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    DescribePushStreamMetricsOutput Result;

    @Data
    public static class DescribePushStreamMetricsOutput {
        @JSONField(name = "MetricList")
        private List<MetricList> MetricList;
    }

    @Data
    public static class MetricList {
        @JSONField(name = "Time")
        private String Time;

        @JSONField(name = "Bitrate")
        private double Bitrate;

        @JSONField(name = "Framerate")
        private double Framerate;
    }
}
