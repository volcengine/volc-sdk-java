package com.volcengine.example.sms;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.GetSubAccountListRequest;
import com.volcengine.model.response.GetSubAccountListResponse;
import com.volcengine.service.sms.SmsService;
import com.volcengine.service.sms.impl.SmsServiceImpl;

public class GetSubAccountListDemo {
    public static void main(String[] args) throws Exception {
        // Make sure only get instance once throughout the entire running program.
        // We suggest using Singleton design model to get the instance.
        // And using the Singleton instance to call functions
        SmsService smsService = SmsServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        smsService.setAccessKey("ak");
        smsService.setSecretKey("sk");

        GetSubAccountListRequest req = new GetSubAccountListRequest();
        req.setPageIndex(1);
        req.setPageSize(1);

        try {
            GetSubAccountListResponse response = smsService.getSubAccountList(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
