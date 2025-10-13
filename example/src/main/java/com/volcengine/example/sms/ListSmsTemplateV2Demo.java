package com.volcengine.example.sms;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.sms.ListSmsTemplateV2Request;
import com.volcengine.model.response.sms.ListSmsTemplateV2Response;
import com.volcengine.service.sms.SmsService;
import com.volcengine.service.sms.SmsServiceInfoConfig;
import com.volcengine.service.sms.impl.SmsServiceImpl;

public class ListSmsTemplateV2Demo {
    private static SmsService smsService = SmsServiceImpl.getInstance(new SmsServiceInfoConfig("ak", "sk"));

    public static void main(String[] args) {
        ListSmsTemplateV2Request listReq = new ListSmsTemplateV2Request();
        listReq.setPage(1);
        listReq.setPageSize(10);
        listReq.setTemplateId("templateId");
        listReq.setSignature("signature");
        listReq.setName("");
        listReq.setContent("");
        listReq.setSubAccounts(null);

        try {
            ListSmsTemplateV2Response listResp = smsService.listSmsTemplateV2(listReq);
            System.out.println("listSmsTemplateV2 响应: " + JSON.toJSONString(listResp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
