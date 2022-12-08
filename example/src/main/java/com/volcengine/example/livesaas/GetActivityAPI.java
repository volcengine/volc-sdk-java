package com.volcengine.example.livesaas;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.livesaas.request.CommonRequest;
import com.volcengine.model.livesaas.response.GetActivityAPIResponse;
import com.volcengine.service.livesaas.LivesaasService;
import com.volcengine.service.livesaas.impl.LivesaasServiceImpl;

public class GetActivityAPI {

    public static void main(String[] args) {
        LivesaasService livesaasService = LivesaasServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.volc/config

        livesaasService.setAccessKey("");
        livesaasService.setSecretKey("");
        // list users
        try {
            CommonRequest commonAPIRequest = new CommonRequest();
            commonAPIRequest.setActivityId(123456L);
            commonAPIRequest.setActivityId(1750157979551799L);

            GetActivityAPIResponse getActivityAPIResponse = livesaasService.getActivityAPI(commonAPIRequest);
            System.out.println(JSON.toJSONString(getActivityAPIResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
