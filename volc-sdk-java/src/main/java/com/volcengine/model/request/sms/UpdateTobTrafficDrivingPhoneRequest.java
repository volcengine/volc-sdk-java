package com.volcengine.model.request.sms;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class UpdateTobTrafficDrivingPhoneRequest {
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

    @JSONField(name = "updatePersonId")
    private boolean updatePersonId;

}
