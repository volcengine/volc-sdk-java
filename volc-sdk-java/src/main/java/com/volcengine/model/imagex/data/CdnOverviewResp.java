package com.volcengine.model.imagex.data;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class CdnOverviewResp {
    @JSONField(name = "SuccessRate")
    private Double successRate;
    @JSONField(name = "AvgDuration")
    private Double avgDuration;
    @JSONField(name = "TotalCount")
    private Long totalCount;
}
