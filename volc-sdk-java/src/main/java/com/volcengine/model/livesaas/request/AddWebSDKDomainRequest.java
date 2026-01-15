package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class AddWebSDKDomainRequest {
    @JSONField(name = "Domain")
    String Domain;
    @JSONField(name = "WhitelistScenes")
    Integer WhitelistScenes;
}