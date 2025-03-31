package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * AddDomainV1BodyRespHdrsItem
 */
@lombok.Data
public final class AddDomainV1BodyRespHdrsItem  {

    /**
     * <p>Header Key，请见[支持配置的响应头](https://www.volcengine.com/docs/508/196704#%E6%94%AF%E6%8C%81%E9%85%8D%E7%BD%AE%E7%9A%84%E5%93%8D%E5%BA%94%E5%A4%B4)。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "key")
    private String key;

    /**
     * <p>Header Value，设置该响应头字段的值。字段值不能超过 1,024 个字符，可以包含除美元符号（$），Delete（ASCII code 127）外的可打印 ASCII 字符。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "value")
    private String value;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
