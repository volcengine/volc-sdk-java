package com.volcengine.model.request.iam;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetUserRequest {
    @JSONField(name = "UserName")
    String userName;

    @JSONField(name = "WithThirdPartyIdentity")
    Boolean withThirdPartyIdentity;
}
