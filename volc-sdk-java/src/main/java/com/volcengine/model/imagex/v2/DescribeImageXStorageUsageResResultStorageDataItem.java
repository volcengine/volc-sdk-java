package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXStorageUsageResResultStorageDataItem
 */
@lombok.Data
public final class DescribeImageXStorageUsageResResultStorageDataItem  {

    /**
     * <p>服务 ID，`GroupBy`包含`ServiceId`时有返回值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceId")
    private String serviceId;

    /**
     * <p>Bucket 名称，`GroupBy`包含`BucketName`时有返回值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BucketName")
    private String bucketName;

    /**
     * <p>存储类型，`GroupBy`包含`StorageType`时有返回值。</p>
     *
     * <p>当传参`IsRetrieval`=`false`时，表示存储值，取值：</p>
     *
     * <p>- `STANDARD`：标准存储 </p>
     *
     * <p>- `IA`：低频存储 </p>
     *
     * <p>- `ARCHIVE`：归档存储 </p>
     *
     * <p>- `COLD_ARCHIVE`：冷归档存储</p>
     *
     * <p>- `ARCHIVE_FR`：归档闪回存储</p>
     *
     *
     *
     * <p>当传参`IsRetrieval`=`true`时，表示取回值，取值：</p>
     *
     * <p>- `IA`：低频取回 </p>
     *
     * <p>- `ARCHIVE`：归档标准取回</p>
     *
     * <p>- `COLD_ARCHIVE`：冷归档快速取回</p>
     *
     * <p>- `ARCHIVE_FR`：归档闪回取回</p>
     *
     * <p>- `COLD_ARCHIVE_STANDARD`：冷归档标准取回</p>
     *
     * <p>- `COLD_ARCHIVE_BULK`：冷归档批量取回</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StorageType")
    private String storageType;

    /**
     * <p>具体数据</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Data")
    private List<DescribeImageXStorageUsageResResultStorageDataItemDataItem> data;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
