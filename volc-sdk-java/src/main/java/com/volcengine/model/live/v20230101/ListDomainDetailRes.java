package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListDomainDetailRes
 */
@lombok.Data
public final class ListDomainDetailRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ListDomainDetailResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private ListDomainDetailResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
