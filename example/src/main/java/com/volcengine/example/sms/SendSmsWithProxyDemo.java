package com.volcengine.example.sms;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.SmsSendRequest;
import com.volcengine.model.response.SmsSendResponse;
import com.volcengine.service.sms.SmsService;
import com.volcengine.service.sms.SmsServiceInfoConfig;
import com.volcengine.service.sms.impl.SmsServiceImpl;
import org.apache.http.HttpHost;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class SendSmsWithProxyDemo {
    private static final String schema = "http";

    // define your proxy address

    private static final String proxyAddress = "";
    private static final HttpHost proxy = HttpHost.create(proxyAddress);

    // define your volc host address
    private static final String host = "";
    private static SmsService smsService = SmsServiceImpl.getInstance(new SmsServiceInfoConfig("ak", "sk")
            .setScheme(schema).setProxy(proxy).setHost(host));

    public static void main(String[] args) throws IOException {

        SmsSendRequest req = new SmsSendRequest();
        req.setPhoneNumbers("136XXXXXXXX");
        req.setSmsAccount("subaccount");
        req.setTemplateId("templateId");
        req.setSign("signature");

        Map<String,String> param = new HashMap<>();
        param.put("code","测试信息");
        req.setTemplateParamByMap(param);

        // set EncryptName
        req.setEncryptName("encryptName");
        try {
            SmsSendResponse response = smsService.sendV2(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            System.out.println(e.getMessage());

            e.printStackTrace();
        }
    }

}
