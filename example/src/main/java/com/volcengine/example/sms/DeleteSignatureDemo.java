package com.volcengine.example.sms;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.DeleteSignatureRequest;
import com.volcengine.model.response.DeleteSignatureResponse;
import com.volcengine.service.sms.SmsService;
import com.volcengine.service.sms.impl.SmsServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;

public class DeleteSignatureDemo {
    public static void main(String[] args) throws Exception {
        // Make sure only get instance once throughout the entire running program.
        // We suggest using Singleton design model to get the instance.
        // And using the Singleton instance to call functions
        SmsService smsService = SmsServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        smsService.setAccessKey("ak");
        smsService.setSecretKey("sk");

        DeleteSignatureRequest req = new DeleteSignatureRequest();
        req.setSubAccounts(new ArrayList<>(Arrays.asList("subAccount1", "subAccount2")));
        req.setId(2306L);
        try {
            DeleteSignatureResponse response = smsService.deleteSmsSignature(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
