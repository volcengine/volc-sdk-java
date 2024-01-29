package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXScreenshotUsageResResultScreenshotDataItem
 */
@lombok.Data
public final class DescribeImageXScreenshotUsageResResultScreenshotDataItem  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Data")
    private List<DescribeImageXScreenshotUsageResResultScreenshotDataItemDataItem> data;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
