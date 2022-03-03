package com.volcengine.model.live.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.live.CallbackDetail;
import lombok.Data;

import java.util.Map;

@Data
public class UpdateCallbackRequest {

    @JSONField(name = "Vhost")
    String vhost;
    @JSONField(name = "Domain")
    String domain;
    @JSONField(name = "App")
    String App;
    @JSONField(name = "MessageType")
    String messageType;
    @JSONField(name = "TranscodeCallback")
    Long transcodeCallback;
    @JSONField(name = "AuthEnable")
    Boolean authEnable;
    @JSONField(name = "AuthKeyPrimary")
    String authKeyPrimary;
    @JSONField(name = "AuthKeySecond")
    String authKeySecond;
    @JSONField(name = "ValidDuration")
    Long validDuration;
    @JSONField(name = "encryptionAlgorithm")
    String EncryptionAlgorithm;
    @JSONField(name = "CallbackField")
    String[] callbackField;
    @JSONField(name = "AuthField")
    Map<String, String> authField;
    @JSONField(name = "EncryptField")
    String[] encryptField;
    @JSONField(name = "AppendField")
    Map<String, String> appendField;
    @JSONField(name = "TimeoutSecond")
    Long timeoutSecond;
    @JSONField(name = "RetryTimes")
    Long retryTimes;
    @JSONField(name = "RetryInternalSecond")
    Long retryInternalSecond;
    @JSONField(name = "CallbackDetailList")
    CallbackDetail[] callbackDetailList;

//    @Data
//    private static class CallbackDetail {
//
//        @JSONField(name = "CallbackType")
//        String callbackType;
//        @JSONField(name = "URL")
//        String URL;
//    }
}
