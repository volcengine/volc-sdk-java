package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class MobileSecondSaleResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    MobileSecondSaleResponse.MobileSecondSaleResult result;

    @Data
    public static class MobileSecondSaleResult {
        @JSONField(name = "RequestId")
        private String requestId;
        @JSONField(name = "Code")
        private Integer code;
        @JSONField(name = "Message")
        private String message;
        @JSONField(name = "Data")
        private MobileSecondSaleResponse.MobileSecondSaleData data;
    }

    @Data
    public static class MobileSecondSaleData {
        @JSONField(name = "Status")
        private Integer status;
        @JSONField(name = "Detail")
        private String detail;
    }
}
