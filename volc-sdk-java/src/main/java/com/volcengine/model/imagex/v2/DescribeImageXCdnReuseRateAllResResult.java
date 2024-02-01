package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXCdnReuseRateAllResResult
 */
@lombok.Data
public final class DescribeImageXCdnReuseRateAllResResult  {

    /**
     * <p>连接复用率数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ReuseRateData")
    private List<DescribeImageXCdnReuseRateAllResResultReuseRateDataItem> reuseRateData;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
