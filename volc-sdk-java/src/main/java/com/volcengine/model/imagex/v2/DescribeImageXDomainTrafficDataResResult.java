package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXDomainTrafficDataResResult
 */
@lombok.Data
public final class DescribeImageXDomainTrafficDataResResult  {

    /**
     * <p>计量数据列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TrafficData")
    private List<DescribeImageXDomainTrafficDataResResultTrafficDataItem> trafficData;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
