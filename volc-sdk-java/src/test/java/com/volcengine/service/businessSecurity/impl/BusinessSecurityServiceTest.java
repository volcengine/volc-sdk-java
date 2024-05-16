package com.volcengine.service.businessSecurity.impl;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.*;
import com.volcengine.model.response.GetDailyMarketingPackageResponse;
import com.volcengine.model.response.ListAppsResponse;
import com.volcengine.model.response.PushTrafficRiskDataResponse;
import com.volcengine.model.response.RiskStatResponse;
import com.volcengine.service.businessSecurity.BusinessSecurityConfig;
import com.volcengine.service.businessSecurity.BusinessSecurityService;
import junit.framework.TestCase;

public class BusinessSecurityServiceTest extends TestCase {
    private BusinessSecurityService initService() {
        BusinessSecurityService service = BusinessSecurityServiceImpl.getInstance();
        service.setAccessKey("AK");
        service.setSecretKey("SK");
        return service;
    }

    private BusinessSecurityService initService(String service) {
        BusinessSecurityConfig.init();
        BusinessSecurityService serviceOpenapi = BusinessSecurityServiceImpl.getInstanceOpenapi();
        serviceOpenapi.setAccessKey("AK");
        serviceOpenapi.setSecretKey("SK");
        return serviceOpenapi;
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

    public void testListApps()throws Exception{
        BusinessSecurityService service = initService();
        ListAppsRequest req = new ListAppsRequest();
        req.setLimit(0);
        req.setOffset(20);
        ListAppsResponse.CommonListAppsResponse resp = service.ListApps(req);
        System.out.println(resp);
    }

    public void testSendSamplePackage()throws Exception{
        BusinessSecurityService service = initService("Business");
        PushTrafficRiskDataRequest request = new PushTrafficRiskDataRequest();
        request.setAppId(579824l);
        request.setFilePath("/tmp/权重测试222.csv");
        request.setBusinessType("A1");
        request.setScene("1");
        request.setDataType("1");
        PushTrafficRiskDataResponse response = service.PushTrafficRiskData(request);
    }

    public void testGetDailyMarketingPackage()throws Exception{
        BusinessSecurityService service = initService("Business");
        GetDailyMarketingPackageRequest request = new GetDailyMarketingPackageRequest();
        request.setDate("20240206");
        request.setPlanName("测试计划");
        request.setCustomerPackageId(1);
        GetDailyMarketingPackageResponse response = service.GetDailyMarketingPackage(request);
    }

}
