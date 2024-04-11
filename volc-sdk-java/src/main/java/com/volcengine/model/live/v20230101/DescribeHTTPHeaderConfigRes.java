package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeHTTPHeaderConfigRes
 */
@lombok.Data
public final class DescribeHTTPHeaderConfigRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeHTTPHeaderConfigResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeHTTPHeaderConfigResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
