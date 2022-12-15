package com.volcengine.model.request.iam;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetLoginProfileRequest {
    @JSONField(name = "UserName")
    String userName;
}
