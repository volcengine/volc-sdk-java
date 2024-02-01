package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXHitRateTrafficDataResResult
 */
@lombok.Data
public final class DescribeImageXHitRateTrafficDataResResult  {

    /**
     * <p>命中率数据</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HitRateData")
    private List<DescribeImageXHitRateTrafficDataResResultHitRateDataItem> hitRateData;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
