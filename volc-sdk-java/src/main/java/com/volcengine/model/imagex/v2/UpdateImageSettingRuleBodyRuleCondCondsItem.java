package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.Map;

/**
 * UpdateImageSettingRuleBodyRuleCondCondsItem
 */
@lombok.Data
public final class UpdateImageSettingRuleBodyRuleCondCondsItem  {

    /**
     * <p>过滤维度，取值请参考[规则配置条件](https://www.volcengine.com/docs/508/65940#%E8%A7%84%E5%88%99%E9%85%8D%E7%BD%AE%E6%9D%A1%E4%BB%B6)。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Key")
    private String key;

    /**
     * <p>操作符。支持取值：==、!=、>、>=、<、<=、in</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Op")
    private String op;

    /**
     * <p>配置值。`Op`为`in`时，为 Array of String 类型，否则为 String 类型。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Value")
    private Map<String, Object> value;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
