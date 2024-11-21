package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * UpdateImageStyleMetaBody
 */
@lombok.Data
public final class UpdateImageStyleMetaBody  {

    /**
     * <p>待更新的样式 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StyleId")
    private String styleId;

    /**
     * <p>更新后的样式名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Name")
    private String name;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
