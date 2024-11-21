package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetProductAIGCResultRes
 */
@lombok.Data
public final class GetProductAIGCResultRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetProductAIGCResultResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetProductAIGCResultResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
