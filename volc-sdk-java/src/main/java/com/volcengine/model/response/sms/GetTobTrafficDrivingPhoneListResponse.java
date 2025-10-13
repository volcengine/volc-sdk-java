package com.volcengine.model.response.sms;


import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class GetTobTrafficDrivingPhoneListResponse {

    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetTobTrafficDrivingPhoneListResponse.ResultBean result;

    @Data
    public static class ResultBean {
        @JSONField(name = "list")
        List<GetTobTrafficDrivingPhoneListResponse.TobTrafficDrivingPhoneJson> list;
        @JSONField(name = "total")
        Integer total;
    }

    @Data
    public static class TobTrafficDrivingPhoneJson {

        @JSONField(name = "account")
        private String account;

        @JSONField(name = "numberType")
        private Integer numberType;

        @JSONField(name = "number")
        private String number;

        @JSONField(name = "company")
        private String company;

        @JSONField(name = "numberPerson")
        private String numberPerson;

        @JSONField(name = "personType")
        private Integer personType;

        @JSONField(name = "personId")
        private String personId;

        @JSONField(name = "numberProvince")
        private String numberProvince;

        @JSONField(name = "numberCity")
        private String numberCity;

        @JSONField(name = "numberEvidence")
        private String numberEvidence;

        @JSONField(name = "soundInfo")
        private String soundInfo;

        @JSONField(name = "reviewStatus")
        private Integer reviewStatus;

        @JSONField(name = "createdAt")
        private Long createdAt;

        @JSONField(name = "updatedAt")
        private Long updatedAt;
    }
}
