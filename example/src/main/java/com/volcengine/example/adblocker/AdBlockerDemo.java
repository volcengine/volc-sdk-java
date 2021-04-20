package com.volcengine.example.adblocker;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.AdBlockerRequest;
import com.volcengine.model.response.AdBlockerResponse;
import com.volcengine.service.adblocker.AdBlockerService;
import com.volcengine.service.adblocker.impl.AdBlockerServiceImpl;

public class AdBlockerDemo {

    public static void main(String[] args) {
        AdBlockerService adBlockerService = AdBlockerServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.volc/config

        adBlockerService.setAccessKey("ak");
        adBlockerService.setSecretKey("sk");

        // adblocker
        try {
            AdBlockerRequest adBlockerRequest = new AdBlockerRequest();
            adBlockerRequest.setAppId(216455);
            adBlockerRequest.setService("register");
            adBlockerRequest.setPatameters("{\"operate_time\": 1617960951}");

            AdBlockerResponse adBlockerResponse = adBlockerService.AdBlock(adBlockerRequest);
            System.out.println(JSON.toJSONString(adBlockerResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
