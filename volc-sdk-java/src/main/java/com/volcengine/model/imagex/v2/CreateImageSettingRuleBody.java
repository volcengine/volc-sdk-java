package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * CreateImageSettingRuleBody
 */
@lombok.Data
public final class CreateImageSettingRuleBody  {

    /**
     * <p>配置项 ID，您可以通过[调用获取配置项列表](https://www.volcengine.com/docs/508/1324617)的方式获取所需的配置项 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SettingId")
    private String settingId;

    /**
     * <p>应用 ID，您可以通过调用[获取应用列表](https://www.volcengine.com/docs/508/19511)的方式获取所需的 AppId。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppId")
    private String appId;

    /**
     * <p>规则内容</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Rule")
    private CreateImageSettingRuleBodyRule rule;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
