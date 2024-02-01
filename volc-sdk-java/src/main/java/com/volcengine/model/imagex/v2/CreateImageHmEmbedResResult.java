package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * CreateImageHmEmbedResResult
 */
@lombok.Data
public final class CreateImageHmEmbedResResult  {

    /**
     * <p>添加盲水印后的结果图 Uri。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StoreUri")
    private String storeUri;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
