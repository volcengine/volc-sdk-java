package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.Map;

/**
 * CreateImageSettingRuleBodyRule
 */
@lombok.Data
public final class CreateImageSettingRuleBodyRule  {

    /**
     * <p>配置值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Value")
    private Map<String, Object> value;

    /**
     * <p>匹配条件，仅当条件匹配后规则才会生效。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Cond")
    private CreateImageSettingRuleBodyRuleCond cond;

    /**
     * <p>规则名称，仅支持字母、数字、下划线，最多输入 32 个字符。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Name")
    private String name;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
