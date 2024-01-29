package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXCdnReuseRateByTimeResResultReuseRateDataItemDataItem
 */
@lombok.Data
public final class DescribeImageXCdnReuseRateByTimeResResultReuseRateDataItemDataItem  {

    /**
     * <p>网络连接复用率。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Value")
    private Double value;

    /**
     * <p>上报数据量。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Count")
    private Integer count;

    /**
     * <p>数据对应时间点。</p>
     *
     * <p>* 日期格式按照`ISO8601`表示法，格式为：`YYYY-MM-DDThh:mm:ss±hh:mm`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Timestamp")
    private String timestamp;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
