package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXAddOnQPSUsageResResult
 */
@lombok.Data
public final class DescribeImageXAddOnQPSUsageResResult  {

    /**
     * <p>QPS 用量</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "QPSData")
    private List<DescribeImageXAddOnQPSUsageResResultQPSDataItem> qPSData;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
