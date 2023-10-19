package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * GeneratePlayURLRes
 */
@lombok.Data
public final class GeneratePlayURLRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GeneratePlayURLResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GeneratePlayURLResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
