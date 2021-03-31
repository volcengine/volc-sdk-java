package com.volcengine.example.sms;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.SmsSendRequest;
import com.volcengine.model.response.SmsSendResponse;
import com.volcengine.service.sms.SmsService;
import com.volcengine.service.sms.impl.SmsServiceImpl;

public class SendSmsDemo {

    public static void main(String[] args) {
        SmsService smsService = SmsServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        smsService.setAccessKey("ak");
        smsService.setSecretKey("sk");

        SmsSendRequest req = new SmsSendRequest();
        req.setSign("signature");
        req.setSmsAccount("smsAccount");
        req.setPhoneNumbers("phoneNo");
        req.setTemplateId("templateId");
        req.setTemplateParam("param");//{"code":"1234"}
        req.setTag("tag");
        try {
            SmsSendResponse response = smsService.send(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}