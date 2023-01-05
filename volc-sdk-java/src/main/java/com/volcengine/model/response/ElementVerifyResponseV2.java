package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ElementVerifyResponseV2 {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ElementVerifyResponseV2.ElementVerifyResultV2 result;

    @Data
    public static class ElementVerifyResultV2 {
        @JSONField(name = "RequestId")
        private String requestId;
        @JSONField(name = "Code")
        private Integer code;
        @JSONField(name = "Message")
        private String message;
        @JSONField(name = "Data")
        private ElementVerifyResponseV2.ElementVerifyDataV2 data;
    }

    @Data
    public static class ElementVerifyDataV2 {
        @JSONField(name = "Status")
        private Integer status;
        @JSONField(name = "Detail")
        private ElementVerifyResponseV2.ElementDetail detail;
    }

    @Data
    public static class ElementDetail {
        @JSONField(name = "BankName")
        private String bankName;
        @JSONField(name = "CardType")
        private String cardType;
        @JSONField(name = "CardCategory")
        private String cardCategory;
        @JSONField(name = "EnterpriseCode")
        private String enterpriseCode;
        @JSONField(name = "EnterpriseName")
        private String EnterpriseName;
        @JSONField(name = "IdCardNo")
        private String IdCardNo;
        @JSONField(name = "IdCardName")
        private String IdCardName;
    }
}
