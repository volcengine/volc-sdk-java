package com.volcengine.example.vms.resource;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.vms.NotifyService;
import com.volcengine.service.vms.impl.NotifyServiceImpl;
import com.volcengine.service.vms.request.CreateTtsResourceRequest;
import com.volcengine.service.vms.response.BasicResourceResult;
import com.volcengine.service.vms.response.CommonResponse;

public class CreateTtsResourceDemo {

    public static void main(String[] args) {

        NotifyService notifyService = NotifyServiceImpl.getInstance();

        notifyService.setAccessKey("your ak");
        notifyService.setSecretKey("your sk");

        try {
            CreateTtsResourceRequest resourceRequest = CreateTtsResourceRequest.builder().name("my test").ttsTemplateContent("hello, my name is Bob").build();
            CommonResponse<BasicResourceResult> commonResponse = notifyService.createTtsResource(resourceRequest);
            System.out.println(JSON.toJSONString(commonResponse));
        }catch (Exception exception){
            exception.printStackTrace();
        }
    }
}
