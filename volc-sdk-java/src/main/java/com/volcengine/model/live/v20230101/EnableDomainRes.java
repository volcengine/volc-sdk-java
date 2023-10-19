package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * EnableDomainRes
 */
@lombok.Data
public final class EnableDomainRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private EnableDomainResResponseMetadata responseMetadata;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
