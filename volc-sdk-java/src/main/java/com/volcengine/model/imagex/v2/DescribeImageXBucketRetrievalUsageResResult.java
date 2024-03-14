package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXBucketRetrievalUsageResResult
 */
@lombok.Data
public final class DescribeImageXBucketRetrievalUsageResResult  {

    /**
     * <p>计量数据列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StorageData")
    private List<DescribeImageXBucketRetrievalUsageResResultStorageDataItem> storageData;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
