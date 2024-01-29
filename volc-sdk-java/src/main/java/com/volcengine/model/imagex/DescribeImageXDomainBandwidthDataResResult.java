package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXDomainBandwidthDataResResult
 */
@lombok.Data
public final class DescribeImageXDomainBandwidthDataResResult  {

    /**
     * <p>计量数据列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BpsData")
    private List<DescribeImageXDomainBandwidthDataResResultBpsDataItem> bpsData;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
