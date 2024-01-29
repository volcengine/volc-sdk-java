package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXClientTopDemotionURLRes
 */
@lombok.Data
public final class DescribeImageXClientTopDemotionURLRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeImageXClientTopDemotionURLResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeImageXClientTopDemotionURLResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
