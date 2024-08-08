package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXVideoClipDurationUsageResResult
 */
@lombok.Data
public final class DescribeImageXVideoClipDurationUsageResResult  {

    /**
     * <p>小视频转动图转换时长</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VideoClipDurationData")
    private List<DescribeImageXVideoClipDurationUsageResResultVideoClipDurationDataItem> videoClipDurationData;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
