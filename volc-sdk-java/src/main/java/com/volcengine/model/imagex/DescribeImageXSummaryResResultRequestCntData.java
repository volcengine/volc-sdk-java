package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXSummaryResResultRequestCntData
 */
@lombok.Data
public final class DescribeImageXSummaryResResultRequestCntData  {

    /**
     * <p>当月源站请求次数，单位为：次。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Value")
    private Integer value;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
