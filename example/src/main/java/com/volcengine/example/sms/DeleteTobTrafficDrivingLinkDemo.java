package com.volcengine.example.sms;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.beans.ShortUrlConfig;
import com.volcengine.model.request.ApplySmsTemplateRequest;
import com.volcengine.model.request.sms.DeleteTobTrafficDrivingLinkRequest;
import com.volcengine.model.response.ApplySmsTemplateResponse;
import com.volcengine.model.response.sms.DeleteTobTrafficDrivingLinkResponse;
import com.volcengine.service.sms.SmsService;
import com.volcengine.service.sms.SmsServiceInfoConfig;
import com.volcengine.service.sms.impl.SmsServiceImpl;

import static com.volcengine.helper.Const.*;

public class DeleteTobTrafficDrivingLinkDemo {
    private static SmsService smsService = SmsServiceImpl.getInstance(new SmsServiceInfoConfig("ak", "sk"));

    public static void main(String[] args) throws Exception {
        DeleteTobTrafficDrivingLinkRequest deleteLinkReq = new DeleteTobTrafficDrivingLinkRequest();
        deleteLinkReq.setLink(""); // JumpLink参数不填，将删除LINK和LINK下所有JumpLink记录
        deleteLinkReq.setJumpLink("https://xxxxx.com"); // Link参数不填，将删除所有匹配JumpLink的记录
        try {
            DeleteTobTrafficDrivingLinkResponse deleteLinkResp = smsService.deleteTobTrafficDrivingLink(deleteLinkReq);
            System.out.println("deleteTobTrafficDrivingLink 响应: " + com.alibaba.fastjson.JSON.toJSONString(deleteLinkResp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
