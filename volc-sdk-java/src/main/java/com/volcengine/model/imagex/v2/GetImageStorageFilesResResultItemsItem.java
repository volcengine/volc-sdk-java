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

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
