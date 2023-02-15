package com.volcengine.model.beans;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

public class CDN {

    @Data
    @Accessors(chain = true)
    public static class AccountingData {

        @JSONField(name = "Metric")
        String Metric;

        @JSONField(name = "Values")
        List<DataPoint> Values;
    }

    @Data
    @Accessors(chain = true)
    public static class AccountingDataDetail {

        @JSONField(name = "BillingRegion")
        String BillingRegion;

        @JSONField(name = "Metrics")
        List<AccountingData> Metrics;

        @JSONField(name = "Name")
        String Name;
    }

    @Data
    @Accessors(chain = true)
    public static class AddCdnCertInfo {

        @JSONField(name = "Desc")
        String Desc;
    }

    @Data
    @Accessors(chain = true)
    public static class AddCdnCertificateRequest {

        @JSONField(name = "CertInfo")
        AddCdnCertInfo CertInfo;

        @JSONField(name = "Certificate")
        Certificate Certificate;

        @JSONField(name = "Source")
        String Source;
    }

    @Data
    @Accessors(chain = true)
    public static class AddCdnCertificateResponse {

        @JSONField(name = "ResponseMetadata")
        ResponseMetadata ResponseMetadata;

        @JSONField(name = "Result")
        String Result;
    }

    @Data
    @Accessors(chain = true)
    public static class AddCdnDomainRequest {

        @JSONField(name = "AreaAccessRule")
        AreaAccessRule AreaAccessRule;

        @JSONField(name = "BandwidthLimit")
        BandwidthLimit BandwidthLimit;

        @JSONField(name = "Cache")
        List<CacheControlRule> Cache;

        @JSONField(name = "CacheKey")
        List<CacheKeyGenerationRule> CacheKey;

        @JSONField(name = "Compression")
        Compression Compression;

        @JSONField(name = "CustomErrorPage")
        CustomErrorPage CustomErrorPage;

        @JSONField(name = "Domain")
        String Domain;

        @JSONField(name = "DownloadSpeedLimit")
        DownloadSpeedLimit DownloadSpeedLimit;

        @JSONField(name = "FollowRedirect")
        Boolean FollowRedirect;

        @JSONField(name = "HTTPS")
        HTTPS HTTPS;

        @JSONField(name = "HeaderLogging")
        HeaderLog HeaderLogging;

        @JSONField(name = "HttpForcedRedirect")
        HttpForcedRedirect HttpForcedRedirect;

        @JSONField(name = "IPv6")
        IPv6 IPv6;

        @JSONField(name = "IpAccessRule")
        IpAccessRule IpAccessRule;

        @JSONField(name = "IpFreqLimit")
        IpFreqLimit IpFreqLimit;

        @JSONField(name = "IpSpeedLimit")
        IpSpeedLimit IpSpeedLimit;

        @JSONField(name = "MethodDeniedRule")
        MethodDeniedRule MethodDeniedRule;

        @JSONField(name = "NegativeCache")
        List<NegativeCache> NegativeCache;

        @JSONField(name = "Origin")
        List<OriginRule> Origin;

        @JSONField(name = "OriginAccessRule")
        OriginAccessRule OriginAccessRule;

        @JSONField(name = "OriginArg")
        List<OriginArgRule> OriginArg;

        @JSONField(name = "OriginHost")
        String OriginHost;

        @JSONField(name = "OriginProtocol")
        String OriginProtocol;

        @JSONField(name = "OriginRange")
        Boolean OriginRange;

        @JSONField(name = "OriginSni")
        OriginSni OriginSni;

        @JSONField(name = "Project")
        String Project;

        @JSONField(name = "Quic")
        Quic Quic;

        @JSONField(name = "RedirectionRewrite")
        RedirectionRewrite RedirectionRewrite;

        @JSONField(name = "RefererAccessRule")
        RefererAccessRule RefererAccessRule;

        @JSONField(name = "RemoteAuth")
        RemoteAuth RemoteAuth;

        @JSONField(name = "RequestHeader")
        List<RequestHeaderRule> RequestHeader;

        @JSONField(name = "ResourceTags")
        List<ResourceTag> ResourceTags;

        @JSONField(name = "ResponseHeader")
        List<ResponseHeaderRule> ResponseHeader;

        @JSONField(name = "ServiceRegion")
        String ServiceRegion;

        @JSONField(name = "ServiceType")
        String ServiceType;

        @JSONField(name = "SignedUrlAuth")
        SignedUrlAuth SignedUrlAuth;

        @JSONField(name = "Sparrow")
        Sparrow Sparrow;

        @JSONField(name = "Timeout")
        TimeoutArg Timeout;

        @JSONField(name = "UaAccessRule")
        UserAgentAccessRule UaAccessRule;

        @JSONField(name = "VideoDrag")
        VideoDrag VideoDrag;
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

        @JSONField(name = "ResourceTags")
        List<ResourceTag> ResourceTags;

        @JSONField(name = "Resources")
        List<String> Resources;
    }

    @Data
    @Accessors(chain = true)
    public static class AddResourceTagsResponse {

        @JSONField(name = "ResponseMetadata")
        ResponseMetadata ResponseMetadata;
    }

    @Data
    @Accessors(chain = true)
    public static class AreaAccessRule {

        @JSONField(name = "Area")
        List<String> Area;

        @JSONField(name = "RuleType")
        String RuleType;

        @JSONField(name = "Switch")
        Boolean Switch;
    }

    @Data
    @Accessors(chain = true)
    public static class AuthCacheAction {

        @JSONField(name = "Action")
        String Action;

        @JSONField(name = "CacheKey")
        List<String> CacheKey;

        @JSONField(name = "IgnoreCase")
        Boolean IgnoreCase;

        @JSONField(name = "Ttl")
        Long Ttl;
    }

    @Data
    @Accessors(chain = true)
    public static class AuthModeConfig {

        @JSONField(name = "BackupRemoteAddr")
        String BackupRemoteAddr;

        @JSONField(name = "MasterRemoteAddr")
        String MasterRemoteAddr;

        @JSONField(name = "PathType")
        String PathType;

        @JSONField(name = "PathValue")
        String PathValue;

        @JSONField(name = "RequestMethod")
        String RequestMethod;
    }

    @Data
    @Accessors(chain = true)
    public static class AuthRequestHeaderRule {

        @JSONField(name = "RequestHeaderComponents")
        RequestHeaderComponent RequestHeaderComponents;

        @JSONField(name = "RequestHeaderInstances")
        List<RequestHeaderInstance> RequestHeaderInstances;
    }

    @Data
    @Accessors(chain = true)
    public static class AuthResponseConfig {

        @JSONField(name = "CacheAction")
        AuthCacheAction CacheAction;

        @JSONField(name = "ResponseAction")
        ResponseAction ResponseAction;

        @JSONField(name = "StatusCodeAction")
        StatusCodeAction StatusCodeAction;

        @JSONField(name = "TimeOutAction")
        TimeOutAction TimeOutAction;
    }

    @Data
    @Accessors(chain = true)
    public static class BandwidthLimit {

        @JSONField(name = "BandwidthLimitRule")
        BandwidthLimitRule BandwidthLimitRule;

        @JSONField(name = "Switch")
        Boolean Switch;
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

        @JSONField(name = "BandwidthLimitAction")
        BandwidthLimitAction BandwidthLimitAction;

        @JSONField(name = "Condition")
        Condition Condition;
    }

    @Data
    @Accessors(chain = true)
    public static class BatchDeployCertRequest {

        @JSONField(name = "CertId")
        String CertId;

        @JSONField(name = "Domain")
        String Domain;
    }

    @Data
    @Accessors(chain = true)
    public static class BatchDeployCertResponse {

        @JSONField(name = "ResponseMetadata")
        ResponseMetadata ResponseMetadata;

        @JSONField(name = "Result")
        BatchDeployCertResult Result;
    }

    @Data
    @Accessors(chain = true)
    public static class BatchDeployCertResult {

        @JSONField(name = "DeployResult")
        List<DomainCertDeployStatus> DeployResult;
    }

    @Data
    @Accessors(chain = true)
    public static class CacheAction {

        @JSONField(name = "Action")
        String Action;

        @JSONField(name = "DefaultPolicy")
        String DefaultPolicy;

        @JSONField(name = "IgnoreCase")
        Boolean IgnoreCase;

        @JSONField(name = "Ttl")
        Long Ttl;
    }

    @Data
    @Accessors(chain = true)
    public static class CacheControlRule {

        @JSONField(name = "CacheAction")
        CacheAction CacheAction;

        @JSONField(name = "Condition")
        Condition Condition;
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

        @JSONField(name = "Action")
        String Action;

        @JSONField(name = "IgnoreCase")
        Boolean IgnoreCase;

        @JSONField(name = "Object")
        String Object;

        @JSONField(name = "Subobject")
        String Subobject;
    }

    @Data
    @Accessors(chain = true)
    public static class CacheKeyGenerationRule {

        @JSONField(name = "CacheKeyAction")
        CacheKeyAction CacheKeyAction;

        @JSONField(name = "Condition")
        Condition Condition;
    }

    @Data
    @Accessors(chain = true)
    public static class CertInfo {

        @JSONField(name = "CertId")
        String CertId;

        @JSONField(name = "CertName")
        String CertName;

        @JSONField(name = "Certificate")
        Certificate Certificate;

        @JSONField(name = "ConfiguredDomain")
        String ConfiguredDomain;

        @JSONField(name = "Desc")
        String Desc;

        @JSONField(name = "DnsName")
        String DnsName;

        @JSONField(name = "EffectiveTime")
        Long EffectiveTime;

        @JSONField(name = "ExpireTime")
        Long ExpireTime;

        @JSONField(name = "Source")
        String Source;

        @JSONField(name = "Status")
        String Status;
    }

    @Data
    @Accessors(chain = true)
    public static class Certificate {

        @JSONField(name = "Certificate")
        String Certificate;

        @JSONField(name = "PrivateKey")
        String PrivateKey;
    }

    @Data
    @Accessors(chain = true)
    public static class Compression {

        @JSONField(name = "CompressionRules")
        List<CompressionRule> CompressionRules;

        @JSONField(name = "Switch")
        Boolean Switch;
    }

    @Data
    @Accessors(chain = true)
    public static class CompressionAction {

        @JSONField(name = "CompressionFormat")
        String CompressionFormat;

        @JSONField(name = "CompressionTarget")
        String CompressionTarget;

        @JSONField(name = "CompressionType")
        List<String> CompressionType;
    }

    @Data
    @Accessors(chain = true)
    public static class CompressionRule {

        @JSONField(name = "CompressionAction")
        CompressionAction CompressionAction;

        @JSONField(name = "Condition")
        Condition Condition;
    }

    @Data
    @Accessors(chain = true)
    public static class Condition {

        @JSONField(name = "ConditionRule")
        List<ConditionRule> ConditionRule;

        @JSONField(name = "Connective")
        String Connective;
    }

    @Data
    @Accessors(chain = true)
    public static class ConditionRule {

        @JSONField(name = "Object")
        String Object;

        @JSONField(name = "Operator")
        String Operator;

        @JSONField(name = "Type")
        String Type;

        @JSONField(name = "Value")
        String Value;
    }

    @Data
    @Accessors(chain = true)
    public static class ContentTask {

        @JSONField(name = "CreateTime")
        Long CreateTime;

        @JSONField(name = "Process")
        String Process;

        @JSONField(name = "Remark")
        String Remark;

        @JSONField(name = "Status")
        String Status;

        @JSONField(name = "TaskID")
        String TaskID;

        @JSONField(name = "TaskType")
        String TaskType;

        @JSONField(name = "Url")
        String Url;
    }

    @Data
    @Accessors(chain = true)
    public static class CustomErrorPage {

        @JSONField(name = "ErrorPageRule")
        List<ErrorPageRule> ErrorPageRule;

        @JSONField(name = "Switch")
        Boolean Switch;
    }

    @Data
    @Accessors(chain = true)
    public static class CustomVariableInstance {

        @JSONField(name = "Operator")
        String Operator;

        @JSONField(name = "Type")
        String Type;

        @JSONField(name = "Value")
        String Value;
    }

    @Data
    @Accessors(chain = true)
    public static class CustomVariableRules {

        @JSONField(name = "CustomVariableInstances")
        List<CustomVariableInstance> CustomVariableInstances;
    }

    @Data
    @Accessors(chain = true)
    public static class DataPoint {

        @JSONField(name = "TimeStamp")
        Long TimeStamp;

        @JSONField(name = "Value")
        Double Value;
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

        @JSONField(name = "ResourceTags")
        List<ResourceTag> ResourceTags;

        @JSONField(name = "Resources")
        List<String> Resources;
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

        @JSONField(name = "Aggregate")
        String Aggregate;

        @JSONField(name = "BillingRegion")
        String BillingRegion;

        @JSONField(name = "Domain")
        String Domain;

        @JSONField(name = "EndTime")
        Long EndTime;

        @JSONField(name = "Interval")
        Long Interval;

        @JSONField(name = "IsWildcardDomain")
        Boolean IsWildcardDomain;

        @JSONField(name = "Metric")
        String Metric;

        @JSONField(name = "Project")
        String Project;

        @JSONField(name = "Protocol")
        String Protocol;

        @JSONField(name = "StartTime")
        Long StartTime;
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
        List<AccountingDataDetail> Resources;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeCdnAccessLogRequest {

        @JSONField(name = "Domain")
        String Domain;

        @JSONField(name = "EndTime")
        Long EndTime;

        @JSONField(name = "PageNum")
        Long PageNum;

        @JSONField(name = "PageSize")
        Long PageSize;

        @JSONField(name = "ServiceRegion")
        String ServiceRegion;

        @JSONField(name = "StartTime")
        Long StartTime;
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

        @JSONField(name = "DomainLogDetails")
        List<DomainLogDetail> DomainLogDetails;

        @JSONField(name = "PageNum")
        Long PageNum;

        @JSONField(name = "PageSize")
        Long PageSize;

        @JSONField(name = "TotalCount")
        Long TotalCount;
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
        DomainVolcanoDetail DomainConfig;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeCdnDataDetailRequest {

        @JSONField(name = "Domain")
        String Domain;

        @JSONField(name = "EndTime")
        Long EndTime;

        @JSONField(name = "Interval")
        String Interval;

        @JSONField(name = "IpVersion")
        String IpVersion;

        @JSONField(name = "Metric")
        String Metric;

        @JSONField(name = "Protocol")
        String Protocol;

        @JSONField(name = "StartTime")
        Long StartTime;
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

        @JSONField(name = "DataDetails")
        List<NrtDataDetails> DataDetails;

        @JSONField(name = "Name")
        String Name;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeCdnDataRequest {

        @JSONField(name = "Aggregate")
        String Aggregate;

        @JSONField(name = "Area")
        String Area;

        @JSONField(name = "BillingRegion")
        String BillingRegion;

        @JSONField(name = "DisaggregateMetrics")
        String DisaggregateMetrics;

        @JSONField(name = "Domain")
        String Domain;

        @JSONField(name = "EndTime")
        Long EndTime;

        @JSONField(name = "Interval")
        String Interval;

        @JSONField(name = "IpVersion")
        String IpVersion;

        @JSONField(name = "IsWildcardDomain")
        Boolean IsWildcardDomain;

        @JSONField(name = "Isp")
        String Isp;

        @JSONField(name = "Metric")
        String Metric;

        @JSONField(name = "Project")
        String Project;

        @JSONField(name = "Protocol")
        String Protocol;

        @JSONField(name = "Region")
        String Region;

        @JSONField(name = "StartTime")
        Long StartTime;
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
        List<NrtDataResource> Resources;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeCdnOriginDataRequest {

        @JSONField(name = "Aggregate")
        String Aggregate;

        @JSONField(name = "BillingRegion")
        String BillingRegion;

        @JSONField(name = "DisaggregateMetrics")
        String DisaggregateMetrics;

        @JSONField(name = "Domain")
        String Domain;

        @JSONField(name = "EndTime")
        Long EndTime;

        @JSONField(name = "Interval")
        String Interval;

        @JSONField(name = "IsWildcardDomain")
        Boolean IsWildcardDomain;

        @JSONField(name = "Metric")
        String Metric;

        @JSONField(name = "Project")
        String Project;

        @JSONField(name = "StartTime")
        Long StartTime;
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
        List<NrtDataResource> Resources;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeCdnRegionAndIspRequest {

        @JSONField(name = "Area")
        String Area;

        @JSONField(name = "Feature")
        String Feature;
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
        List<TopInstanceDetail> ServiceInfos;
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
    public static class DescribeCertConfigRequest {

        @JSONField(name = "CertId")
        String CertId;

        @JSONField(name = "Status")
        String Status;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeCertConfigResponse {

        @JSONField(name = "ResponseMetadata")
        ResponseMetadata ResponseMetadata;

        @JSONField(name = "Result")
        DescribeCertConfigResult Result;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeCertConfigResult {

        @JSONField(name = "CertNotConfig")
        List<DomainCertResult> CertNotConfig;

        @JSONField(name = "OtherCertConfig")
        List<DomainCertResult> OtherCertConfig;

        @JSONField(name = "SpecifiedCertConfig")
        List<DomainCertResult> SpecifiedCertConfig;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeContentBlockTasksRequest {

        @JSONField(name = "EndTime")
        Long EndTime;

        @JSONField(name = "PageNum")
        Long PageNum;

        @JSONField(name = "PageSize")
        Long PageSize;

        @JSONField(name = "StartTime")
        Long StartTime;

        @JSONField(name = "Status")
        String Status;

        @JSONField(name = "TaskID")
        String TaskID;

        @JSONField(name = "TaskType")
        String TaskType;

        @JSONField(name = "URL")
        String URL;
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

        @JSONField(name = "Data")
        List<DescribeContentBlockTasksTaskInfo> Data;

        @JSONField(name = "PageNum")
        Long PageNum;

        @JSONField(name = "PageSize")
        Long PageSize;

        @JSONField(name = "Total")
        Long Total;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeContentBlockTasksTaskInfo {

        @JSONField(name = "CreateTime")
        Long CreateTime;

        @JSONField(name = "Status")
        String Status;

        @JSONField(name = "TaskID")
        String TaskID;

        @JSONField(name = "TaskType")
        String TaskType;

        @JSONField(name = "Url")
        String Url;
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

        @JSONField(name = "PreloadLimit")
        Long PreloadLimit;

        @JSONField(name = "PreloadQuota")
        Long PreloadQuota;

        @JSONField(name = "PreloadRemain")
        Long PreloadRemain;

        @JSONField(name = "RefreshDirLimit")
        Long RefreshDirLimit;

        @JSONField(name = "RefreshDirQuota")
        Long RefreshDirQuota;

        @JSONField(name = "RefreshDirRemain")
        Long RefreshDirRemain;

        @JSONField(name = "RefreshQuota")
        Long RefreshQuota;

        @JSONField(name = "RefreshQuotaLimit")
        Long RefreshQuotaLimit;

        @JSONField(name = "RefreshRemain")
        Long RefreshRemain;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeContentTasksRequest {

        @JSONField(name = "DomainName")
        String DomainName;

        @JSONField(name = "EndTime")
        Long EndTime;

        @JSONField(name = "PageNum")
        Long PageNum;

        @JSONField(name = "PageSize")
        Long PageSize;

        @JSONField(name = "Remark")
        String Remark;

        @JSONField(name = "StartTime")
        Long StartTime;

        @JSONField(name = "Status")
        String Status;

        @JSONField(name = "TaskID")
        String TaskID;

        @JSONField(name = "TaskType")
        String TaskType;

        @JSONField(name = "Url")
        String Url;
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

        @JSONField(name = "Data")
        List<ContentTask> Data;

        @JSONField(name = "PageNum")
        Long PageNum;

        @JSONField(name = "PageSize")
        Long PageSize;

        @JSONField(name = "Total")
        Long Total;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeDistrictIspDataRequest {

        @JSONField(name = "Aggregate")
        String Aggregate;

        @JSONField(name = "Domain")
        String Domain;

        @JSONField(name = "EndTime")
        Long EndTime;

        @JSONField(name = "Interval")
        String Interval;

        @JSONField(name = "IpVersion")
        String IpVersion;

        @JSONField(name = "Metric")
        String Metric;

        @JSONField(name = "Protocol")
        String Protocol;

        @JSONField(name = "StartTime")
        Long StartTime;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeDistrictIspDataResponse {

        @JSONField(name = "ResponseMetadata")
        ResponseMetadata ResponseMetadata;

        @JSONField(name = "Result")
        DescribeDistrictIspDataResult Result;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeDistrictIspDataResult {

        @JSONField(name = "Resources")
        List<DomainNrtDetailData> Resources;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeEdgeNrtDataSummaryRequest {

        @JSONField(name = "Aggregate")
        String Aggregate;

        @JSONField(name = "Area")
        String Area;

        @JSONField(name = "BillingRegion")
        String BillingRegion;

        @JSONField(name = "DisaggregateMetrics")
        String DisaggregateMetrics;

        @JSONField(name = "Domain")
        String Domain;

        @JSONField(name = "EndTime")
        Long EndTime;

        @JSONField(name = "Interval")
        String Interval;

        @JSONField(name = "IpVersion")
        String IpVersion;

        @JSONField(name = "Isp")
        String Isp;

        @JSONField(name = "Metric")
        String Metric;

        @JSONField(name = "Project")
        String Project;

        @JSONField(name = "Protocol")
        String Protocol;

        @JSONField(name = "Region")
        String Region;

        @JSONField(name = "StartTime")
        Long StartTime;
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
        List<NrtDataSummaryResource> Resources;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeEdgeStatisticalDataRequest {

        @JSONField(name = "Area")
        String Area;

        @JSONField(name = "Domain")
        String Domain;

        @JSONField(name = "EndTime")
        Long EndTime;

        @JSONField(name = "Interval")
        String Interval;

        @JSONField(name = "IpVersion")
        String IpVersion;

        @JSONField(name = "Metric")
        String Metric;

        @JSONField(name = "Region")
        String Region;

        @JSONField(name = "StartTime")
        Long StartTime;
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
        List<EdgeStatisticalDataResource> Resources;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeEdgeTopNrtDataRequest {

        @JSONField(name = "Area")
        String Area;

        @JSONField(name = "BillingRegion")
        String BillingRegion;

        @JSONField(name = "Domain")
        String Domain;

        @JSONField(name = "EndTime")
        Long EndTime;

        @JSONField(name = "Interval")
        String Interval;

        @JSONField(name = "Item")
        String Item;

        @JSONField(name = "Metric")
        String Metric;

        @JSONField(name = "Project")
        String Project;

        @JSONField(name = "StartTime")
        Long StartTime;
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
        List<TopNrtDataDetail> TopDataDetails;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeEdgeTopStatisticalDataRequest {

        @JSONField(name = "Area")
        String Area;

        @JSONField(name = "Domain")
        String Domain;

        @JSONField(name = "EndTime")
        Long EndTime;

        @JSONField(name = "Item")
        String Item;

        @JSONField(name = "Metric")
        String Metric;

        @JSONField(name = "StartTime")
        Long StartTime;
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

        @JSONField(name = "Item")
        String Item;

        @JSONField(name = "Metric")
        String Metric;

        @JSONField(name = "Name")
        String Name;

        @JSONField(name = "TopDataDetails")
        List<EdgeTopStatisticalDataDetail> TopDataDetails;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeEdgeTopStatusCodeRequest {

        @JSONField(name = "Area")
        String Area;

        @JSONField(name = "BillingRegion")
        String BillingRegion;

        @JSONField(name = "Domain")
        String Domain;

        @JSONField(name = "EndTime")
        Long EndTime;

        @JSONField(name = "Item")
        String Item;

        @JSONField(name = "Metric")
        String Metric;

        @JSONField(name = "Project")
        String Project;

        @JSONField(name = "StartTime")
        Long StartTime;
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
        List<TopStatusCodeDetail> TopDataDetails;
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

        @JSONField(name = "CdnIp")
        Boolean CdnIp;

        @JSONField(name = "IP")
        String IP;

        @JSONField(name = "ISP")
        String ISP;

        @JSONField(name = "Location")
        String Location;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeIPListInfoRequest {

        @JSONField(name = "IpList")
        String IpList;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeIPListInfoResponse {

        @JSONField(name = "ResponseMetadata")
        ResponseMetadata ResponseMetadata;

        @JSONField(name = "Result")
        List<IPInfo> Result;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeOriginNrtDataSummaryRequest {

        @JSONField(name = "Aggregate")
        String Aggregate;

        @JSONField(name = "Area")
        String Area;

        @JSONField(name = "BillingRegion")
        String BillingRegion;

        @JSONField(name = "DisaggregateMetrics")
        String DisaggregateMetrics;

        @JSONField(name = "Domain")
        String Domain;

        @JSONField(name = "EndTime")
        Long EndTime;

        @JSONField(name = "Interval")
        String Interval;

        @JSONField(name = "IpVersion")
        String IpVersion;

        @JSONField(name = "Isp")
        String Isp;

        @JSONField(name = "Metric")
        String Metric;

        @JSONField(name = "Project")
        String Project;

        @JSONField(name = "Protocol")
        String Protocol;

        @JSONField(name = "Region")
        String Region;

        @JSONField(name = "StartTime")
        Long StartTime;
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
        List<NrtDataSummaryResource> Resources;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeOriginTopNrtDataRequest {

        @JSONField(name = "Area")
        String Area;

        @JSONField(name = "BillingRegion")
        String BillingRegion;

        @JSONField(name = "Domain")
        String Domain;

        @JSONField(name = "EndTime")
        Long EndTime;

        @JSONField(name = "Interval")
        String Interval;

        @JSONField(name = "Item")
        String Item;

        @JSONField(name = "Metric")
        String Metric;

        @JSONField(name = "Project")
        String Project;

        @JSONField(name = "StartTime")
        Long StartTime;
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
        List<TopNrtDataDetail> TopDataDetails;
    }

    @Data
    @Accessors(chain = true)
    public static class DescribeOriginTopStatusCodeRequest {

        @JSONField(name = "Area")
        String Area;

        @JSONField(name = "BillingRegion")
        String BillingRegion;

        @JSONField(name = "Domain")
        String Domain;

        @JSONField(name = "EndTime")
        Long EndTime;

        @JSONField(name = "Item")
        String Item;

        @JSONField(name = "Metric")
        String Metric;

        @JSONField(name = "Project")
        String Project;

        @JSONField(name = "StartTime")
        Long StartTime;
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
        List<TopStatusCodeDetail> TopDataDetails;
    }

    @Data
    @Accessors(chain = true)
    public static class DomainCertDeployStatus {

        @JSONField(name = "Domain")
        String Domain;

        @JSONField(name = "ErrorMsg")
        String ErrorMsg;

        @JSONField(name = "Status")
        String Status;
    }

    @Data
    @Accessors(chain = true)
    public static class DomainCertResult {

        @JSONField(name = "CerStatus")
        String CerStatus;

        @JSONField(name = "Domain")
        String Domain;

        @JSONField(name = "Status")
        String Status;
    }

    @Data
    @Accessors(chain = true)
    public static class DomainLogDetail {

        @JSONField(name = "EndTime")
        Long EndTime;

        @JSONField(name = "LogName")
        String LogName;

        @JSONField(name = "LogPath")
        String LogPath;

        @JSONField(name = "LogSize")
        Long LogSize;

        @JSONField(name = "StartTime")
        Long StartTime;
    }

    @Data
    @Accessors(chain = true)
    public static class DomainNrtDetailData {

        @JSONField(name = "DataDetails")
        List<NrtDataDetails> DataDetails;

        @JSONField(name = "Name")
        String Name;
    }

    @Data
    @Accessors(chain = true)
    public static class DomainVolcanoDetail {

        @JSONField(name = "AreaAccessRule")
        AreaAccessRule AreaAccessRule;

        @JSONField(name = "BandwidthLimit")
        BandwidthLimit BandwidthLimit;

        @JSONField(name = "Cache")
        List<CacheControlRule> Cache;

        @JSONField(name = "CacheKey")
        List<CacheKeyGenerationRule> CacheKey;

        @JSONField(name = "Cname")
        String Cname;

        @JSONField(name = "Compression")
        Compression Compression;

        @JSONField(name = "CreateTime")
        Long CreateTime;

        @JSONField(name = "CustomErrorPage")
        CustomErrorPage CustomErrorPage;

        @JSONField(name = "Domain")
        String Domain;

        @JSONField(name = "DownloadSpeedLimit")
        DownloadSpeedLimit DownloadSpeedLimit;

        @JSONField(name = "FollowRedirect")
        Boolean FollowRedirect;

        @JSONField(name = "HTTPS")
        HTTPS HTTPS;

        @JSONField(name = "HeaderLogging")
        HeaderLog HeaderLogging;

        @JSONField(name = "HttpForcedRedirect")
        HttpForcedRedirect HttpForcedRedirect;

        @JSONField(name = "IPv6")
        IPv6 IPv6;

        @JSONField(name = "IpAccessRule")
        IpAccessRule IpAccessRule;

        @JSONField(name = "IpFreqLimit")
        IpFreqLimit IpFreqLimit;

        @JSONField(name = "IpSpeedLimit")
        IpSpeedLimit IpSpeedLimit;

        @JSONField(name = "LockStatus")
        String LockStatus;

        @JSONField(name = "MethodDeniedRule")
        MethodDeniedRule MethodDeniedRule;

        @JSONField(name = "NegativeCache")
        List<NegativeCache> NegativeCache;

        @JSONField(name = "Origin")
        List<OriginRule> Origin;

        @JSONField(name = "OriginAccessRule")
        OriginAccessRule OriginAccessRule;

        @JSONField(name = "OriginArg")
        List<OriginArgRule> OriginArg;

        @JSONField(name = "OriginHost")
        String OriginHost;

        @JSONField(name = "OriginProtocol")
        String OriginProtocol;

        @JSONField(name = "OriginRange")
        Boolean OriginRange;

        @JSONField(name = "OriginSni")
        OriginSni OriginSni;

        @JSONField(name = "Project")
        String Project;

        @JSONField(name = "Quic")
        Quic Quic;

        @JSONField(name = "RedirectionRewrite")
        RedirectionRewrite RedirectionRewrite;

        @JSONField(name = "RefererAccessRule")
        RefererAccessRule RefererAccessRule;

        @JSONField(name = "RemoteAuth")
        RemoteAuth RemoteAuth;

        @JSONField(name = "RequestHeader")
        List<RequestHeaderRule> RequestHeader;

        @JSONField(name = "ResponseHeader")
        List<ResponseHeaderRule> ResponseHeader;

        @JSONField(name = "ServiceRegion")
        String ServiceRegion;

        @JSONField(name = "ServiceType")
        String ServiceType;

        @JSONField(name = "SignedUrlAuth")
        SignedUrlAuth SignedUrlAuth;

        @JSONField(name = "Sparrow")
        Sparrow Sparrow;

        @JSONField(name = "Status")
        String Status;

        @JSONField(name = "Timeout")
        TimeoutArg Timeout;

        @JSONField(name = "UaAccessRule")
        UserAgentAccessRule UaAccessRule;

        @JSONField(name = "UpdateTime")
        Long UpdateTime;

        @JSONField(name = "VideoDrag")
        VideoDrag VideoDrag;
    }

    @Data
    @Accessors(chain = true)
    public static class DownloadSpeedLimit {

        @JSONField(name = "DownloadSpeedLimitRules")
        List<DownloadSpeedLimitRule> DownloadSpeedLimitRules;

        @JSONField(name = "Switch")
        Boolean Switch;
    }

    @Data
    @Accessors(chain = true)
    public static class DownloadSpeedLimitAction {

        @JSONField(name = "SpeedLimitRate")
        Long SpeedLimitRate;

        @JSONField(name = "SpeedLimitRateAfter")
        Long SpeedLimitRateAfter;

        @JSONField(name = "SpeedLimitTime")
        SpeedLimitTime SpeedLimitTime;
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
    public static class EdgeStatisticalDataResource {

        @JSONField(name = "Metrics")
        List<AccountingData> Metrics;

        @JSONField(name = "Name")
        String Name;
    }

    @Data
    @Accessors(chain = true)
    public static class EdgeTopStatisticalDataDetail {

        @JSONField(name = "ItemKey")
        String ItemKey;

        @JSONField(name = "ItemKeyCN")
        String ItemKeyCN;

        @JSONField(name = "Value")
        Double Value;
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
    public static class ErrorPageAction {

        @JSONField(name = "Action")
        String Action;

        @JSONField(name = "RedirectCode")
        String RedirectCode;

        @JSONField(name = "RedirectUrl")
        String RedirectUrl;

        @JSONField(name = "StatusCode")
        String StatusCode;
    }

    @Data
    @Accessors(chain = true)
    public static class ErrorPageRule {

        @JSONField(name = "ErrorPageAction")
        ErrorPageAction ErrorPageAction;
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

        @JSONField(name = "CertInfo")
        CertInfo CertInfo;

        @JSONField(name = "DisableHttp")
        Boolean DisableHttp;

        @JSONField(name = "ForcedRedirect")
        ForcedRedirect ForcedRedirect;

        @JSONField(name = "HTTP2")
        Boolean HTTP2;

        @JSONField(name = "OCSP")
        Boolean OCSP;

        @JSONField(name = "Switch")
        Boolean Switch;

        @JSONField(name = "TlsVersion")
        List<String> TlsVersion;
    }

    @Data
    @Accessors(chain = true)
    public static class HeaderLog {

        @JSONField(name = "HeaderLogging")
        String HeaderLogging;

        @JSONField(name = "Switch")
        Boolean Switch;
    }

    @Data
    @Accessors(chain = true)
    public static class HttpForcedRedirect {

        @JSONField(name = "EnableForcedRedirect")
        Boolean EnableForcedRedirect;

        @JSONField(name = "StatusCode")
        String StatusCode;
    }

    @Data
    @Accessors(chain = true)
    public static class IPInfo {

        @JSONField(name = "CdnIp")
        Boolean CdnIp;

        @JSONField(name = "IP")
        String IP;

        @JSONField(name = "ISP")
        String ISP;

        @JSONField(name = "Location")
        String Location;
    }

    @Data
    @Accessors(chain = true)
    public static class IPv6 {

        @JSONField(name = "Switch")
        Boolean Switch;
    }

    @Data
    @Accessors(chain = true)
    public static class IpAccessRule {

        @JSONField(name = "Ip")
        List<String> Ip;

        @JSONField(name = "RuleType")
        String RuleType;

        @JSONField(name = "Switch")
        Boolean Switch;
    }

    @Data
    @Accessors(chain = true)
    public static class IpFreqLimit {

        @JSONField(name = "IpFreqLimitRules")
        List<IpFreqLimitRule> IpFreqLimitRules;

        @JSONField(name = "Switch")
        Boolean Switch;
    }

    @Data
    @Accessors(chain = true)
    public static class IpFreqLimitAction {

        @JSONField(name = "Action")
        String Action;

        @JSONField(name = "FreqLimitRate")
        Long FreqLimitRate;

        @JSONField(name = "StatusCode")
        String StatusCode;
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

        @JSONField(name = "IpSpeedLimitRules")
        List<IpSpeedLimitRule> IpSpeedLimitRules;

        @JSONField(name = "Switch")
        Boolean Switch;
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
    public static class ListCdnCertInfoRequest {

        @JSONField(name = "CertId")
        String CertId;

        @JSONField(name = "ConfiguredDomain")
        String ConfiguredDomain;

        @JSONField(name = "DnsName")
        String DnsName;

        @JSONField(name = "PageNum")
        Long PageNum;

        @JSONField(name = "PageSize")
        Long PageSize;

        @JSONField(name = "Source")
        String Source;

        @JSONField(name = "Status")
        String Status;
    }

    @Data
    @Accessors(chain = true)
    public static class ListCdnCertInfoResponse {

        @JSONField(name = "ResponseMetadata")
        ResponseMetadata ResponseMetadata;

        @JSONField(name = "Result")
        ListCdnCertInfoResult Result;
    }

    @Data
    @Accessors(chain = true)
    public static class ListCdnCertInfoResult {

        @JSONField(name = "CertInfo")
        List<CertInfo> CertInfo;

        @JSONField(name = "ExpiringCount")
        Long ExpiringCount;

        @JSONField(name = "PageNum")
        Long PageNum;

        @JSONField(name = "PageSize")
        Long PageSize;

        @JSONField(name = "Total")
        Long Total;
    }

    @Data
    @Accessors(chain = true)
    public static class ListCdnDomainDomain {

        @JSONField(name = "BackupOrigin")
        List<String> BackupOrigin;

        @JSONField(name = "Cname")
        String Cname;

        @JSONField(name = "CreateTime")
        Long CreateTime;

        @JSONField(name = "Domain")
        String Domain;

        @JSONField(name = "HTTPS")
        Boolean HTTPS;

        @JSONField(name = "IPv6")
        Boolean IPv6;

        @JSONField(name = "OriginProtocol")
        String OriginProtocol;

        @JSONField(name = "PrimaryOrigin")
        List<String> PrimaryOrigin;

        @JSONField(name = "ResourceTags")
        List<ResourceTag> ResourceTags;

        @JSONField(name = "ServiceRegion")
        String ServiceRegion;

        @JSONField(name = "ServiceType")
        String ServiceType;

        @JSONField(name = "Status")
        String Status;

        @JSONField(name = "UpdateTime")
        Long UpdateTime;
    }

    @Data
    @Accessors(chain = true)
    public static class ListCdnDomainsRequest {

        @JSONField(name = "Domain")
        String Domain;

        @JSONField(name = "ExactMatch")
        Boolean ExactMatch;

        @JSONField(name = "HTTPS")
        Boolean HTTPS;

        @JSONField(name = "IPv6")
        Boolean IPv6;

        @JSONField(name = "OriginProtocol")
        String OriginProtocol;

        @JSONField(name = "PageNum")
        Long PageNum;

        @JSONField(name = "PageSize")
        Long PageSize;

        @JSONField(name = "PrimaryOrigin")
        String PrimaryOrigin;

        @JSONField(name = "Project")
        String Project;

        @JSONField(name = "ResourceTags")
        List<String> ResourceTags;

        @JSONField(name = "ServiceRegion")
        String ServiceRegion;

        @JSONField(name = "ServiceType")
        String ServiceType;

        @JSONField(name = "Status")
        String Status;

        @JSONField(name = "TagConnective")
        String TagConnective;
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
        List<ListCdnDomainDomain> Data;

        @JSONField(name = "PageNum")
        Long PageNum;

        @JSONField(name = "PageSize")
        Long PageSize;

        @JSONField(name = "Total")
        Long Total;
    }

    @Data
    @Accessors(chain = true)
    public static class ListCertInfoRequest {

        @JSONField(name = "Name")
        String Name;

        @JSONField(name = "PageNum")
        Long PageNum;

        @JSONField(name = "PageSize")
        Long PageSize;

        @JSONField(name = "SetPagination")
        Boolean SetPagination;

        @JSONField(name = "Source")
        String Source;

        @JSONField(name = "Status")
        String Status;
    }

    @Data
    @Accessors(chain = true)
    public static class ListCertInfoResponse {

        @JSONField(name = "ResponseMetadata")
        ResponseMetadata ResponseMetadata;

        @JSONField(name = "Result")
        ListCertInfoResult Result;
    }

    @Data
    @Accessors(chain = true)
    public static class ListCertInfoResult {

        @JSONField(name = "CertInfo")
        List<CertInfo> CertInfo;

        @JSONField(name = "ExpiringCount")
        Long ExpiringCount;

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
        List<ResourceTag> ResourceTags;
    }

    @Data
    @Accessors(chain = true)
    public static class MethodDeniedRule {

        @JSONField(name = "Methods")
        String Methods;

        @JSONField(name = "Switch")
        Boolean Switch;
    }

    @Data
    @Accessors(chain = true)
    public static class MetricTimestampValue {

        @JSONField(name = "Metric")
        String Metric;

        @JSONField(name = "Values")
        List<TimestampValue> Values;
    }

    @Data
    @Accessors(chain = true)
    public static class MetricValue {

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
    public static class NegativeCache {

        @JSONField(name = "Condition")
        Condition Condition;

        @JSONField(name = "NegativeCacheRule")
        NegativeCacheAction NegativeCacheRule;
    }

    @Data
    @Accessors(chain = true)
    public static class NegativeCacheAction {

        @JSONField(name = "Action")
        String Action;

        @JSONField(name = "IgnoreCase")
        Boolean IgnoreCase;

        @JSONField(name = "StatusCode")
        String StatusCode;

        @JSONField(name = "Ttl")
        Long Ttl;
    }

    @Data
    @Accessors(chain = true)
    public static class NrtDataDetails {

        @JSONField(name = "Isp")
        String Isp;

        @JSONField(name = "Metrics")
        List<MetricTimestampValue> Metrics;

        @JSONField(name = "Region")
        String Region;
    }

    @Data
    @Accessors(chain = true)
    public static class NrtDataResource {

        @JSONField(name = "BillingRegion")
        String BillingRegion;

        @JSONField(name = "Metrics")
        List<MetricTimestampValue> Metrics;

        @JSONField(name = "Name")
        String Name;
    }

    @Data
    @Accessors(chain = true)
    public static class NrtDataSummaryResource {

        @JSONField(name = "BillingRegion")
        String BillingRegion;

        @JSONField(name = "Metrics")
        List<MetricValue> Metrics;

        @JSONField(name = "Name")
        String Name;
    }

    @Data
    @Accessors(chain = true)
    public static class OriginAccessRule {

        @JSONField(name = "AllowEmpty")
        Boolean AllowEmpty;

        @JSONField(name = "Origins")
        List<String> Origins;

        @JSONField(name = "RuleType")
        String RuleType;

        @JSONField(name = "Switch")
        Boolean Switch;
    }

    @Data
    @Accessors(chain = true)
    public static class OriginAction {

        @JSONField(name = "OriginLines")
        List<OriginLine> OriginLines;
    }

    @Data
    @Accessors(chain = true)
    public static class OriginArgAction {

        @JSONField(name = "OriginArgComponents")
        List<OriginArgComponents> OriginArgComponents;
    }

    @Data
    @Accessors(chain = true)
    public static class OriginArgComponents {

        @JSONField(name = "Action")
        String Action;

        @JSONField(name = "Object")
        String Object;

        @JSONField(name = "Subobject")
        String Subobject;
    }

    @Data
    @Accessors(chain = true)
    public static class OriginArgRule {

        @JSONField(name = "Condition")
        Condition Condition;

        @JSONField(name = "OriginArgAction")
        OriginArgAction OriginArgAction;
    }

    @Data
    @Accessors(chain = true)
    public static class OriginLine {

        @JSONField(name = "Address")
        String Address;

        @JSONField(name = "HttpPort")
        String HttpPort;

        @JSONField(name = "HttpsPort")
        String HttpsPort;

        @JSONField(name = "InstanceType")
        String InstanceType;

        @JSONField(name = "OriginHost")
        String OriginHost;

        @JSONField(name = "OriginType")
        String OriginType;

        @JSONField(name = "PrivateBucketAccess")
        Boolean PrivateBucketAccess;

        @JSONField(name = "PrivateBucketAuth")
        PrivateBucketAuth PrivateBucketAuth;

        @JSONField(name = "Weight")
        String Weight;
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
    public static class OriginSni {

        @JSONField(name = "SniDomain")
        String SniDomain;

        @JSONField(name = "Switch")
        Boolean Switch;
    }

    @Data
    @Accessors(chain = true)
    public static class OriginTimeoutAction {

        @JSONField(name = "HttpTimeout")
        Long HttpTimeout;

        @JSONField(name = "TcpTimeout")
        Long TcpTimeout;
    }

    @Data
    @Accessors(chain = true)
    public static class PrivateBucketAuth {

        @JSONField(name = "AuthType")
        String AuthType;

        @JSONField(name = "Switch")
        Boolean Switch;

        @JSONField(name = "TosAuthInformation")
        TosAuthInformation TosAuthInformation;
    }

    @Data
    @Accessors(chain = true)
    public static class QueryStringComponents {

        @JSONField(name = "Action")
        String Action;

        @JSONField(name = "Value")
        String Value;
    }

    @Data
    @Accessors(chain = true)
    public static class QueryStringInstance {

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
    public static class QueryStringRule {

        @JSONField(name = "QueryStringComponents")
        QueryStringComponents QueryStringComponents;

        @JSONField(name = "QueryStringInstances")
        List<QueryStringInstance> QueryStringInstances;
    }

    @Data
    @Accessors(chain = true)
    public static class Quic {

        @JSONField(name = "Switch")
        Boolean Switch;
    }

    @Data
    @Accessors(chain = true)
    public static class RedirectionAction {

        @JSONField(name = "RedirectCode")
        String RedirectCode;

        @JSONField(name = "SourcePath")
        String SourcePath;

        @JSONField(name = "TargetHost")
        String TargetHost;

        @JSONField(name = "TargetPath")
        String TargetPath;

        @JSONField(name = "TargetProtocol")
        String TargetProtocol;

        @JSONField(name = "TargetQueryComponents")
        TargetQueryComponents TargetQueryComponents;
    }

    @Data
    @Accessors(chain = true)
    public static class RedirectionRewrite {

        @JSONField(name = "RedirectionRule")
        List<RedirectionRule> RedirectionRule;

        @JSONField(name = "Switch")
        Boolean Switch;
    }

    @Data
    @Accessors(chain = true)
    public static class RedirectionRule {

        @JSONField(name = "RedirectionAction")
        RedirectionAction RedirectionAction;
    }

    @Data
    @Accessors(chain = true)
    public static class RefererAccessRule {

        @JSONField(name = "AllowEmpty")
        Boolean AllowEmpty;

        @JSONField(name = "Referers")
        List<String> Referers;

        @JSONField(name = "RuleType")
        String RuleType;

        @JSONField(name = "Switch")
        Boolean Switch;
    }

    @Data
    @Accessors(chain = true)
    public static class RemoteAuth {

        @JSONField(name = "RemoteAuthRules")
        List<RemoteAuthRule> RemoteAuthRules;

        @JSONField(name = "Switch")
        Boolean Switch;
    }

    @Data
    @Accessors(chain = true)
    public static class RemoteAuthRule {

        @JSONField(name = "Condition")
        Condition Condition;

        @JSONField(name = "RemoteAuthRuleAction")
        RemoteAuthRuleAction RemoteAuthRuleAction;
    }

    @Data
    @Accessors(chain = true)
    public static class RemoteAuthRuleAction {

        @JSONField(name = "AuthModeConfig")
        AuthModeConfig AuthModeConfig;

        @JSONField(name = "AuthResponseConfig")
        AuthResponseConfig AuthResponseConfig;

        @JSONField(name = "QueryStringRules")
        QueryStringRule QueryStringRules;

        @JSONField(name = "RequestBodyRules")
        String RequestBodyRules;

        @JSONField(name = "RequestHeaderRules")
        AuthRequestHeaderRule RequestHeaderRules;
    }

    @Data
    @Accessors(chain = true)
    public static class RequestHeaderAction {

        @JSONField(name = "RequestHeaderInstances")
        List<RequestHeaderInstance> RequestHeaderInstances;
    }

    @Data
    @Accessors(chain = true)
    public static class RequestHeaderComponent {

        @JSONField(name = "Action")
        String Action;

        @JSONField(name = "Value")
        String Value;
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
    public static class ResourceTag {

        @JSONField(name = "Key")
        String Key;

        @JSONField(name = "Value")
        String Value;
    }

    @Data
    @Accessors(chain = true)
    public static class ResponseAction {

        @JSONField(name = "StatusCode")
        String StatusCode;
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

        @JSONField(name = "AccessOriginControl")
        Boolean AccessOriginControl;

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

        @JSONField(name = "RequestId")
        String RequestId;

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
    public static class SignedUrlAuth {

        @JSONField(name = "SignedUrlAuthRules")
        List<SignedUrlAuthRule> SignedUrlAuthRules;

        @JSONField(name = "Switch")
        Boolean Switch;
    }

    @Data
    @Accessors(chain = true)
    public static class SignedUrlAuthAction {

        @JSONField(name = "BackupSecretKey")
        String BackupSecretKey;

        @JSONField(name = "CustomVariableRules")
        CustomVariableRules CustomVariableRules;

        @JSONField(name = "Duration")
        Long Duration;

        @JSONField(name = "MasterSecretKey")
        String MasterSecretKey;

        @JSONField(name = "RewriteM3u8")
        Boolean RewriteM3u8;

        @JSONField(name = "SignName")
        String SignName;

        @JSONField(name = "SignatureRule")
        List<String> SignatureRule;

        @JSONField(name = "TimeFormat")
        String TimeFormat;

        @JSONField(name = "TimeName")
        String TimeName;

        @JSONField(name = "URLAuthType")
        String URLAuthType;
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
    public static class Sparrow {

        @JSONField(name = "SparrowRules")
        List<SparrowRule> SparrowRules;

        @JSONField(name = "Switch")
        Boolean Switch;
    }

    @Data
    @Accessors(chain = true)
    public static class SparrowAction {

        @JSONField(name = "Action")
        String Action;

        @JSONField(name = "IgnoreCase")
        Boolean IgnoreCase;

        @JSONField(name = "SparrowID")
        String SparrowID;
    }

    @Data
    @Accessors(chain = true)
    public static class SparrowRule {

        @JSONField(name = "Condition")
        Condition Condition;

        @JSONField(name = "SparrowAction")
        SparrowAction SparrowAction;
    }

    @Data
    @Accessors(chain = true)
    public static class SpeedLimitTime {

        @JSONField(name = "BeginTime")
        String BeginTime;

        @JSONField(name = "DayWeek")
        String DayWeek;

        @JSONField(name = "EndTime")
        String EndTime;
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
    public static class StatusCodeAction {

        @JSONField(name = "DefaultAction")
        String DefaultAction;

        @JSONField(name = "FailCode")
        String FailCode;

        @JSONField(name = "SuccessCode")
        String SuccessCode;
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

        @JSONField(name = "ConcurrentLimit")
        Long ConcurrentLimit;

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
    public static class TargetQueryComponents {

        @JSONField(name = "Action")
        String Action;

        @JSONField(name = "Value")
        String Value;
    }

    @Data
    @Accessors(chain = true)
    public static class TimeOutAction {

        @JSONField(name = "Action")
        String Action;

        @JSONField(name = "Time")
        Long Time;
    }

    @Data
    @Accessors(chain = true)
    public static class TimeoutArg {

        @JSONField(name = "Switch")
        Boolean Switch;

        @JSONField(name = "TimeoutRules")
        List<TimeoutRule> TimeoutRules;
    }

    @Data
    @Accessors(chain = true)
    public static class TimeoutRule {

        @JSONField(name = "Condition")
        Condition Condition;

        @JSONField(name = "TimeoutAction")
        OriginTimeoutAction TimeoutAction;
    }

    @Data
    @Accessors(chain = true)
    public static class TimestampValue {

        @JSONField(name = "Timestamp")
        Long Timestamp;

        @JSONField(name = "Value")
        Double Value;
    }

    @Data
    @Accessors(chain = true)
    public static class TopInstanceDetail {

        @JSONField(name = "BillingCode")
        String BillingCode;

        @JSONField(name = "BillingCycle")
        String BillingCycle;

        @JSONField(name = "BillingData")
        String BillingData;

        @JSONField(name = "BillingDesc")
        String BillingDesc;

        @JSONField(name = "CreateTime")
        String CreateTime;

        @JSONField(name = "InstanceCategory")
        String InstanceCategory;

        @JSONField(name = "InstanceType")
        String InstanceType;

        @JSONField(name = "MetricType")
        String MetricType;

        @JSONField(name = "ServiceRegion")
        String ServiceRegion;

        @JSONField(name = "StartTime")
        String StartTime;

        @JSONField(name = "Status")
        String Status;
    }

    @Data
    @Accessors(chain = true)
    public static class TopNrtDataDetail {

        @JSONField(name = "Bandwidth")
        Double Bandwidth;

        @JSONField(name = "BandwidthPeakTime")
        Long BandwidthPeakTime;

        @JSONField(name = "Flux")
        Double Flux;

        @JSONField(name = "FluxRatio")
        Double FluxRatio;

        @JSONField(name = "ItemKey")
        String ItemKey;

        @JSONField(name = "ItemKeyCN")
        String ItemKeyCN;

        @JSONField(name = "PV")
        Double PV;

        @JSONField(name = "PVRatio")
        Double PVRatio;

        @JSONField(name = "Quic")
        Long Quic;
    }

    @Data
    @Accessors(chain = true)
    public static class TopStatusCodeDetail {

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

        @JSONField(name = "ItemKey")
        String ItemKey;
    }

    @Data
    @Accessors(chain = true)
    public static class TosAuthInformation {

        @JSONField(name = "RoleAccountId")
        String RoleAccountId;

        @JSONField(name = "RoleName")
        String RoleName;

        @JSONField(name = "RolePassAccountId")
        String RolePassAccountId;

        @JSONField(name = "RolePassName")
        String RolePassName;
    }

    @Data
    @Accessors(chain = true)
    public static class UpdateCdnConfigRequest {

        @JSONField(name = "AreaAccessRule")
        AreaAccessRule AreaAccessRule;

        @JSONField(name = "BandwidthLimit")
        BandwidthLimit BandwidthLimit;

        @JSONField(name = "Cache")
        List<CacheControlRule> Cache;

        @JSONField(name = "CacheKey")
        List<CacheKeyGenerationRule> CacheKey;

        @JSONField(name = "Compression")
        Compression Compression;

        @JSONField(name = "CustomErrorPage")
        CustomErrorPage CustomErrorPage;

        @JSONField(name = "Domain")
        String Domain;

        @JSONField(name = "DownloadSpeedLimit")
        DownloadSpeedLimit DownloadSpeedLimit;

        @JSONField(name = "FollowRedirect")
        Boolean FollowRedirect;

        @JSONField(name = "HTTPS")
        HTTPS HTTPS;

        @JSONField(name = "HeaderLogging")
        HeaderLog HeaderLogging;

        @JSONField(name = "HttpForcedRedirect")
        HttpForcedRedirect HttpForcedRedirect;

        @JSONField(name = "IPv6")
        IPv6 IPv6;

        @JSONField(name = "IpAccessRule")
        IpAccessRule IpAccessRule;

        @JSONField(name = "IpFreqLimit")
        IpFreqLimit IpFreqLimit;

        @JSONField(name = "IpSpeedLimit")
        IpSpeedLimit IpSpeedLimit;

        @JSONField(name = "MethodDeniedRule")
        MethodDeniedRule MethodDeniedRule;

        @JSONField(name = "NegativeCache")
        List<NegativeCache> NegativeCache;

        @JSONField(name = "Origin")
        List<OriginRule> Origin;

        @JSONField(name = "OriginAccessRule")
        OriginAccessRule OriginAccessRule;

        @JSONField(name = "OriginArg")
        List<OriginArgRule> OriginArg;

        @JSONField(name = "OriginHost")
        String OriginHost;

        @JSONField(name = "OriginProtocol")
        String OriginProtocol;

        @JSONField(name = "OriginRange")
        Boolean OriginRange;

        @JSONField(name = "OriginSni")
        OriginSni OriginSni;

        @JSONField(name = "Quic")
        Quic Quic;

        @JSONField(name = "RedirectionRewrite")
        RedirectionRewrite RedirectionRewrite;

        @JSONField(name = "RefererAccessRule")
        RefererAccessRule RefererAccessRule;

        @JSONField(name = "RemoteAuth")
        RemoteAuth RemoteAuth;

        @JSONField(name = "RequestHeader")
        List<RequestHeaderRule> RequestHeader;

        @JSONField(name = "ResponseHeader")
        List<ResponseHeaderRule> ResponseHeader;

        @JSONField(name = "ServiceRegion")
        String ServiceRegion;

        @JSONField(name = "ServiceType")
        String ServiceType;

        @JSONField(name = "SignedUrlAuth")
        SignedUrlAuth SignedUrlAuth;

        @JSONField(name = "Sparrow")
        Sparrow Sparrow;

        @JSONField(name = "Timeout")
        TimeoutArg Timeout;

        @JSONField(name = "UaAccessRule")
        UserAgentAccessRule UaAccessRule;

        @JSONField(name = "VideoDrag")
        VideoDrag VideoDrag;
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

        @JSONField(name = "ResourceTags")
        List<ResourceTag> ResourceTags;

        @JSONField(name = "Resources")
        List<String> Resources;
    }

    @Data
    @Accessors(chain = true)
    public static class UpdateResourceTagsResponse {

        @JSONField(name = "ResponseMetadata")
        ResponseMetadata ResponseMetadata;
    }

    @Data
    @Accessors(chain = true)
    public static class UserAgentAccessRule {

        @JSONField(name = "AllowEmpty")
        Boolean AllowEmpty;

        @JSONField(name = "RuleType")
        String RuleType;

        @JSONField(name = "Switch")
        Boolean Switch;

        @JSONField(name = "UserAgent")
        List<String> UserAgent;
    }

    @Data
    @Accessors(chain = true)
    public static class VideoDrag {

        @JSONField(name = "Switch")
        Boolean Switch;
    }
}    
    