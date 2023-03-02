package com.volcengine.service.imagex.extension;

import com.volcengine.helper.Const;
import com.volcengine.helper.Utils;
import com.volcengine.model.ApiInfo;
import com.volcengine.model.imagex.data.*;
import com.volcengine.service.imagex.IImageXService;
import com.volcengine.service.imagex.ImageXConfig;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class DataModule {
    public final static Map<String, String> EMPTY_STRING_STRING_MAP = (Map<String, String>) Collections.EMPTY_MAP;

    static public void AddDataModule() {
        new ArrayList<String>() {
            {
                add("DescribeImageXDomainTrafficData");
                add("DescribeImageXDomainBandwidthData");
                add("DescribeImageXBucketUsage");
                add("DescribeImageXRequestCntUsage");
                add("DescribeImageXBaseOpUsage");
                add("DescribeImageXCompressUsage");
                add("DescribeImageXEdgeRequest");
                add("DescribeImageXHitRateTrafficData");
                add("DescribeImageXHitRateRequestData");
                add("DescribeImageXCDNTopRequestData");
                add("DescribeImageXSummary");
                add("DescribeImageXEdgeRequestBandwidth");
                add("DescribeImageXEdgeRequestTraffic");
                add("DescribeImageXEdgeRequestRegions");
            }
        }.forEach(it -> ImageXConfig.apiInfoList.put(it, new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", it));
                                add(new BasicNameValuePair("Version", "2018-08-01"));
                            }
                        });
                    }
                }
        )));
        new ArrayList<String>() {
            {
                add("DescribeImageXMirrorRequestTraffic");
                add("DescribeImageXMirrorRequestBandwidth");
                add("DescribeImageXMirrorRequestHttpCodeByTime");
                add("DescribeImageXMirrorRequestHttpCodeOverview");
            }
        }.forEach(it -> ImageXConfig.apiInfoList.put(it, new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", it));
                                add(new BasicNameValuePair("Version", "2018-08-01"));
                            }
                        });
                    }
                }
        )));
    }

    public static DescribeImageXDomainTrafficDataResp describeImageXDomainTrafficData(IImageXService service, DescribeImageXDomainTrafficDataReq req) throws Exception {
        return service.getImageX("DescribeImageXDomainTrafficData", Utils.paramsToMap(req), DescribeImageXDomainTrafficDataResp.class).getResult();
    }

    public static DescribeImageXDomainBandwidthDataResp describeImageXDomainBandwidthData(IImageXService service, DescribeImageXDomainBandwidthDataReq req) throws Exception {
        return service.getImageX("DescribeImageXDomainBandwidthData", Utils.paramsToMap(req), DescribeImageXDomainBandwidthDataResp.class).getResult();
    }

    public static DescribeImageXBucketUsageResp describeImageXBucketUsage(IImageXService service, DescribeImageXBucketUsageReq req) throws Exception {
        return service.getImageX("DescribeImageXBucketUsage", Utils.paramsToMap(req), DescribeImageXBucketUsageResp.class).getResult();
    }

    public static DescribeImageXRequestCntUsageResp describeImageXRequestCntUsage(IImageXService service, DescribeImageXRequestCntUsageReq req) throws Exception {
        return service.getImageX("DescribeImageXRequestCntUsage", Utils.paramsToMap(req), DescribeImageXRequestCntUsageResp.class).getResult();
    }

    public static DescribeImageXBaseOpUsageResp describeImageXBaseOpUsage(IImageXService service, DescribeImageXBaseOpUsageReq req) throws Exception {
        return service.getImageX("DescribeImageXBaseOpUsage", Utils.paramsToMap(req), DescribeImageXBaseOpUsageResp.class).getResult();
    }

    public static DescribeImageXCompressUsageResp describeImageXCompressUsage(IImageXService service, DescribeImageXCompressUsageReq req) throws Exception {
        return service.getImageX("DescribeImageXCompressUsage", Utils.paramsToMap(req), DescribeImageXCompressUsageResp.class).getResult();
    }

    public static DescribeImageXEdgeRequestResp describeImageXEdgeRequest(IImageXService service, DescribeImageXEdgeRequestReq req) throws Exception {
        return service.getImageX("DescribeImageXEdgeRequest", Utils.paramsToMap(req), DescribeImageXEdgeRequestResp.class).getResult();
    }

    public static DescribeImageXHitRateTrafficDataResp describeImageXHitRateTrafficData(IImageXService service, DescribeImageXHitRateTrafficDataReq req) throws Exception {
        return service.getImageX("DescribeImageXHitRateTrafficData", Utils.paramsToMap(req), DescribeImageXHitRateTrafficDataResp.class).getResult();
    }

    public static DescribeImageXHitRateRequestDataResp describeImageXHitRateRequestData(IImageXService service, DescribeImageXHitRateRequestDataReq req) throws Exception {
        return service.getImageX("DescribeImageXHitRateRequestData", Utils.paramsToMap(req), DescribeImageXHitRateRequestDataResp.class).getResult();
    }

    public static DescribeImageXCDNTopRequestDataResp describeImageXCDNTopRequestData(IImageXService service, DescribeImageXCDNTopRequestDataReq req) throws Exception {
        return service.getImageX("DescribeImageXCDNTopRequestData", Utils.paramsToMap(req), DescribeImageXCDNTopRequestDataResp.class).getResult();
    }

    public static DescribeImageXSummaryResp describeImageXSummary(IImageXService service, DescribeImageXSummaryReq req) throws Exception {
        return service.getImageX("DescribeImageXSummary", Utils.paramsToMap(req), DescribeImageXSummaryResp.class).getResult();
    }

    public static DescribeImageXEdgeRequestBandwidthResp describeImageXEdgeRequestBandwidth(IImageXService service, DescribeImageXEdgeRequestBandwidthReq req) throws Exception {
        return service.getImageX("DescribeImageXEdgeRequestBandwidth", Utils.paramsToMap(req), DescribeImageXEdgeRequestBandwidthResp.class).getResult();
    }

    public static DescribeImageXEdgeRequestTrafficResp describeImageXEdgeRequestTraffic(IImageXService service, DescribeImageXEdgeRequestTrafficReq req) throws Exception {
        return service.getImageX("DescribeImageXEdgeRequestTraffic", Utils.paramsToMap(req), DescribeImageXEdgeRequestTrafficResp.class).getResult();
    }

    public static DescribeImageXEdgeRequestRegionsResp describeImageXEdgeRequestRegions(IImageXService service, DescribeImageXEdgeRequestRegionsReq req) throws Exception {
        return service.getImageX("DescribeImageXEdgeRequestRegions", Utils.paramsToMap(req), DescribeImageXEdgeRequestRegionsResp.class).getResult();
    }

    public static DescribeImageXMirrorRequestTrafficResp describeImageXMirrorRequestTraffic(IImageXService service, DescribeImageXMirrorRequestTrafficReq req) throws Exception {
        return service.postImageX("DescribeImageXMirrorRequestTraffic", EMPTY_STRING_STRING_MAP, req, DescribeImageXMirrorRequestTrafficResp.class).getResult();
    }

    public static DescribeImageXMirrorRequestBandwidthResp describeImageXMirrorRequestBandwidth(IImageXService service, DescribeImageXMirrorRequestBandwidthReq req) throws Exception {
        return service.postImageX("DescribeImageXMirrorRequestBandwidth", EMPTY_STRING_STRING_MAP, req, DescribeImageXMirrorRequestBandwidthResp.class).getResult();
    }

    public static DescribeImageXMirrorRequestHttpCodeByTimeResp describeImageXMirrorRequestHttpCodeByTime(IImageXService service, DescribeImageXMirrorRequestHttpCodeByTimeReq req) throws Exception {
        return service.postImageX("DescribeImageXMirrorRequestHttpCodeByTime", EMPTY_STRING_STRING_MAP, req, DescribeImageXMirrorRequestHttpCodeByTimeResp.class).getResult();
    }

    public static DescribeImageXMirrorRequestHttpCodeOverviewResp describeImageXMirrorRequestHttpCodeOverview(IImageXService service, DescribeImageXMirrorRequestHttpCodeOverviewReq req) throws Exception {
        return service.postImageX("DescribeImageXMirrorRequestHttpCodeOverview", EMPTY_STRING_STRING_MAP, req, DescribeImageXMirrorRequestHttpCodeOverviewResp.class).getResult();
    }
}
