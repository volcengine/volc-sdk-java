package com.volcengine.example.notify.resource;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.notify.NotifyService;
import com.volcengine.service.notify.impl.NotifyServiceImpl;
import com.volcengine.service.notify.model.request.FetchVoiceResourceRequest;
import com.volcengine.service.notify.model.response.BasicResourceResult;
import com.volcengine.service.notify.model.response.CommonResponse;

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
