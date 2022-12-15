package com.volcengine.model.request.iam;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
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
