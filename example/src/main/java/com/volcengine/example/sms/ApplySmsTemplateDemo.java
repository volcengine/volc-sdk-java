package com.volcengine.example.sms;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.beans.ShortUrlConfig;
import com.volcengine.model.request.ApplySmsTemplateRequest;
import com.volcengine.model.response.ApplySmsTemplateResponse;
import com.volcengine.service.sms.SmsService;
import com.volcengine.service.sms.impl.SmsServiceImpl;

import static com.volcengine.helper.Const.*;

public class ApplySmsTemplateDemo {
    public static void main(String[] args) throws Exception {
        // Make sure only get instance once throughout the entire running program.
        // We suggest using Singleton design model to get the instance.
        // And using the Singleton instance to call functions
        SmsService smsService = SmsServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        smsService.setAccessKey("ak");
        smsService.setSecretKey("sk");

        ApplySmsTemplateRequest req = new ApplySmsTemplateRequest();
        req.setSubAccount("subAccount");
        req.setChannelType(SmsChannelTypeCnMKT);
        req.setArea(AreaCN);
        req.setContent("We're offering our https://webhook.site/edd2b39a-6c8d-4161-a310-36a470c840d4 T退订");
        req.setDesc("Test SDK");
        req.setName("template_name");
        ShortUrlConfig shortUrlConfig = new ShortUrlConfig();
        shortUrlConfig.setIsEnable(EnableStatusEnabled);
        shortUrlConfig.setIsNeedClickDetails(EnableStatusNotEnabled);
        req.setShortUrlConfig(shortUrlConfig);
        try{
            ApplySmsTemplateResponse response = smsService.applySmsTemplate(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
