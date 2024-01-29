package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * GetImageComicResultResResult
 */
@lombok.Data
public final class GetImageComicResultResResult  {

    /**
     * <p>结果图存储 URI。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResUri")
    private String resUri;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
