package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXAddOnQPSUsageResResultQPSDataItemDataItem
 */
@lombok.Data
public final class DescribeImageXAddOnQPSUsageResResultQPSDataItemDataItem  {

    /**
     * <p>统计时间点，时间片开始时刻，格式为：YYYY-MM-DDThh:mm:ss±hh:mm。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TimeStamp")
    private String timeStamp;

    /**
     * <p>QPS 用量的值。单位为 "次/秒"，表示每秒处理的请求数量。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Value")
    private Integer value;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
