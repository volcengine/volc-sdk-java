package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXEdgeRequestTrafficResResult
 */
@lombok.Data
public final class DescribeImageXEdgeRequestTrafficResResult  {

    /**
     * <p>查询数据</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TrafficData")
    private List<DescribeImageXEdgeRequestTrafficResResultTrafficDataItem> trafficData;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
