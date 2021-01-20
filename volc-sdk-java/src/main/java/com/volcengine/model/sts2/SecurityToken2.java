package com.volcengine.model.sts2;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class SecurityToken2 {
    @JSONField(name = "AccessKeyID",ordinal = 1)
    private String accessKeyId;
    @JSONField(name = "SecretAccessKey",ordinal = 2)
    private String secretAccessKey;
    @JSONField(name = "SessionToken",ordinal = 3)
    private String sessionToken;
    @JSONField(name = "ExpiredTime",ordinal = 4)
    private String expiredTime;
    @JSONField(name = "CurrentTime",ordinal = 5)
    private String currentTime;
}
