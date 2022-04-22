package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class MobileStatusResponseV2 {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    MobileStatusResponseV2.MobileStatusResultV2 result;

    @Data
    public static class MobileStatusResultV2 {
        @JSONField(name = "RequestId")
        private String requestId;
        @JSONField(name = "Code")
        private Integer code;
        @JSONField(name = "Message")
        private String message;
        @JSONField(name = "Data")
        private MobileStatusResponseV2.MobileStatusDataV2 data;
    }

    @Data
    public static class MobileStatusDataV2 {
        @JSONField(name = "Status")
        private Integer status;
        @JSONField(name = "Mobile")
        private String mobile;
        @JSONField(name = "Detail")
        private MobileStatusResponseV2.MobileDetail detail;
    }

    @Data
    public static class MobileDetail {
        @JSONField(name = "Province")
        private String province;
        @JSONField(name = "ProvinceCode")
        private String provinceCode;
        @JSONField(name = "City")
        private String city;
        @JSONField(name = "CityCode")
        private String cityCode;
        @JSONField(name = "ISP")
        private String isp;
        @JSONField(name = "Mobile")
        private String mobile;
        @JSONField(name = "PostCode")
        private String postCode;
        @JSONField(name = "OldISP")
        private String oldISP;
        @JSONField(name = "NewISP")
        private String newISP;
    }
}
