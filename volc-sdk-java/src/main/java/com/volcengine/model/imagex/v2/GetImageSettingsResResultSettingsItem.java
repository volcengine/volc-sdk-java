package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;
import java.util.Map;

/**
 * GetImageSettingsResResultSettingsItem
 */
@lombok.Data
public final class GetImageSettingsResResultSettingsItem  {

    /**
     * <p>配置项 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SettingId")
    private String settingId;

    /**
     * <p>父节点 ID，若本身为父节点则该值为空。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ParentId")
    private String parentId;

    /**
     * <p>配置项名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Name")
    private String name;

    /**
     * <p>配置项状态。当前仅支持取值为 `0`，表示状态正常。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private Integer status;

    /**
     * <p>配置项类型，取值如下所示：</p>
     *
     *
     *
     * <p>- `sample`：采样率类型</p>
     *
     * <p>- `integer`：整数类型</p>
     *
     * <p>- `float`：浮点数类型</p>
     *
     * <p>- `string`：字符串类型</p>
     *
     * <p>- `strarr`：字符串数组类型</p>
     *
     * <p>- `bool`：布尔值类型</p>
     *
     * <p>- `parent`：父节点类型</p>
     *
     * <p>- `object`：对象类型</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    /**
     * <p>仅当 `Type` 取值为 `object` 时有值，表示 value 类型，key 类型统一为 String。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ValueType")
    private String valueType;

    /**
     * <p>备注信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Comment")
    private String comment;

    /**
     * <p>`Type` 的默认值，仅当`Type`值不是`parent`时有意义。该值的类型实际由 `Type` 决定，例如当`Type`为整数类型时，默认值为 0。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DefaultValue")
    private Map<String, Object> defaultValue;

    /**
     * <p> 配置子节点列表，仅当`Type`取值为`parent`时有意义。其参数结构与 [Settings](#settings) 相同。 </p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ChildSettings")
    private List<Map<String, Object>> childSettings;

    /**
     * <p>取值限制范围。仅当`Type` 取值为`integer/float/sample/object`时有效。`Type`取值为`object`时，表示`ValueType`的取值范围。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ValueRange")
    private GetImageSettingsResResultSettingsItemValueRange valueRange;

    /**
     * <p>配置修改时间，修改时的服务器当地时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UpdateAt")
    private String updateAt;

    /**
     * <p>所属组件，即请求时的组件名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Category")
    private String category;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
