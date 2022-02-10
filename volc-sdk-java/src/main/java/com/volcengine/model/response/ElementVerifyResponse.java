package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class ElementVerifyResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ElementVerifyResult result;

    @Data
    public static class ElementVerifyResult {
        @JSONField(name = "RequestId")
        private String requestId;
        @JSONField(name = "Code")
        private Integer code;
        @JSONField(name = "Message")
        private String message;
        @JSONField(name = "Data")
        private ElementVerifyData data;
    }

    @Data
    public static class ElementVerifyData {
        @JSONField(name = "Status")
        private Integer status;
        @JSONField(name = "Detail")
        private String detail;
    }
}
