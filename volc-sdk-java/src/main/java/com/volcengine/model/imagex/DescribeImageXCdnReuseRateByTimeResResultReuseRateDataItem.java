package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXCdnReuseRateByTimeResResultReuseRateDataItem
 */
@lombok.Data
public final class DescribeImageXCdnReuseRateByTimeResResultReuseRateDataItem  {

    /**
     * <p>数据类型，不拆分时取值`Total`，拆分时为具体的维度值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    /**
     * <p>上报数据总量。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Count")
    private Integer count;

    /**
     * <p>对应的连接复用率数据列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Data")
    private List<DescribeImageXCdnReuseRateByTimeResResultReuseRateDataItemDataItem> data;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
