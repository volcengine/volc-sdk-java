package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageAuditTasksRes
 */
@lombok.Data
public final class GetImageAuditTasksRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetImageAuditTasksResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetImageAuditTasksResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
