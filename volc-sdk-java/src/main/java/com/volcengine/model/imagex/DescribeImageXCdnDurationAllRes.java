package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXCdnDurationAllRes
 */
@lombok.Data
public final class DescribeImageXCdnDurationAllRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeImageXCdnDurationAllResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeImageXCdnDurationAllResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
