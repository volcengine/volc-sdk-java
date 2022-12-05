package com.volcengine.service.businessSecurity.impl;

import com.volcengine.helper.Const;
import com.volcengine.model.request.RiskDetectionRequest;
import com.volcengine.model.response.ElementVerifyResponseV2;
import com.volcengine.model.response.MobileStatusResponseV2;
import com.volcengine.service.businessSecurity.BusinessSecurityService;
import junit.framework.TestCase;

public class BusinessSecurityServiceTest extends TestCase {
    private BusinessSecurityService initService() {
        BusinessSecurityService service = BusinessSecurityServiceImpl.getInstance();
        service.setAccessKey("AK");
        service.setSecretKey("AK");
        return service;
    }

    public void testMobileStatusV2() throws Exception {
        BusinessSecurityService service = initService();

        RiskDetectionRequest req = new RiskDetectionRequest();
        req.setAppId(1234);
        req.setService("service");
        req.setParameters("{\"operate_time\":1617960951,\"mobile\":\"\"}");
        MobileStatusResponseV2 result = service.MobileStatusV2(req);
        System.out.println("");
    }

    public void testElementVerifyV2() throws Exception {
        BusinessSecurityService service = initService();

        RiskDetectionRequest req = new RiskDetectionRequest();
        req.setAppId(1234);
        req.setService("service");
        req.setParameters("{\"operate_time\": 1635321212,\"mobile\":\"\",\"idcard_name\":\"\"}");
        ElementVerifyResponseV2 result = service.ElementVerifyV2(req);
        System.out.println("");
    }

    public void testElementVerifyEncrypted() throws Exception {
        BusinessSecurityService service = initService();

        RiskDetectionRequest req = new RiskDetectionRequest();
        req.setAppId(1234);
        req.setService("service");
        req.setParameters("{\"operate_time\": 1635321212,\"mobile\":\"\",\"idcard_name\":\"\"}");
        ElementVerifyResponseV2 result = service.ElementVerifyEncrypted("your private key", Const.AES, req);
        System.out.println(result);
    }
}
