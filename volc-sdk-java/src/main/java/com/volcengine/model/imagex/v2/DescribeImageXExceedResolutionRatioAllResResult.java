package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXExceedResolutionRatioAllResResult
 */
@lombok.Data
public final class DescribeImageXExceedResolutionRatioAllResResult  {

    /**
     * <p>客户端大图分辨率分布数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResolutionRatioData")
    private List<DescribeImageXExceedResolutionRatioAllResResultResolutionRatioDataItem> resolutionRatioData;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
