package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXClientDecodeDurationByTimeResResult
 */
@lombok.Data
public final class DescribeImageXClientDecodeDurationByTimeResResult  {

    /**
     * <p>解码耗时数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DurationData")
    private List<DescribeImageXClientDecodeDurationByTimeResResultDurationDataItem> durationData;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
