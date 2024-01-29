package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * GetComprehensiveEnhanceImageRes
 */
@lombok.Data
public final class GetComprehensiveEnhanceImageRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetComprehensiveEnhanceImageResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetComprehensiveEnhanceImageResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
