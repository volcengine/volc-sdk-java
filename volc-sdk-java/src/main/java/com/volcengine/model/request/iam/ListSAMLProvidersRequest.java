package com.volcengine.model.request.iam;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ListSAMLProvidersRequest {
    @JSONField(name = "Limit")
    int limit;

    @JSONField(name = "Offset")
    int offset;
}
