package com.volcengine.model.acep.v20231030;


import com.alibaba.fastjson.JSON;

import java.util.Map;

/**
 * ResultGetPodPropertyResult
 */
@lombok.Data
public final class ResultGetPodPropertyResult  {

    /**
     * <p>非持久化属性列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PropertyList")
    private Map<String, String> propertyList;

    /**
     * <p>global类型setting值列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SettingGlobalList")
    private Map<String, String> settingGlobalList;

    /**
     * <p>secure类型setting值列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SettingSecureList")
    private Map<String, String> settingSecureList;

    /**
     * <p>system类型setting值列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SettingSystemList")
    private Map<String, String> settingSystemList;

    /**
     * <p>持久化属性列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PersistPropertyList")
    private Map<String, String> persistPropertyList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
