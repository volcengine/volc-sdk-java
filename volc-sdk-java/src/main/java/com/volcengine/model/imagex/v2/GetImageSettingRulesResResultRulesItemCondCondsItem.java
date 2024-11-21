package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.Map;

/**
 * GetImageSettingRulesResResultRulesItemCondCondsItem
 */
@lombok.Data
public final class GetImageSettingRulesResResultRulesItemCondCondsItem  {

    /**
     * <p>过滤维度。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Key")
    private String key;

    /**
     * <p>操作符。支持取值：==、!=、>、>=、<、<=、in</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Op")
    private String op;

    /**
     * <p>配置值。`Op` 为 `in` 时，为 `Array of String` 类型，取值为其他时为 `String` 类型。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Value")
    private Map<String, Object> value;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
