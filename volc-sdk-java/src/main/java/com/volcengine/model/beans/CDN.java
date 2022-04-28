package com.volcengine.model.beans;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

public class CDN {

    @Data
    @Accessors(chain = true)
    public static class AddCdnDomainRequest {

        @JSONField(name = "Domain")
        String Domain;

        @JSONField(name = "ServiceType")
        String ServiceType;

        @JSONField(name = "Origin")
        List<OriginRule> Origin;

        @JSONField(name = "OriginProtocol")
        String OriginProtocol;

        @JSONField(name = "Project")
        String Project;

        @JSONField(name = "ResourceTags")
        List<ResourceTagEntry> ResourceTags;

        @JSONField(name = "OriginHost")
        String OriginHost;

        @JSONField(name = "OriginRange")
        Boolean OriginRange;

        @JSONField(name = "FollowRedirect")
        Boolean FollowRedirect;

        @JSONField(name = "Cache")
        List<CacheControlRule> Cache;

        @JSONField(name = "CacheKey")
        List<CacheKeyGenerationRule> CacheKey;

        @JSONField(name = "NegativeCache")
        List<NegativeCacheRule> NegativeCache;

        @JSONField(name = "IpAccessRule")
        IpAccessRule IpAccessRule;

        @JSONField(name = "RefererAccessRule")
        RefererAccessRule RefererAccessRule;

        @JSONField(name = "OriginAccessRule")
        OriginAccessRule OriginAccessRule;

        @JSONField(name = "SignedUrlAuth")
        SignedUrlAuth SignedUrlAuth;

        @JSONField(name = "BandwidthLimit")
        BandwidthLimit BandwidthLimit;

        @JSONField(name = "IpFreqLimit")
        IpFreqLimit IpFreqLimit;

        @JSONField(name = "IpSpeedLimit")
        IpSpeedLimit IpSpeedLimit;

        @JSONField(name = "DownloadSpeedLimit")
        DownloadSpeedLimit DownloadSpeedLimit;

        @JSONField(name = "ResponseHeader")
        List<ResponseHeaderRule> ResponseHeader;

        @JSONField(name = "RequestHeader")
        List<RequestHeaderRule> RequestHeader;

        @JSONField(name = "Compression")
        Compression Compression;

        @JSONField(name = "HTTPS")
        HTTPS HTTPS;
    }

    @Data
    @Accessors(chain = true)
    public static class AddCdnDomainResponse {

        @JSONField(name = "ResponseMetadata")
        ResponseMetadata ResponseMetadata;
    }

    @Data
    @Accessors(chain = true)
    public static class AddResourceTagsRequest {

        @JSONField(name = "Resources")
        List<String> Resources;

        @JSONField(name = "ResourceTags")
        List<ResourceTagEntry> ResourceTags;
    }

    @Data
    @Accessors(chain = true)
    public static class AddResourceTagsResponse {

        @JSONField(name = "ResponseMetadata")
        ResponseMetadata ResponseMetadata;
    }

    @Data
    @Accessors(chain = true)
    public static class BandwidthLimit {

        @JSONField(name = "Switch")
        Boolean Switch;

        @JSONField(name = "BandwidthLimitRule")
        BandwidthLimitRule BandwidthLimitRule;
    }

    @Data
    @Accessors(chain = true)
    public static class BandwidthLimitAction {

        @JSONField(name = "BandwidthThreshold")
        Long BandwidthThreshold;

        @JSONField(name = "LimitType")
        String LimitType;

        @JSONField(name = "SpeedLimitRate")
        Long SpeedLimitRate;
    }

    @Data
    @Accessors(chain = true)
    public static class BandwidthLimitRule {

        @JSONField(name = "Condition")
        Condition Condition;

        @JSONField(name = "BandwidthLimitAction")
        BandwidthLimitAction BandwidthLimitAction;
    }

    @Data
    @Accessors(chain = true)
    public static class CacheAction {

        @JSONField(name = "Action")
        String Action;

        @JSONField(name = "Ttl")
        Long Ttl;
    }

    @Data
    @Accessors(chain = true)
    public static class CacheControlRule {

        @JSONField(name = "Condition")
        Condition Condition;

        @JSONField(name = "CacheAction")
        CacheAction CacheAction;
    }

    @Data
    @Accessors(chain = true)
    public static class CacheKeyAction {

        @JSONField(name = "CacheKeyComponents")
        List<CacheKeyComponent> CacheKeyComponents;
    }

    @Data
    @Accessors(chain = true)
    public static class CacheKeyComponent {

        @JSONField(name = "Object")
        String Object;

        @JSONField(name = "Action")
        String Action;

        @JSONField(name = "Subobject")
        String Subobject;

        @JSONField(name = "IgnoreCase")
        Boolean IgnoreCase;
    }

    @Data
    @Accessors(chain = true)
    public static class CacheKeyGenerationRule {

        @JSONField(name = "Condition")
        Condition Condition;

        @JSONField(name = "CacheKeyAction")
        CacheKeyAction CacheKeyAction;
    }

    @Data
    @Accessors(chain = true)
    public static class CertInfo {

        @JSONField(name = "CertId")
        String CertId;
    }

    @Data
    @Accessors(chain = true)
    public static class Compression {

        @JSONField(name = "Switch")
        Boolean Switch;

        @JSONField(name = "CompressionRules")
        List<CompressionRule> CompressionRules;
    }

    @Data
    @Accessors(chain = true)
    public static class CompressionAction {

        @JSONField(name = "CompressionType")
        List<String> CompressionType;

        @JSONField(name = "CompressionTarget")
        String CompressionTarget;
    }

    @Data
    @Accessors(chain = true)
    public static class CompressionRule {

        @JSONField(name = "Condition")
        Condition Condition;

        @JSONField(name = "CompressionAction")
        CompressionAction CompressionAction;
    }

    @Data
    @Accessors(chain = true)
    public static class Condition {

        @JSONField(name = "Connective")
        String Connective;

        @JSONField(name = "ConditionRule")
        List<ConditionRule> ConditionRule;
    }

    @Data
    @Accessors(chain = true)
    public static class ConditionRule {

        @JSONField(name = "Type")
        String Type;

        @JSONField(name = "Object")
        String Object;

        @JSONField(name = "Operator")
        String Operator;

        @JSONField(name = "Value")
        String Value;
    }

    @Data
    @Accessors(chain = true)
    public static class ContentTask {

        @JSONField(name = "Url")
        String Url;

        @JSONField(name = "Status")
        String Status;

        @JSONField(name = "TaskType")
        String TaskType;

        @JSONField(name = "CreateTime")
        Long CreateTime;

        @JSONField(name = "TaskID")
        String TaskID;
    }

    @Data
    @Accessors(chain = true)
    public static class DataDetail {

        @JSONField(name = "Isp")
        String Isp;

        @JSONField(name = "Region")
        String Region;

        @JSONField(name = "Metrics")
        List<MetricStatData> Metrics;
    }

    @Data
    @Accessors(chain = true)
    public static class DeleteCdnDomainRequest {

        @JSONField(name = "Domain")
        String Domain;
    }

    @Data
    @Accessors(chain = true)
    public static class DeleteCdnDomainResponse {

        @JSONField(name = "ResponseMetadata")
        ResponseMetadata ResponseMetadata;
    }

    @Data
    @Accessors(chain = true)
    public static class DeleteResourceTagsRequest {

        @JSONField(name = "Resources")
        List<String> Resources;

        @JSONField(name = "ResourceTags")
        List<ResourceTagEntry> ResourceTags;
    }

    @Data
    @Accessors(chain = true)
    public static class DeleteResourceTagsResponse {

        @JSONField(name = "ResponseMetadata")
        ResponseMetadata ResponseMetadata;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeAccountingDataRequest {

        @JSONField(name = "StartTime")
        Long StartTime;

        @JSONField(name = "EndTime")
        Long EndTime;

        @JSONField(name = "Metric")
        String Metric;

        @JSONField(name = "Domain")
        String Domain;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeAccountingDataResponse {

        @JSONField(name = "ResponseMetadata")
        ResponseMetadata ResponseMetadata;

        @JSONField(name = "Result")
        DescribeAccountingDataResult Result;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeAccountingDataResult {

        @JSONField(name = "Resources")
        List<ResourceStatData> Resources;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeCdnAccessLogRequest {

        @JSONField(name = "Domain")
        String Domain;

        @JSONField(name = "StartTime")
        Long StartTime;

        @JSONField(name = "EndTime")
        Long EndTime;

        @JSONField(name = "PageNum")
        Long PageNum;

        @JSONField(name = "PageSize")
        Long PageSize;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeCdnAccessLogResponse {

        @JSONField(name = "ResponseMetadata")
        ResponseMetadata ResponseMetadata;

        @JSONField(name = "Result")
        DescribeCdnAccessLogResult Result;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeCdnAccessLogResult {

        @JSONField(name = "Domain")
        String Domain;

        @JSONField(name = "PageSize")
        Long PageSize;

        @JSONField(name = "PageNum")
        Long PageNum;

        @JSONField(name = "TotalCount")
        Long TotalCount;

        @JSONField(name = "DomainLogDetails")
        List<DomainLogDetail> DomainLogDetails;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeCdnConfigRequest {

        @JSONField(name = "Domain")
        String Domain;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeCdnConfigResponse {

        @JSONField(name = "ResponseMetadata")
        ResponseMetadata ResponseMetadata;

        @JSONField(name = "Result")
        DescribeCdnConfigResult Result;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeCdnConfigResult {

        @JSONField(name = "DomainConfig")
        DomainConfig DomainConfig;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeCdnDataDetailRequest {

        @JSONField(name = "StartTime")
        Long StartTime;

        @JSONField(name = "EndTime")
        Long EndTime;

        @JSONField(name = "Metric")
        String Metric;

        @JSONField(name = "Domain")
        String Domain;

        @JSONField(name = "Interval")
        String Interval;

        @JSONField(name = "Protocol")
        String Protocol;

        @JSONField(name = "IpVersion")
        String IpVersion;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeCdnDataDetailResponse {

        @JSONField(name = "ResponseMetadata")
        ResponseMetadata ResponseMetadata;

        @JSONField(name = "Result")
        DescribeCdnDataDetailResult Result;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeCdnDataDetailResult {

        @JSONField(name = "Domain")
        String Domain;

        @JSONField(name = "DataDetails")
        List<DataDetail> DataDetails;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeCdnDataRequest {

        @JSONField(name = "StartTime")
        Long StartTime;

        @JSONField(name = "EndTime")
        Long EndTime;

        @JSONField(name = "Metric")
        String Metric;

        @JSONField(name = "Domain")
        String Domain;

        @JSONField(name = "Interval")
        String Interval;

        @JSONField(name = "Area")
        String Area;

        @JSONField(name = "Region")
        String Region;

        @JSONField(name = "Isp")
        String Isp;

        @JSONField(name = "Protocol")
        String Protocol;

        @JSONField(name = "IpVersion")
        String IpVersion;

        @JSONField(name = "Aggregate")
        String Aggregate;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeCdnDataResponse {

        @JSONField(name = "ResponseMetadata")
        ResponseMetadata ResponseMetadata;

        @JSONField(name = "Result")
        DescribeCdnDataResult Result;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeCdnDataResult {

        @JSONField(name = "Resources")
        List<ResourceStatData> Resources;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeCdnDomainTopDataRequest {

        @JSONField(name = "Domain")
        String Domain;

        @JSONField(name = "StartTime")
        Long StartTime;

        @JSONField(name = "EndTime")
        Long EndTime;

        @JSONField(name = "Item")
        String Item;

        @JSONField(name = "Metric")
        String Metric;

        @JSONField(name = "Area")
        String Area;

        @JSONField(name = "ProjectName")
        String ProjectName;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeCdnDomainTopDataResponse {

        @JSONField(name = "ResponseMetadata")
        ResponseMetadata ResponseMetadata;

        @JSONField(name = "Result")
        DescribeCdnDomainTopDataResult Result;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeCdnDomainTopDataResult {

        @JSONField(name = "Domain")
        String Domain;

        @JSONField(name = "TopDataDetails")
        List<TopDataDetailDeprecated> TopDataDetails;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeCdnOriginDataRequest {

        @JSONField(name = "StartTime")
        Long StartTime;

        @JSONField(name = "EndTime")
        Long EndTime;

        @JSONField(name = "Metric")
        String Metric;

        @JSONField(name = "Domain")
        String Domain;

        @JSONField(name = "Interval")
        String Interval;

        @JSONField(name = "Aggregate")
        String Aggregate;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeCdnOriginDataResponse {

        @JSONField(name = "ResponseMetadata")
        ResponseMetadata ResponseMetadata;

        @JSONField(name = "Result")
        DescribeCdnOriginDataResult Result;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeCdnOriginDataResult {

        @JSONField(name = "Resources")
        List<ResourceStatData> Resources;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeCdnRegionAndIspRequest {

        @JSONField(name = "Area")
        String Area;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeCdnRegionAndIspResponse {

        @JSONField(name = "ResponseMetadata")
        ResponseMetadata ResponseMetadata;

        @JSONField(name = "Result")
        DescribeCdnRegionAndIspResult Result;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeCdnRegionAndIspResult {

        @JSONField(name = "Isps")
        List<NamePair> Isps;

        @JSONField(name = "Regions")
        List<NamePair> Regions;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeCdnServiceResponse {

        @JSONField(name = "ResponseMetadata")
        ResponseMetadata ResponseMetadata;

        @JSONField(name = "Result")
        DescribeCdnServiceResult Result;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeCdnServiceResult {

        @JSONField(name = "ServiceInfos")
        List<ServiceInformation> ServiceInfos;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeCdnUpperIpRequest {

        @JSONField(name = "Domain")
        String Domain;

        @JSONField(name = "IpVersion")
        String IpVersion;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeCdnUpperIpResponse {

        @JSONField(name = "ResponseMetadata")
        ResponseMetadata ResponseMetadata;

        @JSONField(name = "Result")
        DescribeCdnUpperIpResult Result;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeCdnUpperIpResult {

        @JSONField(name = "CdnIpv4")
        List<String> CdnIpv4;

        @JSONField(name = "CdnIpv6")
        List<String> CdnIpv6;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeContentBlockTasksRequest {

        @JSONField(name = "Url")
        String Url;

        @JSONField(name = "Domain")
        String Domain;

        @JSONField(name = "TaskID")
        String TaskID;

        @JSONField(name = "TaskType")
        String TaskType;

        @JSONField(name = "Status")
        String Status;

        @JSONField(name = "StartTime")
        Long StartTime;

        @JSONField(name = "EndTime")
        Long EndTime;

        @JSONField(name = "PageNum")
        Long PageNum;

        @JSONField(name = "PageSize")
        Long PageSize;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeContentBlockTasksResponse {

        @JSONField(name = "ResponseMetadata")
        ResponseMetadata ResponseMetadata;

        @JSONField(name = "Result")
        DescribeContentBlockTasksResult Result;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeContentBlockTasksResult {

        @JSONField(name = "Total")
        Long Total;

        @JSONField(name = "PageNum")
        Long PageNum;

        @JSONField(name = "PageSize")
        Long PageSize;

        @JSONField(name = "Data")
        List<ContentTask> Data;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeContentQuotaResponse {

        @JSONField(name = "ResponseMetadata")
        ResponseMetadata ResponseMetadata;

        @JSONField(name = "Result")
        DescribeContentQuotaResult Result;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeContentQuotaResult {

        @JSONField(name = "RefreshQuota")
        Long RefreshQuota;

        @JSONField(name = "RefreshRemain")
        Long RefreshRemain;

        @JSONField(name = "PreloadQuota")
        Long PreloadQuota;

        @JSONField(name = "PreloadRemain")
        Long PreloadRemain;

        @JSONField(name = "RefreshDirQuota")
        Long RefreshDirQuota;

        @JSONField(name = "RefreshDirRemain")
        Long RefreshDirRemain;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeContentTasksRequest {

        @JSONField(name = "Url")
        String Url;

        @JSONField(name = "DomainName")
        String DomainName;

        @JSONField(name = "TaskID")
        String TaskID;

        @JSONField(name = "TaskType")
        String TaskType;

        @JSONField(name = "Status")
        String Status;

        @JSONField(name = "StartTime")
        Long StartTime;

        @JSONField(name = "EndTime")
        Long EndTime;

        @JSONField(name = "PageNum")
        Long PageNum;

        @JSONField(name = "PageSize")
        Long PageSize;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeContentTasksResponse {

        @JSONField(name = "ResponseMetadata")
        ResponseMetadata ResponseMetadata;

        @JSONField(name = "Result")
        DescribeContentTasksResult Result;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeContentTasksResult {

        @JSONField(name = "Total")
        Long Total;

        @JSONField(name = "PageNum")
        Long PageNum;

        @JSONField(name = "PageSize")
        Long PageSize;

        @JSONField(name = "Data")
        List<ContentTask> Data;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeEdgeNrtDataSummaryRequest {

        @JSONField(name = "StartTime")
        Long StartTime;

        @JSONField(name = "EndTime")
        Long EndTime;

        @JSONField(name = "Metric")
        String Metric;

        @JSONField(name = "Domain")
        String Domain;

        @JSONField(name = "Interval")
        String Interval;

        @JSONField(name = "Area")
        String Area;

        @JSONField(name = "Region")
        String Region;

        @JSONField(name = "Isp")
        String Isp;

        @JSONField(name = "Protocol")
        String Protocol;

        @JSONField(name = "IpVersion")
        String IpVersion;

        @JSONField(name = "Aggregate")
        String Aggregate;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeEdgeNrtDataSummaryResponse {

        @JSONField(name = "ResponseMetadata")
        ResponseMetadata ResponseMetadata;

        @JSONField(name = "Result")
        DescribeEdgeNrtDataSummaryResult Result;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeEdgeNrtDataSummaryResult {

        @JSONField(name = "Resources")
        List<ResourceSummary> Resources;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeEdgeStatisticalDataRequest {

        @JSONField(name = "StartTime")
        Long StartTime;

        @JSONField(name = "EndTime")
        Long EndTime;

        @JSONField(name = "Metric")
        String Metric;

        @JSONField(name = "Domain")
        String Domain;

        @JSONField(name = "Interval")
        String Interval;

        @JSONField(name = "Area")
        String Area;

        @JSONField(name = "Region")
        String Region;

        @JSONField(name = "IpVersion")
        String IpVersion;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeEdgeStatisticalDataResponse {

        @JSONField(name = "ResponseMetadata")
        ResponseMetadata ResponseMetadata;

        @JSONField(name = "Result")
        DescribeEdgeStatisticalDataResult Result;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeEdgeStatisticalDataResult {

        @JSONField(name = "Resources")
        List<ResourceStatData> Resources;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeEdgeTopNrtDataRequest {

        @JSONField(name = "StartTime")
        Long StartTime;

        @JSONField(name = "EndTime")
        Long EndTime;

        @JSONField(name = "Metric")
        String Metric;

        @JSONField(name = "Domain")
        String Domain;

        @JSONField(name = "Item")
        String Item;

        @JSONField(name = "Area")
        String Area;

        @JSONField(name = "Interval")
        String Interval;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeEdgeTopNrtDataResponse {

        @JSONField(name = "ResponseMetadata")
        ResponseMetadata ResponseMetadata;

        @JSONField(name = "Result")
        DescribeEdgeTopNrtDataResult Result;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeEdgeTopNrtDataResult {

        @JSONField(name = "Item")
        String Item;

        @JSONField(name = "Metric")
        String Metric;

        @JSONField(name = "Name")
        String Name;

        @JSONField(name = "TopDataDetails")
        List<TopDetail> TopDataDetails;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeEdgeTopStatisticalDataRequest {

        @JSONField(name = "StartTime")
        Long StartTime;

        @JSONField(name = "EndTime")
        Long EndTime;

        @JSONField(name = "Metric")
        String Metric;

        @JSONField(name = "Domain")
        String Domain;

        @JSONField(name = "Item")
        String Item;

        @JSONField(name = "Area")
        String Area;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeEdgeTopStatisticalDataResponse {

        @JSONField(name = "ResponseMetadata")
        ResponseMetadata ResponseMetadata;

        @JSONField(name = "Result")
        DescribeEdgeTopStatisticalDataResult Result;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeEdgeTopStatisticalDataResult {

        @JSONField(name = "Domain")
        String Domain;

        @JSONField(name = "TopDataDetails")
        List<TopDataDetail> TopDataDetails;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeEdgeTopStatusCodeRequest {

        @JSONField(name = "StartTime")
        Long StartTime;

        @JSONField(name = "EndTime")
        Long EndTime;

        @JSONField(name = "Domain")
        String Domain;

        @JSONField(name = "Item")
        String Item;

        @JSONField(name = "Metric")
        String Metric;

        @JSONField(name = "Area")
        String Area;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeEdgeTopStatusCodeResponse {

        @JSONField(name = "ResponseMetadata")
        ResponseMetadata ResponseMetadata;

        @JSONField(name = "Result")
        DescribeEdgeTopStatusCodeResult Result;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeEdgeTopStatusCodeResult {

        @JSONField(name = "Item")
        String Item;

        @JSONField(name = "Metric")
        String Metric;

        @JSONField(name = "Name")
        String Name;

        @JSONField(name = "TopDataDetails")
        List<TopStatusDetail> TopDataDetails;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeIPInfoRequest {

        @JSONField(name = "IP")
        String IP;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeIPInfoResponse {

        @JSONField(name = "ResponseMetadata")
        ResponseMetadata ResponseMetadata;

        @JSONField(name = "Result")
        DescribeIPInfoResult Result;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeIPInfoResult {

        @JSONField(name = "IP")
        String IP;

        @JSONField(name = "Location")
        String Location;

        @JSONField(name = "ISP")
        String ISP;

        @JSONField(name = "CdnIp")
        Boolean CdnIp;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeOriginNrtDataSummaryRequest {

        @JSONField(name = "StartTime")
        Long StartTime;

        @JSONField(name = "EndTime")
        Long EndTime;

        @JSONField(name = "Metric")
        String Metric;

        @JSONField(name = "Domain")
        String Domain;

        @JSONField(name = "Interval")
        String Interval;

        @JSONField(name = "Aggregate")
        String Aggregate;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeOriginNrtDataSummaryResponse {

        @JSONField(name = "ResponseMetadata")
        ResponseMetadata ResponseMetadata;

        @JSONField(name = "Result")
        DescribeOriginNrtDataSummaryResult Result;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeOriginNrtDataSummaryResult {

        @JSONField(name = "Resources")
        List<ResourceSummary> Resources;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeOriginTopNrtDataRequest {

        @JSONField(name = "Domain")
        String Domain;

        @JSONField(name = "StartTime")
        Long StartTime;

        @JSONField(name = "EndTime")
        Long EndTime;

        @JSONField(name = "Item")
        String Item;

        @JSONField(name = "Interval")
        String Interval;

        @JSONField(name = "Metric")
        String Metric;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeOriginTopNrtDataResponse {

        @JSONField(name = "ResponseMetadata")
        ResponseMetadata ResponseMetadata;

        @JSONField(name = "Result")
        DescribeOriginTopNrtDataResult Result;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeOriginTopNrtDataResult {

        @JSONField(name = "Item")
        String Item;

        @JSONField(name = "Metric")
        String Metric;

        @JSONField(name = "Name")
        String Name;

        @JSONField(name = "TopDataDetails")
        List<TopDetail> TopDataDetails;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeOriginTopStatusCodeRequest {

        @JSONField(name = "StartTime")
        Long StartTime;

        @JSONField(name = "EndTime")
        Long EndTime;

        @JSONField(name = "Domain")
        String Domain;

        @JSONField(name = "Item")
        String Item;

        @JSONField(name = "Metric")
        String Metric;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeOriginTopStatusCodeResponse {

        @JSONField(name = "ResponseMetadata")
        ResponseMetadata ResponseMetadata;

        @JSONField(name = "Result")
        DescribeOriginTopStatusCodeResult Result;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeOriginTopStatusCodeResult {

        @JSONField(name = "Item")
        String Item;

        @JSONField(name = "Metric")
        String Metric;

        @JSONField(name = "Name")
        String Name;

        @JSONField(name = "TopDataDetails")
        List<TopStatusDetail> TopDataDetails;
    }

    @Data
    @Accessors(chain = true)
    public static class DomainConfig {

        @JSONField(name = "Cname")
        String Cname;

        @JSONField(name = "Domain")
        String Domain;

        @JSONField(name = "Project")
        String Project;

        @JSONField(name = "ServiceType")
        String ServiceType;

        @JSONField(name = "ServiceRegion")
        String ServiceRegion;

        @JSONField(name = "UpdateTime")
        Long UpdateTime;

        @JSONField(name = "CreateTime")
        Long CreateTime;

        @JSONField(name = "Status")
        String Status;

        @JSONField(name = "OriginHost")
        String OriginHost;

        @JSONField(name = "OriginProtocol")
        String OriginProtocol;

        @JSONField(name = "OriginRange")
        Boolean OriginRange;

        @JSONField(name = "FollowRedirect")
        Boolean FollowRedirect;

        @JSONField(name = "Origin")
        List<OriginRule> Origin;

        @JSONField(name = "HTTPS")
        HTTPS HTTPS;

        @JSONField(name = "IpAccessRule")
        IpAccessRule IpAccessRule;

        @JSONField(name = "RefererAccessRule")
        RefererAccessRule RefererAccessRule;

        @JSONField(name = "OriginAccessRule")
        OriginAccessRule OriginAccessRule;

        @JSONField(name = "SignedUrlAuth")
        SignedUrlAuth SignedUrlAuth;

        @JSONField(name = "BandwidthLimit")
        BandwidthLimit BandwidthLimit;

        @JSONField(name = "IpFreqLimit")
        IpFreqLimit IpFreqLimit;

        @JSONField(name = "IpSpeedLimit")
        IpSpeedLimit IpSpeedLimit;

        @JSONField(name = "Cache")
        List<CacheControlRule> Cache;

        @JSONField(name = "CacheKey")
        List<CacheKeyGenerationRule> CacheKey;

        @JSONField(name = "NegativeCache")
        List<NegativeCacheRule> NegativeCache;

        @JSONField(name = "ResponseHeader")
        List<ResponseHeaderRule> ResponseHeader;

        @JSONField(name = "RequestHeader")
        List<RequestHeaderRule> RequestHeader;

        @JSONField(name = "Compression")
        Compression Compression;

        @JSONField(name = "DownloadSpeedLimit")
        DownloadSpeedLimit DownloadSpeedLimit;
    }

    @Data
    @Accessors(chain = true)
    public static class DomainLogDetail {

        @JSONField(name = "StartTime")
        String StartTime;

        @JSONField(name = "EndTime")
        String EndTime;

        @JSONField(name = "LogName")
        String LogName;

        @JSONField(name = "LogPath")
        String LogPath;

        @JSONField(name = "LogSize")
        String LogSize;
    }

    @Data
    @Accessors(chain = true)
    public static class DomainSummary {

        @JSONField(name = "Domain")
        String Domain;

        @JSONField(name = "Status")
        String Status;

        @JSONField(name = "Cname")
        String Cname;

        @JSONField(name = "ServiceRegion")
        String ServiceRegion;

        @JSONField(name = "ServiceType")
        String ServiceType;

        @JSONField(name = "CreateTime")
        Long CreateTime;

        @JSONField(name = "UpdateTime")
        Long UpdateTime;

        @JSONField(name = "Resources")
        List<ResourceTagEntry> Resources;
    }

    @Data
    @Accessors(chain = true)
    public static class DownloadSpeedLimit {

        @JSONField(name = "Switch")
        Boolean Switch;

        @JSONField(name = "DownloadSpeedLimitRules")
        List<DownloadSpeedLimitRule> DownloadSpeedLimitRules;
    }

    @Data
    @Accessors(chain = true)
    public static class DownloadSpeedLimitAction {

        @JSONField(name = "SpeedLimitRate")
        Long SpeedLimitRate;

        @JSONField(name = "SpeedLimitRateAfter")
        Long SpeedLimitRateAfter;

        @JSONField(name = "DownloadSpeedLimitRate")
        Long DownloadSpeedLimitRate;

        @JSONField(name = "DownloadSpeedLimitRateAfter")
        Long DownloadSpeedLimitRateAfter;
    }

    @Data
    @Accessors(chain = true)
    public static class DownloadSpeedLimitRule {

        @JSONField(name = "Condition")
        Condition Condition;

        @JSONField(name = "DownloadSpeedLimitAction")
        DownloadSpeedLimitAction DownloadSpeedLimitAction;
    }

    @Data
    @Accessors(chain = true)
    public static class EmptyResponse {

        @JSONField(name = "ResponseMetadata")
        ResponseMetadata ResponseMetadata;
    }

    @Data
    @Accessors(chain = true)
    public static class ErrorObj {

        @JSONField(name = "CodeN")
        Long CodeN;

        @JSONField(name = "Code")
        String Code;

        @JSONField(name = "Message")
        String Message;
    }

    @Data
    @Accessors(chain = true)
    public static class ForcedRedirect {

        @JSONField(name = "EnableForcedRedirect")
        Boolean EnableForcedRedirect;

        @JSONField(name = "StatusCode")
        String StatusCode;
    }

    @Data
    @Accessors(chain = true)
    public static class HTTPS {

        @JSONField(name = "Switch")
        Boolean Switch;

        @JSONField(name = "HTTP2")
        Boolean HTTP2;

        @JSONField(name = "DisableHttp")
        Boolean DisableHttp;

        @JSONField(name = "TlsVersion")
        List<String> TlsVersion;

        @JSONField(name = "CertInfo")
        CertInfo CertInfo;

        @JSONField(name = "ForcedRedirect")
        ForcedRedirect ForcedRedirect;
    }

    @Data
    @Accessors(chain = true)
    public static class IpAccessRule {

        @JSONField(name = "Switch")
        Boolean Switch;

        @JSONField(name = "RuleType")
        String RuleType;

        @JSONField(name = "Ip")
        List<String> Ip;
    }

    @Data
    @Accessors(chain = true)
    public static class IpFreqLimit {

        @JSONField(name = "Switch")
        Boolean Switch;

        @JSONField(name = "IpFreqLimitRules")
        List<IpFreqLimitRule> IpFreqLimitRules;
    }

    @Data
    @Accessors(chain = true)
    public static class IpFreqLimitAction {

        @JSONField(name = "Action")
        String Action;

        @JSONField(name = "FreqLimitRate")
        Long FreqLimitRate;

        @JSONField(name = "StateCode")
        String StateCode;
    }

    @Data
    @Accessors(chain = true)
    public static class IpFreqLimitRule {

        @JSONField(name = "Condition")
        Condition Condition;

        @JSONField(name = "IpFreqLimitAction")
        IpFreqLimitAction IpFreqLimitAction;
    }

    @Data
    @Accessors(chain = true)
    public static class IpSpeedLimit {

        @JSONField(name = "Switch")
        Boolean Switch;

        @JSONField(name = "IpSpeedLimitRules")
        List<IpSpeedLimitRule> IpSpeedLimitRules;
    }

    @Data
    @Accessors(chain = true)
    public static class IpSpeedLimitAction {

        @JSONField(name = "SpeedLimitRate")
        Long SpeedLimitRate;
    }

    @Data
    @Accessors(chain = true)
    public static class IpSpeedLimitRule {

        @JSONField(name = "Condition")
        Condition Condition;

        @JSONField(name = "IpSpeedLimitAction")
        IpSpeedLimitAction IpSpeedLimitAction;
    }

    @Data
    @Accessors(chain = true)
    public static class ListCdnDomainsRequest {

        @JSONField(name = "Domain")
        String Domain;

        @JSONField(name = "ServiceType")
        String ServiceType;

        @JSONField(name = "ResourceTags")
        List<ResourceTagEntry> ResourceTags;

        @JSONField(name = "Status")
        String Status;

        @JSONField(name = "PageNum")
        Long PageNum;

        @JSONField(name = "PageSize")
        Long PageSize;
    }

    @Data
    @Accessors(chain = true)
    public static class ListCdnDomainsResponse {

        @JSONField(name = "ResponseMetadata")
        ResponseMetadata ResponseMetadata;

        @JSONField(name = "Result")
        ListCdnDomainsResult Result;
    }

    @Data
    @Accessors(chain = true)
    public static class ListCdnDomainsResult {

        @JSONField(name = "Data")
        List<DomainSummary> Data;

        @JSONField(name = "PageNum")
        Long PageNum;

        @JSONField(name = "PageSize")
        Long PageSize;

        @JSONField(name = "Total")
        Long Total;
    }

    @Data
    @Accessors(chain = true)
    public static class ListResourceTagsResponse {

        @JSONField(name = "ResponseMetadata")
        ResponseMetadata ResponseMetadata;

        @JSONField(name = "Result")
        ListResourceTagsResult Result;
    }

    @Data
    @Accessors(chain = true)
    public static class ListResourceTagsResult {

        @JSONField(name = "ResourceTags")
        List<ResourceTagEntry> ResourceTags;
    }

    @Data
    @Accessors(chain = true)
    public static class MetricStatData {

        @JSONField(name = "Metric")
        String Metric;

        @JSONField(name = "Values")
        List<TimeSeriesData> Values;
    }

    @Data
    @Accessors(chain = true)
    public static class MetricSummary {

        @JSONField(name = "Metric")
        String Metric;

        @JSONField(name = "Value")
        Double Value;
    }

    @Data
    @Accessors(chain = true)
    public static class NamePair {

        @JSONField(name = "Code")
        String Code;

        @JSONField(name = "Name")
        String Name;
    }

    @Data
    @Accessors(chain = true)
    public static class NegativeCacheAction {

        @JSONField(name = "StatusCode")
        String StatusCode;

        @JSONField(name = "Action")
        String Action;

        @JSONField(name = "Ttl")
        Long Ttl;
    }

    @Data
    @Accessors(chain = true)
    public static class NegativeCacheRule {

        @JSONField(name = "Condition")
        Condition Condition;

        @JSONField(name = "NegativeCacheRule")
        NegativeCacheAction NegativeCacheRule;
    }

    @Data
    @Accessors(chain = true)
    public static class OriginAccessRule {

        @JSONField(name = "Switch")
        Boolean Switch;

        @JSONField(name = "RuleType")
        String RuleType;

        @JSONField(name = "Origins")
        List<String> Origins;

        @JSONField(name = "AllowEmpty")
        Boolean AllowEmpty;
    }

    @Data
    @Accessors(chain = true)
    public static class OriginAction {

        @JSONField(name = "OriginLines")
        List<OriginLine> OriginLines;
    }

    @Data
    @Accessors(chain = true)
    public static class OriginLine {

        @JSONField(name = "OriginType")
        String OriginType;

        @JSONField(name = "InstanceType")
        String InstanceType;

        @JSONField(name = "Address")
        String Address;

        @JSONField(name = "HttpPort")
        String HttpPort;

        @JSONField(name = "HttpsPort")
        String HttpsPort;

        @JSONField(name = "Weight")
        String Weight;

        @JSONField(name = "PrivateBucketAccess")
        Boolean PrivateBucketAccess;
    }

    @Data
    @Accessors(chain = true)
    public static class OriginRule {

        @JSONField(name = "Condition")
        Condition Condition;

        @JSONField(name = "OriginAction")
        OriginAction OriginAction;
    }

    @Data
    @Accessors(chain = true)
    public static class RefererAccessRule {

        @JSONField(name = "Switch")
        Boolean Switch;

        @JSONField(name = "RuleType")
        String RuleType;

        @JSONField(name = "Referers")
        List<String> Referers;

        @JSONField(name = "AllowEmpty")
        Boolean AllowEmpty;
    }

    @Data
    @Accessors(chain = true)
    public static class RequestHeaderAction {

        @JSONField(name = "RequestHeaderInstances")
        List<RequestHeaderInstance> RequestHeaderInstances;
    }

    @Data
    @Accessors(chain = true)
    public static class RequestHeaderInstance {

        @JSONField(name = "Action")
        String Action;

        @JSONField(name = "Key")
        String Key;

        @JSONField(name = "Value")
        String Value;

        @JSONField(name = "ValueType")
        String ValueType;
    }

    @Data
    @Accessors(chain = true)
    public static class RequestHeaderRule {

        @JSONField(name = "Condition")
        Condition Condition;

        @JSONField(name = "RequestHeaderAction")
        RequestHeaderAction RequestHeaderAction;
    }

    @Data
    @Accessors(chain = true)
    public static class ResourceStatData {

        @JSONField(name = "Name")
        String Name;

        @JSONField(name = "Metrics")
        List<MetricStatData> Metrics;
    }

    @Data
    @Accessors(chain = true)
    public static class ResourceSummary {

        @JSONField(name = "Name")
        String Name;

        @JSONField(name = "Metrics")
        List<MetricSummary> Metrics;
    }

    @Data
    @Accessors(chain = true)
    public static class ResourceTagEntry {

        @JSONField(name = "Key")
        String Key;

        @JSONField(name = "Value")
        String Value;
    }

    @Data
    @Accessors(chain = true)
    public static class ResponseHeaderAction {

        @JSONField(name = "ResponseHeaderInstances")
        List<ResponseHeaderInstance> ResponseHeaderInstances;
    }

    @Data
    @Accessors(chain = true)
    public static class ResponseHeaderInstance {

        @JSONField(name = "Action")
        String Action;

        @JSONField(name = "Key")
        String Key;

        @JSONField(name = "Value")
        String Value;

        @JSONField(name = "ValueType")
        String ValueType;
    }

    @Data
    @Accessors(chain = true)
    public static class ResponseHeaderRule {

        @JSONField(name = "Condition")
        Condition Condition;

        @JSONField(name = "ResponseHeaderAction")
        ResponseHeaderAction ResponseHeaderAction;
    }

    @Data
    @Accessors(chain = true)
    public static class ResponseMetadata {

        @JSONField(name = "RequestID")
        String RequestID;

        @JSONField(name = "Service")
        String Service;

        @JSONField(name = "Region")
        String Region;

        @JSONField(name = "Action")
        String Action;

        @JSONField(name = "Version")
        String Version;

        @JSONField(name = "Error")
        ErrorObj Error;
    }

    @Data
    @Accessors(chain = true)
    public static class ServiceInformation {

        @JSONField(name = "Status")
        String Status;

        @JSONField(name = "CreateTime")
        String CreateTime;

        @JSONField(name = "StartTime")
        String StartTime;

        @JSONField(name = "BillingCycle")
        String BillingCycle;

        @JSONField(name = "BillingDesc")
        String BillingDesc;

        @JSONField(name = "BillingCode")
        String BillingCode;

        @JSONField(name = "BillingData")
        String BillingData;

        @JSONField(name = "InstanceType")
        String InstanceType;
    }

    @Data
    @Accessors(chain = true)
    public static class SignedUrlAuth {

        @JSONField(name = "Switch")
        Boolean Switch;

        @JSONField(name = "SignedUrlAuthRules")
        List<SignedUrlAuthRule> SignedUrlAuthRules;
    }

    @Data
    @Accessors(chain = true)
    public static class SignedUrlAuthAction {

        @JSONField(name = "URLAuthType")
        String URLAuthType;

        @JSONField(name = "MasterSecretKey")
        String MasterSecretKey;

        @JSONField(name = "BackupSecretKey")
        String BackupSecretKey;

        @JSONField(name = "SignName")
        String SignName;

        @JSONField(name = "TimeName")
        String TimeName;

        @JSONField(name = "Duration")
        Long Duration;

        @JSONField(name = "TimeFormat")
        String TimeFormat;

        @JSONField(name = "SignatureRule")
        List<String> SignatureRule;
    }

    @Data
    @Accessors(chain = true)
    public static class SignedUrlAuthRule {

        @JSONField(name = "Condition")
        Condition Condition;

        @JSONField(name = "SignedUrlAuthAction")
        SignedUrlAuthAction SignedUrlAuthAction;
    }

    @Data
    @Accessors(chain = true)
    public static class StartCdnDomainRequest {

        @JSONField(name = "Domain")
        String Domain;
    }

    @Data
    @Accessors(chain = true)
    public static class StartCdnDomainResponse {

        @JSONField(name = "ResponseMetadata")
        ResponseMetadata ResponseMetadata;
    }

    @Data
    @Accessors(chain = true)
    public static class StopCdnDomainRequest {

        @JSONField(name = "Domain")
        String Domain;
    }

    @Data
    @Accessors(chain = true)
    public static class StopCdnDomainResponse {

        @JSONField(name = "ResponseMetadata")
        ResponseMetadata ResponseMetadata;
    }

    @Data
    @Accessors(chain = true)
    public static class SubmitBlockTaskRequest {

        @JSONField(name = "Urls")
        String Urls;
    }

    @Data
    @Accessors(chain = true)
    public static class SubmitBlockTaskResponse {

        @JSONField(name = "ResponseMetadata")
        ResponseMetadata ResponseMetadata;

        @JSONField(name = "Result")
        SubmitBlockTaskResult Result;
    }

    @Data
    @Accessors(chain = true)
    public static class SubmitBlockTaskResult {

        @JSONField(name = "TaskID")
        String TaskID;
    }

    @Data
    @Accessors(chain = true)
    public static class SubmitPreloadTaskRequest {

        @JSONField(name = "Urls")
        String Urls;
    }

    @Data
    @Accessors(chain = true)
    public static class SubmitPreloadTaskResponse {

        @JSONField(name = "ResponseMetadata")
        ResponseMetadata ResponseMetadata;

        @JSONField(name = "Result")
        SubmitPreloadTaskResult Result;
    }

    @Data
    @Accessors(chain = true)
    public static class SubmitPreloadTaskResult {

        @JSONField(name = "TaskID")
        String TaskID;
    }

    @Data
    @Accessors(chain = true)
    public static class SubmitRefreshTaskRequest {

        @JSONField(name = "Type")
        String Type;

        @JSONField(name = "Urls")
        String Urls;
    }

    @Data
    @Accessors(chain = true)
    public static class SubmitRefreshTaskResponse {

        @JSONField(name = "ResponseMetadata")
        ResponseMetadata ResponseMetadata;

        @JSONField(name = "Result")
        SubmitRefreshTaskResult Result;
    }

    @Data
    @Accessors(chain = true)
    public static class SubmitRefreshTaskResult {

        @JSONField(name = "TaskID")
        String TaskID;
    }

    @Data
    @Accessors(chain = true)
    public static class SubmitUnblockTaskRequest {

        @JSONField(name = "Urls")
        String Urls;
    }

    @Data
    @Accessors(chain = true)
    public static class SubmitUnblockTaskResponse {

        @JSONField(name = "ResponseMetadata")
        ResponseMetadata ResponseMetadata;

        @JSONField(name = "Result")
        SubmitUnblockTaskResult Result;
    }

    @Data
    @Accessors(chain = true)
    public static class SubmitUnblockTaskResult {

        @JSONField(name = "TaskID")
        String TaskID;
    }

    @Data
    @Accessors(chain = true)
    public static class TimeSeriesData {

        @JSONField(name = "Timestamp")
        Long Timestamp;

        @JSONField(name = "Value")
        Double Value;
    }

    @Data
    @Accessors(chain = true)
    public static class TopDataDetail {

        @JSONField(name = "ItemKey")
        String ItemKey;

        @JSONField(name = "ItemKeyCN")
        String ItemKeyCN;

        @JSONField(name = "Value")
        Double Value;
    }

    @Data
    @Accessors(chain = true)
    public static class TopDataDetailDeprecated {

        @JSONField(name = "Item")
        String Item;

        @JSONField(name = "PV")
        Long PV;

        @JSONField(name = "PVRatio")
        Double PVRatio;

        @JSONField(name = "Flux")
        Long Flux;

        @JSONField(name = "FluxRatio")
        Double FluxRatio;

        @JSONField(name = "Bandwidth")
        Double Bandwidth;
    }

    @Data
    @Accessors(chain = true)
    public static class TopDetail {

        @JSONField(name = "ItemKey")
        String ItemKey;

        @JSONField(name = "ItemKeyCN")
        String ItemKeyCN;

        @JSONField(name = "Bandwidth")
        Double Bandwidth;

        @JSONField(name = "BandwidthPeakTime")
        Long BandwidthPeakTime;

        @JSONField(name = "Flux")
        Double Flux;

        @JSONField(name = "FluxRatio")
        Double FluxRatio;

        @JSONField(name = "PV")
        Long PV;

        @JSONField(name = "PVRatio")
        Long PVRatio;
    }

    @Data
    @Accessors(chain = true)
    public static class TopStatusDetail {

        @JSONField(name = "ItemKey")
        String ItemKey;

        @JSONField(name = "2xx")
        Double Status2xx;

        @JSONField(name = "2xxRatio")
        Double Status2xxRatio;

        @JSONField(name = "3xx")
        Double Status3xx;

        @JSONField(name = "3xxRatio")
        Double Status3xxRatio;

        @JSONField(name = "4xx")
        Double Status4xx;

        @JSONField(name = "4xxRatio")
        Double Status4xxRatio;

        @JSONField(name = "5xx")
        Double Status5xx;

        @JSONField(name = "5xxRatio")
        Double Status5xxRatio;
    }

    @Data
    @Accessors(chain = true)
    public static class UpdateCdnConfigRequest {

        @JSONField(name = "Domain")
        String Domain;

        @JSONField(name = "ResourceTags")
        List<ResourceTagEntry> ResourceTags;

        @JSONField(name = "OriginHost")
        String OriginHost;

        @JSONField(name = "OriginProtocol")
        String OriginProtocol;

        @JSONField(name = "OriginRange")
        Boolean OriginRange;

        @JSONField(name = "FollowRedirect")
        Boolean FollowRedirect;

        @JSONField(name = "Origin")
        List<OriginRule> Origin;

        @JSONField(name = "Cache")
        List<CacheControlRule> Cache;

        @JSONField(name = "CacheKey")
        List<CacheKeyGenerationRule> CacheKey;

        @JSONField(name = "NegativeCache")
        List<NegativeCacheRule> NegativeCache;

        @JSONField(name = "IpAccessRule")
        IpAccessRule IpAccessRule;

        @JSONField(name = "RefererAccessRule")
        RefererAccessRule RefererAccessRule;

        @JSONField(name = "OriginAccessRule")
        OriginAccessRule OriginAccessRule;

        @JSONField(name = "SignedUrlAuth")
        SignedUrlAuth SignedUrlAuth;

        @JSONField(name = "BandwidthLimit")
        BandwidthLimit BandwidthLimit;

        @JSONField(name = "IpFreqLimit")
        IpFreqLimit IpFreqLimit;

        @JSONField(name = "IpSpeedLimit")
        IpSpeedLimit IpSpeedLimit;

        @JSONField(name = "DownloadSpeedLimit")
        DownloadSpeedLimit DownloadSpeedLimit;

        @JSONField(name = "ResponseHeader")
        List<ResponseHeaderRule> ResponseHeader;

        @JSONField(name = "RequestHeader")
        List<RequestHeaderRule> RequestHeader;

        @JSONField(name = "Compression")
        Compression Compression;

        @JSONField(name = "HTTPS")
        HTTPS HTTPS;
    }

    @Data
    @Accessors(chain = true)
    public static class UpdateCdnConfigResponse {

        @JSONField(name = "ResponseMetadata")
        ResponseMetadata ResponseMetadata;
    }

    @Data
    @Accessors(chain = true)
    public static class UpdateResourceTagsRequest {

        @JSONField(name = "Resources")
        List<String> Resources;

        @JSONField(name = "ResourceTags")
        List<ResourceTagEntry> ResourceTags;
    }

    @Data
    @Accessors(chain = true)
    public static class UpdateResourceTagsResponse {

        @JSONField(name = "ResponseMetadata")
        ResponseMetadata ResponseMetadata;
    }
}
