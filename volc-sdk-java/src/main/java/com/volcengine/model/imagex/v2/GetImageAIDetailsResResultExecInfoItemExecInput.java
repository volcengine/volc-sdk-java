package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageAIDetailsResResultExecInfoItemExecInput
 */
@lombok.Data
public final class GetImageAIDetailsResResultExecInfoItemExecInput  {

    /**
     * <p>图片 URL 或 URI。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ObjectKey")
    private String objectKey;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
