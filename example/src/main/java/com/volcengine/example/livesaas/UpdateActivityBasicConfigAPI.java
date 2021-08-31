package com.volcengine.example.livesaas;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.livesaas.request.CreateActivityAPIRequest;
import com.volcengine.model.livesaas.request.UpdateActivityBasicConfigAPIRequest;
import com.volcengine.model.livesaas.response.CreateActivityAPIResponse;
import com.volcengine.model.livesaas.response.UpdateActivityBasicConfigAPIResponse;
import com.volcengine.service.livesaas.LivesaasService;
import com.volcengine.service.livesaas.impl.LivesaasServiceImpl;

public class UpdateActivityBasicConfigAPI {
    public static void main(String[] args) {
        LivesaasService livesaasService = LivesaasServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.volc/config

        livesaasService.setAccessKey("");
        livesaasService.setSecretKey("");
        // list users
        try {
            UpdateActivityBasicConfigAPIRequest updateActivityBasicConfigAPIRequest=new UpdateActivityBasicConfigAPIRequest() ;
            updateActivityBasicConfigAPIRequest.setName("测试JavaSDK");

            UpdateActivityBasicConfigAPIResponse  updateActivityBasicConfigAPIResponse = livesaasService.updateActivityBasicConfigAPI(updateActivityBasicConfigAPIRequest);
            System.out.println(JSON.toJSONString(updateActivityBasicConfigAPIResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
