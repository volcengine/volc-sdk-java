package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class MobileStatusResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    MobileStatusResult result;

    @Data
    public static class MobileStatusResult {
        @JSONField(name = "RequestId")
        private String requestId;
        @JSONField(name = "Code")
        private Integer code;
        @JSONField(name = "Message")
        private String message;
        @JSONField(name = "Data")
        private MobileStatusData data;
    }

    @Data
    public static class MobileStatusData {
        @JSONField(name = "Status")
        private Integer status;
        @JSONField(name = "Mobile")
        private String mobile;
        @JSONField(name = "Detail")
        private String detail;
    }
}
