package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXServiceQualityRes
 */
@lombok.Data
public final class DescribeImageXServiceQualityRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeImageXServiceQualityResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeImageXServiceQualityResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
