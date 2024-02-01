package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

/**
 * QueryOnlineStatusRes
 */
@lombok.Data
public final class QueryOnlineStatusRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private QueryOnlineStatusResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
