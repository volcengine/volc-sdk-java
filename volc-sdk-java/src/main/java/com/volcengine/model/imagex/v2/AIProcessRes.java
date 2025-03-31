package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * AIProcessRes
 */
@lombok.Data
public final class AIProcessRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private AIProcessResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private AIProcessResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
