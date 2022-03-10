package com.volcengine.model.request.kms;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class QueryKeyringRequest {
    @JSONField(name = "KeyringName")
    String keyringName;
}
