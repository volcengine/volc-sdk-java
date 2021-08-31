package com.volcengine.example.livesaas;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.livesaas.request.UpdateActivityProductAPIRequest;
import com.volcengine.model.livesaas.request.UploadLibAPIRequest;
import com.volcengine.model.livesaas.response.UpdateActivityProductAPIResponse;
import com.volcengine.model.livesaas.response.UploadLibAPIResponse;
import com.volcengine.service.livesaas.LivesaasService;
import com.volcengine.service.livesaas.impl.LivesaasServiceImpl;

public class UploadLibAPI {
    public static void main(String[] args) {
        LivesaasService livesaasService = LivesaasServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.volc/config

        livesaasService.setAccessKey("");
        livesaasService.setSecretKey("");
        // list users
        try {
            UploadLibAPIRequest uploadLibAPIRequest=new UploadLibAPIRequest();
            UploadLibAPIResponse uploadLibAPIResponse = livesaasService.uploadLibAPI(uploadLibAPIRequest);
            System.out.println(JSON.toJSONString(uploadLibAPIResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
