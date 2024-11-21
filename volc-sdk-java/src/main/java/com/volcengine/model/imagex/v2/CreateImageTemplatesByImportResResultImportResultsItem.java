package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * CreateImageTemplatesByImportResResultImportResultsItem
 */
@lombok.Data
public final class CreateImageTemplatesByImportResResultImportResultsItem  {

    /**
     * <p>源模板名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TemplateName")
    private String templateName;

    /**
     * <p>导入是否成功，取值如下所示：</p>
     *
     * <p>- `true`：导入成功</p>
     *
     * <p>- `false`：导入失败</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Success")
    private Boolean success;

    /**
     * <p>导入后模板名称。当`Success`取值为`true`时有值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImportedName")
    private String importedName;

    /**
     * <p>导入失败原因。当`Success`取值为`false`时有值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Msg")
    private String msg;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
