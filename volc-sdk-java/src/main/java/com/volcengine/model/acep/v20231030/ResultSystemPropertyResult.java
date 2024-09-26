package com.volcengine.model.acep.v20231030;


import com.alibaba.fastjson.JSON;

/**
 * ResultSystemPropertyResult
 */
@lombok.Data
public final class ResultSystemPropertyResult  {

    /**
     * <p>属性名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SystemPropertyName")
    private String systemPropertyName;

    /**
     * <p>属性值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SystemPropertyValue")
    private String systemPropertyValue;

    /**
     * <p>属性值数据类型。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SystemPropertyValueType")
    private String systemPropertyValueType;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
