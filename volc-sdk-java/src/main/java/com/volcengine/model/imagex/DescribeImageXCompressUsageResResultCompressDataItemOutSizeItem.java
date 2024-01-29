package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXCompressUsageResResultCompressDataItemOutSizeItem
 */
@lombok.Data
public final class DescribeImageXCompressUsageResResultCompressDataItemOutSizeItem  {

    /**
     * <p>数据对应时间点，时间片开始时刻。日期格式按照`ISO8601`表示法，格式为：`YYYY-MM-DDThh:mm:ss±hh:mm`，比如`2019-06-02T00:00:00+08:00`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TimeStamp")
    private String timeStamp;

    /**
     * <p>压缩前大小或压缩后大小，单位为 byte。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Value")
    private Double value;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
