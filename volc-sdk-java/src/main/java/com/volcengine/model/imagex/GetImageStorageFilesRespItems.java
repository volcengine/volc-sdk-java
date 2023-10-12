package com.volcengine.model.imagex;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class GetImageStorageFilesRespItems {
    @JSONField(name = "Key")
    String key;

    @JSONField(name = "LastModified")
    String lastModified;

    @JSONField(name = "StoreUri")
    String storeUri;

    @JSONField(name = "FileSize")
    Integer fileSize;
}