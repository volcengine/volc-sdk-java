package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetSyncAuditResultRes
 */
@lombok.Data
public final class GetSyncAuditResultRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetSyncAuditResultResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetSyncAuditResultResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
