package com.volcengine.example.livesaas;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.livesaas.request.UpdateActivityBasicConfigAPIRequest;
import com.volcengine.model.livesaas.request.UpdateActivityProductAPIRequest;
import com.volcengine.model.livesaas.response.UpdateActivityBasicConfigAPIResponse;
import com.volcengine.model.livesaas.response.UpdateActivityProductAPIResponse;
import com.volcengine.service.livesaas.LivesaasService;
import com.volcengine.service.livesaas.impl.LivesaasServiceImpl;

public class UpdateActivityProductAPI {
    public static void main(String[] args) {
        LivesaasService livesaasService = LivesaasServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.volc/config

        livesaasService.setAccessKey("");
        livesaasService.setSecretKey("");
        // list users
        try {
            UpdateActivityProductAPIRequest updateActivityProductAPIRequest =new UpdateActivityProductAPIRequest();
            UpdateActivityProductAPIResponse updateActivityProductAPIResponse = livesaasService.updateActivityProductAPI(updateActivityProductAPIRequest);
            System.out.println(JSON.toJSONString(updateActivityProductAPIResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
