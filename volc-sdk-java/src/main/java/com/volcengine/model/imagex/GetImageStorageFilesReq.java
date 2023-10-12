package com.volcengine.model.imagex;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetImageStorageFilesReq {
    @JSONField(name = "ServiceId")
    String serviceId;
    
    @JSONField(name = "Marker")
    String marker;

    @JSONField(name = "Limit")
    Integer taskId;

    @JSONField(name = "Prefix")
    String prefix;

    @JSONField(name = "Delimiter")
    String delimiter;
}
