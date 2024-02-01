package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXSummaryResResultBaseOpData
 */
@lombok.Data
public final class DescribeImageXSummaryResResultBaseOpData  {

    /**
     * <p>当月图像处理量，单位为：Byte。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Value")
    private Long value;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
