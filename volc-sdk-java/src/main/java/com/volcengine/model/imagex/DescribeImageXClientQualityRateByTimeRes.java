package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXClientQualityRateByTimeRes
 */
@lombok.Data
public final class DescribeImageXClientQualityRateByTimeRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeImageXClientQualityRateByTimeResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeImageXClientQualityRateByTimeResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
