package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetDownloadLiveClientRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "LoginType")
    Integer LoginType;
    @JSONField(name = "UserName")
    String UserName;
}