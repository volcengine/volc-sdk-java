package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXMultiCompressUsageResResultCompressDataItemDataItem
 */
@lombok.Data
public final class DescribeImageXMultiCompressUsageResResultCompressDataItemDataItem  {

    /**
     * <p>统计时间点，时间片开始时刻。按照`ISO8601`表示法，格式为：`YYYY-MM-DDThh:mm:ss±hh:mm`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TimeStamp")
    private String timeStamp;

    /**
     * <p>压缩量，单位为 Byte。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Value")
    private Double value;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
