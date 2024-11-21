package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * AddDomainV1BodyRespHdrsItem
 */
@lombok.Data
public final class AddDomainV1BodyRespHdrsItem  {

    /**
     * <p>Header Key</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "key")
    private String key;

    /**
     * <p>Header Value</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "value")
    private String value;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
