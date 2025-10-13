package com.volcengine.example.sms;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.beans.ShortUrlConfig;
import com.volcengine.model.request.ApplySmsTemplateRequest;
import com.volcengine.model.request.sms.UpdateTobTrafficDrivingPhoneRequest;
import com.volcengine.model.response.ApplySmsTemplateResponse;
import com.volcengine.model.response.sms.UpdateTobTrafficDrivingPhoneResponse;
import com.volcengine.service.sms.SmsService;
import com.volcengine.service.sms.SmsServiceInfoConfig;
import com.volcengine.service.sms.impl.SmsServiceImpl;

import static com.volcengine.helper.Const.*;

public class UpdateTobTrafficDrivingPhoneDemo {
    private static SmsService smsService = SmsServiceImpl.getInstance(new SmsServiceInfoConfig("ak", "sk"));

    public static void main(String[] args) throws Exception {
        UpdateTobTrafficDrivingPhoneRequest updatePhoneReq = new UpdateTobTrafficDrivingPhoneRequest();
        updatePhoneReq.setNumberType(1);
        updatePhoneReq.setNumber("18800001115");
        updatePhoneReq.setCompany("");
        updatePhoneReq.setNumberPerson("更新后联系人");
        updatePhoneReq.setPersonType(1);
        updatePhoneReq.setPersonId("150203199609070812");
        updatePhoneReq.setNumberProvince("广东");
        updatePhoneReq.setNumberCity("深圳");
        updatePhoneReq.setUpdatePersonId(true);
        try {
            UpdateTobTrafficDrivingPhoneResponse updatePhoneResp = smsService.updateTobTrafficDrivingPhone(updatePhoneReq);
            System.out.println("updateTobTrafficDrivingPhone 响应: " + com.alibaba.fastjson.JSON.toJSONString(updatePhoneResp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
