package com.volcengine.model.request.iam;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class UpdateUserRequest {
    @JSONField(name = "UserName")
    String userName;
    @JSONField(name = "NewUserName")
    String newUserName;
    @JSONField(name = "NewDisplayName")
    String newDisplayName;
    @JSONField(name = "NewMobilePhone")
    String newMobilePhone;
    @JSONField(name = "NewEmail")
    String newEmail;
    @JSONField(name = "NewDescription")
    String newDescription;
}
