package com.volcengine.example.vms.resource;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.vms.VmsService;
import com.volcengine.service.vms.impl.VmsServiceImpl;
import com.volcengine.service.vms.request.FetchVoiceResourceRequest;
import com.volcengine.service.vms.response.BasicResourceResult;
import com.volcengine.service.vms.response.CommonResponse;

public class FetchResourceFromUrlDemo {

    public static void main(String[] args) {

        VmsService vmsService = VmsServiceImpl.getInstance();
        vmsService.setAccessKey("your ak");
        vmsService.setSecretKey("your sk");

        try {
            String url = "your url";
            FetchVoiceResourceRequest fetchVoiceResourceRequest = FetchVoiceResourceRequest.builder().url(url).name("your name").build();
            CommonResponse<BasicResourceResult> commonResponse = vmsService.fetchVoiceResourceByUrl(fetchVoiceResourceRequest);
            System.out.println(JSON.toJSONString(commonResponse));
        }catch (Exception exception){
            exception.printStackTrace();
        }
    }
}
