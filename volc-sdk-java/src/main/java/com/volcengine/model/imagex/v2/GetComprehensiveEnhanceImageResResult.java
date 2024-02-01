package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetComprehensiveEnhanceImageResResult
 */
@lombok.Data
public final class GetComprehensiveEnhanceImageResResult  {

    /**
     * <p>结果图地址</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResUri")
    private String resUri;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
