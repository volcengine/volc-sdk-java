package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * GetImageTemplateResResultAdaptiveFmt
 */
@lombok.Data
public final class GetImageTemplateResResultAdaptiveFmt  {

    /**
     * <p>静图自适应，可选"webp"/"heic"/"avif"/"dynamic"</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Static")
    private String myStatic;

    /**
     * <p>动图自适应，可选"webp"/"heic"/"avif"/"dynamic"</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Animated")
    private String animated;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
