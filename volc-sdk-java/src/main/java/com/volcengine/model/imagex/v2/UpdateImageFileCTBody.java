package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * UpdateImageFileCTBody
 */
@lombok.Data
public final class UpdateImageFileCTBody  {

    /**
     * <p>待更新文件的存储 URI，您可以通过调用[获取服务下的上传文件](https://www.volcengine.com/docs/508/9392)来获取所需的文件 URI。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StoreUri")
    private String storeUri;

    /**
     * <p>设置更新后的 Content-Type 值。</p>
     *
     * <p>:::tip</p>
     *
     * <p>请确保更新后的 Content-Type，在服务维度设置的 Content-Type 白名单内。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StorageContentType")
    private String storageContentType;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
