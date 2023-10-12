package com.volcengine.example.businessSecurity;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.AsyncRiskDetectionRequest;
import com.volcengine.model.request.RiskDetectionRequest;
import com.volcengine.model.request.RiskResultRequest;
import com.volcengine.model.response.*;
import com.volcengine.service.businessSecurity.BusinessSecurityService;

import com.volcengine.service.businessSecurity.impl.BusinessSecurityServiceImpl;

public class RiskDetectionDemo {
    public static void main(String[] args) {
        BusinessSecurityService businessSecurityService = BusinessSecurityServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.volc/config

        businessSecurityService.setAccessKey("AK");
        businessSecurityService.setSecretKey("SK");
    }
}
