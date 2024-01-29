package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXVideoClipDurationUsageResResultVideoClipDurationDataItemDataItem
 */
@lombok.Data
public final class DescribeImageXVideoClipDurationUsageResResultVideoClipDurationDataItemDataItem  {

    /**
     * <p>统计时间点。日期格式按照ISO8601表示法，格式为：YYYY-MM-DDThh:mm:ss±hh:mm，比如2019-06-02T00:00:00+08:00。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TimeStamp")
    private String timeStamp;

    /**
     * <p>转换时长，单位ms</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Value")
    private Double value;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
