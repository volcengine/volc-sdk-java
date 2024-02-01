package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXSummaryResResultCdnTrafficData
 */
@lombok.Data
public final class DescribeImageXSummaryResResultCdnTrafficData  {

    /**
     * <p>当月流量用量，单位为：Byte。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Value")
    private Long value;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
