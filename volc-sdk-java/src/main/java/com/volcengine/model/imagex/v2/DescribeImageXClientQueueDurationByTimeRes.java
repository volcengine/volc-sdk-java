package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXClientQueueDurationByTimeRes
 */
@lombok.Data
public final class DescribeImageXClientQueueDurationByTimeRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeImageXClientQueueDurationByTimeResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeImageXClientQueueDurationByTimeResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
