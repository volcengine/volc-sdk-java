package com.volcengine.model.request.iam;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class DeleteUserRequest {
    @JSONField(name = "UserName")
    String userName;
}
