package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXBucketRetrievalUsageResResultStorageDataItemDataItem
 */
@lombok.Data
public final class DescribeImageXBucketRetrievalUsageResResultStorageDataItemDataItem  {

    /**
     * <p>统计时间点，时间片开始时刻，格式为：格式为：YYYY-MM-DDThh:mm:ss±hh:mm</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TimeStamp")
    private String timeStamp;

    /**
     * <p>单位：Byte</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Value")
    private Double value;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
