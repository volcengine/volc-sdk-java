package com.volcengine.model.response.iam;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class LoginProfile {
    @JSONField(name = "UserName")
    String userName;
    @JSONField(name = "LoginAllowed")
    Boolean loginAllowed;
    @JSONField(name = "PasswordResetRequired")
    Boolean passwordResetRequired;
    @JSONField(name = "LastLoginDate")
    String lastLoginDate;
    @JSONField(name = "LastLoginIp")
    String lastLoginIp;
}
