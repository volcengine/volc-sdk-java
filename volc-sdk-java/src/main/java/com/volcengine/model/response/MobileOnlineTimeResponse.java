package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class MobileOnlineTimeResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    MobileOnlineTimeResponse.MobileOnlineTimeResult result;

    @Data
    public static class MobileOnlineTimeResult {
        @JSONField(name = "RequestId")
        private String requestId;
        @JSONField(name = "Code")
        private Integer code;
        @JSONField(name = "Message")
        private String message;
        @JSONField(name = "Data")
        private MobileOnlineTimeResponse.MobileOnlineTimeData data;
    }

    @Data
    public static class MobileOnlineTimeData {
        @JSONField(name = "Status")
        private Integer status;
        @JSONField(name = "Detail")
        private String detail;
    }
}
