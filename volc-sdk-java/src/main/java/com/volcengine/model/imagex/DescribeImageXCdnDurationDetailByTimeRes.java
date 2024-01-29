package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXCdnDurationDetailByTimeRes
 */
@lombok.Data
public final class DescribeImageXCdnDurationDetailByTimeRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeImageXCdnDurationDetailByTimeResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeImageXCdnDurationDetailByTimeResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
