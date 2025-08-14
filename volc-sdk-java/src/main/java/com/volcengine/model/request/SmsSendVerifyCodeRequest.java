package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class SmsSendVerifyCodeRequest {
    @JSONField(name = "SmsAccount")
    String smsAccount;
    @JSONField(name = "Sign")
    String sign;
    @JSONField(name = "TemplateId")
    String templateId;
    @JSONField(name = "PhoneNumber")
    String phoneNumber;
    @JSONField(name = "UserExtCode")
    String userExtCode;
    @JSONField(name = "Scene")
    String scene;
    @JSONField(name = "CodeType")
    int codeType;
    @JSONField(name = "ExpireTime")
    int expireTime;
    @JSONField(name = "TryCount")
    int tryCount;
    @JSONField(name="EncryptName")
    String encryptName;
    @JSONField(name="Tag")
    String tag;
}
