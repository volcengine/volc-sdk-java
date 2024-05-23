package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ContentSecurityAccessConfigCreateResponse {

    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    CommonResult result;

    @Data
    public static class CommonResult {
        @JSONField(name = "RequestId")
        private String requestId;
        @JSONField(name = "Code")
        private Integer code;
        @JSONField(name = "Message")
        private String message;
        @JSONField(name = "Data")
        private AccessConfigCreateData data;
    }

    @Data
    public static class AccessConfigCreateData {
        @JSONField(name = "id")
        private Integer id;
    }

}
