package com.volcengine.service.imagex.v2;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.error.SdkError;
import com.volcengine.helper.Const;
import com.volcengine.helper.Utils;
import com.volcengine.model.ServiceInfo;
import com.volcengine.model.response.CommonResponse;
import com.volcengine.model.response.RawResponse;
import com.volcengine.model.response.ResponseMetadata;
import com.alibaba.fastjson.JSON;
import com.volcengine.model.imagex.v2.*;
import com.volcengine.service.BaseServiceImpl;
import lombok.Data;
import java.util.*;

/**
 * Imagex Trait
 */
public class ImagexTrait extends BaseServiceImpl {
    protected ImagexTrait() {
        super(ImagexConfig.serviceInfoMap.get(Const.REGION_CN_NORTH_1), ImagexConfig.apiInfoList);
    }

    protected ImagexTrait(ServiceInfo serviceInfo) {
        super(serviceInfo, ImagexConfig.apiInfoList);
    }

    @Data
    static public class ResponseModel {
        @JSONField(name = "ResponseMetadata")
        private ResponseMetadata responseMetadata;
    }

    private <T> T parseRawResponse(RawResponse rawResponse, Class<T> type) throws Exception {
        Exception ex = rawResponse.getException();
        if (ex != null) {
            throw ex;
        }
        byte[] data = rawResponse.getData();
        if (data == null) {
            throw new Exception("null response body got, rawResponse:" + JSON.toJSONString(rawResponse));
        }

        ResponseModel resp = JSON.parseObject(data, ResponseModel.class);
        ResponseMetadata responseMetadata = resp.getResponseMetadata();
        if (responseMetadata == null) {
            return JSON.parseObject(data, type);
        }
        ResponseMetadata.Error err = responseMetadata.getError();
        if (err != null) {
            throw new Exception(String.format("API Error: LogID:%s ErrorCode:%s(%d) %s",
                    responseMetadata.getRequestId(),
                    err.getCode(), err.getCodeN(),
                    err.getMessage()
            ));
        }

        return JSON.parseObject(data, type);
    }

    public <T>  T getImageX(String action, Map<String, String> param, Class<T> resType) throws Exception {
        RawResponse response = query(action, Utils.mapToPairList(param));
        return parseRawResponse(response,resType);
    }

    public <T>  T postImageX(String action, Map<String, String> param, Object req, Class<T> resType) throws Exception {
        RawResponse response = json(action, Utils.mapToPairList(param), JSON.toJSONString(req));
        return parseRawResponse(response,resType);
    }

  
    public CommonResponse getImageX(String action, Map<String, String> param) throws Exception {
        RawResponse response = query(action, Utils.mapToPairList(param));
        return parseRawRes(response);
    }

  
    public CommonResponse postImageX(String action, Map<String, String> param, Object req) throws Exception {
        RawResponse response = json(action, Utils.mapToPairList(param), JSON.toJSONString(req));
        return parseRawRes(response);
    }

    private CommonResponse parseRawRes(RawResponse response) throws Exception {
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        CommonResponse res = JSON.parseObject(response.getData(), CommonResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + " error: " + meta.getError().getMessage());
        }
        return res;
    }


    /**
     * <p>delDomain</p>
     * <p>删除域名</p>
     *
     * <p>本接口支持删除指定服务下的域名。</p>
     *
     * @param query query arguments
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DelDomainRes delDomain(DelDomainQuery query, DelDomainBody body) throws Exception {
        RawResponse rawResponse = json("DelDomain", Utils.paramsToPair(query), JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DelDomainRes.class);
    }

    /**
     * <p>updateRefer</p>
     * <p>更新 Referer 防盗链配置</p>
     *
     * <p>本接口支持通过其指定服务 ID 和域名更新防盗链配置。</p>
     *
     * @param query query arguments
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateReferRes updateRefer(UpdateReferQuery query, UpdateReferBody body) throws Exception {
        RawResponse rawResponse = json("UpdateRefer", Utils.paramsToPair(query), JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateReferRes.class);
    }

    /**
     * <p>updateHttps</p>
     * <p>更新 https 配置</p>
     *
     * <p>本接口支持通过指定服务 ID 和域名来更新 HTTPS 配置。</p>
     *
     * @param query query arguments
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateHttpsRes updateHttps(UpdateHttpsQuery query, UpdateHttpsBody body) throws Exception {
        RawResponse rawResponse = json("UpdateHttps", Utils.paramsToPair(query), JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateHttpsRes.class);
    }

    /**
     * <p>updateResponseHeader</p>
     * <p>更新响应头配置</p>
     *
     * <p>支持通过指定服务 ID 等参数修改响应头配置。</p>
     *
     * @param query query arguments
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateResponseHeaderRes updateResponseHeader(UpdateResponseHeaderQuery query, UpdateResponseHeaderBody body) throws Exception {
        RawResponse rawResponse = json("UpdateResponseHeader", Utils.paramsToPair(query), JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateResponseHeaderRes.class);
    }

    /**
     * <p>setDefaultDomain</p>
     * <p>更新默认域名配置</p>
     *
     * <p>本接口支持更改默认域名。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public SetDefaultDomainRes setDefaultDomain(SetDefaultDomainBody body) throws Exception {
        RawResponse rawResponse = json("SetDefaultDomain", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, SetDefaultDomainRes.class);
    }

    /**
     * <p>describeImageVolcCdnAccessLog</p>
     * <p>查询离线日志下载地址</p>
     *
     * <p>本接口支持通过指定服务 ID 、域名和地域等获取查询离线日志下载链接。您可通过下载链接获取离线日志，日志字段说明请参考[日志字段说明与示例](https://www.volcengine.com/docs/508/184315</p>
     *
     * @param query query arguments
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeImageVolcCdnAccessLogRes describeImageVolcCdnAccessLog(DescribeImageVolcCdnAccessLogQuery query, DescribeImageVolcCdnAccessLogBody body) throws Exception {
        RawResponse rawResponse = json("DescribeImageVolcCdnAccessLog", Utils.paramsToPair(query), JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeImageVolcCdnAccessLogRes.class);
    }

    /**
     * <p>getResponseHeaderValidateKeys</p>
     * <p>获取响应头允许的key列表</p>
     *
     * <p>本接口支持获取当前账号全部合法的响应头 key 信息。</p>
     *
     * @return response data
     * @throws Exception error during request
     */
    public GetResponseHeaderValidateKeysRes getResponseHeaderValidateKeys() throws Exception {
        RawResponse rawResponse = json("GetResponseHeaderValidateKeys", null, "");
        return parseRawResponse(rawResponse, GetResponseHeaderValidateKeysRes.class);
    }

    /**
     * <p>getDomainConfig</p>
     * <p>获取域名配置</p>
     *
     * <p>通过指定服务 ID 以及域名，获取当前域名的配置信息。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public GetDomainConfigRes getDomainConfig(GetDomainConfigQuery query) throws Exception {
        RawResponse rawResponse = json("GetDomainConfig", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, GetDomainConfigRes.class);
    }

    /**
     * <p>getServiceDomains</p>
     * <p>获取服务下全部域名</p>
     *
     * <p>本接口支持通过指定服务 ID 获取服务下所有域名信息。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public GetServiceDomainsRes getServiceDomains(GetServiceDomainsQuery query) throws Exception {
        RawResponse rawResponse = json("GetServiceDomains", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, GetServiceDomainsRes.class);
    }

    /**
     * <p>createImageMigrateTask</p>
     * <p>创建数据迁移任务</p>
     *
     * <p>本接口支持您通过自定义迁移源信息和具体迁移策略等配置，创建从源存储至 veImageX 的数据迁移任务。</p>
     *
     *
     *
     * <p>## 迁移准备</p>
     *
     *
     *
     * <p>已支持迁移数据源与迁移准备内容如下表所示。</p>
     *
     * <p>| 源服务商 | 准备内容 | 文档地址 |</p>
     *
     * <p>| --- | --- | --- |</p>
     *
     * <p>| 阿里云OSS | Access Key、Secret Key、Bucket | [迁移准备](https://www.volcengine.com/docs/508/129214) |</p>
     *
     * <p>| 腾讯云COS | Access Key、Secret Key、Bucket、Region | [迁移准备](https://www.volcengine.com/docs/508/129215) |</p>
     *
     * <p>| 七牛云Kodo | Access Key、Secret Key、Bucket | [迁移准备](https://www.volcengine.com/docs/508/129216) |</p>
     *
     * <p>| 百度云BOS | Access Key、Secret Key、Bucket、Region | [迁移准备](https://www.volcengine.com/docs/508/129219) |</p>
     *
     * <p>| 华为云OBS | Access Key、Secret Key、Bucket、Region | [迁移准备](https://www.volcengine.com/docs/508/129220) |</p>
     *
     * <p>| 优刻得（Ucloud File） | Access Key、Secret Key、Bucket、Region | [迁移准备](https://www.volcengine.com/docs/508/129217) |</p>
     *
     * <p>| AWS国际站 | Access Key、Secret Key、Bucket | [迁移准备](https://www.volcengine.com/docs/508/129218) |</p>
     *
     * <p>| 其他 S3 协议存储 | Access Key、Secret Key、Bucket、Region、Endpoint | 请根据实际源站获取 |</p>
     *
     * <p>| URL | 迁移 URL 列表文件（.txt）的公网访问地址 | [URL 列表迁移说明](https://www.volcengine.com/docs/508/1263268) |</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public CreateImageMigrateTaskRes createImageMigrateTask(CreateImageMigrateTaskBody body) throws Exception {
        RawResponse rawResponse = json("CreateImageMigrateTask", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, CreateImageMigrateTaskRes.class);
    }

    /**
     * <p>deleteImageMigrateTask</p>
     * <p>删除迁移任务</p>
     *
     * <p>本接口支持您通过指定任务 ID 来删除该迁移任务，仅对状态是非**运行中**外的任务生效。</p>
     *
     * <p>:::tip</p>
     *
     * <p>仅当状态非`Running`时，该删除操作有效。您可调用[GetImageMigrateTasks](https://www.volcengine.com/docs/508/1108670) 查看待结束任务的状态。</p>
     *
     * <p>:::</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public DeleteImageMigrateTaskRes deleteImageMigrateTask(DeleteImageMigrateTaskQuery query) throws Exception {
        RawResponse rawResponse = json("DeleteImageMigrateTask", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, DeleteImageMigrateTaskRes.class);
    }

    /**
     * <p>exportFailedMigrateTask</p>
     * <p>导出迁移失败列表</p>
     *
     * <p>本接口支持您通过指定迁移失败的任务 ID 来导出文件地址和迁移失败错误信息。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public ExportFailedMigrateTaskRes exportFailedMigrateTask(ExportFailedMigrateTaskQuery query) throws Exception {
        RawResponse rawResponse = json("ExportFailedMigrateTask", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, ExportFailedMigrateTaskRes.class);
    }

    /**
     * <p>updateImageTaskStrategy</p>
     * <p>更新迁移任务策略</p>
     *
     * <p>本接口支持通过指定任务 ID 来更新该任务的迁移策略。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateImageTaskStrategyRes updateImageTaskStrategy(UpdateImageTaskStrategyBody body) throws Exception {
        RawResponse rawResponse = json("UpdateImageTaskStrategy", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateImageTaskStrategyRes.class);
    }

    /**
     * <p>terminateImageMigrateTask</p>
     * <p>结束迁移任务</p>
     *
     * <p>通过指定任务 ID 来结束该迁移任务。结束迁移任务将停止后续的迁移文件，已完成的迁移文件不被删除。</p>
     *
     * <p>:::tip</p>
     *
     * <p>仅当状态为`Initial`和`Running`时，该结束操作有效。您可调用[GetImageMigrateTasks](https://www.volcengine.com/docs/508/1108670) 查看待结束任务的状态。</p>
     *
     * <p>:::</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public TerminateImageMigrateTaskRes terminateImageMigrateTask(TerminateImageMigrateTaskQuery query) throws Exception {
        RawResponse rawResponse = json("TerminateImageMigrateTask", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, TerminateImageMigrateTaskRes.class);
    }

    /**
     * <p>getVendorBuckets</p>
     * <p>获取服务商 Bucket</p>
     *
     * <p>本接口支持通过指定云服务商和访问密钥获取迁移源 Bucket 详情。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public GetVendorBucketsRes getVendorBuckets(GetVendorBucketsBody body) throws Exception {
        RawResponse rawResponse = json("GetVendorBuckets", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, GetVendorBucketsRes.class);
    }

    /**
     * <p>getImageMigrateTasks</p>
     * <p>获取迁移任务详情</p>
     *
     * <p>本接口支持分页获取当前账号下的迁移任务及其迁移详情。 </p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public GetImageMigrateTasksRes getImageMigrateTasks(GetImageMigrateTasksQuery query) throws Exception {
        RawResponse rawResponse = json("GetImageMigrateTasks", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, GetImageMigrateTasksRes.class);
    }

    /**
     * <p>rerunImageMigrateTask</p>
     * <p>重启迁移失败任务</p>
     *
     * <p>本接口支持您通过指定任务 ID 来重新启动该迁移任务（原任务基础上重试失败列表），仅对状态为部分迁移完成的任务生效。</p>
     *
     * <p>:::tip</p>
     *
     * <p>仅当状态为`Partial`时，该重启操作有效。您可调用[GetImageMigrateTasks](https://www.volcengine.com/docs/508/1108670) 查看待结束任务的状态。</p>
     *
     * <p>:::</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public RerunImageMigrateTaskRes rerunImageMigrateTask(RerunImageMigrateTaskQuery query) throws Exception {
        RawResponse rawResponse = json("RerunImageMigrateTask", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, RerunImageMigrateTaskRes.class);
    }

    /**
     * <p>describeImageXSourceRequestBandwidth</p>
     * <p>查询回源带宽用量</p>
     *
     * <p>本接口支持通过自定义查询时间段，查询该时间段的回源带宽用量。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public DescribeImageXSourceRequestBandwidthRes describeImageXSourceRequestBandwidth(DescribeImageXSourceRequestBandwidthQuery query) throws Exception {
        RawResponse rawResponse = json("DescribeImageXSourceRequestBandwidth", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, DescribeImageXSourceRequestBandwidthRes.class);
    }

    /**
     * <p>describeImageXSourceRequestTraffic</p>
     * <p>查询回源流量用量</p>
     *
     * <p>本接口支持通过自定义查询时间段，查询该时间段的回源流量用量。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public DescribeImageXSourceRequestTrafficRes describeImageXSourceRequestTraffic(DescribeImageXSourceRequestTrafficQuery query) throws Exception {
        RawResponse rawResponse = json("DescribeImageXSourceRequestTraffic", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, DescribeImageXSourceRequestTrafficRes.class);
    }

    /**
     * <p>describeImageXSourceRequest</p>
     * <p>查询回源请求次</p>
     *
     * <p>本接口支持通过自定义查询时间段，查询该时间段的回源请求次数。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public DescribeImageXSourceRequestRes describeImageXSourceRequest(DescribeImageXSourceRequestQuery query) throws Exception {
        RawResponse rawResponse = json("DescribeImageXSourceRequest", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, DescribeImageXSourceRequestRes.class);
    }

    /**
     * <p>describeImageXBucketRetrievalUsage</p>
     * <p>查询资源占用量</p>
     *
     * <p>本接口支持通过自定义查询时间段，查询该时间段的每天资源占用量。</p>
     *
     * <p>:::tip</p>
     *
     * <p>单次查询最大时间跨度为 93 天。</p>
     *
     * <p>:::</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public DescribeImageXBucketRetrievalUsageRes describeImageXBucketRetrievalUsage(DescribeImageXBucketRetrievalUsageQuery query) throws Exception {
        RawResponse rawResponse = json("DescribeImageXBucketRetrievalUsage", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, DescribeImageXBucketRetrievalUsageRes.class);
    }

    /**
     * <p>describeImageXSummary</p>
     * <p>查询用量概览</p>
     *
     * <p>本接口支持通过指定时间点以及服务 ID，查询本月用量概览，包括带宽、流量、存储、请求次数、基础图像处理。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public DescribeImageXSummaryRes describeImageXSummary(DescribeImageXSummaryQuery query) throws Exception {
        RawResponse rawResponse = json("DescribeImageXSummary", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, DescribeImageXSummaryRes.class);
    }

    /**
     * <p>describeImageXDomainTrafficData</p>
     * <p>查询流量用量</p>
     *
     * <p>本接口支持通过自定义时间段，来查询域名流量用量。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public DescribeImageXDomainTrafficDataRes describeImageXDomainTrafficData(DescribeImageXDomainTrafficDataQuery query) throws Exception {
        RawResponse rawResponse = json("DescribeImageXDomainTrafficData", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, DescribeImageXDomainTrafficDataRes.class);
    }

    /**
     * <p>describeImageXDomainBandwidthData</p>
     * <p>查询带宽用量</p>
     *
     * <p>本接口支持通过自定义时间段，查询域名带宽用量。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public DescribeImageXDomainBandwidthDataRes describeImageXDomainBandwidthData(DescribeImageXDomainBandwidthDataQuery query) throws Exception {
        RawResponse rawResponse = json("DescribeImageXDomainBandwidthData", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, DescribeImageXDomainBandwidthDataRes.class);
    }

    /**
     * <p>describeImageXDomainBandwidthNinetyFiveData</p>
     * <p>查询带宽95值</p>
     *
     * <p>本接口支持通过自定义时间段，查询域名的 95 峰值带宽用量。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public DescribeImageXDomainBandwidthNinetyFiveDataRes describeImageXDomainBandwidthNinetyFiveData(DescribeImageXDomainBandwidthNinetyFiveDataQuery query) throws Exception {
        RawResponse rawResponse = json("DescribeImageXDomainBandwidthNinetyFiveData", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, DescribeImageXDomainBandwidthNinetyFiveDataRes.class);
    }

    /**
     * <p>describeImageXBucketUsage</p>
     * <p>查询资源占用量</p>
     *
     * <p>本接口支持通过自定义查询时间段，查询该时间段的每天资源占用量。</p>
     *
     * <p>:::tip</p>
     *
     * <p>单次查询最大时间跨度为 93 天。</p>
     *
     * <p>:::</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public DescribeImageXBucketUsageRes describeImageXBucketUsage(DescribeImageXBucketUsageQuery query) throws Exception {
        RawResponse rawResponse = json("DescribeImageXBucketUsage", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, DescribeImageXBucketUsageRes.class);
    }

    /**
     * <p>describeImageXBillingRequestCntUsage</p>
     * <p>获取附加组件通用请求次数</p>
     *
     * <p>本接口支持通过自定义查询时间段，获取该时间段的附加组件通用请求次数。</p>
     *
     *
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public DescribeImageXBillingRequestCntUsageRes describeImageXBillingRequestCntUsage(DescribeImageXBillingRequestCntUsageQuery query) throws Exception {
        RawResponse rawResponse = json("DescribeImageXBillingRequestCntUsage", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, DescribeImageXBillingRequestCntUsageRes.class);
    }

    /**
     * <p>describeImageXRequestCntUsage</p>
     * <p>查询请求次数</p>
     *
     * <p>本接口支持通过自定义查询时间段，查询该时间段的请求次数。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public DescribeImageXRequestCntUsageRes describeImageXRequestCntUsage(DescribeImageXRequestCntUsageQuery query) throws Exception {
        RawResponse rawResponse = json("DescribeImageXRequestCntUsage", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, DescribeImageXRequestCntUsageRes.class);
    }

    /**
     * <p>describeImageXBaseOpUsage</p>
     * <p>查询基础处理量</p>
     *
     * <p>本接口支持通过自定义时间段，查询该时间段的图像基础处理量。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public DescribeImageXBaseOpUsageRes describeImageXBaseOpUsage(DescribeImageXBaseOpUsageQuery query) throws Exception {
        RawResponse rawResponse = json("DescribeImageXBaseOpUsage", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, DescribeImageXBaseOpUsageRes.class);
    }

    /**
     * <p>describeImageXCompressUsage</p>
     * <p>查询高效压缩量</p>
     *
     * <p>本接口支持通过自定义查询时间段，查询该时间段的图像高效压缩量。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public DescribeImageXCompressUsageRes describeImageXCompressUsage(DescribeImageXCompressUsageQuery query) throws Exception {
        RawResponse rawResponse = json("DescribeImageXCompressUsage", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, DescribeImageXCompressUsageRes.class);
    }

    /**
     * <p>describeImageXScreenshotUsage</p>
     * <p>查询截帧用量</p>
     *
     * <p>本接口支持通过自定义查询时间段，查询该时间段的截帧用量。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public DescribeImageXScreenshotUsageRes describeImageXScreenshotUsage(DescribeImageXScreenshotUsageQuery query) throws Exception {
        RawResponse rawResponse = json("DescribeImageXScreenshotUsage", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, DescribeImageXScreenshotUsageRes.class);
    }

    /**
     * <p>describeImageXVideoClipDurationUsage</p>
     * <p>查询小视频转动图用量</p>
     *
     * <p>本接口支持通过自定义查询时间段，查询该时间段的小视频转动图的视频转换时长用量。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public DescribeImageXVideoClipDurationUsageRes describeImageXVideoClipDurationUsage(DescribeImageXVideoClipDurationUsageQuery query) throws Exception {
        RawResponse rawResponse = json("DescribeImageXVideoClipDurationUsage", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, DescribeImageXVideoClipDurationUsageRes.class);
    }

    /**
     * <p>describeImageXMultiCompressUsage</p>
     * <p>查询多文件压缩用量</p>
     *
     * <p>本接口支持通过自定义查询时间段，查询该时间段的多文件压缩用量。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public DescribeImageXMultiCompressUsageRes describeImageXMultiCompressUsage(DescribeImageXMultiCompressUsageQuery query) throws Exception {
        RawResponse rawResponse = json("DescribeImageXMultiCompressUsage", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, DescribeImageXMultiCompressUsageRes.class);
    }

    /**
     * <p>describeImageXEdgeRequest</p>
     * <p>查询边缘分发请求次</p>
     *
     * <p>本接口支持通过自定义查询时间段，查询该时间段的边缘请求次数。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public DescribeImageXEdgeRequestRes describeImageXEdgeRequest(DescribeImageXEdgeRequestQuery query) throws Exception {
        RawResponse rawResponse = json("DescribeImageXEdgeRequest", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, DescribeImageXEdgeRequestRes.class);
    }

    /**
     * <p>describeImageXEdgeRequestBandwidth</p>
     * <p>查询边缘分发带宽用量</p>
     *
     * <p>本接口支持通过自定义查询时间段，查询该时间段的边缘分发带宽用量。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public DescribeImageXEdgeRequestBandwidthRes describeImageXEdgeRequestBandwidth(DescribeImageXEdgeRequestBandwidthQuery query) throws Exception {
        RawResponse rawResponse = json("DescribeImageXEdgeRequestBandwidth", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, DescribeImageXEdgeRequestBandwidthRes.class);
    }

    /**
     * <p>describeImageXEdgeRequestTraffic</p>
     * <p>查询边缘分发流量用量</p>
     *
     * <p>本接口支持通过自定义查询时间段，查询该时间段的边缘分发流量用量。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public DescribeImageXEdgeRequestTrafficRes describeImageXEdgeRequestTraffic(DescribeImageXEdgeRequestTrafficQuery query) throws Exception {
        RawResponse rawResponse = json("DescribeImageXEdgeRequestTraffic", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, DescribeImageXEdgeRequestTrafficRes.class);
    }

    /**
     * <p>describeImageXEdgeRequestRegions</p>
     * <p>获取边缘分发地区列表</p>
     *
     * <p>本接口支持通过自定义查询时间段，查询该时间段的边缘分发数据的地区列表。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public DescribeImageXEdgeRequestRegionsRes describeImageXEdgeRequestRegions(DescribeImageXEdgeRequestRegionsQuery query) throws Exception {
        RawResponse rawResponse = json("DescribeImageXEdgeRequestRegions", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, DescribeImageXEdgeRequestRegionsRes.class);
    }

    /**
     * <p>describeImageXMirrorRequestHttpCodeByTime</p>
     * <p>查询镜像回源请求次</p>
     *
     * <p>本接口支持通过自定义查询时间段，查询该时间段的镜像回源请求次。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeImageXMirrorRequestHttpCodeByTimeRes describeImageXMirrorRequestHttpCodeByTime(DescribeImageXMirrorRequestHttpCodeByTimeBody body) throws Exception {
        RawResponse rawResponse = json("DescribeImageXMirrorRequestHttpCodeByTime", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeImageXMirrorRequestHttpCodeByTimeRes.class);
    }

    /**
     * <p>describeImageXMirrorRequestHttpCodeOverview</p>
     * <p>查询镜像回源请求次域名明细数据</p>
     *
     * <p>本接口支持通过自定义查询时间段，查询该时间段的镜像回源请求次的域名明细数据用量。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeImageXMirrorRequestHttpCodeOverviewRes describeImageXMirrorRequestHttpCodeOverview(DescribeImageXMirrorRequestHttpCodeOverviewBody body) throws Exception {
        RawResponse rawResponse = json("DescribeImageXMirrorRequestHttpCodeOverview", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeImageXMirrorRequestHttpCodeOverviewRes.class);
    }

    /**
     * <p>describeImageXMirrorRequestTraffic</p>
     * <p>查询镜像回源流量</p>
     *
     * <p>本接口支持通过自定义查询时间段，查询该时间段的镜像回源流量用量数据。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeImageXMirrorRequestTrafficRes describeImageXMirrorRequestTraffic(DescribeImageXMirrorRequestTrafficBody body) throws Exception {
        RawResponse rawResponse = json("DescribeImageXMirrorRequestTraffic", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeImageXMirrorRequestTrafficRes.class);
    }

    /**
     * <p>describeImageXMirrorRequestBandwidth</p>
     * <p>查询镜像回源带宽</p>
     *
     * <p>本接口支持通过自定义查询时间段，查询该时间段的镜像回源带宽用量数据。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeImageXMirrorRequestBandwidthRes describeImageXMirrorRequestBandwidth(DescribeImageXMirrorRequestBandwidthBody body) throws Exception {
        RawResponse rawResponse = json("DescribeImageXMirrorRequestBandwidth", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeImageXMirrorRequestBandwidthRes.class);
    }

    /**
     * <p>describeImageXServerQPSUsage</p>
     * <p>查询数据处理服务QPS</p>
     *
     * <p>本接口支持通过自定义查询时间段，查询该时间段的数据处理服务QPS。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public DescribeImageXServerQPSUsageRes describeImageXServerQPSUsage(DescribeImageXServerQPSUsageQuery query) throws Exception {
        RawResponse rawResponse = json("DescribeImageXServerQPSUsage", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, DescribeImageXServerQPSUsageRes.class);
    }

    /**
     * <p>describeImageXHitRateTrafficData</p>
     * <p>查询流量命中率</p>
     *
     * <p>本接口支持通过自定义查询时间段，查询该时间段的域名的 CDN 流量命中率用量数据。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public DescribeImageXHitRateTrafficDataRes describeImageXHitRateTrafficData(DescribeImageXHitRateTrafficDataQuery query) throws Exception {
        RawResponse rawResponse = json("DescribeImageXHitRateTrafficData", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, DescribeImageXHitRateTrafficDataRes.class);
    }

    /**
     * <p>describeImageXHitRateRequestData</p>
     * <p>查询请求命中率</p>
     *
     * <p>本接口支持通过自定义查询时间段，查询该时间段的域名的 CDN 请求次数命中率用量数据。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public DescribeImageXHitRateRequestDataRes describeImageXHitRateRequestData(DescribeImageXHitRateRequestDataQuery query) throws Exception {
        RawResponse rawResponse = json("DescribeImageXHitRateRequestData", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, DescribeImageXHitRateRequestDataRes.class);
    }

    /**
     * <p>describeImageXCDNTopRequestData</p>
     * <p>获取数据统计分析结果</p>
     *
     * <p>本接口支持获取按照流量/请求次数排序的数据列表，即按流量或请求次数由大到小排序后，访问量最靠前的域名/URL/Refer/客户端IP/UA/访问区域/运营商等数据。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>- URL/Refer/客户端IP/UA 最多支持展示 Top 1000 的数据。</p>
     *
     * <p>- 访问区域/运营商可展示展示全量数据。</p>
     *
     * <p>:::</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public DescribeImageXCDNTopRequestDataRes describeImageXCDNTopRequestData(DescribeImageXCDNTopRequestDataQuery query) throws Exception {
        RawResponse rawResponse = json("DescribeImageXCDNTopRequestData", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, DescribeImageXCDNTopRequestDataRes.class);
    }

    /**
     * <p>describeImageXExceedResolutionRatioAll</p>
     * <p>查询大图分辨率占比分布</p>
     *
     * <p>本接口支持通过指定查询维度，来获取大图分辨率占比分布数据。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>单次查询的时间跨度不能超过 **90** 天。</p>
     *
     * <p>:::</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeImageXExceedResolutionRatioAllRes describeImageXExceedResolutionRatioAll(DescribeImageXExceedResolutionRatioAllBody body) throws Exception {
        RawResponse rawResponse = json("DescribeImageXExceedResolutionRatioAll", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeImageXExceedResolutionRatioAllRes.class);
    }

    /**
     * <p>describeImageXExceedFileSize</p>
     * <p>查询大图文件体积大小分布</p>
     *
     * <p>本接口支持通过指定查询维度，来获取大图文件体积大小分布数据。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>单次查询的时间跨度不能超过 **90** 天。</p>
     *
     * <p>:::</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeImageXExceedFileSizeRes describeImageXExceedFileSize(DescribeImageXExceedFileSizeBody body) throws Exception {
        RawResponse rawResponse = json("DescribeImageXExceedFileSize", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeImageXExceedFileSizeRes.class);
    }

    /**
     * <p>describeImageXExceedCountByTime</p>
     * <p>查询大图样本量</p>
     *
     * <p>本接口支持查询大图样本量数据。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>单次查询的时间跨度不能超过 **90** 天。</p>
     *
     * <p>:::</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeImageXExceedCountByTimeRes describeImageXExceedCountByTime(DescribeImageXExceedCountByTimeBody body) throws Exception {
        RawResponse rawResponse = json("DescribeImageXExceedCountByTime", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeImageXExceedCountByTimeRes.class);
    }

    /**
     * <p>describeImageXServiceQuality</p>
     * <p>服务质量概览</p>
     *
     * <p>本接口支持通过指定服务地区，从而获取当前账号下的服务数据。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public DescribeImageXServiceQualityRes describeImageXServiceQuality(DescribeImageXServiceQualityQuery query) throws Exception {
        RawResponse rawResponse = json("DescribeImageXServiceQuality", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, DescribeImageXServiceQualityRes.class);
    }

    /**
     * <p>getImageXQueryApps</p>
     * <p>查询应用列表</p>
     *
     * <p>本接口支持指定应用数据传入来源，查询账号下当前来源的应用信息。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public GetImageXQueryAppsRes getImageXQueryApps(GetImageXQueryAppsQuery query) throws Exception {
        RawResponse rawResponse = json("GetImageXQueryApps", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, GetImageXQueryAppsRes.class);
    }

    /**
     * <p>getImageXQueryRegions</p>
     * <p>查询地区列表</p>
     *
     * <p>本接口支持通过指定数据来源，查询当前数据查询的的具体国内省份和海外国家。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public GetImageXQueryRegionsRes getImageXQueryRegions(GetImageXQueryRegionsQuery query) throws Exception {
        RawResponse rawResponse = json("GetImageXQueryRegions", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, GetImageXQueryRegionsRes.class);
    }

    /**
     * <p>getImageXQueryDims</p>
     * <p>查询自定义维度列表</p>
     *
     * <p>本接口支持通过指定数据来源，查询上传数据中的维度信息。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public GetImageXQueryDimsRes getImageXQueryDims(GetImageXQueryDimsQuery query) throws Exception {
        RawResponse rawResponse = json("GetImageXQueryDims", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, GetImageXQueryDimsRes.class);
    }

    /**
     * <p>getImageXQueryVals</p>
     * <p>查询自定义维度值</p>
     *
     * <p>本接口支持通过自定义查询维度以及指定数据来源，查询按降序排列的上报数据中出现的维度值信息。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public GetImageXQueryValsRes getImageXQueryVals(GetImageXQueryValsQuery query) throws Exception {
        RawResponse rawResponse = json("GetImageXQueryVals", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, GetImageXQueryValsRes.class);
    }

    /**
     * <p>describeImageXUploadCountByTime</p>
     * <p>查询上传有效次数</p>
     *
     * <p>本接口支持通过指定查询维度，来获取上传数据中的有效上传次数数据，包含有效次数和数据对应时间点。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeImageXUploadCountByTimeRes describeImageXUploadCountByTime(DescribeImageXUploadCountByTimeBody body) throws Exception {
        RawResponse rawResponse = json("DescribeImageXUploadCountByTime", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeImageXUploadCountByTimeRes.class);
    }

    /**
     * <p>describeImageXUploadDuration</p>
     * <p>查询上传平均耗时</p>
     *
     * <p>本接口支持通过指定查询维度，来获取上传数据中的上传平均耗时数据等。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>单次查询的时间跨度不能超过 **90** 天。</p>
     *
     * <p>:::</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeImageXUploadDurationRes describeImageXUploadDuration(DescribeImageXUploadDurationBody body) throws Exception {
        RawResponse rawResponse = json("DescribeImageXUploadDuration", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeImageXUploadDurationRes.class);
    }

    /**
     * <p>describeImageXUploadSuccessRateByTime</p>
     * <p>查询上传成功率</p>
     *
     * <p>本接口支持通过指定查询维度，查询上传成功率及数据对应时间点。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>单次查询的时间跨度不能超过 **90** 天。</p>
     *
     * <p>:::</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeImageXUploadSuccessRateByTimeRes describeImageXUploadSuccessRateByTime(DescribeImageXUploadSuccessRateByTimeBody body) throws Exception {
        RawResponse rawResponse = json("DescribeImageXUploadSuccessRateByTime", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeImageXUploadSuccessRateByTimeRes.class);
    }

    /**
     * <p>describeImageXUploadFileSize</p>
     * <p>查询上传文件大小分布</p>
     *
     * <p>本接口支持通过指定查询维度，来获取上传数据中的上传文件大小数据。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>单次查询的时间跨度不能超过 **90** 天。</p>
     *
     * <p>:::</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeImageXUploadFileSizeRes describeImageXUploadFileSize(DescribeImageXUploadFileSizeBody body) throws Exception {
        RawResponse rawResponse = json("DescribeImageXUploadFileSize", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeImageXUploadFileSizeRes.class);
    }

    /**
     * <p>describeImageXUploadErrorCodeByTime</p>
     * <p>查询错误码时序数据</p>
     *
     * <p>本接口支持通过指定查询维度，来获取上传数据中的错误码信息以及时序数据等。</p>
     *
     * <p>:::tip</p>
     *
     * <p>单次查询的时间跨度不能超过 **90** 天。</p>
     *
     * <p>:::</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeImageXUploadErrorCodeByTimeRes describeImageXUploadErrorCodeByTime(DescribeImageXUploadErrorCodeByTimeBody body) throws Exception {
        RawResponse rawResponse = json("DescribeImageXUploadErrorCodeByTime", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeImageXUploadErrorCodeByTimeRes.class);
    }

    /**
     * <p>describeImageXUploadErrorCodeAll</p>
     * <p>查询错误码分布</p>
     *
     * <p>本接口支持通过指定查询维度，查询错误码详细数据，如：错误码内容、错误码数量和地域信息等。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>单次查询的时间跨度不能超过 **90** 天。</p>
     *
     * <p>:::</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeImageXUploadErrorCodeAllRes describeImageXUploadErrorCodeAll(DescribeImageXUploadErrorCodeAllBody body) throws Exception {
        RawResponse rawResponse = json("DescribeImageXUploadErrorCodeAll", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeImageXUploadErrorCodeAllRes.class);
    }

    /**
     * <p>describeImageXUploadSpeed</p>
     * <p>查询上传平均速度</p>
     *
     * <p>本接口支持通过指定查询维度，来获取上传数据中的上传平均速度数据。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>单次查询的时间跨度不能超过 **90** 天。</p>
     *
     * <p>:::</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeImageXUploadSpeedRes describeImageXUploadSpeed(DescribeImageXUploadSpeedBody body) throws Exception {
        RawResponse rawResponse = json("DescribeImageXUploadSpeed", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeImageXUploadSpeedRes.class);
    }

    /**
     * <p>describeImageXUploadSegmentSpeedByTime</p>
     * <p>查询上传分片速度</p>
     *
     * <p>本接口支持通过指定查询时间段和时间粒度获取 2.0 模式下的上传分片速度。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>单次查询的时间跨度不能超过 **90** 天。</p>
     *
     * <p>:::</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeImageXUploadSegmentSpeedByTimeRes describeImageXUploadSegmentSpeedByTime(DescribeImageXUploadSegmentSpeedByTimeBody body) throws Exception {
        RawResponse rawResponse = json("DescribeImageXUploadSegmentSpeedByTime", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeImageXUploadSegmentSpeedByTimeRes.class);
    }

    /**
     * <p>describeImageXCdnSuccessRateByTime</p>
     * <p>查询网络成功率时序数据</p>
     *
     * <p>本接口支持通过指定查询维度，来获取下行网络监控的网络成功率时序数据。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>单次查询的时间跨度不能超过 **90** 天。</p>
     *
     * <p>:::</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeImageXCdnSuccessRateByTimeRes describeImageXCdnSuccessRateByTime(DescribeImageXCdnSuccessRateByTimeBody body) throws Exception {
        RawResponse rawResponse = json("DescribeImageXCdnSuccessRateByTime", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeImageXCdnSuccessRateByTimeRes.class);
    }

    /**
     * <p>describeImageXCdnSuccessRateAll</p>
     * <p>查询网络成功率分布</p>
     *
     * <p>本接口支持通过指定查询维度，来获取下行网络监控的网络成功率分布数据。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>单次查询的时间跨度不能超过 **90** 天。</p>
     *
     * <p>:::</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeImageXCdnSuccessRateAllRes describeImageXCdnSuccessRateAll(DescribeImageXCdnSuccessRateAllBody body) throws Exception {
        RawResponse rawResponse = json("DescribeImageXCdnSuccessRateAll", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeImageXCdnSuccessRateAllRes.class);
    }

    /**
     * <p>describeImageXCdnErrorCodeByTime</p>
     * <p>查询错误码时序数据</p>
     *
     * <p>本接口支持通过指定查询维度，来获取下行网络监控的错误码时序数据。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>单次查询的时间跨度不能超过 **90** 天。</p>
     *
     * <p>:::</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeImageXCdnErrorCodeByTimeRes describeImageXCdnErrorCodeByTime(DescribeImageXCdnErrorCodeByTimeBody body) throws Exception {
        RawResponse rawResponse = json("DescribeImageXCdnErrorCodeByTime", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeImageXCdnErrorCodeByTimeRes.class);
    }

    /**
     * <p>describeImageXCdnErrorCodeAll</p>
     * <p>查询错误码分布</p>
     *
     * <p>本接口支持通过指定查询维度，来获取下行网络监控的错误码分布数据。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>单次查询的时间跨度不能超过 **90** 天。</p>
     *
     * <p>:::</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeImageXCdnErrorCodeAllRes describeImageXCdnErrorCodeAll(DescribeImageXCdnErrorCodeAllBody body) throws Exception {
        RawResponse rawResponse = json("DescribeImageXCdnErrorCodeAll", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeImageXCdnErrorCodeAllRes.class);
    }

    /**
     * <p>describeImageXCdnDurationDetailByTime</p>
     * <p>查询网络耗时时序数据</p>
     *
     * <p>本接口支持通过指定查询维度，来获取下行网络监控的网络耗时时序数据。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>单次查询的时间跨度不能超过 **90** 天。</p>
     *
     * <p>:::</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeImageXCdnDurationDetailByTimeRes describeImageXCdnDurationDetailByTime(DescribeImageXCdnDurationDetailByTimeBody body) throws Exception {
        RawResponse rawResponse = json("DescribeImageXCdnDurationDetailByTime", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeImageXCdnDurationDetailByTimeRes.class);
    }

    /**
     * <p>describeImageXCdnDurationAll</p>
     * <p>查询网络耗时分布</p>
     *
     * <p>本接口支持通过指定查询维度，来获取下行网络监控的网络耗时分布数据。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>单次查询的时间跨度不能超过 **90** 天。</p>
     *
     * <p>:::</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeImageXCdnDurationAllRes describeImageXCdnDurationAll(DescribeImageXCdnDurationAllBody body) throws Exception {
        RawResponse rawResponse = json("DescribeImageXCdnDurationAll", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeImageXCdnDurationAllRes.class);
    }

    /**
     * <p>describeImageXCdnReuseRateByTime</p>
     * <p>查询网络连接复用率时序数据</p>
     *
     * <p>本接口支持通过指定查询维度，来获取下行网络监控的网络连接复用率时序数据。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>单次查询的时间跨度不能超过 **90** 天。</p>
     *
     * <p>:::</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeImageXCdnReuseRateByTimeRes describeImageXCdnReuseRateByTime(DescribeImageXCdnReuseRateByTimeBody body) throws Exception {
        RawResponse rawResponse = json("DescribeImageXCdnReuseRateByTime", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeImageXCdnReuseRateByTimeRes.class);
    }

    /**
     * <p>describeImageXCdnReuseRateAll</p>
     * <p>查询网络连接复用率分布</p>
     *
     * <p>本接口支持通过指定查询维度，来获取下行网络监控的网络连接复用率分布数据。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>单次查询的时间跨度不能超过 **90** 天。</p>
     *
     * <p>:::</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeImageXCdnReuseRateAllRes describeImageXCdnReuseRateAll(DescribeImageXCdnReuseRateAllBody body) throws Exception {
        RawResponse rawResponse = json("DescribeImageXCdnReuseRateAll", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeImageXCdnReuseRateAllRes.class);
    }

    /**
     * <p>describeImageXCdnProtocolRateByTime</p>
     * <p>查询网络协议占比</p>
     *
     * <p>本接口支持通过指定查询维度，来获取下行网络监控的网络协议占比数据。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>单次查询的时间跨度不能超过 **90** 天。</p>
     *
     * <p>:::</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeImageXCdnProtocolRateByTimeRes describeImageXCdnProtocolRateByTime(DescribeImageXCdnProtocolRateByTimeBody body) throws Exception {
        RawResponse rawResponse = json("DescribeImageXCdnProtocolRateByTime", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeImageXCdnProtocolRateByTimeRes.class);
    }

    /**
     * <p>describeImageXClientFailureRate</p>
     * <p>查询用户感知失败率</p>
     *
     * <p>本接口支持通过指定查询维度，来获取客户端状态监控的用户感知失败率数据。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>单次查询的时间跨度不能超过 **90** 天。</p>
     *
     * <p>:::</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeImageXClientFailureRateRes describeImageXClientFailureRate(DescribeImageXClientFailureRateBody body) throws Exception {
        RawResponse rawResponse = json("DescribeImageXClientFailureRate", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeImageXClientFailureRateRes.class);
    }

    /**
     * <p>describeImageXClientDecodeSuccessRateByTime</p>
     * <p>查询解码成功率</p>
     *
     * <p>本接口支持通过指定查询维度，来获取客户端状态监控的解码成功率数据。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>单次查询的时间跨度不能超过 **90** 天。</p>
     *
     * <p>:::</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeImageXClientDecodeSuccessRateByTimeRes describeImageXClientDecodeSuccessRateByTime(DescribeImageXClientDecodeSuccessRateByTimeBody body) throws Exception {
        RawResponse rawResponse = json("DescribeImageXClientDecodeSuccessRateByTime", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeImageXClientDecodeSuccessRateByTimeRes.class);
    }

    /**
     * <p>describeImageXClientDecodeDurationByTime</p>
     * <p>查询解码耗时</p>
     *
     * <p>本接口支持通过指定查询维度，来获取客户端状态监控的解码耗时数据。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>单次查询的时间跨度不能超过 **90** 天。</p>
     *
     * <p>:::</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeImageXClientDecodeDurationByTimeRes describeImageXClientDecodeDurationByTime(DescribeImageXClientDecodeDurationByTimeBody body) throws Exception {
        RawResponse rawResponse = json("DescribeImageXClientDecodeDurationByTime", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeImageXClientDecodeDurationByTimeRes.class);
    }

    /**
     * <p>describeImageXClientQueueDurationByTime</p>
     * <p>查询排队耗时</p>
     *
     * <p>本接口支持通过指定查询维度，来获取客户端状态监控的排队耗时数据。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>单次查询的时间跨度不能超过 **90** 天。</p>
     *
     * <p>:::</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeImageXClientQueueDurationByTimeRes describeImageXClientQueueDurationByTime(DescribeImageXClientQueueDurationByTimeBody body) throws Exception {
        RawResponse rawResponse = json("DescribeImageXClientQueueDurationByTime", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeImageXClientQueueDurationByTimeRes.class);
    }

    /**
     * <p>describeImageXClientErrorCodeByTime</p>
     * <p>查询错误码时序数据</p>
     *
     * <p>本接口支持通过指定查询维度，来获取客户端状态监控的错误码时序数据。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>单次查询的时间跨度不能超过 **90** 天。</p>
     *
     * <p>:::</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeImageXClientErrorCodeByTimeRes describeImageXClientErrorCodeByTime(DescribeImageXClientErrorCodeByTimeBody body) throws Exception {
        RawResponse rawResponse = json("DescribeImageXClientErrorCodeByTime", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeImageXClientErrorCodeByTimeRes.class);
    }

    /**
     * <p>describeImageXClientErrorCodeAll</p>
     * <p>查询错误码分布</p>
     *
     * <p>本接口支持通过指定查询维度，来获取客户端状态监控的错误码分布数据。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>单次查询的时间跨度不能超过 **90** 天。</p>
     *
     * <p>:::</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeImageXClientErrorCodeAllRes describeImageXClientErrorCodeAll(DescribeImageXClientErrorCodeAllBody body) throws Exception {
        RawResponse rawResponse = json("DescribeImageXClientErrorCodeAll", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeImageXClientErrorCodeAllRes.class);
    }

    /**
     * <p>describeImageXClientLoadDuration</p>
     * <p>查询加载耗时时序数据</p>
     *
     * <p>本接口支持通过指定查询维度，来获取客户端状态监控的加载耗时时序数据。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>单次查询的时间跨度不能超过 **90** 天。</p>
     *
     * <p>:::</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeImageXClientLoadDurationRes describeImageXClientLoadDuration(DescribeImageXClientLoadDurationBody body) throws Exception {
        RawResponse rawResponse = json("DescribeImageXClientLoadDuration", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeImageXClientLoadDurationRes.class);
    }

    /**
     * <p>describeImageXClientLoadDurationAll</p>
     * <p>查询加载耗时分布</p>
     *
     * <p>本接口支持通过指定查询维度，来获取客户端状态监控的加载耗时分布数据。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>单次查询的时间跨度不能超过 **90** 天。</p>
     *
     * <p>:::</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeImageXClientLoadDurationAllRes describeImageXClientLoadDurationAll(DescribeImageXClientLoadDurationAllBody body) throws Exception {
        RawResponse rawResponse = json("DescribeImageXClientLoadDurationAll", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeImageXClientLoadDurationAllRes.class);
    }

    /**
     * <p>describeImageXClientSdkVerByTime</p>
     * <p>查询 SDK 版本变化趋势</p>
     *
     * <p>本接口支持通过指定查询维度，来获取客户端状态监控的 SDK 版本变化趋势数据。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>单次查询的时间跨度不能超过 **90** 天。</p>
     *
     * <p>:::</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeImageXClientSdkVerByTimeRes describeImageXClientSdkVerByTime(DescribeImageXClientSdkVerByTimeBody body) throws Exception {
        RawResponse rawResponse = json("DescribeImageXClientSdkVerByTime", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeImageXClientSdkVerByTimeRes.class);
    }

    /**
     * <p>describeImageXClientFileSize</p>
     * <p>查询文件大小分布</p>
     *
     * <p>本接口支持通过指定查询维度，来获取客户端状态监控的文件大小分布数据。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>单次查询的时间跨度不能超过 **90** 天。</p>
     *
     * <p>:::</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeImageXClientFileSizeRes describeImageXClientFileSize(DescribeImageXClientFileSizeBody body) throws Exception {
        RawResponse rawResponse = json("DescribeImageXClientFileSize", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeImageXClientFileSizeRes.class);
    }

    /**
     * <p>describeImageXClientTopFileSize</p>
     * <p>查询文件大小 TOP URL</p>
     *
     * <p>本接口支持通过指定查询维度，来获取客户端状态监控的文件大小 TOP URL。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeImageXClientTopFileSizeRes describeImageXClientTopFileSize(DescribeImageXClientTopFileSizeBody body) throws Exception {
        RawResponse rawResponse = json("DescribeImageXClientTopFileSize", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeImageXClientTopFileSizeRes.class);
    }

    /**
     * <p>describeImageXClientCountByTime</p>
     * <p>查询客户端上报量</p>
     *
     * <p>本接口支持通过指定查询维度，来获取客户端状态监控的客户端上报量数据。</p>
     *
     * <p>:::tip</p>
     *
     * <p>单次查询的时间跨度不能超过 **90** 天。</p>
     *
     * <p>:::</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeImageXClientCountByTimeRes describeImageXClientCountByTime(DescribeImageXClientCountByTimeBody body) throws Exception {
        RawResponse rawResponse = json("DescribeImageXClientCountByTime", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeImageXClientCountByTimeRes.class);
    }

    /**
     * <p>describeImageXClientQualityRateByTime</p>
     * <p>查询黑白屏率时序数据</p>
     *
     * <p>本接口支持通过指定查询维度，来获取客户端状态监控的黑白屏率时序数据。</p>
     *
     * <p>:::tip</p>
     *
     * <p>- 单次查询的时间跨度不能超过 **90** 天。</p>
     *
     * <p>- 黑白屏监控指客户端解码后出现纯黑、纯白、透明图占上报图片总数量的比例。</p>
     *
     * <p>:::</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeImageXClientQualityRateByTimeRes describeImageXClientQualityRateByTime(DescribeImageXClientQualityRateByTimeBody body) throws Exception {
        RawResponse rawResponse = json("DescribeImageXClientQualityRateByTime", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeImageXClientQualityRateByTimeRes.class);
    }

    /**
     * <p>describeImageXClientTopQualityURL</p>
     * <p>查询黑白屏 TOP URL</p>
     *
     * <p>本接口支持通过指定查询维度，来获取客户端状态监控的黑白屏 Top URL 数据明细。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeImageXClientTopQualityURLRes describeImageXClientTopQualityURL(DescribeImageXClientTopQualityURLBody body) throws Exception {
        RawResponse rawResponse = json("DescribeImageXClientTopQualityURL", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeImageXClientTopQualityURLRes.class);
    }

    /**
     * <p>describeImageXClientDemotionRateByTime</p>
     * <p>查询降级率时序数据</p>
     *
     * <p>本接口支持通过指定查询维度，来获取客户端状态监控的处理降级成功率时序数据。</p>
     *
     * <p>:::tip</p>
     *
     * <p>单次查询的时间跨度不能超过 **90** 天。</p>
     *
     * <p>:::</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeImageXClientDemotionRateByTimeRes describeImageXClientDemotionRateByTime(DescribeImageXClientDemotionRateByTimeBody body) throws Exception {
        RawResponse rawResponse = json("DescribeImageXClientDemotionRateByTime", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeImageXClientDemotionRateByTimeRes.class);
    }

    /**
     * <p>describeImageXClientTopDemotionURL</p>
     * <p>查询降级率 TOP URL</p>
     *
     * <p>本接口支持通过指定查询维度，来获取客户端状态监控的降级率 TOP URL 数据明细。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeImageXClientTopDemotionURLRes describeImageXClientTopDemotionURL(DescribeImageXClientTopDemotionURLBody body) throws Exception {
        RawResponse rawResponse = json("DescribeImageXClientTopDemotionURL", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeImageXClientTopDemotionURLRes.class);
    }

    /**
     * <p>describeImageXClientScoreByTime</p>
     * <p>查询画质评估时序数据</p>
     *
     * <p>本接口支持通过指定查询时间段和时间粒度，获取画质评估上报数据。</p>
     *
     * <p>:::tip</p>
     *
     * <p>单次查询的时间跨度不能超过 **90** 天。</p>
     *
     * <p>:::</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeImageXClientScoreByTimeRes describeImageXClientScoreByTime(DescribeImageXClientScoreByTimeBody body) throws Exception {
        RawResponse rawResponse = json("DescribeImageXClientScoreByTime", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeImageXClientScoreByTimeRes.class);
    }

    /**
     * <p>describeImageXSensibleCountByTime</p>
     * <p>查询采集样本量</p>
     *
     * <p>本接口支持查询感知指标采集样本量数据。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>单次查询的时间跨度不能超过 **90** 天。</p>
     *
     * <p>:::</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeImageXSensibleCountByTimeRes describeImageXSensibleCountByTime(DescribeImageXSensibleCountByTimeBody body) throws Exception {
        RawResponse rawResponse = json("DescribeImageXSensibleCountByTime", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeImageXSensibleCountByTimeRes.class);
    }

    /**
     * <p>describeImageXSensibleCacheHitRateByTime</p>
     * <p>查询内存/磁盘命中率</p>
     *
     * <p>本接口支持查询感知指标内存/磁盘命中率数据。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>单次查询的时间跨度不能超过 **90** 天。</p>
     *
     * <p>:::</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeImageXSensibleCacheHitRateByTimeRes describeImageXSensibleCacheHitRateByTime(DescribeImageXSensibleCacheHitRateByTimeBody body) throws Exception {
        RawResponse rawResponse = json("DescribeImageXSensibleCacheHitRateByTime", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeImageXSensibleCacheHitRateByTimeRes.class);
    }

    /**
     * <p>describeImageXSensibleTopSizeURL</p>
     * <p>查询大图文件体积 Top URL</p>
     *
     * <p>本接口支持查询大图文件体积 Top URL 数据。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeImageXSensibleTopSizeURLRes describeImageXSensibleTopSizeURL(DescribeImageXSensibleTopSizeURLBody body) throws Exception {
        RawResponse rawResponse = json("DescribeImageXSensibleTopSizeURL", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeImageXSensibleTopSizeURLRes.class);
    }

    /**
     * <p>describeImageXSensibleTopResolutionURL</p>
     * <p>查询大图文件分辨率 Top URL</p>
     *
     * <p>本接口支持查询大图文件分辨率 Top URL 数据。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeImageXSensibleTopResolutionURLRes describeImageXSensibleTopResolutionURL(DescribeImageXSensibleTopResolutionURLBody body) throws Exception {
        RawResponse rawResponse = json("DescribeImageXSensibleTopResolutionURL", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeImageXSensibleTopResolutionURLRes.class);
    }

    /**
     * <p>describeImageXSensibleTopRamURL</p>
     * <p>查询大图文件内存 Top URL</p>
     *
     * <p>本接口支持查询大图文件内存 Top URL 数据。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeImageXSensibleTopRamURLRes describeImageXSensibleTopRamURL(DescribeImageXSensibleTopRamURLBody body) throws Exception {
        RawResponse rawResponse = json("DescribeImageXSensibleTopRamURL", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeImageXSensibleTopRamURLRes.class);
    }

    /**
     * <p>describeImageXSensibleTopUnknownURL</p>
     * <p>查询大图文件未知原因 TOP URL</p>
     *
     * <p>本接口查询大图文件未知原因 Top URL 列表。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeImageXSensibleTopUnknownURLRes describeImageXSensibleTopUnknownURL(DescribeImageXSensibleTopUnknownURLBody body) throws Exception {
        RawResponse rawResponse = json("DescribeImageXSensibleTopUnknownURL", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeImageXSensibleTopUnknownURLRes.class);
    }

    /**
     * <p>updateImageResourceStatus</p>
     * <p>修改上传文件状态</p>
     *
     * <p>本接口支持修改指定服务下资源的封禁状态。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>若您在封禁服务`ServiceId`开启了[重名覆盖上传](https://www.volcengine.com/docs/508/1119912)，当封禁的资源被上传的重名文件覆盖后，该资源的封禁状态会重置为正常。</p>
     *
     * <p>:::</p>
     *
     * @param query query arguments
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateImageResourceStatusRes updateImageResourceStatus(UpdateImageResourceStatusQuery query, UpdateImageResourceStatusBody body) throws Exception {
        RawResponse rawResponse = json("UpdateImageResourceStatus", Utils.paramsToPair(query), JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateImageResourceStatusRes.class);
    }

    /**
     * <p>getImageStorageFiles</p>
     * <p>列举服务下的文件</p>
     *
     * <p>本接口支持列举指定服务下的全量文件。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public GetImageStorageFilesRes getImageStorageFiles(GetImageStorageFilesQuery query) throws Exception {
        RawResponse rawResponse = json("GetImageStorageFiles", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, GetImageStorageFilesRes.class);
    }

    /**
     * <p>deleteImageUploadFiles</p>
     * <p>删除服务下多个文件</p>
     *
     * <p>通过指定服务 ID 以及上传文件的 Uri 列表，来删除指定的文件。</p>
     *
     * @param query query arguments
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DeleteImageUploadFilesRes deleteImageUploadFiles(DeleteImageUploadFilesQuery query, DeleteImageUploadFilesBody body) throws Exception {
        RawResponse rawResponse = json("DeleteImageUploadFiles", Utils.paramsToPair(query), JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DeleteImageUploadFilesRes.class);
    }

    /**
     * <p>updateImageUploadFiles</p>
     * <p>指定服务下多个文件URL状态</p>
     *
     * <p>指定服务下多个文件URL状态</p>
     *
     * @param query query arguments
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateImageUploadFilesRes updateImageUploadFiles(UpdateImageUploadFilesQuery query, UpdateImageUploadFilesBody body) throws Exception {
        RawResponse rawResponse = json("UpdateImageUploadFiles", Utils.paramsToPair(query), JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateImageUploadFilesRes.class);
    }

    /**
     * <p>commitImageUpload</p>
     * <p>文件上传完成上报</p>
     *
     * <p>本接口支持通过指定服务 ID 以及 SessionKey，来获取上传成功的资源 Uri 以及加密信息。</p>
     *
     * @param query query arguments
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public CommitImageUploadRes commitImageUpload(CommitImageUploadQuery query, CommitImageUploadBody body) throws Exception {
        RawResponse rawResponse = json("CommitImageUpload", Utils.paramsToPair(query), JSON.toJSONString(body));
        return parseRawResponse(rawResponse, CommitImageUploadRes.class);
    }

    /**
     * <p>applyImageUpload</p>
     * <p>获取文件上传地址</p>
     *
     * <p>本接口用于指定上传文件信息，并获取文件上传地址和凭证。成功获取到上传地址和凭证后，使用[公网域名](https://www.volcengine.com/docs/508/477196#%E4%B8%8A%E4%BC%A0%E7%9B%B8%E5%85%B3%E5%9F%9F%E5%90%8D)上传您指定的文件二进制数据，对返回的上传地址发起 PUT 请求上传文件。（**可选操作**：通过调用 [CommitImageUpload](https://www.volcengine.com/docs/508/9398) 接口，确认文件上传并获取上报上传结果。）</p>
     *
     * <p>推荐您使用[服务端 SDK](https://www.volcengine.com/docs/508/9397#%E6%9C%8D%E5%8A%A1%E7%AB%AF-sdk) 进行文件上传，具体上传流程请参考[服务端上传](https://www.volcengine.com/docs/508/477196#%E6%9C%8D%E5%8A%A1%E7%AB%AF%E4%B8%8A%E4%BC%A0)。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>强烈不建议您依赖 [CommitImageUpload](https://www.volcengine.com/docs/508/9398) 返回的图片 meta 信息，有获取 meta 需求推荐在上传完成后拼接`~info`模板获取[图片 meta 信息](https://www.volcengine.com/docs/508/64085)。原因请见[为什么不建议依赖 Commit 阶段返回的图片 meta 信息？](https://www.volcengine.com/docs/508/477196#%E4%B8%BA%E4%BB%80%E4%B9%88%E4%B8%8D%E5%BB%BA%E8%AE%AE%E4%BE%9D%E8%B5%96-commit-%E9%98%B6%E6%AE%B5%E8%BF%94%E5%9B%9E%E7%9A%84%E5%9B%BE%E7%89%87-meta-%E4%BF%A1%E6%81%AF%EF%BC%9F)</p>
     *
     * <p>:::</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>veImageX 在全球多个区域部署，每个区域有自己对应的 OpenAPI 域名，不支持跨区域调用。具体详情请查看[服务地址](https://www.volcengine.com/docs/508/14106)。</p>
     *
     * <p>:::</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public ApplyImageUploadRes applyImageUpload(ApplyImageUploadQuery query) throws Exception {
        RawResponse rawResponse = json("ApplyImageUpload", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, ApplyImageUploadRes.class);
    }

    /**
     * <p>getImageUploadFile</p>
     * <p>获取服务下单个上传文件</p>
     *
     * <p>通过指定服务 ID 以及已上传的文件 Uri，来获取上传文件的详细信息，如：文件修改时间和文件字节数等。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public GetImageUploadFileRes getImageUploadFile(GetImageUploadFileQuery query) throws Exception {
        RawResponse rawResponse = json("GetImageUploadFile", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, GetImageUploadFileRes.class);
    }

    /**
     * <p>getImageUploadFiles</p>
     * <p>获取服务下的上传文件</p>
     *
     * <p>通过指定服务 ID，获取当前服务下的上传文件信息。</p>
     *
     * <p>:::tip</p>
     *
     * <p>最多可返回 100 条上传文件信息。</p>
     *
     * <p>:::</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public GetImageUploadFilesRes getImageUploadFiles(GetImageUploadFilesQuery query) throws Exception {
        RawResponse rawResponse = json("GetImageUploadFiles", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, GetImageUploadFilesRes.class);
    }

    /**
     * <p>getImageUpdateFiles</p>
     * <p>获取服务下的更新文件</p>
     *
     * <p>通过指定服务 ID 以及获取文件类型，从而得到符合条件的文件 URL 详情。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public GetImageUpdateFilesRes getImageUpdateFiles(GetImageUpdateFilesQuery query) throws Exception {
        RawResponse rawResponse = json("GetImageUpdateFiles", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, GetImageUpdateFilesRes.class);
    }

    /**
     * <p>previewImageUploadFile</p>
     * <p>预览服务下的文件</p>
     *
     * <p>通过指定服务 ID 以及上传文件 Uri，来获取指定文件的详细信息。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public PreviewImageUploadFileRes previewImageUploadFile(PreviewImageUploadFileQuery query) throws Exception {
        RawResponse rawResponse = json("PreviewImageUploadFile", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, PreviewImageUploadFileRes.class);
    }

    /**
     * <p>getImageServiceSubscription</p>
     * <p>查询服务开通状态</p>
     *
     * <p>本接口支持查询图片服务的开通状态详情，支持返回账号 ID、已购商品和已购商品配置等信息。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public GetImageServiceSubscriptionRes getImageServiceSubscription(GetImageServiceSubscriptionQuery query) throws Exception {
        RawResponse rawResponse = json("GetImageServiceSubscription", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, GetImageServiceSubscriptionRes.class);
    }

    /**
     * <p>getImageService</p>
     * <p>获取单个服务信息</p>
     *
     * <p>本接口支持通过指定服务 ID，获取对应服务的详情，如：服务名称、服务地域和服务类型等信息。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public GetImageServiceRes getImageService(GetImageServiceQuery query) throws Exception {
        RawResponse rawResponse = json("GetImageService", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, GetImageServiceRes.class);
    }

    /**
     * <p>getAllImageServices</p>
     * <p>获取所有服务信息</p>
     *
     * <p>本接口支持获取当前火山账号下创建的所有 veImageX 图片服务信息。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public GetAllImageServicesRes getAllImageServices(GetAllImageServicesQuery query) throws Exception {
        RawResponse rawResponse = json("GetAllImageServices", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, GetAllImageServicesRes.class);
    }

    /**
     * <p>createImageCompressTask</p>
     * <p>创建多文件压缩异步任务</p>
     *
     * <p>本接口支持通过指定压缩文件/文件夹及其他配置创建异步压缩任务，系统将执行压缩打包处理并将压缩包存储至指定服务内。支持以下两种压缩文件提交方式：</p>
     *
     *
     *
     * <p>- 方式 1：[FlieList 方式](https://www.volcengine.com/docs/508/1112504#filelist)：需配置公网可访问的待压缩文件 URL 与 Alias，Folder 配置，不得超过 500。</p>
     *
     * <p>- 方式 2：[IndexFile 方式](https://www.volcengine.com/docs/508/1112504#indexfile)：在 .txt 文件（索引文件）内填写待压缩文件相关配置，每行需填写 `StoreUri/URL,Alias,Folder`相关配置 ，并将该索引文件上传至指定服务，并获取索引文件 StoreUri。</p>
     *
     * <p>	- 如果填写待压缩文件的 URL，则需满足公网可访问。您可下载 Compress\_StoreUri.txt 参考示例，完成 URL 类型索引文件的填写。<br></p>
     *
     * <p>		</p>
     *
     * <p>		</p>
     *
     * <p>	- 如果填写带压缩文件的 StoreUri，则需存储至指定服务。您可下载 Compress\_StoreUri.txt 参考示例，完成 StoreUri 类型索引文件的填写。<br></p>
     *
     * <p>		</p>
     *
     * <p>	</p>
     *
     * <p>	:::tip</p>
     *
     * <p>	压缩文件类型不支持混用。</p>
     *
     * <p>	:::</p>
     *
     * @param query query arguments
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public CreateImageCompressTaskRes createImageCompressTask(CreateImageCompressTaskQuery query, CreateImageCompressTaskBody body) throws Exception {
        RawResponse rawResponse = json("CreateImageCompressTask", Utils.paramsToPair(query), JSON.toJSONString(body));
        return parseRawResponse(rawResponse, CreateImageCompressTaskRes.class);
    }

    /**
     * <p>fetchImageUrl</p>
     * <p>数据抓取</p>
     *
     * <p>本接口通过指定一个公网可访问的待迁移资源 URL 以及上传目标服务 ID 等信息，来对资源进行抓取和上传，并得到迁移后的资源存储 URI 等信息。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>- 如果您的数据在本地 IDC 或者在本地磁盘中，同时通过本地服务器挂载云存储的资源迁移 veImageX 存储，推荐您使用[本地迁移与上传工具](https://www.volcengine.com/docs/508/67066)进行数据迁移。</p>
     *
     * <p>- 如果您的数据位于第三方云厂商或有可公网访问的 URL 本地数据，您可以登录 veImageX 使用[数据迁移](https://www.volcengine.com/docs/508/76309)功能迁移您的数据至 veImageX 存储。</p>
     *
     * <p>:::</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public FetchImageUrlRes fetchImageUrl(FetchImageUrlBody body) throws Exception {
        RawResponse rawResponse = json("FetchImageUrl", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, FetchImageUrlRes.class);
    }

    /**
     * <p>updateImageStorageTTL</p>
     * <p>更新服务存储有效期</p>
     *
     * <p>本接口支持更新指定服务的存储有效期。若资源有效期到期，veImageX 将自动删除指定服务内的资源，减少您的存储成本。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateImageStorageTTLRes updateImageStorageTTL(UpdateImageStorageTTLBody body) throws Exception {
        RawResponse rawResponse = json("UpdateImageStorageTTL", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateImageStorageTTLRes.class);
    }

    /**
     * <p>getCompressTaskInfo</p>
     * <p>获取异步压缩任务详情</p>
     *
     * <p>本接口支持通过指定服务 ID 和异步压缩任务 ID 获取压缩任务详情。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public GetCompressTaskInfoRes getCompressTaskInfo(GetCompressTaskInfoQuery query) throws Exception {
        RawResponse rawResponse = json("GetCompressTaskInfo", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, GetCompressTaskInfoRes.class);
    }

    /**
     * <p>getUrlFetchTask</p>
     * <p>获取异步抓取任务详情</p>
     *
     * <p>本接口支持通过异步任务 ID，获取异步任务详情，包括：任务状态、资源地址和任务失败时回调详情。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public GetUrlFetchTaskRes getUrlFetchTask(GetUrlFetchTaskQuery query) throws Exception {
        RawResponse rawResponse = json("GetUrlFetchTask", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, GetUrlFetchTaskRes.class);
    }

    /**
     * <p>getResourceURL</p>
     * <p>获取资源URL</p>
     *
     * <p>支持指定服务 ID 、域名以及上传图像资源 Uri 后，获取资源访问地址；若指定模板，也支持获取模板处理后结果图访问地址。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public GetResourceURLRes getResourceURL(GetResourceURLQuery query) throws Exception {
        RawResponse rawResponse = json("GetResourceURL", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, GetResourceURLRes.class);
    }

    /**
     * <p>createImageFromUri</p>
     * <p>资源迁移</p>
     *
     * <p>资源迁移</p>
     *
     * @param query query arguments
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public CreateImageFromUriRes createImageFromUri(CreateImageFromUriQuery query, CreateImageFromUriBody body) throws Exception {
        RawResponse rawResponse = json("CreateImageFromUri", Utils.paramsToPair(query), JSON.toJSONString(body));
        return parseRawResponse(rawResponse, CreateImageFromUriRes.class);
    }

    /**
     * <p>updateImageFileKey</p>
     * <p>重命名文件</p>
     *
     * <p>重命名文件</p>
     *
     * @param query query arguments
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateImageFileKeyRes updateImageFileKey(UpdateImageFileKeyQuery query, UpdateImageFileKeyBody body) throws Exception {
        RawResponse rawResponse = json("UpdateImageFileKey", Utils.paramsToPair(query), JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateImageFileKeyRes.class);
    }

    /**
     * <p>createImageContentTask</p>
     * <p>创建刷新预热禁用解禁任务</p>
     *
     * <p>本接口支持在指定服务 ID 、待更改操作的文件和文件操作类型（刷新 URL、刷新目录（包含根目录）、预热 URL、禁用 URL 和解禁 URL）后创建相关文件管理任务。</p>
     *
     * @param query query arguments
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public CreateImageContentTaskRes createImageContentTask(CreateImageContentTaskQuery query, CreateImageContentTaskBody body) throws Exception {
        RawResponse rawResponse = json("CreateImageContentTask", Utils.paramsToPair(query), JSON.toJSONString(body));
        return parseRawResponse(rawResponse, CreateImageContentTaskRes.class);
    }

    /**
     * <p>getImageContentTaskDetail</p>
     * <p>获取任务详情</p>
     *
     * <p>本接口支持查询近 30 天内内容管理任务详情列表。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public GetImageContentTaskDetailRes getImageContentTaskDetail(GetImageContentTaskDetailBody body) throws Exception {
        RawResponse rawResponse = json("GetImageContentTaskDetail", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, GetImageContentTaskDetailRes.class);
    }

    /**
     * <p>getImageContentBlockList</p>
     * <p>获取禁用 URL 列表详情</p>
     *
     * <p>本接口支持获取近 30 天内的已被禁用的 URL 列表详情，若 URL 解禁成功，则无法被查询。</p>
     *
     * @param query query arguments
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public GetImageContentBlockListRes getImageContentBlockList(GetImageContentBlockListQuery query, GetImageContentBlockListBody body) throws Exception {
        RawResponse rawResponse = json("GetImageContentBlockList", Utils.paramsToPair(query), JSON.toJSONString(body));
        return parseRawResponse(rawResponse, GetImageContentBlockListRes.class);
    }

    /**
     * <p>createImageTranscodeQueue</p>
     * <p>创建任务队列</p>
     *
     * <p>本接口支持在该账号创建离线转码任务队列，并自定义队列配置，如队列名称、队列描述、回调配置等。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public CreateImageTranscodeQueueRes createImageTranscodeQueue(CreateImageTranscodeQueueBody body) throws Exception {
        RawResponse rawResponse = json("CreateImageTranscodeQueue", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, CreateImageTranscodeQueueRes.class);
    }

    /**
     * <p>deleteImageTranscodeQueue</p>
     * <p>删除任务队列</p>
     *
     * <p>该接口支持通过指定待删除的任务队列 ID 在账号内删除该任务队列。</p>
     *
     * <p>:::warning</p>
     *
     * <p>每个账号内置的一个默认任务队列不允许被删除。</p>
     *
     * <p>:::</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DeleteImageTranscodeQueueRes deleteImageTranscodeQueue(DeleteImageTranscodeQueueBody body) throws Exception {
        RawResponse rawResponse = json("DeleteImageTranscodeQueue", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DeleteImageTranscodeQueueRes.class);
    }

    /**
     * <p>updateImageTranscodeQueue</p>
     * <p>更新任务队列配置</p>
     *
     * <p>本接口支持对已创建任务队列更新其离线转码配置，如队列名称、队列描述和回调配置等。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateImageTranscodeQueueRes updateImageTranscodeQueue(UpdateImageTranscodeQueueBody body) throws Exception {
        RawResponse rawResponse = json("UpdateImageTranscodeQueue", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateImageTranscodeQueueRes.class);
    }

    /**
     * <p>updateImageTranscodeQueueStatus</p>
     * <p>更新任务队列状态</p>
     *
     * <p>该接口支持通过指定待更新的任务队列 ID 来更新该队列的状态。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateImageTranscodeQueueStatusRes updateImageTranscodeQueueStatus(UpdateImageTranscodeQueueStatusBody body) throws Exception {
        RawResponse rawResponse = json("UpdateImageTranscodeQueueStatus", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateImageTranscodeQueueStatusRes.class);
    }

    /**
     * <p>getImageTranscodeQueues</p>
     * <p>获取任务队列</p>
     *
     * <p>本接口支持获取当前账号下已创建的任务队列详情。</p>
     *
     *
     *
     *
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public GetImageTranscodeQueuesRes getImageTranscodeQueues(GetImageTranscodeQueuesQuery query) throws Exception {
        RawResponse rawResponse = json("GetImageTranscodeQueues", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, GetImageTranscodeQueuesRes.class);
    }

    /**
     * <p>createImageTranscodeTask</p>
     * <p>提交转码任务</p>
     *
     * <p>本接口支持向状态为运行中的任务队列，提交以一条或多条 URL/URI 资源转码执行任务组成的转码任务。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>- 仅当队列为运行中时可向该队列提交任务，请您在控制台或调用 [GetImageTranscodeQueues](https://www.volcengine.com/docs/508/1107341) 接口查看任务队列状态是否为运行中。</p>
     *
     * <p>- 一条任务队列（QueueId）可包含多个转码任务（TaskId），一个转码任务可由一条或多条 URL/URI 转码执行任务（EntryId）组成。</p>
     *
     * <p>:::</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public CreateImageTranscodeTaskRes createImageTranscodeTask(CreateImageTranscodeTaskBody body) throws Exception {
        RawResponse rawResponse = json("CreateImageTranscodeTask", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, CreateImageTranscodeTaskRes.class);
    }

    /**
     * <p>getImageTranscodeDetails</p>
     * <p>获取任务执行详情</p>
     *
     * <p>本接口支持您通过指定任务队列 ID 和查询时间段获取当前队列的转码任务详情。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>仅支持保存并查询任务结束时间在近 7 天的处理任务。</p>
     *
     * <p>:::</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public GetImageTranscodeDetailsRes getImageTranscodeDetails(GetImageTranscodeDetailsQuery query) throws Exception {
        RawResponse rawResponse = json("GetImageTranscodeDetails", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, GetImageTranscodeDetailsRes.class);
    }

    /**
     * <p>createImageTranscodeCallback</p>
     * <p>手动触发回调</p>
     *
     * <p>本接口支持通过指定任务条目 ID，手动向该任务队列配置的回调 URL 发送回调信息。回调内容及错误请参考[离线转码说明](https://www.volcengine.com/docs/508/1104726)。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public CreateImageTranscodeCallbackRes createImageTranscodeCallback(CreateImageTranscodeCallbackBody body) throws Exception {
        RawResponse rawResponse = json("CreateImageTranscodeCallback", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, CreateImageTranscodeCallbackRes.class);
    }

    /**
     * <p>deleteImageTranscodeDetail</p>
     * <p>删除任务执行详情</p>
     *
     * <p>本接口支持通过指定任务条目 ID，删除提交任务内对应的该条 URL/URI。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DeleteImageTranscodeDetailRes deleteImageTranscodeDetail(DeleteImageTranscodeDetailBody body) throws Exception {
        RawResponse rawResponse = json("DeleteImageTranscodeDetail", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DeleteImageTranscodeDetailRes.class);
    }

    /**
     * <p>getImagePSDetection</p>
     * <p>使用PS检测获取结果值</p>
     *
     * <p>本接口支持通过指定服务 ID 以及原图 URI，检测图片是否被人为的 PS 修改，获取图片检测分值以及是否为正常图片。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>当前仅适用于营业执照类图像检测场景，其他图像检测类型还在持续开发中，敬请期待。</p>
     *
     * <p>:::</p>
     *
     * @param query query arguments
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public GetImagePSDetectionRes getImagePSDetection(GetImagePSDetectionQuery query, GetImagePSDetectionBody body) throws Exception {
        RawResponse rawResponse = json("GetImagePSDetection", Utils.paramsToPair(query), JSON.toJSONString(body));
        return parseRawResponse(rawResponse, GetImagePSDetectionRes.class);
    }

    /**
     * <p>getImageEraseResult</p>
     * <p>使用图像修复获取结果图</p>
     *
     * <p>本接口支持通过指定服务 ID 、待擦除的图片地址以及擦除模型，得到擦除后的图片 URI。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public GetImageEraseResultRes getImageEraseResult(GetImageEraseResultBody body) throws Exception {
        RawResponse rawResponse = json("GetImageEraseResult", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, GetImageEraseResultRes.class);
    }

    /**
     * <p>getImageSuperResolutionResult</p>
     * <p>使用图像超分辨率获取结果图</p>
     *
     * <p>本接口支持通过输入待处理图像地址，经超分处理后得到处理后的图片 URI。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public GetImageSuperResolutionResultRes getImageSuperResolutionResult(GetImageSuperResolutionResultBody body) throws Exception {
        RawResponse rawResponse = json("GetImageSuperResolutionResult", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, GetImageSuperResolutionResultRes.class);
    }

    /**
     * <p>getImageDuplicateDetection</p>
     * <p>使用图片去重获取结果值</p>
     *
     * <p>本接口支持指定服务 ID 以及待去重原图 URL 数组，获取去重结果。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     *
     *
     * <p>* 支持同步或异步去重，如果输入两张以上图片推荐您使用异步去重处理。</p>
     *
     * <p>* 如果使用异步去重，则最终去重的图片评分以及图片分组结果请调用 [GetDedupTaskStatus](https://www.volcengine.com/docs/508/138909)接口查看。</p>
     *
     *
     *
     * <p>:::</p>
     *
     * @param query query arguments
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public GetImageDuplicateDetectionRes getImageDuplicateDetection(GetImageDuplicateDetectionQuery query, GetImageDuplicateDetectionBody body) throws Exception {
        RawResponse rawResponse = json("GetImageDuplicateDetection", Utils.paramsToPair(query), JSON.toJSONString(body));
        return parseRawResponse(rawResponse, GetImageDuplicateDetectionRes.class);
    }

    /**
     * <p>getImageOCRV2</p>
     * <p>使用文字识别 OCR 获取识别信息</p>
     *
     * <p>本接口支持通过指定服务 ID 以及图片识别场景，获取该场景下图片的识别结果等信息。</p>
     *
     * @param query query arguments
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public GetImageOCRV2Res getImageOCRV2(GetImageOCRV2Query query, GetImageOCRV2Body body) throws Exception {
        RawResponse rawResponse = json("GetImageOCRV2", Utils.paramsToPair(query), JSON.toJSONString(body));
        return parseRawResponse(rawResponse, GetImageOCRV2Res.class);
    }

    /**
     * <p>getImageBgFillResult</p>
     * <p>使用智能图像扩展获取结果图</p>
     *
     * <p>本接口支持通过指定服务 ID、原图地址以及智能图像扩展模型，得到处理后的结果图 URI。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public GetImageBgFillResultRes getImageBgFillResult(GetImageBgFillResultBody body) throws Exception {
        RawResponse rawResponse = json("GetImageBgFillResult", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, GetImageBgFillResultRes.class);
    }

    /**
     * <p>getSegmentImage</p>
     * <p>使用智能背景移除获取结果图</p>
     *
     * <p>针对上传的静图，支持去除上传图像背景，获取图像主体并设置主体轮廓描边的相关配置，如描边颜色、描边宽度。</p>
     *
     * @param query query arguments
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public GetSegmentImageRes getSegmentImage(GetSegmentImageQuery query, GetSegmentImageBody body) throws Exception {
        RawResponse rawResponse = json("GetSegmentImage", Utils.paramsToPair(query), JSON.toJSONString(body));
        return parseRawResponse(rawResponse, GetSegmentImageRes.class);
    }

    /**
     * <p>getImageSmartCropResult</p>
     * <p>使用智能裁剪获取结果图</p>
     *
     * <p>本接口支持指定服务 ID 以及原图地址，经智能裁剪后得到处理后的图片 URI。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public GetImageSmartCropResultRes getImageSmartCropResult(GetImageSmartCropResultBody body) throws Exception {
        RawResponse rawResponse = json("GetImageSmartCropResult", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, GetImageSmartCropResultRes.class);
    }

    /**
     * <p>getImageComicResult</p>
     * <p>使用漫画风获取结果图</p>
     *
     * <p>通过指定服务 ID 以及待处理图片，获取漫画风处理后结果图地址。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public GetImageComicResultRes getImageComicResult(GetImageComicResultBody body) throws Exception {
        RawResponse rawResponse = json("GetImageComicResult", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, GetImageComicResultRes.class);
    }

    /**
     * <p>getImageEnhanceResult</p>
     * <p>使用画质增强获取结果图</p>
     *
     * <p>本接口支持指定服务 ID、原图地址和画质增强模型，提升原图画质后获取结果图 URI。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>您也可以通过调用 [GetImageEnhanceResultWithData](https://www.volcengine.com/docs/508/475346) 输入图片二进制数据，来获取经画质增强能力编码后的图片二进制数据。</p>
     *
     * <p>:::</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public GetImageEnhanceResultRes getImageEnhanceResult(GetImageEnhanceResultBody body) throws Exception {
        RawResponse rawResponse = json("GetImageEnhanceResult", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, GetImageEnhanceResultRes.class);
    }

    /**
     * <p>getImageQuality</p>
     * <p>使用画质评估获取分值</p>
     *
     * <p>本接口支持指定服务 ID 和原图地址后对该图像的主客观画质和美学维度进行评分，并获取该图片各维度评分结果。具体图片维度说明以及分值含义请参考下方参数说明。</p>
     *
     * @param query query arguments
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public GetImageQualityRes getImageQuality(GetImageQualityQuery query, GetImageQualityBody body) throws Exception {
        RawResponse rawResponse = json("GetImageQuality", Utils.paramsToPair(query), JSON.toJSONString(body));
        return parseRawResponse(rawResponse, GetImageQualityRes.class);
    }

    /**
     * <p>getPrivateImageType</p>
     * <p>使用隐私分类获取分类信息</p>
     *
     * <p>本接口支持通过指定服务 ID 以及原图 URI，获取该图片的隐私分类结果信息。</p>
     *
     * @param query query arguments
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public GetPrivateImageTypeRes getPrivateImageType(GetPrivateImageTypeQuery query, GetPrivateImageTypeBody body) throws Exception {
        RawResponse rawResponse = json("GetPrivateImageType", Utils.paramsToPair(query), JSON.toJSONString(body));
        return parseRawResponse(rawResponse, GetPrivateImageTypeRes.class);
    }

    /**
     * <p>createHiddenWatermarkImage</p>
     * <p>创建盲水印前背景图层</p>
     *
     * <p>本接口支持生成含有盲水印的 png 格式透明图（前景水印图层）。在实际使用中，您需要将该图层无缩放且平铺至您的网页顶层，从而实现给网页添加盲水印的目的。适用于纯色或彩色背景网页被截图外发后，对截图者进行身份溯源的场景。</p>
     *
     *
     *
     * <p>:::warning</p>
     *
     * <p>- 提取水印时，若直接提供本接口返回的 PNG 前景水印图层，将无法提取出水印内容。请**务必**提供已融合盲水印透明图的背景网页的**截图**。</p>
     *
     * <p>- 为了确保能够正常提取截图中的水印，请**不要**对生成的盲水印 PNG 背景图层执行其他图片处理操作。</p>
     *
     * <p>:::</p>
     *
     * @param query query arguments
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public CreateHiddenWatermarkImageRes createHiddenWatermarkImage(CreateHiddenWatermarkImageQuery query, CreateHiddenWatermarkImageBody body) throws Exception {
        RawResponse rawResponse = json("CreateHiddenWatermarkImage", Utils.paramsToPair(query), JSON.toJSONString(body));
        return parseRawResponse(rawResponse, CreateHiddenWatermarkImageRes.class);
    }

    /**
     * <p>getImageDetectResult</p>
     * <p>图片内容检测</p>
     *
     * <p>图片内容检测</p>
     *
     * @param query query arguments
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public GetImageDetectResultRes getImageDetectResult(GetImageDetectResultQuery query, GetImageDetectResultBody body) throws Exception {
        RawResponse rawResponse = json("GetImageDetectResult", Utils.paramsToPair(query), JSON.toJSONString(body));
        return parseRawResponse(rawResponse, GetImageDetectResultRes.class);
    }

    /**
     * <p>createImageHmExtract</p>
     * <p>提取盲水印</p>
     *
     * <p>本接口支持指定服务以及提取源图片，获取该图片中的盲水印信息。</p>
     *
     *
     *
     * <p>:::warning</p>
     *
     * <p>- 对同一张图片，请确保在提取水印时指定的模型，与添加水印时指定的模型为同一种，以免无法正常提取水印。</p>
     *
     * <p>- 在诸如电子邮件附件、社交媒体平台（如 Facebook、Instagram）、实时通讯应用（如微信）等传输媒介中传输图片时往往会自动压缩图片的分辨率，此时，图片水印也可能无法正常提取。</p>
     *
     * <p>:::</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public CreateImageHmExtractRes createImageHmExtract(CreateImageHmExtractQuery query) throws Exception {
        RawResponse rawResponse = json("CreateImageHmExtract", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, CreateImageHmExtractRes.class);
    }

    /**
     * <p>createImageHmEmbed</p>
     * <p>添加盲水印</p>
     *
     * <p>本接口支持指定服务以及原图后，将自定义的文字盲水印等信息嵌入原图并获取结果图 Uri。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public CreateImageHmEmbedRes createImageHmEmbed(CreateImageHmEmbedBody body) throws Exception {
        RawResponse rawResponse = json("CreateImageHmEmbed", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, CreateImageHmEmbedRes.class);
    }

    /**
     * <p>getComprehensiveEnhanceImage</p>
     * <p>综合增强</p>
     *
     * <p>本接口支持通过指定服务 ID 、原图地址和综合增强配置，获取处理后结果图 URI。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public GetComprehensiveEnhanceImageRes getComprehensiveEnhanceImage(GetComprehensiveEnhanceImageBody body) throws Exception {
        RawResponse rawResponse = json("GetComprehensiveEnhanceImage", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, GetComprehensiveEnhanceImageRes.class);
    }

    /**
     * <p>getImageEraseModels</p>
     * <p>获取图像修复列表详情</p>
     *
     * <p>本接口支持获取图像修复模型列表信息。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public GetImageEraseModelsRes getImageEraseModels(GetImageEraseModelsQuery query) throws Exception {
        RawResponse rawResponse = json("GetImageEraseModels", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, GetImageEraseModelsRes.class);
    }

    /**
     * <p>getDedupTaskStatus</p>
     * <p>获取异步去重任务详情</p>
     *
     * <p>本接口支持通过指定异步去重任务 ID 获取对应异步去重任务执行详细情况。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public GetDedupTaskStatusRes getDedupTaskStatus(GetDedupTaskStatusQuery query) throws Exception {
        RawResponse rawResponse = json("GetDedupTaskStatus", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, GetDedupTaskStatusRes.class);
    }

    /**
     * <p>createImageService</p>
     * <p>创建服务</p>
     *
     * <p>通过指定服务名称、服务区域以及域名来创建一个图片服务，并得到返回的服务名称和服务 ID。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public CreateImageServiceRes createImageService(CreateImageServiceBody body) throws Exception {
        RawResponse rawResponse = json("CreateImageService", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, CreateImageServiceRes.class);
    }

    /**
     * <p>deleteImageService</p>
     * <p>删除服务</p>
     *
     * <p>通过输入服务 ID 来删除对应的图片服务。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public DeleteImageServiceRes deleteImageService(DeleteImageServiceQuery query) throws Exception {
        RawResponse rawResponse = json("DeleteImageService", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, DeleteImageServiceRes.class);
    }

    /**
     * <p>updateImageAuthKey</p>
     * <p>更新主备鉴权Key</p>
     *
     * <p>本接口支持更新指定服务 ID 下的主备鉴权 Key，来修改鉴权信息。</p>
     *
     * @param query query arguments
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateImageAuthKeyRes updateImageAuthKey(UpdateImageAuthKeyQuery query, UpdateImageAuthKeyBody body) throws Exception {
        RawResponse rawResponse = json("UpdateImageAuthKey", Utils.paramsToPair(query), JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateImageAuthKeyRes.class);
    }

    /**
     * <p>updateServiceName</p>
     * <p>更新服务名称</p>
     *
     * <p>本接口支持修改指定服务 ID 的服务名称。</p>
     *
     * @param query query arguments
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateServiceNameRes updateServiceName(UpdateServiceNameQuery query, UpdateServiceNameBody body) throws Exception {
        RawResponse rawResponse = json("UpdateServiceName", Utils.paramsToPair(query), JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateServiceNameRes.class);
    }

    /**
     * <p>updateImageObjectAccess</p>
     * <p>更新源地址访问配置</p>
     *
     * <p>本接口更新指定服务 ID 下的源地址访问配置。</p>
     *
     * @param query query arguments
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateImageObjectAccessRes updateImageObjectAccess(UpdateImageObjectAccessQuery query, UpdateImageObjectAccessBody body) throws Exception {
        RawResponse rawResponse = json("UpdateImageObjectAccess", Utils.paramsToPair(query), JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateImageObjectAccessRes.class);
    }

    /**
     * <p>updateImageMirrorConf</p>
     * <p>更新镜像回源配置</p>
     *
     * <p>根据服务 ID 以及输入的待更新的镜像回源配置详情，更新该服务的镜像回源配置。</p>
     *
     * <p>:::tip</p>
     *
     * <p>本接口全量更新配置，如果某个配置项为空，比如 Host 为空，接口会将对应的配置设为空。</p>
     *
     * <p>:::</p>
     *
     * @param query query arguments
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateImageMirrorConfRes updateImageMirrorConf(UpdateImageMirrorConfQuery query, UpdateImageMirrorConfBody body) throws Exception {
        RawResponse rawResponse = json("UpdateImageMirrorConf", Utils.paramsToPair(query), JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateImageMirrorConfRes.class);
    }

    /**
     * <p>getImageAuthKey</p>
     * <p>获取主备鉴权Key</p>
     *
     * <p>本接口支持获取指定服务 ID 配置的主备鉴权信息。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public GetImageAuthKeyRes getImageAuthKey(GetImageAuthKeyQuery query) throws Exception {
        RawResponse rawResponse = json("GetImageAuthKey", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, GetImageAuthKeyRes.class);
    }

    /**
     * <p>createImageAnalyzeTask</p>
     * <p>创建离线评估任务</p>
     *
     * <p>本接口支持在指定服务下创建离线评估任务。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public CreateImageAnalyzeTaskRes createImageAnalyzeTask(CreateImageAnalyzeTaskBody body) throws Exception {
        RawResponse rawResponse = json("CreateImageAnalyzeTask", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, CreateImageAnalyzeTaskRes.class);
    }

    /**
     * <p>deleteImageAnalyzeTaskRun</p>
     * <p>删除任务执行记录</p>
     *
     * <p>本接口支持对状态为**已结束**的离线画质评估任务删除指定的执行记录。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DeleteImageAnalyzeTaskRunRes deleteImageAnalyzeTaskRun(DeleteImageAnalyzeTaskRunBody body) throws Exception {
        RawResponse rawResponse = json("DeleteImageAnalyzeTaskRun", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DeleteImageAnalyzeTaskRunRes.class);
    }

    /**
     * <p>deleteImageAnalyzeTask</p>
     * <p>删除离线评估任务</p>
     *
     * <p>本接口支持删除一个指定的离线评估任务。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DeleteImageAnalyzeTaskRes deleteImageAnalyzeTask(DeleteImageAnalyzeTaskBody body) throws Exception {
        RawResponse rawResponse = json("DeleteImageAnalyzeTask", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DeleteImageAnalyzeTaskRes.class);
    }

    /**
     * <p>updateImageAnalyzeTaskStatus</p>
     * <p>更新离线画质任务状态</p>
     *
     * <p>本接口支持更新指定的离线画质任务状态。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateImageAnalyzeTaskStatusRes updateImageAnalyzeTaskStatus(UpdateImageAnalyzeTaskStatusBody body) throws Exception {
        RawResponse rawResponse = json("UpdateImageAnalyzeTaskStatus", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateImageAnalyzeTaskStatusRes.class);
    }

    /**
     * <p>updateImageAnalyzeTask</p>
     * <p>更新离线评估任务配置</p>
     *
     * <p>本接口支持通过指定任务 ID 更新配置。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateImageAnalyzeTaskRes updateImageAnalyzeTask(UpdateImageAnalyzeTaskBody body) throws Exception {
        RawResponse rawResponse = json("UpdateImageAnalyzeTask", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateImageAnalyzeTaskRes.class);
    }

    /**
     * <p>getImageAnalyzeTasks</p>
     * <p>获取离线评估任务列表</p>
     *
     * <p>本接口支持查询全部的离线评估任务列表。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public GetImageAnalyzeTasksRes getImageAnalyzeTasks(GetImageAnalyzeTasksQuery query) throws Exception {
        RawResponse rawResponse = json("GetImageAnalyzeTasks", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, GetImageAnalyzeTasksRes.class);
    }

    /**
     * <p>getImageAnalyzeResult</p>
     * <p>获取离线评估任务结果</p>
     *
     * <p>本接口支持获取指定离线评估任务结果。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public GetImageAnalyzeResultRes getImageAnalyzeResult(GetImageAnalyzeResultQuery query) throws Exception {
        RawResponse rawResponse = json("GetImageAnalyzeResult", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, GetImageAnalyzeResultRes.class);
    }

    /**
     * <p>getImageStyleResult</p>
     * <p>获取结果图 URI</p>
     *
     * <p>使用创意魔方中预先创建好的样式 `StyleId`，定义需要设置的要素与要素的取值 `Params`，生成结果图，并获取结果图 URI。</p>
     *
     *
     *
     * <p>- 调用前，请先在控制台中完成创意魔方样式的创建，并获取图片样式 ID `StyleId` 、样式中要素 ID `Key` 与样式所在服务的 ID `ServiceId`。</p>
     *
     * <p>- 调用时，动态传入图片、文字、二维码等要素以及 Header 中的信息，实时渲染合成一张图片，并返回结果图片的 URI。</p>
     *
     * <p>- 调用后，请务必在图片服务的基础配置中开启**源地址访问**后，再使用 [veImageX 地址拼接规则](https://www.volcengine.com/docs/508/105405)。</p>
     *
     * @param query query arguments
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public GetImageStyleResultRes getImageStyleResult(GetImageStyleResultQuery query, GetImageStyleResultBody body) throws Exception {
        RawResponse rawResponse = json("GetImageStyleResult", Utils.paramsToPair(query), JSON.toJSONString(body));
        return parseRawResponse(rawResponse, GetImageStyleResultRes.class);
    }

    /**
     * <p>createImageTemplate</p>
     * <p>创建图片模版</p>
     *
     * <p>本接口支持指定服务 ID，在该服务下创建图片模板并自定义模板配置。</p>
     *
     * @param query query arguments
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public CreateImageTemplateRes createImageTemplate(CreateImageTemplateQuery query, CreateImageTemplateBody body) throws Exception {
        RawResponse rawResponse = json("CreateImageTemplate", Utils.paramsToPair(query), JSON.toJSONString(body));
        return parseRawResponse(rawResponse, CreateImageTemplateRes.class);
    }

    /**
     * <p>deleteTemplatesFromBin</p>
     * <p>删除回收站模板</p>
     *
     * <p>本接口支持通过指定服务 ID 以及模板名称，删除该服务回收站内对应的模板。</p>
     *
     * @param query query arguments
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DeleteTemplatesFromBinRes deleteTemplatesFromBin(DeleteTemplatesFromBinQuery query, DeleteTemplatesFromBinBody body) throws Exception {
        RawResponse rawResponse = json("DeleteTemplatesFromBin", Utils.paramsToPair(query), JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DeleteTemplatesFromBinRes.class);
    }

    /**
     * <p>deleteImageTemplate</p>
     * <p>删除图片模版</p>
     *
     * <p>本接口支持通过指定服务 ID 以及模板名称删除对应的图片模板。</p>
     *
     * @param query query arguments
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DeleteImageTemplateRes deleteImageTemplate(DeleteImageTemplateQuery query, DeleteImageTemplateBody body) throws Exception {
        RawResponse rawResponse = json("DeleteImageTemplate", Utils.paramsToPair(query), JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DeleteImageTemplateRes.class);
    }

    /**
     * <p>createTemplatesFromBin</p>
     * <p>恢复回收站模板</p>
     *
     * <p>本接口支持通过指定服务 ID 以及待恢复的模板名称，恢复该服务回收站内对应的模板。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>当已经有同名模版的时候，此时恢复模版会递增版本号。</p>
     *
     * <p>:::</p>
     *
     * @param query query arguments
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public CreateTemplatesFromBinRes createTemplatesFromBin(CreateTemplatesFromBinQuery query, CreateTemplatesFromBinBody body) throws Exception {
        RawResponse rawResponse = json("CreateTemplatesFromBin", Utils.paramsToPair(query), JSON.toJSONString(body));
        return parseRawResponse(rawResponse, CreateTemplatesFromBinRes.class);
    }

    /**
     * <p>getImageTemplate</p>
     * <p>获取单个图片模板</p>
     *
     * <p>本接口支持通过指定服务 ID 以及模板名称，获取单个图片模板的配置详情。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public GetImageTemplateRes getImageTemplate(GetImageTemplateQuery query) throws Exception {
        RawResponse rawResponse = json("GetImageTemplate", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, GetImageTemplateRes.class);
    }

    /**
     * <p>getTemplatesFromBin</p>
     * <p>获取回收站中所有模板</p>
     *
     * <p>本接口支持通过指定服务 ID，获取该服务下回收站内所有模板信息。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public GetTemplatesFromBinRes getTemplatesFromBin(GetTemplatesFromBinQuery query) throws Exception {
        RawResponse rawResponse = json("GetTemplatesFromBin", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, GetTemplatesFromBinRes.class);
    }

    /**
     * <p>getAllImageTemplates</p>
     * <p>获取服务下所有图片模版</p>
     *
     * <p>本接口支持通过其指定服务 ID 获取该服务下所有的图片模板信息。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public GetAllImageTemplatesRes getAllImageTemplates(GetAllImageTemplatesQuery query) throws Exception {
        RawResponse rawResponse = json("GetAllImageTemplates", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, GetAllImageTemplatesRes.class);
    }

    /**
     * <p>createImageAuditTask</p>
     * <p>创建审核任务</p>
     *
     * <p>本接口支持在指定服务下创建审核任务。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public CreateImageAuditTaskRes createImageAuditTask(CreateImageAuditTaskBody body) throws Exception {
        RawResponse rawResponse = json("CreateImageAuditTask", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, CreateImageAuditTaskRes.class);
    }

    /**
     * <p>deleteImageAuditResult</p>
     * <p>删除审核结果</p>
     *
     * <p>本接口支持删除指定任务的某条审核结果。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DeleteImageAuditResultRes deleteImageAuditResult(DeleteImageAuditResultBody body) throws Exception {
        RawResponse rawResponse = json("DeleteImageAuditResult", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DeleteImageAuditResultRes.class);
    }

    /**
     * <p>updateImageAuditTaskStatus</p>
     * <p>更新审核任务状态</p>
     *
     * <p>本接口支持任务状态为已取消的审核任务，更新其任务状态。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateImageAuditTaskStatusRes updateImageAuditTaskStatus(UpdateImageAuditTaskStatusBody body) throws Exception {
        RawResponse rawResponse = json("UpdateImageAuditTaskStatus", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateImageAuditTaskStatusRes.class);
    }

    /**
     * <p>updateImageAuditTask</p>
     * <p>更新审核任务配置</p>
     *
     * <p>本接口支持对任务状态为已取消的审核任务，通过指定服务 ID 和任务 ID 来更新该条审核任务的各项配置。</p>
     *
     * <p>:::tip</p>
     *
     * <p>您可通过调用[查询所有审核任务](https://www.volcengine.com/docs/508/1158717)查看所有审核任务的状态。</p>
     *
     * <p>:::</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateImageAuditTaskRes updateImageAuditTask(UpdateImageAuditTaskBody body) throws Exception {
        RawResponse rawResponse = json("UpdateImageAuditTask", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateImageAuditTaskRes.class);
    }

    /**
     * <p>updateAuditImageStatus</p>
     * <p>更新审核图片状态</p>
     *
     * <p>本接口支持对审核异常（审核失败、审核不通过、建议复审）的图片更新图片状态。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateAuditImageStatusRes updateAuditImageStatus(UpdateAuditImageStatusBody body) throws Exception {
        RawResponse rawResponse = json("UpdateAuditImageStatus", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateAuditImageStatusRes.class);
    }

    /**
     * <p>getImageAuditTasks</p>
     * <p>查询所有审核任务</p>
     *
     * <p>本接口支持通过指定审核类型，查询该类型下所有审核任务。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public GetImageAuditTasksRes getImageAuditTasks(GetImageAuditTasksQuery query) throws Exception {
        RawResponse rawResponse = json("GetImageAuditTasks", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, GetImageAuditTasksRes.class);
    }

    /**
     * <p>getImageAuditResult</p>
     * <p>获取审核任务结果</p>
     *
     * <p>本接口支持您通过指定任务 ID 获取该任务的审核结果。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public GetImageAuditResultRes getImageAuditResult(GetImageAuditResultQuery query) throws Exception {
        RawResponse rawResponse = json("GetImageAuditResult", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, GetImageAuditResultRes.class);
    }

    /**
     * <p>getAuditEntrysCount</p>
     * <p>获取审核图片计数</p>
     *
     * <p>本接口支持获取指定审核任务的各类审核图片计量数据。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public GetAuditEntrysCountRes getAuditEntrysCount(GetAuditEntrysCountQuery query) throws Exception {
        RawResponse rawResponse = json("GetAuditEntrysCount", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, GetAuditEntrysCountRes.class);
    }

    /**
     * <p>createImageRetryAuditTask</p>
     * <p>重试审核失败图片</p>
     *
     * <p>本接口支持重试失败图片。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public CreateImageRetryAuditTaskRes createImageRetryAuditTask(CreateImageRetryAuditTaskBody body) throws Exception {
        RawResponse rawResponse = json("CreateImageRetryAuditTask", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, CreateImageRetryAuditTaskRes.class);
    }

}
