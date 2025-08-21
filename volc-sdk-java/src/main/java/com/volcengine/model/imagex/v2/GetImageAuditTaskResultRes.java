package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageAuditTaskResultRes
 */
@lombok.Data
public final class GetImageAuditTaskResultRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetImageAuditTaskResultResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetImageAuditTaskResultResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
