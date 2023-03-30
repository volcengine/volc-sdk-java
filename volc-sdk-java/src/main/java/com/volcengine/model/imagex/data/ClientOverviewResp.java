package com.volcengine.model.imagex.data;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ClientOverviewResp {
    @JSONField(name = "FailureRate")
    private Double failureRate;
    @JSONField(name = "SuccessRate")
    private Double successRate;
    @JSONField(name = "AvgDecodeDuration")
    private Double avgDecodeDuration;
    @JSONField(name = "AvgQueueDuration")
    private Double avgQueueDuration;
    @JSONField(name = "AvgLoadDuration")
    private Double avgLoadDuration;
    @JSONField(name = "TotalCount")
    private Long totalCount;
}
