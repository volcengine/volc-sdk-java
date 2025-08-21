package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * SingleImageAuditRes
 */
@lombok.Data
public final class SingleImageAuditRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private SingleImageAuditResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private SingleImageAuditResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
