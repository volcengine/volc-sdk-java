package com.volcengine.example.sms;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.SmsBatchSendRequest;
import com.volcengine.model.request.SmsSendRequest;
import com.volcengine.model.response.SmsSendResponse;
import com.volcengine.service.sms.SmsService;
import com.volcengine.service.sms.impl.SmsServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class SendBatchSmsDemo {

    public static void main(String[] args) {
        SmsService smsService = SmsServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        smsService.setAccessKey("ak");
        smsService.setSecretKey("sk");

        SmsBatchSendRequest req = new SmsBatchSendRequest();
        req.setSign("signature");
        req.setSmsAccount("smsAccount");
        req.setTemplateId("templateId");
        req.setTag("tag");

        List<SmsBatchSendRequest.BatchSmsMessage> messages = new ArrayList<>();
        messages.add(new SmsBatchSendRequest.BatchSmsMessage("phoneNo", "{\"code\":\"1234\"}"));
        req.setMessages(messages);
        try {
            SmsSendResponse response = smsService.batchSend(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}