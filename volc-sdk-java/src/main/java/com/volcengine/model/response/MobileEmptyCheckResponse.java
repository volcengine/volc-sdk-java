package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class MobileEmptyCheckResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    MobileEmptyCheckResponse.MobileEmptyCheckResult result;

    @Data
    public static class MobileEmptyCheckResult {
        @JSONField(name = "RequestId")
        private String requestId;
        @JSONField(name = "Code")
        private Integer code;
        @JSONField(name = "Message")
        private String message;
        @JSONField(name = "Data")
        private MobileEmptyCheckResponse.MobileEmptyCheckData data;
    }

    @Data
    public static class MobileEmptyCheckData {
        @JSONField(name = "Status")
        private Integer status;
        @JSONField(name = "Detail")
        private String detail;
    }
}
