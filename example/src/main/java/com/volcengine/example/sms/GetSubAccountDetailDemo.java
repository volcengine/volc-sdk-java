package com.volcengine.example.sms;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.SubAccountRequest;
import com.volcengine.model.response.GetSubAccountDetailResponse;
import com.volcengine.service.sms.SmsService;
import com.volcengine.service.sms.impl.SmsServiceImpl;

public class GetSubAccountDetailDemo {
    public static void main(String[] args) throws Exception {
        // Make sure only get instance once throughout the entire running program.
        // We suggest using Singleton design model to get the instance.
        // And using the Singleton instance to call functions
        SmsService smsService = SmsServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        smsService.setAccessKey("ak");
        smsService.setSecretKey("sk");

        SubAccountRequest req = new SubAccountRequest();
        req.setSubAccount("subAccount");

        try{
            GetSubAccountDetailResponse response = smsService.getSubAccountDetail(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
