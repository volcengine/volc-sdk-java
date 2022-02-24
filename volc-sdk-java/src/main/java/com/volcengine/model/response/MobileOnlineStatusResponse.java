package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class MobileOnlineStatusResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    MobileOnlineStatusResponse.MobileOnlineStatusResult result;

    @Data
    public static class MobileOnlineStatusResult {
        @JSONField(name = "RequestId")
        private String requestId;
        @JSONField(name = "Code")
        private Integer code;
        @JSONField(name = "Message")
        private String message;
        @JSONField(name = "Data")
        private MobileOnlineStatusResponse.MobileOnlineStatusData data;
    }

    @Data
    public static class MobileOnlineStatusData {
        @JSONField(name = "Status")
        private Integer status;
        @JSONField(name = "Detail")
        private String detail;
    }
}
