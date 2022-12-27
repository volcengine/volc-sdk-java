package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class SmsSendResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ResultBean result;
    @JSONField(name = "Code")
    String code;
    @JSONField(name = "Message")
    String message;

    @Data
    public static class ResultBean {
        @JSONField(name = "MessageID")
        List<String> messageId;
    }

    public SmsSendResponse(){}

    public SmsSendResponse(String code,String message){
        this.code = code;
        this.message = message;
    }
}
