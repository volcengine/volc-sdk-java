package com.bytedanceapi.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class ApplyUploadRequest {
    @JSONField(name = "ServiceId")
    String serviceId;
    @JSONField(name = "SpaceName")
    String spaceName;
    @JSONField(name = "SessionKey")
    String sessionKey;
    @JSONField(name = "FileType")
    String fileType;
    @JSONField(name = "FileSize")
    Integer fileSize;
    @JSONField(name = "UploadNum")
    Integer uploadNum;
    @JSONField(name = "StoreKeys")
    List<String> storeKeys;
}
