package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXHeifEncodeFileInSizeByTimeRes
 */
@lombok.Data
public final class DescribeImageXHeifEncodeFileInSizeByTimeRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeImageXHeifEncodeFileInSizeByTimeResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeImageXHeifEncodeFileInSizeByTimeResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
