package com.volcengine.example.sms;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.sms.ApplySmsTemplateV2Request;
import com.volcengine.model.response.sms.ApplySmsTemplateV2Response;
import com.volcengine.service.sms.SmsService;
import com.volcengine.service.sms.SmsServiceInfoConfig;
import com.volcengine.service.sms.impl.SmsServiceImpl;

import java.util.Arrays;
import java.util.Collections;

public class ApplySmsTemplateV2Demo {
    private static SmsService smsService = SmsServiceImpl.getInstance(new SmsServiceInfoConfig("", ""));

    public static void main(String[] args) {
        ApplySmsTemplateV2Request applyReq = new ApplySmsTemplateV2Request();
        // 基础字段设置
        applyReq.setSubAccounts(Collections.singletonList("subAccount1"));
        applyReq.setTemplateId("template_123");
        applyReq.setSecondTemplateId("second_template_456");
        applyReq.setContent("测试短信内容，包含营销链接：https://example.com/promo，拒收请回复R");
        applyReq.setChannelType("CN_MKT");
        applyReq.setArea("");
        applyReq.setName("营销短信模板V2");
        applyReq.setOpenId("open_789");
        applyReq.setCaller("system-api");
        applyReq.setDesc("2025年营销活动短信模板测试");

        // 构造 ShortUrlConfigReq（短链配置）
        ApplySmsTemplateV2Request.ShortUrlConfigReq shortUrlConfig = new ApplySmsTemplateV2Request.ShortUrlConfigReq();
        shortUrlConfig.setIsEnabled("Enabled");
        shortUrlConfig.setIsNeedClickDetails("NotEnabled");
        shortUrlConfig.setUaCheckStrategy(1);
        applyReq.setShortUrlConfig(shortUrlConfig);

        // 设置签名列表
        applyReq.setSignatures(Arrays.asList("企业签名A", "备用签名B"));

        // 构造 templateParams（模板参数V2）
        ApplySmsTemplateV2Request.TemplateParamsV2 templateParamV2 = new ApplySmsTemplateV2Request.TemplateParamsV2();
        templateParamV2.setName("code");
        templateParamV2.setParamType(1);
        templateParamV2.setLocation("body");
        templateParamV2.setContent("动态参数内容，如订单号");
        applyReq.setTemplateParams(Collections.singletonList(templateParamV2));

        // 构造 templateTrafficDriving（嵌套流量参数列表）
        ApplySmsTemplateV2Request.TemplateParamWithTrafficDriving trafficParam = new ApplySmsTemplateV2Request.TemplateParamWithTrafficDriving();
        trafficParam.setName("traffic_param_link");
        trafficParam.setParamType(2);
        trafficParam.setContent("https://xxxxxx.com");
        applyReq.setTemplateTrafficDriving(Collections.singletonList(Collections.singletonList(trafficParam)));

        try {
            ApplySmsTemplateV2Response applyResp = smsService.applySmsTemplateV2(applyReq);
            System.out.println("applySmsTemplateV2 响应: " + JSON.toJSONString(applyResp));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
