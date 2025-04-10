package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class VpcUploadRequest {
    @JSONField(name = "ServiceId")
    String serviceId;
    @JSONField(name = "FilePath")
    String filePath;
    @JSONField(name = "Data")
    byte[] data;
    @JSONField(name = "StoreKey")
    String storeKey;
    @JSONField(name = "FileExtension")
    String fileExtension;
    @JSONField(name = "Prefix")
    String prefix;
    @JSONField(name = "ContentType")
    String contentType;
    @JSONField(name = "StorageClass")
    String storageClass;
    @JSONField(name = "PartSize")
    Long partSize;
    @JSONField(name = "Overwrite")
    Boolean overwrite;
    @JSONField(serialize = false)
    Boolean skipMeta;
    @JSONField(serialize = false)
    CommitImageUploadRequest commitParam;
}
