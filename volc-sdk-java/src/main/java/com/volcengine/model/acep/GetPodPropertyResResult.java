package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

import java.util.Map;

/**
 * GetPodPropertyResResult
 */
@lombok.Data
public final class GetPodPropertyResResult  {

    /**
     * <p>查询到的 secure 类型 setting 值列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SettingSecureList")
    private Map<String, String> settingSecureList;

    /**
     * <p>查询到的 global 类型 setting 值列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SettingGlobalList")
    private Map<String, String> settingGlobalList;

    /**
     * <p>查询到的 system 类型 setting 值列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SettingSystemList")
    private Map<String, String> settingSystemList;

    /**
     * <p>查询到的非持久化属性列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PropertyList")
    private Map<String, String> propertyList;

    /**
     * <p>查询到的持久化属性列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PersistPropertyList")
    private Map<String, String> persistPropertyList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
