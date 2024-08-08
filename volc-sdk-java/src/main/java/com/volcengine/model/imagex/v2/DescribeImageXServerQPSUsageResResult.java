package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXServerQPSUsageResResult
 */
@lombok.Data
public final class DescribeImageXServerQPSUsageResResult  {

    /**
     * <p>QPS 用量</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "QPSData")
    private List<DescribeImageXServerQPSUsageResResultQPSDataItem> qPSData;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
