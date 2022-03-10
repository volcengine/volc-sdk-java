package com.volcengine.model.response.kms;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class EnableKeyResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
}
