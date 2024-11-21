package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXHeifEncodeSuccessRateByTimeRes
 */
@lombok.Data
public final class DescribeImageXHeifEncodeSuccessRateByTimeRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeImageXHeifEncodeSuccessRateByTimeResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeImageXHeifEncodeSuccessRateByTimeResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
