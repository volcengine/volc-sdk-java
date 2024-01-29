package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXCdnSuccessRateByTimeRes
 */
@lombok.Data
public final class DescribeImageXCdnSuccessRateByTimeRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeImageXCdnSuccessRateByTimeResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeImageXCdnSuccessRateByTimeResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
