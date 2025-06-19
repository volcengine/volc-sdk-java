package com.volcengine.model.response;


import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class UpdateSmsSignatureResponse {

    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    UpdateSmsSignatureResponse.ResultBean result;

    @Data
    public static class ResultBean {
        @JSONField(name = "createdTime")
        long createdTime;

        @JSONField(name = "signature")
        String signature;
    }
}
