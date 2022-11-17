package com.volcengine.example.sms;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.ConversionRequest;
import com.volcengine.model.response.ConversionResponse;
import com.volcengine.service.sms.SmsService;
import com.volcengine.service.sms.impl.SmsServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class ConversionDemo {
    public static void main(String[] args) throws Exception {
        // Make sure only get instance once throughout the entire running program.
        // We suggest using Singleton design model to get the instance.
        // And using the Singleton instance to call functions
        SmsService smsService = SmsServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        smsService.setAccessKey("ak");
        smsService.setSecretKey("sk");
        ConversionRequest req = new ConversionRequest();
        List<String> messageIDs = new ArrayList<>();
        messageIDs.add("msgId");
        req.setMessageIDs(messageIDs);
        try {
            ConversionResponse response = smsService.conversion(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
