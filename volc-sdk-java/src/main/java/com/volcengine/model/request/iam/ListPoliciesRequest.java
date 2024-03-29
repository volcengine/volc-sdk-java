package com.volcengine.model.request.iam;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ListPoliciesRequest {
    @JSONField(name = "Scope")
    String scope;

    @JSONField(name = "Query")
    String query;

    @JSONField(name = "Status")
    String status;

    @JSONField(name = "Limit")
    int limit;

    @JSONField(name = "Offset")
    int offset;
}
