package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXHeifEncodeSuccessCountByTimeRes
 */
@lombok.Data
public final class DescribeImageXHeifEncodeSuccessCountByTimeRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeImageXHeifEncodeSuccessCountByTimeResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeImageXHeifEncodeSuccessCountByTimeResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
