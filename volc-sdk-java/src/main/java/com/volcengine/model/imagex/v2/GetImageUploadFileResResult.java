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
     * <p>底层存储的 content-type 值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StorageContentType")
    private String storageContentType;

    /**
     * <p>文件恢复副本的到期时间。仅当文件执行过恢复操作时有值</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RestoreExpiryDate")
    private String restoreExpiryDate;

    /**
     * <p>文件是否处于恢复中状态，取值如下所示：</p>
     *
     * <p>- `true`：是</p>
     *
     * <p>- `false`：否</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Restoring")
    private Boolean restoring;

    /**
     * <p>底层存储类型，取值如下所示：</p>
     *
     * <p>- `STANDARD`：标准存储 </p>
     *
     * <p>- `IA`：低频存储 </p>
     *
     * <p>- `ARCHIVE`：归档存储 </p>
     *
     * <p>- `COLD_ARCHIVE`：冷归档存储	</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StorageClass")
    private String storageClass;

    /**
     * <p>是否被禁用</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Disabled")
    private Boolean disabled;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
