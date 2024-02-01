package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageUploadFileResResult
 */
@lombok.Data
public final class GetImageUploadFileResResult  {

    /**
     * <p>服务 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceId")
    private String serviceId;

    /**
     * <p>文件 Uri。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StoreUri")
    private String storeUri;

    /**
     * <p>文件修改时间，即文件修改时的服务器当地时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "LastModified")
    private String lastModified;

    /**
     * <p>文件字节数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FileSize")
    private Integer fileSize;

    /**
     * <p>底层存储的content-type值</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StorageContentType")
    private String storageContentType;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
