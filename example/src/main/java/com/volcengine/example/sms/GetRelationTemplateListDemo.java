package com.volcengine.example.sms;

import com.volcengine.model.request.sms.GetRelationTemplateListRequest;
import com.volcengine.model.response.sms.GetRelationTemplateListResponse;
import com.volcengine.service.sms.SmsService;
import com.volcengine.service.sms.SmsServiceInfoConfig;
import com.volcengine.service.sms.impl.SmsServiceImpl;

public class GetRelationTemplateListDemo {
    private static SmsService smsService = SmsServiceImpl.getInstance(new SmsServiceInfoConfig("ak", "sk"));

    public static void main(String[] args) throws Exception {
        GetRelationTemplateListRequest relationTemplateReq = new GetRelationTemplateListRequest();
        relationTemplateReq.setSignature("");
        relationTemplateReq.setNumber("");
        relationTemplateReq.setLink("");
        relationTemplateReq.setJumpLink("https://xxxxx.com");
        try {
            GetRelationTemplateListResponse relationTemplateResp = smsService.getRelationTemplateList(relationTemplateReq);
            System.out.println("getRelationTemplateList 响应: " + com.alibaba.fastjson.JSON.toJSONString(relationTemplateResp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
