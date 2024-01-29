package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXClientFailureRateResResult
 */
@lombok.Data
public final class DescribeImageXClientFailureRateResResult  {

    /**
     * <p>用户感知失败率数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FailureRateData")
    private List<DescribeImageXClientFailureRateResResultFailureRateDataItem> failureRateData;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
