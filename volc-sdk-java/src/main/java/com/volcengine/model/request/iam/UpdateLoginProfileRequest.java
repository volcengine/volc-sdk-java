package com.volcengine.model.request.iam;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class UpdateLoginProfileRequest {
    @JSONField(name = "UserName")
    String userName;
    @JSONField(name = "Password")
    String password;
    @JSONField(name = "LoginAllowed")
    Boolean loginAllowed;
    @JSONField(name = "PasswordResetRequired")
    Boolean passwordResetRequired;
}
