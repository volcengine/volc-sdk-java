package com.volcengine.model.request.iam;

import com.alibaba.fastjson.annotation.JSONField;

import lombok.Data;

@Data
public class CreateUserRequest {
    @JSONField(name = "UserName")
    String userName;
    @JSONField(name = "DisplayName")
    String displayName;
    @JSONField(name = "MobilePhone")
    String mobilePhone;
    @JSONField(name = "Email")
    String email;
    @JSONField(name = "Description")
    String description;
}
