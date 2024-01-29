package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * GetResourceURLRes
 */
@lombok.Data
public final class GetResourceURLRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetResourceURLResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetResourceURLResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
