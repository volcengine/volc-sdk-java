package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXHeifEncodeFileOutSizeByTimeRes
 */
@lombok.Data
public final class DescribeImageXHeifEncodeFileOutSizeByTimeRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeImageXHeifEncodeFileOutSizeByTimeResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeImageXHeifEncodeFileOutSizeByTimeResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
