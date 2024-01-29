package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * GetDomainConfigResResultAccessControlRemoteAuthAuthRequestQueryQueryItem
 */
@lombok.Data
public final class GetDomainConfigResResultAccessControlRemoteAuthAuthRequestQueryQueryItem  {

    /**
     * <p>您设置的鉴权请求参数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "key")
    private String key;

    /**
     * <p>您在 Key 中设置的鉴权请求参数的类型</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "value_type")
    private String valueType;

    /**
     * <p>鉴权请求参数的值</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "value")
    private String value;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
