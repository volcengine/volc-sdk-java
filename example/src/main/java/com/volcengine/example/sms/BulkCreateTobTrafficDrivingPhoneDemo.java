package com.volcengine.example.sms;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.beans.ShortUrlConfig;
import com.volcengine.model.request.ApplySmsTemplateRequest;
import com.volcengine.model.request.sms.BulkCreateTobTrafficDrivingPhoneRequest;
import com.volcengine.model.response.ApplySmsTemplateResponse;
import com.volcengine.model.response.sms.BulkCreateTobTrafficDrivingPhoneResponse;
import com.volcengine.service.sms.SmsService;
import com.volcengine.service.sms.SmsServiceInfoConfig;
import com.volcengine.service.sms.impl.SmsServiceImpl;

import java.util.Collections;

import static com.volcengine.helper.Const.*;

public class BulkCreateTobTrafficDrivingPhoneDemo {
    private static SmsService smsService = SmsServiceImpl.getInstance(new SmsServiceInfoConfig("ak", "sk"));

    public static void main(String[] args) throws Exception {
        BulkCreateTobTrafficDrivingPhoneRequest bulkPhoneReq = new BulkCreateTobTrafficDrivingPhoneRequest();
        BulkCreateTobTrafficDrivingPhoneRequest.CreateTobTrafficDrivingPhoneReqItem phoneItem =
                new BulkCreateTobTrafficDrivingPhoneRequest.CreateTobTrafficDrivingPhoneReqItem();
        phoneItem.setNumberType(1); // 号码类型（示例值）
        phoneItem.setNumber("18800001115"); // 电话号码
        phoneItem.setCompany("");
        phoneItem.setNumberPerson("联系人");
        phoneItem.setPersonType(1); // 人员类型（示例值）
        phoneItem.setPersonId("150203199609070812");
        phoneItem.setNumberProvince("广东");
        phoneItem.setNumberCity("深圳");
        bulkPhoneReq.setData(Collections.singletonList(phoneItem));
        try {
            BulkCreateTobTrafficDrivingPhoneResponse bulkPhoneResp = smsService.bulkCreateTobTrafficDrivingPhone(bulkPhoneReq);
            System.out.println("bulkCreateTobTrafficDrivingPhone 响应: " + com.alibaba.fastjson.JSON.toJSONString(bulkPhoneResp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
