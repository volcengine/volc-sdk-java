package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXExceedCountByTimeRes
 */
@lombok.Data
public final class DescribeImageXExceedCountByTimeRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeImageXExceedCountByTimeResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeImageXExceedCountByTimeResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
