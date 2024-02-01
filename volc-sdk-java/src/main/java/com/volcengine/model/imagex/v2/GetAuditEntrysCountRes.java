package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetAuditEntrysCountRes
 */
@lombok.Data
public final class GetAuditEntrysCountRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetAuditEntrysCountResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetAuditEntrysCountResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
