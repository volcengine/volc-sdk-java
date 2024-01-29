package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXSummaryResResultStorageData
 */
@lombok.Data
public final class DescribeImageXSummaryResResultStorageData  {

    /**
     * <p>当月最新一日资源占用量，单位为：Byte。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Value")
    private Double value;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
