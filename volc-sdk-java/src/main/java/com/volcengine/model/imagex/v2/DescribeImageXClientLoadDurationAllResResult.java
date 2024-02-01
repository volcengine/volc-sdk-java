package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXClientLoadDurationAllResResult
 */
@lombok.Data
public final class DescribeImageXClientLoadDurationAllResResult  {

    /**
     * <p>网络耗时数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DurationData")
    private List<DescribeImageXClientLoadDurationAllResResultDurationDataItem> durationData;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
