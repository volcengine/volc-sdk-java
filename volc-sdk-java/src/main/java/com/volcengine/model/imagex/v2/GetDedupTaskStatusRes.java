package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetDedupTaskStatusRes
 */
@lombok.Data
public final class GetDedupTaskStatusRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetDedupTaskStatusResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetDedupTaskStatusResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
