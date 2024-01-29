package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * CreateImageRetryAuditTaskResResult
 */
@lombok.Data
public final class CreateImageRetryAuditTaskResResult  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private String result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
