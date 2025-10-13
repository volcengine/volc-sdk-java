package com.volcengine.example.sms;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.beans.ShortUrlConfig;
import com.volcengine.model.request.ApplySmsTemplateRequest;
import com.volcengine.model.request.sms.DeleteTobTrafficDrivingPhoneRequest;
import com.volcengine.model.response.ApplySmsTemplateResponse;
import com.volcengine.model.response.sms.DeleteTobTrafficDrivingPhoneResponse;
import com.volcengine.service.sms.SmsService;
import com.volcengine.service.sms.SmsServiceInfoConfig;
import com.volcengine.service.sms.impl.SmsServiceImpl;

import static com.volcengine.helper.Const.*;

public class DeleteTobTrafficDrivingPhoneDemo {
    private static SmsService smsService = SmsServiceImpl.getInstance(new SmsServiceInfoConfig("ak", "sk"));

    public static void main(String[] args) throws Exception {
        DeleteTobTrafficDrivingPhoneRequest deletePhoneReq = new DeleteTobTrafficDrivingPhoneRequest();
        deletePhoneReq.setNumber("18800001115");
        try {
            DeleteTobTrafficDrivingPhoneResponse deletePhoneResp = smsService.deleteTobTrafficDrivingPhone(deletePhoneReq);
            System.out.println("deleteTobTrafficDrivingPhone 响应: " + com.alibaba.fastjson.JSON.toJSONString(deletePhoneResp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
