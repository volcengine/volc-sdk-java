package com.volcengine.model.imagex.data;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class UploadOverviewResp {
    @JSONField(name = "SuccessRate")
    private Double successRate;
    @JSONField(name = "UploadCount")
    private Long uploadCount;
    @JSONField(name = "AvgSize")
    private Double avgSize;
    @JSONField(name = "AvgDuration")
    private Double avgDuration;
    @JSONField(name = "TotalCount")
    private Long totalCount;
}
