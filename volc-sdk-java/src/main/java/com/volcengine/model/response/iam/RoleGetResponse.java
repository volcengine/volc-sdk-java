package com.volcengine.model.response.iam;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class RoleGetResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    RoleGetInnerResponse result;

    @Data
    public static class RoleGetInnerResponse {
        @JSONField(name = "Role")
        RoleResponse role;
    }
}
