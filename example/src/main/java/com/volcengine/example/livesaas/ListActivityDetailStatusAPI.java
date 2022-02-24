package com.volcengine.example.livesaas;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.livesaas.request.CommonAPIRequest;
import com.volcengine.model.livesaas.request.ListActivityDetailStatusAPIRequest;
import com.volcengine.model.livesaas.response.GetStreamsAPIResponse;
import com.volcengine.model.livesaas.response.ListActivityDetailStatusAPIResponse;
import com.volcengine.service.livesaas.LivesaasService;
import com.volcengine.service.livesaas.impl.LivesaasServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class ListActivityDetailStatusAPI {

    public static void main(String[] args) {
        LivesaasService livesaasService = LivesaasServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.volc/config

        livesaasService.setAccessKey("");
        livesaasService.setSecretKey("");
        // list users
        try {

            ListActivityDetailStatusAPIRequest listActivityDetailStatusAPIRequest = new ListActivityDetailStatusAPIRequest();
            List<Long> activityIds = new ArrayList<>();
            activityIds.add(1234L);
            activityIds.add(5678L);
            listActivityDetailStatusAPIRequest.setMobileNo(1234L);
            listActivityDetailStatusAPIRequest.setActivityIds(activityIds);

            ListActivityDetailStatusAPIResponse listActivityDetailStatusAPIResponse = livesaasService.listActivityDetailStatusAPI(listActivityDetailStatusAPIRequest);
            System.out.println(JSON.toJSONString(listActivityDetailStatusAPIResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
