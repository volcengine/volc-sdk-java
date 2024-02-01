package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageEnhanceResultResResult
 */
@lombok.Data
public final class GetImageEnhanceResultResResult  {

    /**
     * <p>增强图像的 URI。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResUri")
    private String resUri;

    /**
     * <p>实际执行的增强方法。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Method")
    private String method;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
