package com.volcengine.example.livesaas;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.livesaas.request.CommonAPIRequest;
import com.volcengine.model.livesaas.response.GetActivityAPIResponse;
import com.volcengine.model.livesaas.response.GetActivityBasicConfigAPIResponse;
import com.volcengine.service.livesaas.LivesaasService;
import com.volcengine.service.livesaas.impl.LivesaasServiceImpl;

public class GetActivityBasicConfigAPI {
    public static void main(String[] args) {
        LivesaasService livesaasService = LivesaasServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.volc/config
        livesaasService.setAccessKey("");
        livesaasService.setSecretKey("");
        // list users
        try {
            CommonAPIRequest commonAPIRequest = new CommonAPIRequest();
            commonAPIRequest.setActivityId(123456L);

            GetActivityBasicConfigAPIResponse getActivityBasicConfigAPIResponse = livesaasService.getActivityBasicConfigAPI(commonAPIRequest);
            System.out.println(JSON.toJSONString(getActivityBasicConfigAPIResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
