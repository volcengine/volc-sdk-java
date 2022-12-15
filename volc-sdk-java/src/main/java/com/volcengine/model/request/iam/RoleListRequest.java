package com.volcengine.model.request.iam;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class RoleListRequest {
    @JSONField(name = "RoleName")
    String roleName;
    @JSONField(name = "Query")
    String query;
    @JSONField(name = "Limit")
    Integer limit;
    @JSONField(name = "Offset")
    Integer offset;
}
