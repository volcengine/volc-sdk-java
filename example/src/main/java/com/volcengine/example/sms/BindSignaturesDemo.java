package com.volcengine.example.sms;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.sms.BindSignaturesRequest;
import com.volcengine.model.response.sms.BindSignaturesResponse;
import com.volcengine.service.sms.SmsService;
import com.volcengine.service.sms.SmsServiceInfoConfig;
import com.volcengine.service.sms.impl.SmsServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BindSignaturesDemo {
    private static SmsService smsService = SmsServiceImpl.getInstance(new SmsServiceInfoConfig("", ""));

    public static void main(String[] args) {
        BindSignaturesRequest bindSignReq = new BindSignaturesRequest();
//        // 设置子账号列表
        bindSignReq.setSubAccounts(Arrays.asList("subAccount1", "subAccount2")); // 可为空
//        // 设置模板ID
        bindSignReq.setTemplateId("template_123");
//        // 设置签名列表
        bindSignReq.setSignatures(Arrays.asList("签名A", "签名B"));
        // 构造 templateTrafficDriving（嵌套列表结构）
        List<List<BindSignaturesRequest.TemplateParamWithTrafficDriving>> trafficDrivingList = new ArrayList<>();
        List<BindSignaturesRequest.TemplateParamWithTrafficDriving> innerList = new ArrayList<>();
        BindSignaturesRequest.TemplateParamWithTrafficDriving param = new BindSignaturesRequest.TemplateParamWithTrafficDriving();
        param.setName("param_name");
        param.setParamType(1);
        param.setContent("param_content");
        innerList.add(param);
        trafficDrivingList.add(innerList);
        bindSignReq.setTemplateTrafficDriving(trafficDrivingList);
        try {
            BindSignaturesResponse bindSignResp = smsService.bindSignatures(bindSignReq);
            System.out.println("bindSignatures 响应: " + JSON.toJSONString(bindSignResp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}