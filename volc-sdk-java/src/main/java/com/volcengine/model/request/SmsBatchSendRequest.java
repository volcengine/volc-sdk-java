package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
public class SmsBatchSendRequest {
    @JSONField(name = "SmsAccount")
    String smsAccount;
    @JSONField(name = "Sign")
    String sign;
    @JSONField(name = "TemplateId")
    String templateId;
    @JSONField(name = "Messages")
    List<BatchSmsMessage> messages;
    @JSONField(name = "Tag")
    String tag;

    @JSONField(name="EncryptName")
    String encryptName;

    @Data
    @AllArgsConstructor
    public static class BatchSmsMessage {
        @JSONField(name = "PhoneNumber")
        String phoneNumber;
        @JSONField(name = "TemplateParam")
        String templateParam;
    }
}
