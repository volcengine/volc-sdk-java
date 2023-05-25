package com.volcengine.example.vms.resource;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.vms.NotifyService;
import com.volcengine.service.vms.impl.NotifyServiceImpl;
import com.volcengine.service.vms.request.FetchVoiceResourceRequest;
import com.volcengine.service.vms.response.BasicResourceResult;
import com.volcengine.service.vms.response.CommonResponse;

public class FetchResourceFromUrlDemo {

    public static void main(String[] args) {
        NotifyService notifyService = NotifyServiceImpl.getInstance();

        notifyService.setAccessKey("your ak");
        notifyService.setSecretKey("your sk");

        try {
            String url = "your url";
            FetchVoiceResourceRequest fetchVoiceResourceRequest = FetchVoiceResourceRequest.builder().url(url).name("your name").build();
            CommonResponse<BasicResourceResult> commonResponse = notifyService.fetchVoiceResourceByUrl(fetchVoiceResourceRequest);
            System.out.println(JSON.toJSONString(commonResponse));
        }catch (Exception exception){
            exception.printStackTrace();
        }
    }
}
