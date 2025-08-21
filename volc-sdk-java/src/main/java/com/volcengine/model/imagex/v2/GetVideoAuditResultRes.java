package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetVideoAuditResultRes
 */
@lombok.Data
public final class GetVideoAuditResultRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetVideoAuditResultResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetVideoAuditResultResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
