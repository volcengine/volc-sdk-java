package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * UpdateImageExifDataBodyActionsItem
 */
@lombok.Data
public final class UpdateImageExifDataBodyActionsItem  {

    /**
     * <p>指定图片的处理类型，取值如下所示：</p>
     *
     * <p>- `Delete`：删除指定 Tag 的内容</p>
     *
     * <p>- `DeleteAll`：删除所有 Tag 的内容</p>
     *
     * <p>- `Modify`：修改指定 Tag 的内容</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    /**
     * <p>仅当 `Type` 取值为 `Delete/Modify` 时，为必填。</p>
     *
     *
     *
     * <p>指定要处理的 Tag 名称，仅支持对[列表](#使用说明)内的标签进行处理。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TagName")
    private String tagName;

    /**
     * <p>仅当 `Type` 取值为 `Modify` 时，为必填。</p>
     *
     *
     *
     * <p>指定新增/修改后 Tag 的内容，最大为 1024 字节。</p>
     *
     * <p>:::tip</p>
     *
     * <p>- 若原图中 `TagName` 内容为空，则表示新增内容；</p>
     *
     * <p>- 若原图中 `TagName` 存在已有内容，则表示更新内容。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TagValue")
    private String tagValue;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
