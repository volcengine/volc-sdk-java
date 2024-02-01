package com.volcengine.model.imagex.data;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class DescribeImageXBucketUsageResp {
    @JSONField(name = "StorageData")
    private List<StorageDataItem> storageData;
}
