package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXVideoClipDurationUsageResResultVideoClipDurationDataItem
 */
@lombok.Data
public final class DescribeImageXVideoClipDurationUsageResResultVideoClipDurationDataItem  {

    /**
     * <p>时序数据</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Data")
    private List<DescribeImageXVideoClipDurationUsageResResultVideoClipDurationDataItemDataItem> data;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
