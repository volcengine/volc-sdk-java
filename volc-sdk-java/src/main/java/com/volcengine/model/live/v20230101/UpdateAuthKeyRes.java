package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateAuthKeyRes
 */
@lombok.Data
public final class UpdateAuthKeyRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private UpdateAuthKeyResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private UpdateAuthKeyResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
