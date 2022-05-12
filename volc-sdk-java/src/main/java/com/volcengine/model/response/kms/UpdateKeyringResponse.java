package com.volcengine.model.response.kms;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class UpdateKeyringResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
}
