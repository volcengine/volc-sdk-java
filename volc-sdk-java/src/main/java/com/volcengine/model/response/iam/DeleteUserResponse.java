package com.volcengine.model.response.iam;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class DeleteUserResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
}
