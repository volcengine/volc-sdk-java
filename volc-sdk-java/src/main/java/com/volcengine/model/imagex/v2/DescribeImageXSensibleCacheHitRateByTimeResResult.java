package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXSensibleCacheHitRateByTimeResResult
 */
@lombok.Data
public final class DescribeImageXSensibleCacheHitRateByTimeResResult  {

    /**
     * <p>命中率数据</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CacheHitData")
    private List<DescribeImageXSensibleCacheHitRateByTimeResResultCacheHitDataItem> cacheHitData;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
