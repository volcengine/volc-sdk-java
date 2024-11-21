package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * UpdateDomainAdaptiveFmtRes
 */
@lombok.Data
public final class UpdateDomainAdaptiveFmtRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private UpdateDomainAdaptiveFmtResResponseMetadata responseMetadata;

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
