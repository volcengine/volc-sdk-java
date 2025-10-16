package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageStorageFilesResResultItemsItem
 */
@lombok.Data
public final class GetImageStorageFilesResResultItemsItem  {

    /**
     * <p>文件存储 Key</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Key")
    private String key;

    /**
     * <p>文件存储 URI</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StoreUri")
    private String storeUri;

    /**
     * <p>文件最后修改时间，RFC 时间格式。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "LastModified")
    private String lastModified;

    /**
     * <p>文件大小，单位为 byte。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FileSize")
    private Long fileSize;

    /**
     * <p>文件的存储类型，取值如下所示：</p>
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
