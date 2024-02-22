package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeIPAccessRuleRes
 */
@lombok.Data
public final class DescribeIPAccessRuleRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeIPAccessRuleResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeIPAccessRuleResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
