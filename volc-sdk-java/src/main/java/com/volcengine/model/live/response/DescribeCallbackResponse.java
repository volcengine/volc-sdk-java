package com.volcengine.model.live.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.live.CallbackDetail;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.Map;

@Data
public class DescribeCallbackResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    DescribeCallbackOutput result;


    @Data
    public static class DescribeCallbackOutput {
        @JSONField(name = "CallbackList")
        CallbackInfo[] callbackList;
    }

    @Data
    public static class CallbackInfo {

        @JSONField(name = "Vhost")
        String vhost;
        @JSONField(name = "App")
        String app;
        @JSONField(name = "MessageType")
        String messageType;
        @JSONField(name = "TranscodeCallback")
        Long transcodeCallback;
        @JSONField(name = "CallbackDetailList")
        CallbackDetail[] callbackDetailList;
        @JSONField(name = "AuthEnable")
        Boolean authEnable;
        @JSONField(name = "AuthKeyPrimary")
        String authKeyPrimary;
        @JSONField(name = "AuthKeySecond")
        String authKeySecond;
        @JSONField(name = "ValidDuration")
        Long validDuration;
        @JSONField(name = "EncryptionAlgorithm")
        String encryptionAlgorithm;
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

//        @Data
//        public static class CallbackDetail {
//
//            @JSONField(name = "CallbackType")
//            String callbackType;
//            @JSONField(name = "URL")
//            String URL;
//        }
    }
}
