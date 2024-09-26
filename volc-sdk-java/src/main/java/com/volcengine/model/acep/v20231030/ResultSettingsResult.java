package com.volcengine.model.acep.v20231030;


import com.alibaba.fastjson.JSON;

/**
 * ResultSettingsResult
 */
@lombok.Data
public final class ResultSettingsResult  {

    /**
     * <p>属性名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SettingsName")
    private String settingsName;

    /**
     * <p>设置类型。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SettingsType")
    private String settingsType;

    /**
     * <p>属性值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SettingsValue")
    private String settingsValue;

    /**
     * <p>属性值数据类型。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SettingsValueType")
    private String settingsValueType;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
