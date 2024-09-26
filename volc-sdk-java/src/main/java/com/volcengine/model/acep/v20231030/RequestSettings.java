package com.volcengine.model.acep.v20231030;


import com.alibaba.fastjson.JSON;

/**
 * RequestSettings
 */
@lombok.Data
public final class RequestSettings  {

    /**
     * <p>属性名称，已可修改的 Settings 属性及属性值，参考 [Settings 属性列表](https://www.volcengine.com/docs/6394/671880#settings-%E5%B1%9E%E6%80%A7%E5%88%97%E8%A1%A8)</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SettingsName")
    private String settingsName;

    /**
     * <p>设置类型，取值如下：</p>
     *
     *
     *
     * <p>- `global`</p>
     *
     * <p>- `secure`</p>
     *
     * <p>- `system`</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SettingsType")
    private String settingsType;

    /**
     * <p>属性值。各类型属性取值示例如下：</p>
     *
     *
     *
     * <p>- bool: "true"、"false"</p>
     *
     * <p>	</p>
     *
     * <p>- int\long: "21312"</p>
     *
     * <p>	</p>
     *
     * <p>- float: "2131.09"</p>
     *
     * <p>	</p>
     *
     * <p>- string: "safehg"</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SettingsValue")
    private String settingsValue;

    /**
     * <p>属性值数据类型，取值如下：</p>
     *
     *
     *
     * <p>- `int`</p>
     *
     * <p>- `long`</p>
     *
     * <p>- `string`</p>
     *
     * <p>- `float`</p>
     *
     * <p>- `bool`</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SettingsValueType")
    private String settingsValueType;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
