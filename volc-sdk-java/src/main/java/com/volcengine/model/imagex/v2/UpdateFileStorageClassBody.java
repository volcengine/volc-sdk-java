package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * UpdateFileStorageClassBody
 */
@lombok.Data
public final class UpdateFileStorageClassBody  {

    /**
     * <p>文件存储 URI。</p>
     *
     * <p>- 您可以在 veImageX 控制台 [资源管理](https://console.volcengine.com/imagex/resource_manage/)页面，在已上传文件的名称列获取资源 URI。</p>
     *
     * <p>- 您也可以通过 OpenAPI 的方式获取 URI，具体请参考[获取服务下全部上传文件</p>
     *
     * <p>](https://www.volcengine.com/docs/508/9393)。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StoreUri")
    private String storeUri;

    /**
     * <p>修改后的存储类型，取值如下所示：</p>
     *
     * <p>- `STANDARD`：标准存储</p>
     *
     * <p>- `IA`：低频存储</p>
     *
     * <p>- `ARCHIVE`：归档存储</p>
     *
     * <p>- `COLD_ARCHIVE`：冷归档存储</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StorageClass")
    private String storageClass;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
