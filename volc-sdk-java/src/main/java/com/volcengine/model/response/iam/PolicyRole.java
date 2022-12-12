package com.volcengine.model.response.iam;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class PolicyRole {
    @JSONField(name = "AttachDate")
    String attachDate;

    @JSONField(name = "RoleName")
    String roleName;

    @JSONField(name = "Description")
    String description;
}
