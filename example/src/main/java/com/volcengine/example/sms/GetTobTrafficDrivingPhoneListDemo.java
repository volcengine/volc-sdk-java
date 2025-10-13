package com.volcengine.example.sms;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.beans.ShortUrlConfig;
import com.volcengine.model.request.ApplySmsTemplateRequest;
import com.volcengine.model.request.sms.GetTobTrafficDrivingPhoneListRequest;
import com.volcengine.model.response.ApplySmsTemplateResponse;
import com.volcengine.model.response.sms.GetTobTrafficDrivingPhoneListResponse;
import com.volcengine.service.sms.SmsService;
import com.volcengine.service.sms.SmsServiceInfoConfig;
import com.volcengine.service.sms.impl.SmsServiceImpl;

import static com.volcengine.helper.Const.*;

public class GetTobTrafficDrivingPhoneListDemo {
    private static SmsService smsService = SmsServiceImpl.getInstance(new SmsServiceInfoConfig("ak", "sk"));

    public static void main(String[] args) throws Exception {
        GetTobTrafficDrivingPhoneListRequest phoneListReq = new GetTobTrafficDrivingPhoneListRequest();
        phoneListReq.setNumber("18800001110");
        try {
            GetTobTrafficDrivingPhoneListResponse phoneListResp = smsService.getTobTrafficDrivingPhoneList(phoneListReq);
            System.out.println("getTobTrafficDrivingPhoneList 响应: " + com.alibaba.fastjson.JSON.toJSONString(phoneListResp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
