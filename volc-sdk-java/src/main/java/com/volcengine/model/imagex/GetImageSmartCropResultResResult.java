package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * GetImageSmartCropResultResResult
 */
@lombok.Data
public final class GetImageSmartCropResultResResult  {

    /**
     * <p>结果图存储 URI。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResUri")
    private String resUri;

    /**
     * <p>是否降级。支持取值如下：</p>
     *
     * <p>* true：降级；</p>
     *
     * <p>* flase：未降级。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Demotioned")
    private Boolean demotioned;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
