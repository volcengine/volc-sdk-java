package com.volcengine.example.sms;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.sms.BindTrafficDrivingParamsRequest;
import com.volcengine.model.response.sms.BindTrafficDrivingParamsResponse;
import com.volcengine.service.sms.SmsService;
import com.volcengine.service.sms.SmsServiceInfoConfig;
import com.volcengine.service.sms.impl.SmsServiceImpl;

public class BindTrafficDrivingParamsDemo {
    private static SmsService smsService = SmsServiceImpl.getInstance(new SmsServiceInfoConfig("", ""));

    public static void main(String[] args) {
        BindTrafficDrivingParamsRequest bindReq = new BindTrafficDrivingParamsRequest();
        bindReq.setSecondTemplateId(""); // 关联的二级模板ID
        bindReq.setSubContentId("SCT_8670xxxx");         // 子内容ID

        // 构造流量驱动参数
        BindTrafficDrivingParamsRequest.TemplateParamWithTrafficDriving trafficDrivingParam =
                new BindTrafficDrivingParamsRequest.TemplateParamWithTrafficDriving();
        trafficDrivingParam.setName("phone1");
        trafficDrivingParam.setParamType(3);
        trafficDrivingParam.setContent("18800001111");
        bindReq.setTemplateTrafficDriving(trafficDrivingParam);

        try {
            BindTrafficDrivingParamsResponse bindResp = smsService.bindTrafficDrivingParams(bindReq);
            System.out.println("bindTrafficDrivingParams 响应: " + JSON.toJSONString(bindResp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
