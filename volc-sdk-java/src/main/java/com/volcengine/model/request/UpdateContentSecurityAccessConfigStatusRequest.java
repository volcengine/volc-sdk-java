package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateContentSecurityAccessConfigStatusRequest {
    @JSONField(name = "id")
    Integer id;
    @JSONField(name = "app_id")
    Integer appId;
    @JSONField(name = "service_item")
    String service;
    @JSONField(name = "biztype")
    String biztype;
    @JSONField(name = "status")
    Integer status;
}
