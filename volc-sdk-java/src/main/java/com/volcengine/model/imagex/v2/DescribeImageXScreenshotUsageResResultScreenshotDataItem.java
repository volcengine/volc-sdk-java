package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXScreenshotUsageResResultScreenshotDataItem
 */
@lombok.Data
public final class DescribeImageXScreenshotUsageResResultScreenshotDataItem  {

    /**
     * <p>时序数据</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Data")
    private List<DescribeImageXScreenshotUsageResResultScreenshotDataItemDataItem> data;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
