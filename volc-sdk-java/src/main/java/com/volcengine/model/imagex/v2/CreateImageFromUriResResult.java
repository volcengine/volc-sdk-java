package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * CreateImageFromUriResResult
 */
@lombok.Data
public final class CreateImageFromUriResResult  {

    /**
     * <p>待复制资源的源存储 URI</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StoreUri")
    private String storeUri;

    /**
     * <p>资源复制到目标服务后的存储 URI</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DstUri")
    private String dstUri;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
