package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXSourceRequestTrafficResResult
 */
@lombok.Data
public final class DescribeImageXSourceRequestTrafficResResult  {

    /**
     * <p>查询数据</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TrafficData")
    private List<DescribeImageXSourceRequestTrafficResResultTrafficDataItem> trafficData;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
