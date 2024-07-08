package com.volcengine.service.cdn.impl;

import com.alibaba.fastjson.JSON;
import com.volcengine.error.SdkError;
import com.volcengine.helper.Utils;
import com.volcengine.model.beans.CDN;
import com.volcengine.model.response.RawResponse;
import com.volcengine.service.BaseServiceImpl;
import com.volcengine.service.cdn.CDNConfig;
import com.volcengine.service.cdn.CDNService;


public class CDNServiceImpl extends BaseServiceImpl implements CDNService {

    private CDNServiceImpl() {
        super(CDNConfig.serviceInfo, CDNConfig.apiInfoList);
    }

    public static CDNService getInstance() {
        return new CDNServiceImpl();
    }
    
    public static String useGet() {return "GET";}

    public static String usePost() {return "POST";}
    
    public RawResponse requestProxy(String api, Object body, String... args) {
        RawResponse response;
        boolean isUseGet = false;
        if (args.length > 0) {
            String arg = args[0];
            if (useGet().equals(arg)) {
                isUseGet = true;
                apiInfoList.get(api).setMethod(useGet());
            }
        }
        if (isUseGet) {
            response = query(api, Utils.mapToPairList(Utils.paramsToMap(body)));
            apiInfoList.get(api).setMethod(usePost());
        } else {
            response = json(api, null, JSON.toJSONString(body));
        }
        return response;
    }

    @Override
    public CDN.AddCdnDomainResponse addCdnDomain(CDN.AddCdnDomainRequest request) throws Exception {
        RawResponse response = requestProxy("AddCdnDomain", request);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.AddCdnDomainResponse.class);
    }

    @Override
    public CDN.StartCdnDomainResponse startCdnDomain(CDN.StartCdnDomainRequest request) throws Exception {
        RawResponse response = requestProxy("StartCdnDomain", request);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.StartCdnDomainResponse.class);
    }

    @Override
    public CDN.StopCdnDomainResponse stopCdnDomain(CDN.StopCdnDomainRequest request) throws Exception {
        RawResponse response = requestProxy("StopCdnDomain", request);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.StopCdnDomainResponse.class);
    }

    @Override
    public CDN.DeleteCdnDomainResponse deleteCdnDomain(CDN.DeleteCdnDomainRequest request) throws Exception {
        RawResponse response = requestProxy("DeleteCdnDomain", request);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DeleteCdnDomainResponse.class);
    }

    @Override
    public CDN.ListCdnDomainsResponse listCdnDomains(CDN.ListCdnDomainsRequest request, String... args) throws Exception {
        RawResponse response = requestProxy("ListCdnDomains", request, args);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.ListCdnDomainsResponse.class);
    }

    @Override
    public CDN.DescribeCdnConfigResponse describeCdnConfig(CDN.DescribeCdnConfigRequest request) throws Exception {
        RawResponse response = requestProxy("DescribeCdnConfig", request);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeCdnConfigResponse.class);
    }

    @Override
    public CDN.UpdateCdnConfigResponse updateCdnConfig(CDN.UpdateCdnConfigRequest request) throws Exception {
        RawResponse response = requestProxy("UpdateCdnConfig", request);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.UpdateCdnConfigResponse.class);
    }

    @Override
    public CDN.DescribeCdnDataResponse describeCdnData(CDN.DescribeCdnDataRequest request, String... args) throws Exception {
        RawResponse response = requestProxy("DescribeCdnData", request, args);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeCdnDataResponse.class);
    }

    @Override
    public CDN.DescribeEdgeNrtDataSummaryResponse describeEdgeNrtDataSummary(CDN.DescribeEdgeNrtDataSummaryRequest request, String... args) throws Exception {
        RawResponse response = requestProxy("DescribeEdgeNrtDataSummary", request, args);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeEdgeNrtDataSummaryResponse.class);
    }

    @Override
    public CDN.DescribeCdnOriginDataResponse describeCdnOriginData(CDN.DescribeCdnOriginDataRequest request, String... args) throws Exception {
        RawResponse response = requestProxy("DescribeCdnOriginData", request, args);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeCdnOriginDataResponse.class);
    }

    @Override
    public CDN.DescribeOriginNrtDataSummaryResponse describeOriginNrtDataSummary(CDN.DescribeOriginNrtDataSummaryRequest request, String... args) throws Exception {
        RawResponse response = requestProxy("DescribeOriginNrtDataSummary", request, args);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeOriginNrtDataSummaryResponse.class);
    }

    @Override
    public CDN.DescribeCdnDataDetailResponse describeCdnDataDetail(CDN.DescribeCdnDataDetailRequest request, String... args) throws Exception {
        RawResponse response = requestProxy("DescribeCdnDataDetail", request, args);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeCdnDataDetailResponse.class);
    }

    @Override
    public CDN.DescribeDistrictIspDataResponse describeDistrictIspData(CDN.DescribeDistrictIspDataRequest request, String... args) throws Exception {
        RawResponse response = requestProxy("DescribeDistrictIspData", request, args);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeDistrictIspDataResponse.class);
    }

    @Override
    public CDN.DescribeEdgeStatisticalDataResponse describeEdgeStatisticalData(CDN.DescribeEdgeStatisticalDataRequest request, String... args) throws Exception {
        RawResponse response = requestProxy("DescribeEdgeStatisticalData", request, args);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeEdgeStatisticalDataResponse.class);
    }

    @Override
    public CDN.DescribeEdgeTopNrtDataResponse describeEdgeTopNrtData(CDN.DescribeEdgeTopNrtDataRequest request, String... args) throws Exception {
        RawResponse response = requestProxy("DescribeEdgeTopNrtData", request, args);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeEdgeTopNrtDataResponse.class);
    }

    @Override
    public CDN.DescribeOriginTopNrtDataResponse describeOriginTopNrtData(CDN.DescribeOriginTopNrtDataRequest request, String... args) throws Exception {
        RawResponse response = requestProxy("DescribeOriginTopNrtData", request, args);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeOriginTopNrtDataResponse.class);
    }

    @Override
    public CDN.DescribeEdgeTopStatusCodeResponse describeEdgeTopStatusCode(CDN.DescribeEdgeTopStatusCodeRequest request, String... args) throws Exception {
        RawResponse response = requestProxy("DescribeEdgeTopStatusCode", request, args);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeEdgeTopStatusCodeResponse.class);
    }

    @Override
    public CDN.DescribeOriginTopStatusCodeResponse describeOriginTopStatusCode(CDN.DescribeOriginTopStatusCodeRequest request, String... args) throws Exception {
        RawResponse response = requestProxy("DescribeOriginTopStatusCode", request, args);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeOriginTopStatusCodeResponse.class);
    }

    @Override
    public CDN.DescribeEdgeTopStatisticalDataResponse describeEdgeTopStatisticalData(CDN.DescribeEdgeTopStatisticalDataRequest request, String... args) throws Exception {
        RawResponse response = requestProxy("DescribeEdgeTopStatisticalData", request, args);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeEdgeTopStatisticalDataResponse.class);
    }

    @Override
    public CDN.DescribeCdnRegionAndIspResponse describeCdnRegionAndIsp(CDN.DescribeCdnRegionAndIspRequest request, String... args) throws Exception {
        RawResponse response = requestProxy("DescribeCdnRegionAndIsp", request, args);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeCdnRegionAndIspResponse.class);
    }

    @Override
    public CDN.DescribeCdnServiceResponse describeCdnService() throws Exception {
        RawResponse response = requestProxy("DescribeCdnService", new Object());
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeCdnServiceResponse.class);
    }

    @Override
    public CDN.DescribeAccountingDataResponse describeAccountingData(CDN.DescribeAccountingDataRequest request) throws Exception {
        RawResponse response = requestProxy("DescribeAccountingData", request);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeAccountingDataResponse.class);
    }

    @Override
    public CDN.SubmitRefreshTaskResponse submitRefreshTask(CDN.SubmitRefreshTaskRequest request) throws Exception {
        RawResponse response = requestProxy("SubmitRefreshTask", request);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.SubmitRefreshTaskResponse.class);
    }

    @Override
    public CDN.SubmitPreloadTaskResponse submitPreloadTask(CDN.SubmitPreloadTaskRequest request) throws Exception {
        RawResponse response = requestProxy("SubmitPreloadTask", request);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.SubmitPreloadTaskResponse.class);
    }

    @Override
    public CDN.DescribeContentTasksResponse describeContentTasks(CDN.DescribeContentTasksRequest request) throws Exception {
        RawResponse response = requestProxy("DescribeContentTasks", request);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeContentTasksResponse.class);
    }

    @Override
    public CDN.DescribeContentQuotaResponse describeContentQuota(String... args) throws Exception {
        RawResponse response = requestProxy("DescribeContentQuota", new Object(), args);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeContentQuotaResponse.class);
    }

    @Override
    public CDN.SubmitBlockTaskResponse submitBlockTask(CDN.SubmitBlockTaskRequest request) throws Exception {
        RawResponse response = requestProxy("SubmitBlockTask", request);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.SubmitBlockTaskResponse.class);
    }

    @Override
    public CDN.SubmitUnblockTaskResponse submitUnblockTask(CDN.SubmitUnblockTaskRequest request) throws Exception {
        RawResponse response = requestProxy("SubmitUnblockTask", request);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.SubmitUnblockTaskResponse.class);
    }

    @Override
    public CDN.DescribeContentBlockTasksResponse describeContentBlockTasks(CDN.DescribeContentBlockTasksRequest request) throws Exception {
        RawResponse response = requestProxy("DescribeContentBlockTasks", request);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeContentBlockTasksResponse.class);
    }

    @Override
    public CDN.DescribeCdnAccessLogResponse describeCdnAccessLog(CDN.DescribeCdnAccessLogRequest request, String... args) throws Exception {
        RawResponse response = requestProxy("DescribeCdnAccessLog", request, args);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeCdnAccessLogResponse.class);
    }

    @Override
    public CDN.DescribeIPInfoResponse describeIPInfo(CDN.DescribeIPInfoRequest request) throws Exception {
        RawResponse response = requestProxy("DescribeIPInfo", request);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeIPInfoResponse.class);
    }

    @Override
    public CDN.DescribeIPListInfoResponse describeIPListInfo(CDN.DescribeIPListInfoRequest request) throws Exception {
        RawResponse response = requestProxy("DescribeIPListInfo", request);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeIPListInfoResponse.class);
    }

    @Override
    public CDN.DescribeCdnUpperIpResponse describeCdnUpperIp(CDN.DescribeCdnUpperIpRequest request) throws Exception {
        RawResponse response = requestProxy("DescribeCdnUpperIp", request);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeCdnUpperIpResponse.class);
    }

    @Override
    public CDN.AddResourceTagsResponse addResourceTags(CDN.AddResourceTagsRequest request) throws Exception {
        RawResponse response = requestProxy("AddResourceTags", request);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.AddResourceTagsResponse.class);
    }

    @Override
    public CDN.UpdateResourceTagsResponse updateResourceTags(CDN.UpdateResourceTagsRequest request) throws Exception {
        RawResponse response = requestProxy("UpdateResourceTags", request);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.UpdateResourceTagsResponse.class);
    }

    @Override
    public CDN.ListResourceTagsResponse listResourceTags() throws Exception {
        RawResponse response = requestProxy("ListResourceTags", new Object());
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.ListResourceTagsResponse.class);
    }

    @Override
    public CDN.DeleteResourceTagsResponse deleteResourceTags(CDN.DeleteResourceTagsRequest request) throws Exception {
        RawResponse response = requestProxy("DeleteResourceTags", request);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DeleteResourceTagsResponse.class);
    }

    @Override
    public CDN.AddCdnCertificateResponse addCdnCertificate(CDN.AddCdnCertificateRequest request) throws Exception {
        RawResponse response = requestProxy("AddCdnCertificate", request);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.AddCdnCertificateResponse.class);
    }

    @Override
    public CDN.ListCertInfoResponse listCertInfo(CDN.ListCertInfoRequest request) throws Exception {
        RawResponse response = requestProxy("ListCertInfo", request);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.ListCertInfoResponse.class);
    }

    @Override
    public CDN.ListCdnCertInfoResponse listCdnCertInfo(CDN.ListCdnCertInfoRequest request) throws Exception {
        RawResponse response = requestProxy("ListCdnCertInfo", request);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.ListCdnCertInfoResponse.class);
    }

    @Override
    public CDN.DescribeCertConfigResponse describeCertConfig(CDN.DescribeCertConfigRequest request) throws Exception {
        RawResponse response = requestProxy("DescribeCertConfig", request);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeCertConfigResponse.class);
    }

    @Override
    public CDN.BatchDeployCertResponse batchDeployCert(CDN.BatchDeployCertRequest request) throws Exception {
        RawResponse response = requestProxy("BatchDeployCert", request);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.BatchDeployCertResponse.class);
    }

    @Override
    public CDN.DeleteCdnCertificateResponse deleteCdnCertificate(CDN.DeleteCdnCertificateRequest request) throws Exception {
        RawResponse response = requestProxy("DeleteCdnCertificate", request);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DeleteCdnCertificateResponse.class);
    }

    @Override
    public CDN.DescribeAccountingSummaryResponse describeAccountingSummary(CDN.DescribeAccountingSummaryRequest request) throws Exception {
        RawResponse response = requestProxy("DescribeAccountingSummary", request);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeAccountingSummaryResponse.class);
    }

    @Override
    public CDN.DescribeDistrictDataResponse describeDistrictData(CDN.DescribeDistrictDataRequest request) throws Exception {
        RawResponse response = requestProxy("DescribeDistrictData", request);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeDistrictDataResponse.class);
    }

    @Override
    public CDN.DescribeEdgeDataResponse describeEdgeData(CDN.DescribeEdgeDataRequest request) throws Exception {
        RawResponse response = requestProxy("DescribeEdgeData", request);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeEdgeDataResponse.class);
    }

    @Override
    public CDN.DescribeDistrictSummaryResponse describeDistrictSummary(CDN.DescribeDistrictSummaryRequest request) throws Exception {
        RawResponse response = requestProxy("DescribeDistrictSummary", request);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeDistrictSummaryResponse.class);
    }

    @Override
    public CDN.DescribeEdgeSummaryResponse describeEdgeSummary(CDN.DescribeEdgeSummaryRequest request) throws Exception {
        RawResponse response = requestProxy("DescribeEdgeSummary", request);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeEdgeSummaryResponse.class);
    }

    @Override
    public CDN.DescribeOriginDataResponse describeOriginData(CDN.DescribeOriginDataRequest request) throws Exception {
        RawResponse response = requestProxy("DescribeOriginData", request);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeOriginDataResponse.class);
    }

    @Override
    public CDN.DescribeOriginSummaryResponse describeOriginSummary(CDN.DescribeOriginSummaryRequest request) throws Exception {
        RawResponse response = requestProxy("DescribeOriginSummary", request);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeOriginSummaryResponse.class);
    }

    @Override
    public CDN.DescribeUserDataResponse describeUserData(CDN.DescribeUserDataRequest request) throws Exception {
        RawResponse response = requestProxy("DescribeUserData", request);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeUserDataResponse.class);
    }

    @Override
    public CDN.DescribeDistrictRankingResponse describeDistrictRanking(CDN.DescribeDistrictRankingRequest request) throws Exception {
        RawResponse response = requestProxy("DescribeDistrictRanking", request);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeDistrictRankingResponse.class);
    }

    @Override
    public CDN.DescribeEdgeRankingResponse describeEdgeRanking(CDN.DescribeEdgeRankingRequest request) throws Exception {
        RawResponse response = requestProxy("DescribeEdgeRanking", request);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeEdgeRankingResponse.class);
    }

    @Override
    public CDN.DescribeOriginRankingResponse describeOriginRanking(CDN.DescribeOriginRankingRequest request) throws Exception {
        RawResponse response = requestProxy("DescribeOriginRanking", request);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeOriginRankingResponse.class);
    }

    @Override
    public CDN.DescribeEdgeStatusCodeRankingResponse describeEdgeStatusCodeRanking(CDN.DescribeEdgeStatusCodeRankingRequest request) throws Exception {
        RawResponse response = requestProxy("DescribeEdgeStatusCodeRanking", request);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeEdgeStatusCodeRankingResponse.class);
    }

    @Override
    public CDN.DescribeOriginStatusCodeRankingResponse describeOriginStatusCodeRanking(CDN.DescribeOriginStatusCodeRankingRequest request) throws Exception {
        RawResponse response = requestProxy("DescribeOriginStatusCodeRanking", request);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeOriginStatusCodeRankingResponse.class);
    }

    @Override
    public CDN.DescribeStatisticalRankingResponse describeStatisticalRanking(CDN.DescribeStatisticalRankingRequest request) throws Exception {
        RawResponse response = requestProxy("DescribeStatisticalRanking", request);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeStatisticalRankingResponse.class);
    }
}
