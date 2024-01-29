package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXCdnDurationAllResResult
 */
@lombok.Data
public final class DescribeImageXCdnDurationAllResResult  {

    /**
     * <p>网络耗时数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DurationData")
    private List<DescribeImageXCdnDurationAllResResultDurationDataItem> durationData;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
