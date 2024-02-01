package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXBucketUsageResResultStorageDataItem
 */
@lombok.Data
public final class DescribeImageXBucketUsageResResultStorageDataItem  {

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
     * <p>具体数据</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Data")
    private List<DescribeImageXBucketUsageResResultStorageDataItemDataItem> data;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
