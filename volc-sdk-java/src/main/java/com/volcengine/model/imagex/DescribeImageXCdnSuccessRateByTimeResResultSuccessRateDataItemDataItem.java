package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXCdnSuccessRateByTimeResResultSuccessRateDataItemDataItem
 */
@lombok.Data
public final class DescribeImageXCdnSuccessRateByTimeResResultSuccessRateDataItemDataItem  {

    /**
     * <p>数据对应的上报量</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Count")
    private Integer count;

    /**
     * <p>数据对应时间点，按照 ISO8601 表示法，格式为：YYYY-MM-DDThh:mm:ss±hh:mm。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Timestamp")
    private String timestamp;

    /**
     * <p>网络成功率</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Value")
    private Double value;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
