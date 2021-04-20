package com.volcengine.example.iam;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.RiskDetectionRequest;
import com.volcengine.model.response.RiskDetectioResponse;
import com.volcengine.service.businessSecurity.BusinessSecurityServiceImpl;
import com.volcengine.service.businessSecurity;

public class RiskDetectionDemo {
    public static void main(String[] args) {
        BusinessSecurityService businessSecurityService = BusinessSecurityServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.volc/config

        businessSecurityService.setAccessKey("ak");
        businessSecurityService.setSecretKey("sk");
        // risk detection
        try {
            RiskDetectionRequest riskDetectionRequest = new RiskDetectionRequest();
            riskDetectionRequest.setLimit(3);

            RiskDetectionResponse riskDetectionResponse = businessSecurityService.RiskDetection(riskDetectionRequest);
            System.out.println(JSON.toJSONString(riskDetectionResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
