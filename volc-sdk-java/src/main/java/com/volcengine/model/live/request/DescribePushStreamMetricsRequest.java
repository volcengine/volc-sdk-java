package com.volcengine.model.live.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class DescribePushStreamMetricsRequest {
    @JSONField(name = "Domain")
    private String Domain;

    @JSONField(name = "App")
    private String App;

    @JSONField(name = "Stream")
    private String Stream;

    @JSONField(name = "StartTime")
    private String StartTime;

    @JSONField(name = "EndTime")
    private String EndTime;

    @JSONField(name = "Aggregation")
    private int Aggregation;
}
