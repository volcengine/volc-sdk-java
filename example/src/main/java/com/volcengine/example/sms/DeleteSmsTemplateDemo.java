package com.volcengine.example.sms;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.DeleteSmsTemplateRequest;
import com.volcengine.model.response.DeleteSmsTemplateResponse;
import com.volcengine.service.sms.SmsService;
import com.volcengine.service.sms.impl.SmsServiceImpl;

public class DeleteSmsTemplateDemo {
    public static void main(String[] args) throws Exception {
        // Make sure only get instance once throughout the entire running program.
        // We suggest using Singleton design model to get the instance.
        // And using the Singleton instance to call functions
        SmsService smsService = SmsServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        smsService.setAccessKey("ak");
        smsService.setSecretKey("sk");

        DeleteSmsTemplateRequest req = new DeleteSmsTemplateRequest();
        req.setSubAccount("subAccount");
        req.setOrder(true);
        req.setId("id");
        try {
            DeleteSmsTemplateResponse response = smsService.deleteSmsTemplate(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
