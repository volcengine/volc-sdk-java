package com.volcengine.example.livesaas;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.livesaas.request.CommonAPIRequest;
import com.volcengine.model.livesaas.request.GetActivityMenuAPIRequest;
import com.volcengine.model.livesaas.response.GetActivityBasicConfigAPIResponse;
import com.volcengine.model.livesaas.response.GetActivityMenuAPIResponse;
import com.volcengine.service.livesaas.LivesaasService;
import com.volcengine.service.livesaas.impl.LivesaasServiceImpl;

public class GetActivityMenuAPI {
    public static void main(String[] args) {
        LivesaasService livesaasService = LivesaasServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.volc/config

        livesaasService.setAccessKey("");
        livesaasService.setSecretKey("");
        // list users
        try {
            GetActivityMenuAPIRequest getActivityMenuAPIRequest = new GetActivityMenuAPIRequest();
            getActivityMenuAPIRequest.setActivityId(123456L);


            GetActivityMenuAPIResponse getActivityMenuAPIResponse = livesaasService.getActivityMenuAPI(getActivityMenuAPIRequest);
            System.out.println(JSON.toJSONString(getActivityMenuAPIResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
