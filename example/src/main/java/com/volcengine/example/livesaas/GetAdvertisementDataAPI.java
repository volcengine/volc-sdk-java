package com.volcengine.example.livesaas;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.livesaas.request.GetAdvertisementDataAPIRequest;
import com.volcengine.model.livesaas.response.GetAdvertisementDataAPIResponse;
import com.volcengine.service.livesaas.LivesaasService;
import com.volcengine.service.livesaas.impl.LivesaasServiceImpl;

public class GetAdvertisementDataAPI {

    public static void main(String[] args) {
        LivesaasService livesaasService = LivesaasServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.volc/config

        livesaasService.setAccessKey("");
        livesaasService.setSecretKey("");
        // list users
        try {
            GetAdvertisementDataAPIRequest getAdvertisementDataAPIRequest = new GetAdvertisementDataAPIRequest();
            getAdvertisementDataAPIRequest.setActivityId(1691034607911981L);

            GetAdvertisementDataAPIResponse getAdvertisementDataAPIResponse = livesaasService.getAdvertisementDataAPI(getAdvertisementDataAPIRequest);
            System.out.println(JSON.toJSONString(getAdvertisementDataAPIResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
