package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * AddPropertyRuleBody
 */
@lombok.Data
public final class AddPropertyRuleBody  {

    /**
     * <p>机型参数规则名称，账户下规则名称唯一，长度不能超过 200 个字符。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RuleName")
    private String ruleName;

    /**
     * <p> 实例 Settings 系统属性，非持久化，立即生效，重启实例后失效；详细信息，参考 [SystemProperty](#systemproperty) 定义。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OverlayProperty")
    private List<com.volcengine.model.acep.v20231030.RequestSystemProperty> overlayProperty;

    /**
     * <p>实例初始化系统属性，持久化，重启实例后生效；详细信息，参考 [SystemProperty](#systemproperty ) 定义：适用于只读系统属性，或 AOSP 原生非持久化的系统属性的修改，如 ro.product.model。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OverlayPersistProperty")
    private List<com.volcengine.model.acep.v20231030.RequestSystemProperty> overlayPersistProperty;

    /**
     * <p>实例 Settings 属性列表；详细信息，参考 [Settings](#settings) 定义。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OverlaySettings")
    private List<com.volcengine.model.acep.v20231030.RequestSettings> overlaySettings;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
