package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetDomainConfigResResultAccessControlRemoteAuthAuthRequestHeaderHeaderItem
 */
@lombok.Data
public final class GetDomainConfigResResultAccessControlRemoteAuthAuthRequestHeaderHeaderItem  {

    /**
     * <p>您设置的请求头</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "key")
    private String key;

    /**
     * <p>请求头的类型</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "value_type")
    private String valueType;

    /**
     * <p>请求头的值</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "value")
    private String value;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
