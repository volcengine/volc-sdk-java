package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXBaseOpUsageResResultBaseOpDataItem
 */
@lombok.Data
public final class DescribeImageXBaseOpUsageResResultBaseOpDataItem  {

    /**
     * <p>计量数据</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Data")
    private List<DescribeImageXBaseOpUsageResResultBaseOpDataItemDataItem> data;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
