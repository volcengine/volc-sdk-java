package com.volcengine.example.sms;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.*;
import com.volcengine.model.response.ApplySmsTemplateResponse;
import com.volcengine.model.response.GetSmsTemplateAndOrderListResponse;
import com.volcengine.model.response.SmsSendResponse;
import com.volcengine.service.base.model.base.Base;
import com.volcengine.service.sms.SmsService;
import com.volcengine.service.sms.SourceType;
import com.volcengine.service.sms.impl.SmsServiceImpl;
import sun.misc.BASE64Encoder;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SendSmsDemo {

    public static void main(String[] args) throws IOException {
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

    private static void TestApplyTemplate(SmsService smsService) throws IOException {
        ApplyVmsTemplateRequest req = new ApplyVmsTemplateRequest();
        req.setChannelType("CN_VMS");
        req.setSubAccount("subaccount");
        req.setName("name");
        req.setTheme("theme");
        req.setSignature("sign");

        //String file = "/Users/bytedance/Downloads/飞书20230116-193305.gif";
        String file = "/share/飞书20230116-193300.mp4";
        DataInputStream reader = new DataInputStream(new FileInputStream(file));
        byte[] bytes = new byte[reader.available()];
        reader.read(bytes);

        List<VmsElement> sources = new ArrayList<>();
        VmsElement s1 = new VmsElement(SourceType.SourceTypeText.getType(),"火山引擎，企业做好的伙伴");

        BASE64Encoder encode = new BASE64Encoder();
        VmsElement s2 = new VmsElement(SourceType.SourceTypeVideo.getType(),encode.encode(bytes));
        sources.add(s1);
        sources.add(s2);
        req.setContents(sources);
        try {
            ApplySmsTemplateResponse response = smsService.ApplyVmsTemplate(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void GetTemplateStatus(SmsService smsService) throws IOException {
        GetVmsTemplateStatusRequest req = new GetVmsTemplateStatusRequest();
        req.setSubAccount("subaccount");
        req.setTemplateId("template");
        try {
            ApplySmsTemplateResponse response = smsService.GetVmsTemplateStatus(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void SendVms(SmsService smsService) throws IOException {
        SmsSendRequest req = new SmsSendRequest();
        req.setPhoneNumbers("188888888");
        req.setSmsAccount("subaccount");
        req.setTemplateId("templateid");
        req.setTemplateParam("");
        try {
            SmsSendResponse response = smsService.sendVms(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}