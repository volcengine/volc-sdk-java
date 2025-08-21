package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * BatchImageAuditRes
 */
@lombok.Data
public final class BatchImageAuditRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private BatchImageAuditResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private BatchImageAuditResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
