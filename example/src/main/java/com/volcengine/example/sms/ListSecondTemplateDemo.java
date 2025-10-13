package com.volcengine.example.sms;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.ApplySignatureIdentRequest;
import com.volcengine.model.request.sms.ListSecondTemplateRequest;
import com.volcengine.model.response.ApplySignatureIdentResponse;
import com.volcengine.model.response.sms.ListSecondTemplateResponse;
import com.volcengine.model.sms.DocType;
import com.volcengine.model.sms.ImageType;
import com.volcengine.model.sms.SignAuthFile;
import com.volcengine.service.sms.SmsService;
import com.volcengine.service.sms.SmsServiceInfoConfig;
import com.volcengine.service.sms.impl.SmsServiceImpl;

import java.io.DataInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class ListSecondTemplateDemo {
    private static SmsService smsService = SmsServiceImpl.getInstance(new SmsServiceInfoConfig("ak", "sk"));

    public static void main(String[] args) {
        ListSecondTemplateRequest listSecondReq = new ListSecondTemplateRequest();
        listSecondReq.setSubAccounts(null);
        listSecondReq.setTemplateId("templateId");
        listSecondReq.setTemplateIdList(null);
        listSecondReq.setSignatures("通知的签名");
        listSecondReq.setSecondTemplateId("secondTemplateId");
        listSecondReq.setSecondTemplateIdList(null);
        listSecondReq.setStatusList(null);


        try {
            ListSecondTemplateResponse listSecondResp = smsService.listSecondTemplate(listSecondReq);
            System.out.println("listSecondTemplate 响应: " + JSON.toJSONString(listSecondResp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
