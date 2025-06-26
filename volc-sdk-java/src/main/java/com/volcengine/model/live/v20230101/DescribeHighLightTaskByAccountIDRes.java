package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeHighLightTaskByAccountIDRes
 */
@lombok.Data
public final class DescribeHighLightTaskByAccountIDRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeHighLightTaskByAccountIDResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeHighLightTaskByAccountIDResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
