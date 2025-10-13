package com.volcengine.example.sms;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.beans.ShortUrlConfig;
import com.volcengine.model.request.ApplySmsTemplateRequest;
import com.volcengine.model.request.sms.GetTobTrafficDrivingLinkListRequest;
import com.volcengine.model.response.ApplySmsTemplateResponse;
import com.volcengine.model.response.sms.GetTobTrafficDrivingLinkListResponse;
import com.volcengine.service.sms.SmsService;
import com.volcengine.service.sms.SmsServiceInfoConfig;
import com.volcengine.service.sms.impl.SmsServiceImpl;

import static com.volcengine.helper.Const.*;

public class GetTobTrafficDrivingLinkListDemo {
    private static SmsService smsService = SmsServiceImpl.getInstance(new SmsServiceInfoConfig("ak", "sk"));

    public static void main(String[] args) throws Exception {
        // call below method if you dont set ak and sk in ～/.vcloud/config
        GetTobTrafficDrivingLinkListRequest linkListReq = new GetTobTrafficDrivingLinkListRequest();
        linkListReq.setLink("");
        linkListReq.setJumpLink("https://xxxxx.com");
        try {
            GetTobTrafficDrivingLinkListResponse linkListResp = smsService.getTobTrafficDrivingLinkList(linkListReq);
            System.out.println("getTobTrafficDrivingLinkList 响应: " + com.alibaba.fastjson.JSON.toJSONString(linkListResp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
