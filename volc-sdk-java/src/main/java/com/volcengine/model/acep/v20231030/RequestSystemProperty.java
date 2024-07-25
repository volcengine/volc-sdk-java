package com.volcengine.model.acep.v20231030;


import com.alibaba.fastjson.JSON;

/**
 * RequestSystemProperty
 */
@lombok.Data
public final class RequestSystemProperty  {

    /**
     * <p>属性名称，已可修改的系统属性及属性值，参考 [System Properties 属性列表](https://www.volcengine.com/docs/6394/671880#system-properties-%E5%B1%9E%E6%80%A7%E5%88%97%E8%A1%A8)。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SystemPropertyName")
    private String systemPropertyName;

    /**
     * <p>属性值。取值如下：</p>
     *
     *
     *
     * <p>- bool: "true"、"false"</p>
     *
     * <p>- int\long: "21312"</p>
     *
     * <p>- float: "2131.09"</p>
     *
     * <p>- string: "safehg"</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>当 `SystemPropertyValueType` 参数取值不同，该 `SystemPropertyValue` 参数对应的取值不同。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SystemPropertyValue")
    private String systemPropertyValue;

    /**
     * <p>属性值数据类型。取值如下：</p>
     *
     *
     *
     * <p>- `int`</p>
     *
     * <p>- `long`</p>
     *
     * <p>- `string`</p>
     *
     * <p>- `float`</p>
     *
     * <p>- `bool`</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SystemPropertyValueType")
    private String systemPropertyValueType;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
