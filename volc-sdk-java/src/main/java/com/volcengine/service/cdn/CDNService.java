package com.volcengine.service.cdn;

    import com.volcengine.model.beans.CDN;
    import com.volcengine.service.IBaseService;

    public interface CDNService extends IBaseService {
        // 添加加速域名: https://www.volcengine.com/docs/6454/97340
        CDN.AddCdnDomainResponse addCdnDomain(CDN.AddCdnDomainRequest request) throws Exception;

        // 上线加速域名: https://www.volcengine.com/docs/6454/74667
        CDN.StartCdnDomainResponse startCdnDomain(CDN.StartCdnDomainRequest request) throws Exception;

        // 下线加速域名: https://www.volcengine.com/docs/6454/75129
        CDN.StopCdnDomainResponse stopCdnDomain(CDN.StopCdnDomainRequest request) throws Exception;

        // 删除加速域名: https://www.volcengine.com/docs/6454/75130
        CDN.DeleteCdnDomainResponse deleteCdnDomain(CDN.DeleteCdnDomainRequest request) throws Exception;

        // 获取域名列表: https://www.volcengine.com/docs/6454/75269
        CDN.ListCdnDomainsResponse listCdnDomains(CDN.ListCdnDomainsRequest request, String... args) throws Exception;

        // 获取域名配置详情: https://www.volcengine.com/docs/6454/80320
        CDN.DescribeCdnConfigResponse describeCdnConfig(CDN.DescribeCdnConfigRequest request) throws Exception;

        // 修改加速域名配置: https://www.volcengine.com/docs/6454/97266
        CDN.UpdateCdnConfigResponse updateCdnConfig(CDN.UpdateCdnConfigRequest request) throws Exception;

        // 获取访问统计的细分数据: https://www.volcengine.com/docs/6454/70442
        CDN.DescribeCdnDataResponse describeCdnData(CDN.DescribeCdnDataRequest request, String... args) throws Exception;

        // 获取访问统计的汇总数据: https://www.volcengine.com/docs/6454/96132
        CDN.DescribeEdgeNrtDataSummaryResponse describeEdgeNrtDataSummary(CDN.DescribeEdgeNrtDataSummaryRequest request, String... args) throws Exception;

        // 获取回源统计的细分数据: https://www.volcengine.com/docs/6454/70443
        CDN.DescribeCdnOriginDataResponse describeCdnOriginData(CDN.DescribeCdnOriginDataRequest request, String... args) throws Exception;

        // 获取回源统计的汇总数据: https://www.volcengine.com/docs/6454/96133
        CDN.DescribeOriginNrtDataSummaryResponse describeOriginNrtDataSummary(CDN.DescribeOriginNrtDataSummaryRequest request, String... args) throws Exception;

        // 获取省份运营商的细分数据: https://www.volcengine.com/docs/6454/75159
        CDN.DescribeCdnDataDetailResponse describeCdnDataDetail(CDN.DescribeCdnDataDetailRequest request, String... args) throws Exception;

        // 获取多个域名的省份和运营商的细分数据: https://www.volcengine.com/docs/6454/145577
        CDN.DescribeDistrictIspDataResponse describeDistrictIspData(CDN.DescribeDistrictIspDataRequest request, String... args) throws Exception;

        // 获取独立访客的细分数据: https://www.volcengine.com/docs/6454/79321
        CDN.DescribeEdgeStatisticalDataResponse describeEdgeStatisticalData(CDN.DescribeEdgeStatisticalDataRequest request, String... args) throws Exception;

        // 获取访问统计的排行数据: https://www.volcengine.com/docs/6454/96145
        CDN.DescribeEdgeTopNrtDataResponse describeEdgeTopNrtData(CDN.DescribeEdgeTopNrtDataRequest request, String... args) throws Exception;

        // 获取回源数据的统计排序: https://www.volcengine.com/docs/6454/104892
        CDN.DescribeOriginTopNrtDataResponse describeOriginTopNrtData(CDN.DescribeOriginTopNrtDataRequest request, String... args) throws Exception;

        // 获取访问状态码的统计排序: https://www.volcengine.com/docs/6454/104888
        CDN.DescribeEdgeTopStatusCodeResponse describeEdgeTopStatusCode(CDN.DescribeEdgeTopStatusCodeRequest request, String... args) throws Exception;

        // 获取回源状态码的统计排序: https://www.volcengine.com/docs/6454/104891
        CDN.DescribeOriginTopStatusCodeResponse describeOriginTopStatusCode(CDN.DescribeOriginTopStatusCodeRequest request, String... args) throws Exception;

        // 获取热点及访客排行数据: https://www.volcengine.com/docs/6454/79322
        CDN.DescribeEdgeTopStatisticalDataResponse describeEdgeTopStatisticalData(CDN.DescribeEdgeTopStatisticalDataRequest request, String... args) throws Exception;

        // 获取区域和 ISP 列表: https://www.volcengine.com/docs/6454/70445
        CDN.DescribeCdnRegionAndIspResponse describeCdnRegionAndIsp(CDN.DescribeCdnRegionAndIspRequest request, String... args) throws Exception;

        // 获取服务相关信息: https://www.volcengine.com/docs/6454/78999
        CDN.DescribeCdnServiceResponse describeCdnService() throws Exception;

        // 获取计费指标的细分数据: https://www.volcengine.com/docs/6454/96167
        CDN.DescribeAccountingDataResponse describeAccountingData(CDN.DescribeAccountingDataRequest request) throws Exception;

        // 提交刷新任务: https://www.volcengine.com/docs/6454/70438
        CDN.SubmitRefreshTaskResponse submitRefreshTask(CDN.SubmitRefreshTaskRequest request) throws Exception;

        // 提交预热任务: https://www.volcengine.com/docs/6454/70436
        CDN.SubmitPreloadTaskResponse submitPreloadTask(CDN.SubmitPreloadTaskRequest request) throws Exception;

        // 获取刷新预热任务信息: https://www.volcengine.com/docs/6454/70437
        CDN.DescribeContentTasksResponse describeContentTasks(CDN.DescribeContentTasksRequest request) throws Exception;

        // 获取刷新预热配额信息: https://www.volcengine.com/docs/6454/70439
        CDN.DescribeContentQuotaResponse describeContentQuota(String... args) throws Exception;

        // 提交封禁任务: https://www.volcengine.com/docs/6454/79890
        CDN.SubmitBlockTaskResponse submitBlockTask(CDN.SubmitBlockTaskRequest request) throws Exception;

        // 提交解封任务: https://www.volcengine.com/docs/6454/79893
        CDN.SubmitUnblockTaskResponse submitUnblockTask(CDN.SubmitUnblockTaskRequest request) throws Exception;

        // 获取封禁解封任务信息: https://www.volcengine.com/docs/6454/79906
        CDN.DescribeContentBlockTasksResponse describeContentBlockTasks(CDN.DescribeContentBlockTasksRequest request) throws Exception;

        // 获取访问日志下载链接: https://www.volcengine.com/docs/6454/70446
        CDN.DescribeCdnAccessLogResponse describeCdnAccessLog(CDN.DescribeCdnAccessLogRequest request, String... args) throws Exception;

        // 获取 IP 归属信息: https://www.volcengine.com/docs/6454/75233
        CDN.DescribeIPInfoResponse describeIPInfo(CDN.DescribeIPInfoRequest request) throws Exception;

        // 批量获取 IP 归属信息: https://www.volcengine.com/docs/6454/106852
        CDN.DescribeIPListInfoResponse describeIPListInfo(CDN.DescribeIPListInfoRequest request) throws Exception;

        // 获取回源节点 IP 列表: https://www.volcengine.com/docs/6454/75273
        CDN.DescribeCdnUpperIpResponse describeCdnUpperIp(CDN.DescribeCdnUpperIpRequest request) throws Exception;

        // 添加资源标签: https://www.volcengine.com/docs/6454/80308
        CDN.AddResourceTagsResponse addResourceTags(CDN.AddResourceTagsRequest request) throws Exception;

        // 更新资源标签: https://www.volcengine.com/docs/6454/80313
        CDN.UpdateResourceTagsResponse updateResourceTags(CDN.UpdateResourceTagsRequest request) throws Exception;

        // 查询标签清单: https://www.volcengine.com/docs/6454/80315
        CDN.ListResourceTagsResponse listResourceTags() throws Exception;

        // 删除资源标签: https://www.volcengine.com/docs/6454/80316
        CDN.DeleteResourceTagsResponse deleteResourceTags(CDN.DeleteResourceTagsRequest request) throws Exception;

        // 上传证书: https://www.volcengine.com/docs/6454/125708
        CDN.AddCdnCertificateResponse addCdnCertificate(CDN.AddCdnCertificateRequest request) throws Exception;

        // 查询CDN证书列表: https://www.volcengine.com/docs/6454/125709
        CDN.ListCertInfoResponse listCertInfo(CDN.ListCertInfoRequest request) throws Exception;

        // 查询CDN有关联域名的证书列表: https://www.volcengine.com/docs/6454/125710
        CDN.ListCdnCertInfoResponse listCdnCertInfo(CDN.ListCdnCertInfoRequest request) throws Exception;

        // 获取特定证书的域名关联信息: https://www.volcengine.com/docs/6454/125711
        CDN.DescribeCertConfigResponse describeCertConfig(CDN.DescribeCertConfigRequest request) throws Exception;

        // 批量关联证书: https://www.volcengine.com/docs/6454/125712
        CDN.BatchDeployCertResponse batchDeployCert(CDN.BatchDeployCertRequest request) throws Exception;

        // 删除托管在内容分发网络的证书: https://www.volcengine.com/docs/6454/597589
        CDN.DeleteCdnCertificateResponse deleteCdnCertificate(CDN.DeleteCdnCertificateRequest request) throws Exception;

        // 查询计费结果数据: 
        CDN.DescribeAccountingSummaryResponse describeAccountingSummary(CDN.DescribeAccountingSummaryRequest request) throws Exception;

        // 获取访问统计的细分数据: 
        CDN.DescribeDistrictDataResponse describeDistrictData(CDN.DescribeDistrictDataRequest request) throws Exception;

        // 获取计费区域的细分数据: 
        CDN.DescribeEdgeDataResponse describeEdgeData(CDN.DescribeEdgeDataRequest request) throws Exception;

        // 获取访问统计的汇总数据: 
        CDN.DescribeDistrictSummaryResponse describeDistrictSummary(CDN.DescribeDistrictSummaryRequest request) throws Exception;

        // 获取计费区域的汇总数据: 
        CDN.DescribeEdgeSummaryResponse describeEdgeSummary(CDN.DescribeEdgeSummaryRequest request) throws Exception;

        // 获取回源统计的细分数据: 
        CDN.DescribeOriginDataResponse describeOriginData(CDN.DescribeOriginDataRequest request) throws Exception;

        // 获取回源统计的汇总数据: 
        CDN.DescribeOriginSummaryResponse describeOriginSummary(CDN.DescribeOriginSummaryRequest request) throws Exception;

        // 获取独立访客的细分数据: 
        CDN.DescribeUserDataResponse describeUserData(CDN.DescribeUserDataRequest request) throws Exception;

        // 获取访问数据的统计排名: 
        CDN.DescribeDistrictRankingResponse describeDistrictRanking(CDN.DescribeDistrictRankingRequest request) throws Exception;

        // 获取计费区域的统计排名: 
        CDN.DescribeEdgeRankingResponse describeEdgeRanking(CDN.DescribeEdgeRankingRequest request) throws Exception;

        // 获取回源数据的统计排名: 
        CDN.DescribeOriginRankingResponse describeOriginRanking(CDN.DescribeOriginRankingRequest request) throws Exception;

        // 获取访问状态码排名数据: 
        CDN.DescribeEdgeStatusCodeRankingResponse describeEdgeStatusCodeRanking(CDN.DescribeEdgeStatusCodeRankingRequest request) throws Exception;

        // 获取回源状态码的统计排名: 
        CDN.DescribeOriginStatusCodeRankingResponse describeOriginStatusCodeRanking(CDN.DescribeOriginStatusCodeRankingRequest request) throws Exception;

        // 获取热门对象的统计排名: 
        CDN.DescribeStatisticalRankingResponse describeStatisticalRanking(CDN.DescribeStatisticalRankingRequest request) throws Exception;

}
