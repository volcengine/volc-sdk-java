package com.volcengine.example.livesaas;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.livesaas.request.UpdateActivityMenuAPIRequest;
import com.volcengine.model.livesaas.response.UpdateActivityMenuAPIResponse;
import com.volcengine.service.livesaas.LivesaasService;
import com.volcengine.service.livesaas.impl.LivesaasServiceImpl;
import lombok.Data;

@Data
public class UpdateActivityMenuAPI {
    public static void main(String[] args) {
        LivesaasService livesaasService = LivesaasServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.volc/config

        livesaasService.setAccessKey("");
        livesaasService.setSecretKey("");
        // list users
        try {
            UpdateActivityMenuAPIRequest updateActivityMenuAPIRequest =new UpdateActivityMenuAPIRequest();

            UpdateActivityMenuAPIResponse updateActivityMenuAPIResponseResponse = livesaasService.updateActivityMenuAPI(updateActivityMenuAPIRequest);
            System.out.println(JSON.toJSONString(updateActivityMenuAPIResponseResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
