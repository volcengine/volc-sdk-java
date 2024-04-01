package com.volcengine.model.response;


import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.SmsSignatureInfo;
import lombok.Data;

import java.util.List;

@Data
public class GetSmsSendDetailsResponse {

    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ResultBean result;
    @Data
    public static class ResultBean {
        @JSONField(name = "sendDetailsResults")
        List<GetSmsSendDetails> list;
        @JSONField(name = "Total")
        int total;
    }
    @Data
    public static class GetSmsSendDetails {
        @JSONField(name = "status")
        int status;
        @JSONField(name = "errorCode")
        String errorCode;
        @JSONField(name = "errorMessage")
        String errorMessage;
        @JSONField(name = "phoneNumber")
        String phoneNumber;
        @JSONField(name = "templateID")
        String templateID;
        @JSONField(name = "content")
        String content;
        @JSONField(name = "channelType")
        String channelType;
        @JSONField(name = "messageId")
        String messageId;
        @JSONField(name = "msgCount")
        int msgCount;
        @JSONField(name = "sendTime")
        long sendTime;
        @JSONField(name = "receiptTime")
        long receiptTime;
    }
}
