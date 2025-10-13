package com.volcengine.model.request.sms;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetTobTrafficDrivingPhoneListRequest {
    @JSONField(name = "number")
    private String number;
}
