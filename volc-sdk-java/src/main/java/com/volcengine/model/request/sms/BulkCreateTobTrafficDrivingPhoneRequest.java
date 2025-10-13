package com.volcengine.model.request.sms;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class BulkCreateTobTrafficDrivingPhoneRequest {
    @JSONField(name = "data")
    private List<CreateTobTrafficDrivingPhoneReqItem> data;

    @Data
    public static class CreateTobTrafficDrivingPhoneReqItem {
        @JSONField(name = "numberType")
        private int numberType;

        @JSONField(name = "number")
        private String number;

        @JSONField(name = "company")
        private String company;

        @JSONField(name = "numberPerson")
        private String numberPerson;

        @JSONField(name = "personType")
        private int personType;

        @JSONField(name = "personId")
        private String personId;

        @JSONField(name = "numberProvince")
        private String numberProvince;

        @JSONField(name = "numberCity")
        private String numberCity;
    }
}

