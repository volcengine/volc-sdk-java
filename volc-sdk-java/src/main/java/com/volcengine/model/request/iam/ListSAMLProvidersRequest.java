package com.volcengine.model.request.iam;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ListSAMLProvidersRequest {
    @JSONField(name = "Limit")
    int limit;

    @JSONField(name = "Offset")
    int offset;
}
