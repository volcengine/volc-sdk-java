package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageFontsResResultFontsItem
 */
@lombok.Data
public final class GetImageFontsResResultFontsItem  {

    /**
     * <p>字体中文名称，如思源黑体。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Name")
    private String name;

    /**
     * <p>字体值，即字体库字体名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Font")
    private String font;

    /**
     * <p>字体资源 URI。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Uri")
    private String uri;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
