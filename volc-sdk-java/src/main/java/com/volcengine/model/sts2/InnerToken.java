package com.volcengine.model.sts2;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class InnerToken {
    @JSONField(name = "LTAccessKeyId",ordinal = 1)
    private String ltAccessKeyId;
    @JSONField(name = "AccessKeyId",ordinal = 2)
    private String accessKeyId;
    @JSONField(name = "SignedSecretAccessKey",ordinal = 3)
    private String signedSecretAccessKey;
    @JSONField(name = "ExpiredTime",ordinal = 4)
    private long expiredTime;
    @JSONField(name = "PolicyString",ordinal = 5)
    private String policyString;
    @JSONField(name = "Signature",ordinal = 6)
    private String signature;
}

