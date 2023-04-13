package com.volcengine.model.imagex.data;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class DescribeImageXSensibleCacheHitRateByTimeResp {
    @JSONField(name = "CacheHitData")
    private List<CurveFloatItem> cacheHitData;
}
