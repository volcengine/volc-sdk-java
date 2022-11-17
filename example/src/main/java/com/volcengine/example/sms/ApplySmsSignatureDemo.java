package com.volcengine.example.sms;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.ApplySmsSignatureRequest;
import com.volcengine.model.response.ApplySmsSignatureResponse;
import com.volcengine.service.sms.SmsService;
import com.volcengine.service.sms.impl.SmsServiceImpl;

public class ApplySmsSignatureDemo {
    public static void main(String[] args) throws Exception {
        // Make sure only get instance once throughout the entire running program.
        // We suggest using Singleton design model to get the instance.
        // And using the Singleton instance to call functions
        SmsService smsService = SmsServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        smsService.setAccessKey("ak");
        smsService.setSecretKey("sk");

        ApplySmsSignatureRequest req = new ApplySmsSignatureRequest();
        req.setDesc("desc");
        req.setSubAccount("subAccount");
        req.setContent("testContent");
        req.setSource("公司名称/公司缩写");

        try {
            ApplySmsSignatureResponse response = smsService.applySmsSignature(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
