package com.volcengine.model.request.iam;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class CreateServiceLinkedRoleRequest {
    @JSONField(name = "ServiceName")
    String serviceName;
}
