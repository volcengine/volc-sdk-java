package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXSensibleCountByTimeRes
 */
@lombok.Data
public final class DescribeImageXSensibleCountByTimeRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeImageXSensibleCountByTimeResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeImageXSensibleCountByTimeResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
