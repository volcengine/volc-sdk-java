package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXSensibleCountByTimeResResultSensibleCountDataItemDataItem
 */
@lombok.Data
public final class DescribeImageXSensibleCountByTimeResResultSensibleCountDataItemDataItem  {

    /**
     * <p>上报量数据，与`Count`数值相同。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Value")
    private Integer value;

    /**
     * <p>上报量数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Count")
    private Integer count;

    /**
     * <p>数据对应时间点，按照 ISO8601 表示法，格式为：YYYY-MM-DDThh:mm:ss±hh:mm。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Timestamp")
    private String timestamp;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
