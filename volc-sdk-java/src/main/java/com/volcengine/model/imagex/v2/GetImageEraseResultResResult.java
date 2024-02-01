package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageEraseResultResResult
 */
@lombok.Data
public final class GetImageEraseResultResResult  {

    /**
     * <p>修复后结果图的 URI。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResUri")
    private String resUri;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
