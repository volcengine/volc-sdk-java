package com.volcengine.example.sms;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.SmsSendVerifyCodeRequest;
import com.volcengine.model.response.SmsSendResponse;
import com.volcengine.service.sms.SmsService;
import com.volcengine.service.sms.impl.SmsServiceImpl;

public class SendSmsVerifyCodeDemo {
    public static void main(String[] args) {
        SmsService smsService = SmsServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        smsService.setAccessKey("ak");
        smsService.setSecretKey("sk");

        SmsSendVerifyCodeRequest req = new SmsSendVerifyCodeRequest();
        req.setSign("signature");
        req.setSmsAccount("smsAccount");
        req.setPhoneNumber("phoneNo");
        req.setTemplateId("templateId");
        req.setScene("Test");
        req.setExpireTime(240);
        req.setTryCount(3);
        req.setCodeType(6);
        // set EncryptName
        req.setEncryptName("encryptName");
        try {
            SmsSendResponse respones = smsService.sendVerifyCode(req);
            System.out.println(JSON.toJSONString(respones));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
