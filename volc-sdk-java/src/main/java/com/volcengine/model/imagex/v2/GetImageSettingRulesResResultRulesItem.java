package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.Map;

/**
 * GetImageSettingRulesResResultRulesItem
 */
@lombok.Data
public final class GetImageSettingRulesResResultRulesItem  {

    /**
     * <p>对应配置值，该值的类型由对应配置项决定。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Value")
    private Map<String, Object> value;

    /**
     * <p>规则条件</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Cond")
    private GetImageSettingRulesResResultRulesItemCond cond;

    /**
     * <p>规则名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Name")
    private String name;

    /**
     * <p>规则 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RuleId")
    private String ruleId;

    /**
     * <p>规则优先级，值越小优先级越高。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Priority")
    private Integer priority;

    /**
     * <p>规则配置信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Content")
    private String content;

    /**
     * <p>规则创建账号</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Creator")
    private String creator;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
