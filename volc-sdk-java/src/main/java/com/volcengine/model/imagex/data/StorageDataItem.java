package com.volcengine.model.imagex.data;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class StorageDataItem {
    @JSONField(name = "ServiceId")
    private String serviceId;
    @JSONField(name = "BucketName")
    private String bucketName;
    @JSONField(name = "Data")
    private List<TSFloatItem> data;

}
