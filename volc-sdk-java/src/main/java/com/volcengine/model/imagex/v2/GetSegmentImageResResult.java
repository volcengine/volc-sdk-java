package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetSegmentImageResResult
 */
@lombok.Data
public final class GetSegmentImageResResult  {

    /**
     * <p>背景去除后的图片 URI。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResUri")
    private String resUri;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
