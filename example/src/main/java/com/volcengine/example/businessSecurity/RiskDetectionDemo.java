package com.volcengine.example.businessSecurity;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.AsyncRiskDetectionRequest;
import com.volcengine.model.request.RiskDetectionRequest;
import com.volcengine.model.request.RiskResultRequest;
import com.volcengine.model.response.AsyncRiskDetectionResponse;
import com.volcengine.model.response.MobileStatusResponse;
import com.volcengine.model.response.RiskDetectionResponse;
import com.volcengine.model.response.RiskResultResponse;
import com.volcengine.service.businessSecurity.BusinessSecurityService;

import com.volcengine.service.businessSecurity.impl.BusinessSecurityServiceImpl;

public class RiskDetectionDemo {
    public static void main(String[] args) {
        BusinessSecurityService businessSecurityService = BusinessSecurityServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.volc/config

        businessSecurityService.setAccessKey("ak");
        businessSecurityService.setSecretKey("sk");
        // risk detection
        try {
            RiskDetectionRequest riskDetectionRequest = new RiskDetectionRequest();
            riskDetectionRequest.setAppId(216455);
            riskDetectionRequest.setService("register");
            riskDetectionRequest.setParameters("{\"operate_time\": 1617960951}");

            RiskDetectionResponse riskDetectionResponse = businessSecurityService.RiskDetection(riskDetectionRequest);
            System.out.println(JSON.toJSONString(riskDetectionResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // async risk detection
        try {
            AsyncRiskDetectionRequest asyncRiskDetectionRequest = new AsyncRiskDetectionRequest();
            asyncRiskDetectionRequest.setAppId(216455);
            asyncRiskDetectionRequest.setService("register");
            asyncRiskDetectionRequest.setPatameters("{\"operate_time\": 1617960951}");

            AsyncRiskDetectionResponse asyncRiskDetectionResponse = businessSecurityService.AsyncRiskDetection(asyncRiskDetectionRequest);
            System.out.println(JSON.toJSONString(asyncRiskDetectionResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // risk result
        try {
            RiskResultRequest riskResultRequest = new RiskResultRequest();
            riskResultRequest.setAppId(216455);
            riskResultRequest.setService("register");
            riskResultRequest.setStartTime(1618848000);
            riskResultRequest.setEndTime(1618921103);
            riskResultRequest.setPageNum(1);
            riskResultRequest.setPageSize(10);

            RiskResultResponse riskResultResponse = businessSecurityService.RiskResult(riskResultRequest);
            System.out.println(JSON.toJSONString(riskResultResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // account risk
        try {
            RiskDetectionRequest riskDetectionRequest = new RiskDetectionRequest();
            riskDetectionRequest.setAppId(5461);
            riskDetectionRequest.setService("account_risk");
            riskDetectionRequest.setParameters("{\"operate_time\":1609818934, \"mobile_sha1\": \"\"}");
            RiskDetectionResponse riskDetectionResponse = businessSecurityService.AccountRisk(riskDetectionRequest);
            System.out.println(JSON.toJSONString(riskDetectionResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // mobile status
        try {
            RiskDetectionRequest riskDetectionRequest = new RiskDetectionRequest();
            riskDetectionRequest.setAppId(5461);
            riskDetectionRequest.setService("mobile_status");
            riskDetectionRequest.setParameters("{\"operate_time\":1609818934, \"mobile\": \"\"}");
            MobileStatusResponse mobileStatusResponse = businessSecurityService.MobileStatus(riskDetectionRequest);
            System.out.println(JSON.toJSONString(mobileStatusResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
