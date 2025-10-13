package com.volcengine.example.sms;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.ApplyVmsTemplateRequest;
import com.volcengine.model.request.GetVmsTemplateStatusRequest;
import com.volcengine.model.request.SmsSendRequest;
import com.volcengine.model.request.VmsElement;
import com.volcengine.model.response.ApplyVmsTemplateResponse;
import com.volcengine.model.response.GetVmsTemplateResponse;
import com.volcengine.model.response.ResponseMetadata;
import com.volcengine.model.response.SmsSendResponse;
import com.volcengine.service.sms.SmsService;
import com.volcengine.service.sms.SmsServiceInfoConfig;
import com.volcengine.service.sms.SourceType;
import com.volcengine.service.sms.impl.SmsServiceImpl;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class SendSmsDemo {
    private static SmsService smsService = SmsServiceImpl.getInstance(new SmsServiceInfoConfig("ak", "sk"));

    public static void main(String[] args) throws IOException {

        SmsSendRequest req = new SmsSendRequest();
        req.setPhoneNumbers("136XXXXXXXX");
        req.setSmsAccount("subaccount");
        req.setTemplateId("templateId");
        req.setSign("signature");

        Map<String,String> param = new HashMap<>();
        param.put("code","测试信息");
        req.setTemplateParamByMap(param);

        // set EncryptName
        req.setEncryptName("encryptName");
        try {
            SmsSendResponse response = smsService.sendStandard(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            System.out.println(e.getMessage());

            e.printStackTrace();
        }
    }

     static void TestApplyTemplate(SmsService smsService) throws IOException {
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
        VmsElement s1 = new VmsElement(SourceType.SourceTypeText.getType(), "火山引擎，企业最好的伙伴");

        VmsElement s2 = new VmsElement(SourceType.SourceTypeVideo.getType(), Base64.getEncoder().encodeToString(bytes));
        sources.add(s1);
        sources.add(s2);
        req.setContents(sources);
        try {
            ApplyVmsTemplateResponse response = smsService.ApplyVmsTemplate(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

     static void GetTemplateStatus(SmsService smsService) throws IOException {
        GetVmsTemplateStatusRequest req = new GetVmsTemplateStatusRequest();
        req.setSubAccount("subaccount");
        req.setTemplateId("template");
        try {
            GetVmsTemplateResponse response = smsService.GetVmsTemplateStatus(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

     static void SendVms(SmsService smsService) throws IOException {
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