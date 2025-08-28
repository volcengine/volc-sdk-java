package com.volcengine.service.businessSecurity.impl;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.*;
import com.volcengine.model.response.*;
import com.volcengine.service.businessSecurity.BusinessSecurityConfig;
import com.volcengine.service.businessSecurity.BusinessSecurityService;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

public class BusinessSecurityServiceTest extends TestCase {
    private BusinessSecurityService initService() {
        BusinessSecurityService service = BusinessSecurityServiceImpl.getInstance();
        return service;
    }

    private BusinessSecurityService initService(String service) {
        BusinessSecurityConfig.init();
        BusinessSecurityService serviceOpenapi = BusinessSecurityServiceImpl.getInstanceOpenapi();
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
        BusinessSecurityService service = initService();
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


    public void testActivateBasePackage()throws Exception{
        BusinessSecurityService service = initService();
        ActivateRiskBasePackageRequest request = new ActivateRiskBasePackageRequest();
        request.setPackageId("1");
        request.setTotalPackageNum(2);
        request.setPackageSeq(1);
        request.setDataType("1");
        List<String> list = new ArrayList<>(1);
        list.add("cfcd208495d565ef66e7dff9f98764da");
        request.setData(list);
        ActivateRiskBasePackageResponse response = service.ActivateRiskBasePackage(request);
        System.out.println(response);
    }

    public void testDeviceId()throws Exception{
        BusinessSecurityService service = initService();
        RiskDetectionRequest request = new RiskDetectionRequest();
        request.setAppId(1);
        request.setService("device_id");
        request.setParameters("");
        DeviceIdResponse response = service.DeviceId(request);
        System.out.println(response);
    }

    public void testActivateSampleData()throws Exception{
        BusinessSecurityService service = initService();
        ActivateRiskSampleDataRequest request = new ActivateRiskSampleDataRequest();
        request.setPackageId("A123456");
        request.setBusinessType("A1");
        request.setPackageSeq(1);
        request.setTotalPackageNum(1);
        request.setDataType("1");
        List<ActivateRiskSampleDataRequest.SampleData> list = new ArrayList<>();
        list.add(new ActivateRiskSampleDataRequest.SampleData("cfcd208495d565ef66e7dff9f98764da","X","Y","abcde"));
        request.setData(list);
        ActivateRiskSampleDataResponse response = service.ActivateRiskSampleData(request);
        System.out.println(response);
    }

    public void testActivateResult()throws Exception{
        BusinessSecurityService service = initService();
        ActivateRiskResultRequest request = new ActivateRiskResultRequest();
        request.setActivateCode("9a5f5a89-6f06-4e49-bbf7-940eb2f5359a");
        request.setPlanId(10);
        ActivateRiskResultResponse response = service.ActivateRiskResult(request);
        System.out.println(response);
    }







    public void testActivationRiskUploadBasePackage()throws Exception{
        int totalPackageNum = 1;
        for (int j=1;j<=totalPackageNum;j++) {
            BusinessSecurityService service = initService();
            ActivationRiskUploadBasePackageRequest request = new ActivationRiskUploadBasePackageRequest();
            request.setAppId(1);
            request.setPackageId("id00004");
            request.setTotalPackageNum(totalPackageNum);
            request.setPackageSeq(j);
            request.setDataType("1");
            request.setScene(1);
            List<String> list = new ArrayList<>(1);
            for (int i = 0; i < 20000; i++) {
                list.add("cfcd208495d565ef66e7dff9f98764da");
            }
            request.setData(list);
            ActivationRiskUploadBasePackageResponse response = service.ActivationRiskUploadBasePackage(request);
            System.out.println(response);
        }
    }

    public void testActivationRiskListBasePackage()throws Exception{
        BusinessSecurityService service = initService();
        ActivationRiskListBasePackagePartRequest request = new ActivationRiskListBasePackagePartRequest();
        request.setAppId(1);
        request.setPackageId("id00002");
        ActivationRiskListBasePackagePartResponse response = service.ActivationRiskListBasePackagePart(request);
        System.out.println(response);
    }

    public void testActivationRiskCompleteBasePackage()throws Exception{

        BusinessSecurityService service = initService();
        ActivationRiskCompleteBasePackageRequest request = new ActivationRiskCompleteBasePackageRequest();
        request.setAppId(1);
        request.setPackageId("id00004");
        request.setScene(1);
        request.setDataSize(20000);
        ActivationRiskCompleteBasePackageResponse response = service.ActivationRiskCompleteBasePackage(request);
        System.out.println(response);

    }
    public void testActivationRiskAbortUploadBasePackage()throws Exception{
        BusinessSecurityService service = initService();
        ActivationRiskAbortUploadBasePackageRequest request = new ActivationRiskAbortUploadBasePackageRequest();
        request.setAppId(1);
        request.setPackageId("Test-15");
        ActivationRiskAbortUploadBasePackageResponse response = service.ActivationRiskAbortUploadBasePackage(request);
        System.out.println(response);
    }

    public void testActivationRiskUploadSampleData()throws Exception{
        BusinessSecurityService service = initService();
        ActivationRiskUploadSampleDataRequest request = new ActivationRiskUploadSampleDataRequest();
        int totalPackageNum = 10;
        for (int j=1;j<=totalPackageNum;j++) {
            request.setAppId(123);
            request.setService("device_id");
            request.setPackageId("id000010");
            request.setTotalPackageNum(totalPackageNum);
            request.setPackageSeq(j);
            request.setBusinessType("A1");
            request.setDataType("1");
            request.setScene(2);
            List<ActivationRiskUploadSampleDataRequest.SampleData> sampleData = new ArrayList<>();
            for (int i = 0; i < 5000; i++) {
                sampleData.add(new ActivationRiskUploadSampleDataRequest.SampleData("6e7dff9f98764da", "sms", "abcde"));
            }
            request.setData(sampleData);
            ActivationRiskUploadSampleDataResponse response = service.ActivationRiskUploadSampleData(request);
            System.out.println(response);
        }
    }

    public void testActivationRiskCompleteSampleData()throws Exception{
        BusinessSecurityService service = initService();
        ActivationRiskCompleteSampleDataRequest request = new ActivationRiskCompleteSampleDataRequest();
        request.setAppId(1);
        request.setPackageId("id000010");
        request.setDataSize(50000);
        ActivationRiskCompleteSampleDataResponse response = service.ActivationRiskCompleteSampleData(request);
        System.out.println(response);
    }

    public void testActivationRiskLisSampleData()throws Exception{
        BusinessSecurityService service = initService();
        ActivationRiskListSampleDataPartRequest request = new ActivationRiskListSampleDataPartRequest();
        request.setAppId(1);
        request.setPackageId("id000010");
        ActivationRiskListSampleDataPartResponse response = service.ActivationRiskListSampleDataPart(request);
        System.out.println(response);
    }

    public void testActivationRiskAsyncDetection()throws Exception{
        BusinessSecurityService service = initService();
        ActivationRiskAsyncDetectRiskRequest request = new ActivationRiskAsyncDetectRiskRequest();
        request.setAppId(1);
        request.setService("pic_top");
        request.setPlanId(6);
        request.setActivateCode("d0869705-04f0-4bb2-ba32-926c12a7f4ca");
        ActivationRiskAsyncDetectRiskResponse response = service.ActivationRiskAsyncDetectRisk(request);
        System.out.println(response);
    }






    public void testActivationRiskAbortUploadSampleData()throws Exception{
        BusinessSecurityService service = initService();
        ActivationRiskAbortUploadSampleDataRequest request = new ActivationRiskAbortUploadSampleDataRequest();
        request.setAppId(1);
        request.setPackageId("Test-15");
        ActivationRiskAbortUploadSampleDataResponse response = service.ActivationRiskAbortUploadSampleData(request);
        System.out.println(response);
    }

    

}
