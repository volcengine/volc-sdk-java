package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXHitRateRequestDataResResult
 */
@lombok.Data
public final class DescribeImageXHitRateRequestDataResResult  {

    /**
     * <p>命中率数据</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HitRateData")
    private List<DescribeImageXHitRateRequestDataResResultHitRateDataItem> hitRateData;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
