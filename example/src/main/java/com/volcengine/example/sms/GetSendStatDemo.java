package com.volcengine.example.sms;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.GetSendStatRequest;
import com.volcengine.model.request.SmsSendRequest;
import com.volcengine.model.response.GetSendStatResponse;
import com.volcengine.model.response.SmsSendResponse;
import com.volcengine.service.sms.SmsService;
import com.volcengine.service.sms.SmsServiceInfoConfig;
import com.volcengine.service.sms.impl.SmsServiceImpl;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static com.volcengine.helper.Const.SmsChannelTypeCnNTC;

public class GetSendStatDemo {
    private static SmsService smsService = SmsServiceImpl.getInstance(new SmsServiceInfoConfig("ak", "sk"));
    public static void main(String[] args) throws IOException {

        GetSendStatRequest req = new GetSendStatRequest();
        req.setChannelType(SmsChannelTypeCnNTC);//发送类型
        req.setStartTime("2023-08-01"); //开始时间以年-月-日格式传入从0点0分0秒开始
        req.setEndTime("2023-08-22");//结束时间以年-月-日格式传入到23点59分59秒结束
        req.setSmsAccount("SmsAccount"); //子通道
        req.setTemplateId("templateId"); //模版id
        try {
            GetSendStatResponse response = smsService.getSendStat(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

}
