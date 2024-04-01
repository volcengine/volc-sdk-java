package com.volcengine.example.sms;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.GetSmsSendDetailsRequest;
import com.volcengine.model.response.GetSmsSendDetailsResponse;
import com.volcengine.service.sms.SmsService;
import com.volcengine.service.sms.SmsServiceInfoConfig;
import com.volcengine.service.sms.impl.SmsServiceImpl;

public class GetSmsSendDetails {
    private static SmsService smsService = SmsServiceImpl.getInstance(new SmsServiceInfoConfig("AK", "SK"));

    public static void main(String[] args) {
        GetSmsSendDetailsRequest request = new GetSmsSendDetailsRequest();
        request.setSubAccount("subAccount");
        request.setSendDate("20240326");
        request.setMessageId("xxxx");
        request.setPhoneNumber("136********");
        request.setPageSize(10);
        request.setPageIndex(1);
        try {
            GetSmsSendDetailsResponse response = smsService.getSmsSendDetails(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            System.out.println(e.getMessage());

            e.printStackTrace();
        }
    }
}
