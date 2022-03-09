package com.volcengine.service.cdn.impl;

import com.alibaba.fastjson.JSON;
import com.volcengine.error.SdkError;
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

    @Override
    public CDN.EmptyResponse addCdnDomain(CDN.AddCdnDomainRequest request) throws Exception {
        RawResponse response = json("AddCdnDomain", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.EmptyResponse.class);
    }

    @Override
    public CDN.EmptyResponse startCdnDomain(CDN.StartCdnDomainRequest request) throws Exception {
        RawResponse response = json("StartCdnDomain", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.EmptyResponse.class);
    }

    @Override
    public CDN.EmptyResponse stopCdnDomain(CDN.StopCdnDomainRequest request) throws Exception {
        RawResponse response = json("StopCdnDomain", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.EmptyResponse.class);
    }

    @Override
    public CDN.EmptyResponse deleteCdnDomain(CDN.DeleteCdnDomainRequest request) throws Exception {
        RawResponse response = json("DeleteCdnDomain", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.EmptyResponse.class);
    }

    @Override
    public CDN.ListCdnDomainsResponse listCdnDomains(CDN.ListCdnDomainsRequest request) throws Exception {
        RawResponse response = json("ListCdnDomains", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.ListCdnDomainsResponse.class);
    }

    @Override
    public CDN.DescribeCdnConfigResponse describeCdnConfig(CDN.DescribeCdnConfigRequest request) throws Exception {
        RawResponse response = json("DescribeCdnConfig", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeCdnConfigResponse.class);
    }

    @Override
    public CDN.EmptyResponse updateCdnConfig(CDN.UpdateCdnConfigRequest request) throws Exception {
        RawResponse response = json("UpdateCdnConfig", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.EmptyResponse.class);
    }

    @Override
    public CDN.DescribeCdnDataResponse describeCdnData(CDN.DescribeCdnDataRequest request) throws Exception {
        RawResponse response = json("DescribeCdnData", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeCdnDataResponse.class);
    }

    @Override
    public CDN.DescribeEdgeNrtDataSummaryResponse describeEdgeNrtDataSummary(CDN.DescribeEdgeNrtDataSummaryRequest request) throws Exception {
        RawResponse response = json("DescribeEdgeNrtDataSummary", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeEdgeNrtDataSummaryResponse.class);
    }

    @Override
    public CDN.DescribeCdnOriginDataResponse describeCdnOriginData(CDN.DescribeCdnOriginDataRequest request) throws Exception {
        RawResponse response = json("DescribeCdnOriginData", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeCdnOriginDataResponse.class);
    }

    @Override
    public CDN.DescribeOriginNrtDataSummaryResponse describeOriginNrtDataSummary(CDN.DescribeOriginNrtDataSummaryRequest request) throws Exception {
        RawResponse response = json("DescribeOriginNrtDataSummary", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeOriginNrtDataSummaryResponse.class);
    }

    @Override
    public CDN.DescribeCdnDataDetailResponse describeCdnDataDetail(CDN.DescribeCdnDataDetailRequest request) throws Exception {
        RawResponse response = json("DescribeCdnDataDetail", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeCdnDataDetailResponse.class);
    }

    @Override
    public CDN.DescribeEdgeStatisticalDataResponse describeEdgeStatisticalData(CDN.DescribeEdgeStatisticalDataRequest request) throws Exception {
        RawResponse response = json("DescribeEdgeStatisticalData", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeEdgeStatisticalDataResponse.class);
    }

    @Override
    public CDN.DescribeEdgeTopNrtDataResponse describeEdgeTopNrtData(CDN.DescribeEdgeTopNrtDataRequest request) throws Exception {
        RawResponse response = json("DescribeEdgeTopNrtData", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeEdgeTopNrtDataResponse.class);
    }

    @Override
    public CDN.DescribeOriginTopNrtDataResponse describeOriginTopNrtData(CDN.DescribeOriginTopNrtDataRequest request) throws Exception {
        RawResponse response = json("DescribeOriginTopNrtData", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeOriginTopNrtDataResponse.class);
    }

    @Override
    public CDN.DescribeEdgeTopStatusCodeResponse describeEdgeTopStatusCode(CDN.DescribeEdgeTopStatusCodeRequest request) throws Exception {
        RawResponse response = json("DescribeEdgeTopStatusCode", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeEdgeTopStatusCodeResponse.class);
    }

    @Override
    public CDN.DescribeOriginTopStatusCodeResponse describeOriginTopStatusCode(CDN.DescribeOriginTopStatusCodeRequest request) throws Exception {
        RawResponse response = json("DescribeOriginTopStatusCode", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeOriginTopStatusCodeResponse.class);
    }

    @Override
    public CDN.DescribeEdgeTopStatisticalDataResponse describeEdgeTopStatisticalData(CDN.DescribeEdgeTopStatisticalDataRequest request) throws Exception {
        RawResponse response = json("DescribeEdgeTopStatisticalData", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeEdgeTopStatisticalDataResponse.class);
    }

    @Override
    public CDN.DescribeCdnRegionAndIspResponse describeCdnRegionAndIsp(CDN.DescribeCdnRegionAndIspRequest request) throws Exception {
        RawResponse response = json("DescribeCdnRegionAndIsp", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeCdnRegionAndIspResponse.class);
    }

    @Override
    public CDN.DescribeCdnDomainTopDataResponse describeCdnDomainTopData(CDN.DescribeCdnDomainTopDataRequest request) throws Exception {
        RawResponse response = json("DescribeCdnDomainTopData", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeCdnDomainTopDataResponse.class);
    }

    @Override
    public CDN.DescribeCdnServiceResponse describeCdnService() throws Exception {
        RawResponse response = json("DescribeCdnService", null, "");
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeCdnServiceResponse.class);
    }

    @Override
    public CDN.DescribeAccountingDataResponse describeAccountingData(CDN.DescribeAccountingDataRequest request) throws Exception {
        RawResponse response = json("DescribeAccountingData", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeAccountingDataResponse.class);
    }

    @Override
    public CDN.SubmitRefreshTaskResponse submitRefreshTask(CDN.SubmitRefreshTaskRequest request) throws Exception {
        RawResponse response = json("SubmitRefreshTask", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.SubmitRefreshTaskResponse.class);
    }

    @Override
    public CDN.SubmitPreloadTaskResponse submitPreloadTask(CDN.SubmitPreloadTaskRequest request) throws Exception {
        RawResponse response = json("SubmitPreloadTask", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.SubmitPreloadTaskResponse.class);
    }

    @Override
    public CDN.DescribeContentTasksResponse describeContentTasks(CDN.DescribeContentTasksRequest request) throws Exception {
        RawResponse response = json("DescribeContentTasks", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeContentTasksResponse.class);
    }

    @Override
    public CDN.DescribeContentQuotaResponse describeContentQuota() throws Exception {
        RawResponse response = json("DescribeContentQuota", null, "");
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeContentQuotaResponse.class);
    }

    @Override
    public CDN.SubmitBlockTaskResponse submitBlockTask(CDN.SubmitBlockTaskRequest request) throws Exception {
        RawResponse response = json("SubmitBlockTask", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.SubmitBlockTaskResponse.class);
    }

    @Override
    public CDN.SubmitUnblockTaskResponse submitUnblockTask(CDN.SubmitUnblockTaskRequest request) throws Exception {
        RawResponse response = json("SubmitUnblockTask", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.SubmitUnblockTaskResponse.class);
    }

    @Override
    public CDN.DescribeContentBlockTasksResponse describeContentBlockTasks(CDN.DescribeContentBlockTasksRequest request) throws Exception {
        RawResponse response = json("DescribeContentBlockTasks", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeContentBlockTasksResponse.class);
    }

    @Override
    public CDN.DescribeCdnAccessLogResponse describeCdnAccessLog(CDN.DescribeCdnAccessLogRequest request) throws Exception {
        RawResponse response = json("DescribeCdnAccessLog", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeCdnAccessLogResponse.class);
    }

    @Override
    public CDN.DescribeIPInfoResponse describeIPInfo(CDN.DescribeIPInfoRequest request) throws Exception {
        RawResponse response = json("DescribeIPInfo", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeIPInfoResponse.class);
    }

    @Override
    public CDN.DescribeCdnUpperIpResponse describeCdnUpperIp(CDN.DescribeCdnUpperIpRequest request) throws Exception {
        RawResponse response = json("DescribeCdnUpperIp", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeCdnUpperIpResponse.class);
    }

    @Override
    public CDN.EmptyResponse addResourceTags(CDN.AddResourceTagsRequest request) throws Exception {
        RawResponse response = json("AddResourceTags", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.EmptyResponse.class);
    }

    @Override
    public CDN.EmptyResponse updateResourceTags(CDN.UpdateResourceTagsRequest request) throws Exception {
        RawResponse response = json("UpdateResourceTags", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.EmptyResponse.class);
    }

    @Override
    public CDN.ListResourceTagsResponse listResourceTags() throws Exception {
        RawResponse response = json("ListResourceTags", null, "");
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.ListResourceTagsResponse.class);
    }

    @Override
    public CDN.EmptyResponse deleteResourceTags(CDN.DeleteResourceTagsRequest request) throws Exception {
        RawResponse response = json("DeleteResourceTags", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.EmptyResponse.class);
    }
}