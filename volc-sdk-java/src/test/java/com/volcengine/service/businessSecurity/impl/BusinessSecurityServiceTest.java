package com.volcengine.service.businessSecurity.impl;

import com.alibaba.fastjson.JSON;
import com.volcengine.helper.Const;
import com.volcengine.model.request.RiskDetectionRequest;
import com.volcengine.model.request.RiskStatRequest;
import com.volcengine.model.response.ElementVerifyResponseV2;
import com.volcengine.model.response.MobileStatusResponseV2;
import com.volcengine.model.response.RiskStatResponse;
import com.volcengine.service.businessSecurity.BusinessSecurityConfig;
import com.volcengine.service.businessSecurity.BusinessSecurityService;
import junit.framework.TestCase;

public class BusinessSecurityServiceTest extends TestCase {
    private BusinessSecurityService initService() {
        BusinessSecurityService service = BusinessSecurityServiceImpl.getInstance();
        service.setAccessKey("AK");
        service.setSecretKey("AK");
        return service;
    }

    private BusinessSecurityService initService(String service) {
        BusinessSecurityConfig.init();
        BusinessSecurityService serviceOpenapi = BusinessSecurityServiceImpl.getInstanceOpenapi();
        serviceOpenapi.setAccessKey("AK");
        serviceOpenapi.setSecretKey("SK");
        return serviceOpenapi;
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

    public void testSimpleRiskStat() throws Exception {
        BusinessSecurityService service = initService("risk_console");

        RiskStatRequest.CommonProductStatisticsReq req = new RiskStatRequest.CommonProductStatisticsReq();
        req.setProduct("element_verify");
        req.setUnitType("day");

        RiskStatRequest.SimpleProductStatisticsParams params = new RiskStatRequest.SimpleProductStatisticsParams();
        params.setStartDate("2023-05-07");
        params.setEndDate("2023-05-09");
        params.setNeedServiceDetail(true);
        params.setNeedAppDetail(true);
        params.setOperateTime(System.currentTimeMillis());
        req.setParameters(JSON.toJSONString(params));

        RiskStatResponse.CommonRiskStatResponse resp = service.SimpleRiskStat(req);
        System.out.println(resp);
    }

    public void testContentRiskStat() throws Exception {
        BusinessSecurityService service = initService("risk_console");

        RiskStatRequest.CommonProductStatisticsReq req = new RiskStatRequest.CommonProductStatisticsReq();
        req.setProduct("content_security");
        req.setUnitType("day");
        req.setService("image_content_risk");

        RiskStatRequest.ContentProductStatisticsParams params = new RiskStatRequest.ContentProductStatisticsParams();
        params.setStartDate("2023-05-07");
        params.setEndDate("2023-05-09");
        params.setNeedBizTypeDetail(true);
        params.setNeedAppDetail(true);
        params.setNeedRiskTypeDetail(true);
        params.setRiskType("text");
        params.setOperateTime(System.currentTimeMillis());
        req.setParameters(JSON.toJSONString(params));

        RiskStatResponse.CommonRiskStatResponse resp = service.ContentRiskStat(req);
        System.out.println(resp);
    }
}
