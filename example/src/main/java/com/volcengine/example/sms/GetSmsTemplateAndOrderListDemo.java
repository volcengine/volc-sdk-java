package com.volcengine.example.sms;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.GetSmsTemplateAndOrderListRequest;
import com.volcengine.model.response.GetSmsTemplateAndOrderListResponse;
import com.volcengine.service.sms.SmsService;
import com.volcengine.service.sms.impl.SmsServiceImpl;

import static com.volcengine.helper.Const.AreaCN;
import static com.volcengine.helper.Const.AreaOverseas;

public class GetSmsTemplateAndOrderListDemo {
    public static void main(String[] args) throws Exception {
        SmsService smsService = SmsServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        smsService.setAccessKey("ak");
        smsService.setSecretKey("sk");

        GetSmsTemplateAndOrderListRequest req = new GetSmsTemplateAndOrderListRequest();
        req.setSubAccount("subAccount");
        req.setArea(AreaCN);
        req.setPageIndex(1);
        req.setPageSize(10);
        try {
            GetSmsTemplateAndOrderListResponse response = smsService.getSmsTemplateAndOrderList(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
