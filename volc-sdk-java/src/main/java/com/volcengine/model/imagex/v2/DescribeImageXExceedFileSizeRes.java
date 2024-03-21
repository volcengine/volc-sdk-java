package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXExceedFileSizeRes
 */
@lombok.Data
public final class DescribeImageXExceedFileSizeRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeImageXExceedFileSizeResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeImageXExceedFileSizeResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
