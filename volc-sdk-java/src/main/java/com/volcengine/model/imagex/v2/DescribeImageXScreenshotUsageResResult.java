package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXScreenshotUsageResResult
 */
@lombok.Data
public final class DescribeImageXScreenshotUsageResResult  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ScreenshotData")
    private List<DescribeImageXScreenshotUsageResResultScreenshotDataItem> screenshotData;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
