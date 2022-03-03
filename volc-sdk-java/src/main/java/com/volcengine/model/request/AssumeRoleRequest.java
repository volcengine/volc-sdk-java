package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class AssumeRoleRequest {
    @JSONField(name = "RoleTrn")
    private String roleTrn;
    @JSONField(name = "RoleSessionName")
    private String roleSessionName;
    @JSONField(name = "DurationSeconds")
    private Integer DurationSeconds;
    @JSONField(name = "Policy")
    private String policy;
}
