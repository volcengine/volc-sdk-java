package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageSuperResolutionResultResResult
 */
@lombok.Data
public final class GetImageSuperResolutionResultResResult  {

    /**
     * <p>超分图像存储位置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResUri")
    private String resUri;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
