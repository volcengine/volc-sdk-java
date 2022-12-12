package com.volcengine.model.response.iam;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class PolicyUser {
    @JSONField(name = "AttachDate")
    String attachDate;

    @JSONField(name = "UserName")
    String userName;

    @JSONField(name = "DisplayName")
    String displayName;

    @JSONField(name = "Description")
    String description;
}
