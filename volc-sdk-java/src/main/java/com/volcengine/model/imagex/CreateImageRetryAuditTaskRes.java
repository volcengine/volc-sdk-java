package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * CreateImageRetryAuditTaskRes
 */
@lombok.Data
public final class CreateImageRetryAuditTaskRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private CreateImageRetryAuditTaskResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private CreateImageRetryAuditTaskResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
