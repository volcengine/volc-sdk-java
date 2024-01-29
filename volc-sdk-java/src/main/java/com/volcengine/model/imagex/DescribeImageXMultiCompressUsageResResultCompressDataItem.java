package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXMultiCompressUsageResResultCompressDataItem
 */
@lombok.Data
public final class DescribeImageXMultiCompressUsageResResultCompressDataItem  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Data")
    private List<DescribeImageXMultiCompressUsageResResultCompressDataItemDataItem> data;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
