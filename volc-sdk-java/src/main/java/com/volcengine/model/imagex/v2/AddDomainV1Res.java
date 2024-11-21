package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * AddDomainV1Res
 */
@lombok.Data
public final class AddDomainV1Res  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private AddDomainV1ResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private AddDomainV1ResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
