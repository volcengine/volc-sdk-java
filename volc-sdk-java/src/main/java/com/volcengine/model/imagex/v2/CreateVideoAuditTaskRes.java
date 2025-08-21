package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * CreateVideoAuditTaskRes
 */
@lombok.Data
public final class CreateVideoAuditTaskRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private CreateVideoAuditTaskResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private CreateVideoAuditTaskResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
