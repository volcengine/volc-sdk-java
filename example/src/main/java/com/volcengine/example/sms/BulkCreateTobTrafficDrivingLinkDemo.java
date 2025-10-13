package com.volcengine.example.sms;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.beans.ShortUrlConfig;
import com.volcengine.model.request.ApplySmsTemplateRequest;
import com.volcengine.model.request.sms.BulkCreateTobTrafficDrivingLinkRequest;
import com.volcengine.model.response.ApplySmsTemplateResponse;
import com.volcengine.model.response.sms.BulkCreateTobTrafficDrivingLinkResponse;
import com.volcengine.service.sms.SmsService;
import com.volcengine.service.sms.SmsServiceInfoConfig;
import com.volcengine.service.sms.impl.SmsServiceImpl;

import java.util.Collections;

import static com.volcengine.helper.Const.*;

public class BulkCreateTobTrafficDrivingLinkDemo {

    private static SmsService smsService = SmsServiceImpl.getInstance(new SmsServiceInfoConfig("", ""));

    public static void main(String[] args) throws Exception {
        BulkCreateTobTrafficDrivingLinkRequest bulkLinkReq = new BulkCreateTobTrafficDrivingLinkRequest();
        BulkCreateTobTrafficDrivingLinkRequest.BulkCreateTobTrafficDrivingLinkReqItem linkItem = new BulkCreateTobTrafficDrivingLinkRequest.BulkCreateTobTrafficDrivingLinkReqItem();
        linkItem.setUseVolcLink(true);
        linkItem.setProtocol("");
        linkItem.setLink("");
        linkItem.setLinkDomainIcp("");
        linkItem.setLinkDomainIcpBody("");
        linkItem.setJumpLink("https://xxxxx.com");
        linkItem.setJumpLinkDomainIcp("111111111");
        linkItem.setJumpLinkDomainIcpBody("2222222");
        bulkLinkReq.setData(Collections.singletonList(linkItem)); // 单条数据，可扩展为 List 多元素
        try {
            BulkCreateTobTrafficDrivingLinkResponse bulkLinkResp = smsService.bulkCreateTobTrafficDrivingLink(bulkLinkReq);
            System.out.println("bulkCreateTobTrafficDrivingLink 响应: " + com.alibaba.fastjson.JSON.toJSONString(bulkLinkResp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
