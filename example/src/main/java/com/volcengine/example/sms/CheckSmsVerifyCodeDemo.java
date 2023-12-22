package com.volcengine.example.sms;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.SmsCheckVerifyCodeRequest;
import com.volcengine.model.response.SmsCheckVerifyCodeResponse;
import com.volcengine.service.sms.SmsService;
import com.volcengine.service.sms.impl.SmsServiceImpl;

public class CheckSmsVerifyCodeDemo {
    public static void main(String[] args) {
        SmsService smsService = SmsServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        smsService.setAccessKey("ak");
        smsService.setSecretKey("sk");

        SmsCheckVerifyCodeRequest req = new SmsCheckVerifyCodeRequest();
        req.setSmsAccount("smsAccount");
        req.setScene("Test");
        req.setPhoneNumber("188xxxxxxxxx");
        req.setCode("123456");
        // set EncryptName
        req.setEncryptName("encryptName");
        try{
            SmsCheckVerifyCodeResponse response = smsService.checkVerifyCode(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
