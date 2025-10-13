package com.volcengine.example.sms;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.GetSignatureAndOrderListRequest;
import com.volcengine.model.response.GetSignatureAndOrderListResponse;
import com.volcengine.service.sms.SmsService;
import com.volcengine.service.sms.impl.SmsServiceImpl;

import java.util.Arrays;

public class GetSignatureAndOrderListDemo {
    public static void main(String[] args) throws Exception {
        SmsService smsService = SmsServiceImpl.getInstance();

        // call below method if you don't set ak and sk in ～/.vcloud/config
        smsService.setAccessKey("ak");
        smsService.setSecretKey("sk");

        GetSignatureAndOrderListRequest req = new GetSignatureAndOrderListRequest();
        req.setSubAccounts(Arrays.asList("subAccount1", "subAccount2"));
        req.setPageIndex(1);
        req.setPageSize(10);
        req.setStatus(3);
        try {
            GetSignatureAndOrderListResponse response = smsService.getSmsSignatureAndOrderList(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
