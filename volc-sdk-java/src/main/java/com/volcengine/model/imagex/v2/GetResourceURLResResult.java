package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetResourceURLResResult
 */
@lombok.Data
public final class GetResourceURLResResult  {

    /**
     * <p>结果图访问默认地址。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "URL")
    private String uRL;

    /**
     * <p>结果图访问精简地址，与默认地址相比缺少 Bucket 部分。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CompactURL")
    private String compactURL;

    /**
     * <p>默认源图片地址。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ObjURL")
    private String objURL;

    /**
     * <p>精简源图片地址，与默认地址相比缺少 Bucket 部分。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ObjCompactURL")
    private String objCompactURL;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
