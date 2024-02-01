package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXServerQPSUsageResResult
 */
@lombok.Data
public final class DescribeImageXServerQPSUsageResResult  {

    /**
     * <p>数据列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "QPSData")
    private List<DescribeImageXServerQPSUsageResResultQPSDataItem> qPSData;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
