package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetCertInfoRes
 */
@lombok.Data
public final class GetCertInfoRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetCertInfoResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetCertInfoResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
