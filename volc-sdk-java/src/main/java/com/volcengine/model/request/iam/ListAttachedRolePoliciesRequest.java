package com.volcengine.model.request.iam;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ListAttachedRolePoliciesRequest {
    @JSONField(name = "RoleName")
    String roleName;
}
