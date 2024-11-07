package com.volcengine.service.imagex.v2;

import com.volcengine.helper.Const;
import com.volcengine.model.ApiInfo;
import com.volcengine.model.Credentials;
import com.volcengine.model.ServiceInfo;
import org.apache.http.Header;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicNameValuePair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Basic configuration for Imagex
 */
public class ImagexConfig {
    /**
     * Basic service configuration for Imagex
     */
    public static Map<String, ServiceInfo> serviceInfoMap = new HashMap<String, ServiceInfo>() {
        {
            put("cn-north-1", new ServiceInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.CONNECTION_TIMEOUT, 5000);
                            put(Const.SOCKET_TIMEOUT, 5000);
                            put(Const.Scheme, "https");
                            put(Const.Host, "imagex.volcengineapi.com");
                            put(Const.Header, new ArrayList<Header>() {
                                {
                                    add(new BasicHeader("Accept", "application/json"));
                                }
                            });
                            put(Const.Credentials, new Credentials("cn-north-1", "ImageX"));
                        }
                    }
            ));
            put("ap-singapore-1", new ServiceInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.CONNECTION_TIMEOUT, 5000);
                            put(Const.SOCKET_TIMEOUT, 5000);
                            put(Const.Scheme, "https");
                            put(Const.Host, "imagex-ap-singapore-1.volcengineapi.com");
                            put(Const.Header, new ArrayList<Header>() {
                                {
                                    add(new BasicHeader("Accept", "application/json"));
                                }
                            });
                            put(Const.Credentials, new Credentials("ap-singapore-1", "ImageX"));
                        }
                    }
            ));
            put("us-east-1", new ServiceInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.CONNECTION_TIMEOUT, 5000);
                            put(Const.SOCKET_TIMEOUT, 5000);
                            put(Const.Scheme, "https");
                            put(Const.Host, "imagex-us-east-1.volcengineapi.com");
                            put(Const.Header, new ArrayList<Header>() {
                                {
                                    add(new BasicHeader("Accept", "application/json"));
                                }
                            });
                            put(Const.Credentials, new Credentials("us-east-1", "ImageX"));
                        }
                    }
            ));
        }
    };

    /**
     * Basic api configuration for Imagex
     */
    public static Map<String, ApiInfo> apiInfoList = new HashMap<String, ApiInfo>() {
        {
            put("DelDomain", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DelDomain"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("UpdateRefer", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateRefer"));
                                add(new BasicNameValuePair("Version", "2018-08-01"));
                            }
                        });
                    }
                }     
            ));
            put("UpdateHttps", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateHttps"));
                                add(new BasicNameValuePair("Version", "2018-08-01"));
                            }
                        });
                    }
                }     
            ));
            put("UpdateResponseHeader", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateResponseHeader"));
                                add(new BasicNameValuePair("Version", "2018-08-01"));
                            }
                        });
                    }
                }     
            ));
            put("SetDefaultDomain", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "SetDefaultDomain"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeImageVolcCdnAccessLog", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeImageVolcCdnAccessLog"));
                                add(new BasicNameValuePair("Version", "2018-08-01"));
                            }
                        });
                    }
                }     
            ));
            put("GetResponseHeaderValidateKeys", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetResponseHeaderValidateKeys"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("GetDomainConfig", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetDomainConfig"));
                                add(new BasicNameValuePair("Version", "2018-08-01"));
                            }
                        });
                    }
                }     
            ));
            put("GetServiceDomains", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetServiceDomains"));
                                add(new BasicNameValuePair("Version", "2018-08-01"));
                            }
                        });
                    }
                }     
            ));
            put("CreateImageMigrateTask", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "CreateImageMigrateTask"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DeleteImageMigrateTask", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DeleteImageMigrateTask"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("ExportFailedMigrateTask", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ExportFailedMigrateTask"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("UpdateImageTaskStrategy", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateImageTaskStrategy"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("TerminateImageMigrateTask", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "TerminateImageMigrateTask"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("GetVendorBuckets", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetVendorBuckets"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("GetImageMigrateTasks", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetImageMigrateTasks"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("RerunImageMigrateTask", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "RerunImageMigrateTask"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeImageXSourceRequestBandwidth", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeImageXSourceRequestBandwidth"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeImageXSourceRequestTraffic", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeImageXSourceRequestTraffic"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeImageXSourceRequest", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeImageXSourceRequest"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeImageXBucketRetrievalUsage", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeImageXBucketRetrievalUsage"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeImageXSummary", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeImageXSummary"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeImageXDomainTrafficData", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeImageXDomainTrafficData"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeImageXDomainBandwidthData", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeImageXDomainBandwidthData"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeImageXDomainBandwidthNinetyFiveData", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeImageXDomainBandwidthNinetyFiveData"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeImageXBucketUsage", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeImageXBucketUsage"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeImageXBillingRequestCntUsage", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeImageXBillingRequestCntUsage"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeImageXRequestCntUsage", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeImageXRequestCntUsage"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeImageXBaseOpUsage", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeImageXBaseOpUsage"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeImageXCompressUsage", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeImageXCompressUsage"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeImageXScreenshotUsage", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeImageXScreenshotUsage"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeImageXVideoClipDurationUsage", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeImageXVideoClipDurationUsage"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeImageXMultiCompressUsage", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeImageXMultiCompressUsage"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeImageXEdgeRequest", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeImageXEdgeRequest"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeImageXEdgeRequestBandwidth", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeImageXEdgeRequestBandwidth"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeImageXEdgeRequestTraffic", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeImageXEdgeRequestTraffic"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeImageXEdgeRequestRegions", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeImageXEdgeRequestRegions"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeImageXMirrorRequestHttpCodeByTime", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeImageXMirrorRequestHttpCodeByTime"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeImageXMirrorRequestHttpCodeOverview", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeImageXMirrorRequestHttpCodeOverview"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeImageXMirrorRequestTraffic", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeImageXMirrorRequestTraffic"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeImageXMirrorRequestBandwidth", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeImageXMirrorRequestBandwidth"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeImageXServerQPSUsage", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeImageXServerQPSUsage"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeImageXHitRateTrafficData", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeImageXHitRateTrafficData"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeImageXHitRateRequestData", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeImageXHitRateRequestData"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeImageXCDNTopRequestData", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeImageXCDNTopRequestData"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeImageXExceedResolutionRatioAll", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeImageXExceedResolutionRatioAll"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeImageXExceedFileSize", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeImageXExceedFileSize"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeImageXExceedCountByTime", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeImageXExceedCountByTime"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeImageXServiceQuality", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeImageXServiceQuality"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("GetImageXQueryApps", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetImageXQueryApps"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("GetImageXQueryRegions", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetImageXQueryRegions"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("GetImageXQueryDims", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetImageXQueryDims"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("GetImageXQueryVals", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetImageXQueryVals"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeImageXUploadCountByTime", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeImageXUploadCountByTime"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeImageXUploadDuration", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeImageXUploadDuration"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeImageXUploadSuccessRateByTime", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeImageXUploadSuccessRateByTime"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeImageXUploadFileSize", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeImageXUploadFileSize"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeImageXUploadErrorCodeByTime", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeImageXUploadErrorCodeByTime"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeImageXUploadErrorCodeAll", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeImageXUploadErrorCodeAll"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeImageXUploadSpeed", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeImageXUploadSpeed"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeImageXUploadSegmentSpeedByTime", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeImageXUploadSegmentSpeedByTime"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeImageXCdnSuccessRateByTime", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeImageXCdnSuccessRateByTime"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeImageXCdnSuccessRateAll", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeImageXCdnSuccessRateAll"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeImageXCdnErrorCodeByTime", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeImageXCdnErrorCodeByTime"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeImageXCdnErrorCodeAll", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeImageXCdnErrorCodeAll"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeImageXCdnDurationDetailByTime", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeImageXCdnDurationDetailByTime"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeImageXCdnDurationAll", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeImageXCdnDurationAll"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeImageXCdnReuseRateByTime", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeImageXCdnReuseRateByTime"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeImageXCdnReuseRateAll", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeImageXCdnReuseRateAll"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeImageXCdnProtocolRateByTime", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeImageXCdnProtocolRateByTime"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeImageXClientFailureRate", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeImageXClientFailureRate"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeImageXClientDecodeSuccessRateByTime", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeImageXClientDecodeSuccessRateByTime"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeImageXClientDecodeDurationByTime", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeImageXClientDecodeDurationByTime"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeImageXClientQueueDurationByTime", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeImageXClientQueueDurationByTime"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeImageXClientErrorCodeByTime", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeImageXClientErrorCodeByTime"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeImageXClientErrorCodeAll", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeImageXClientErrorCodeAll"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeImageXClientLoadDuration", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeImageXClientLoadDuration"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeImageXClientLoadDurationAll", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeImageXClientLoadDurationAll"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeImageXClientSdkVerByTime", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeImageXClientSdkVerByTime"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeImageXClientFileSize", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeImageXClientFileSize"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeImageXClientTopFileSize", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeImageXClientTopFileSize"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeImageXClientCountByTime", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeImageXClientCountByTime"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeImageXClientQualityRateByTime", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeImageXClientQualityRateByTime"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeImageXClientTopQualityURL", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeImageXClientTopQualityURL"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeImageXClientDemotionRateByTime", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeImageXClientDemotionRateByTime"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeImageXClientTopDemotionURL", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeImageXClientTopDemotionURL"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeImageXClientScoreByTime", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeImageXClientScoreByTime"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeImageXSensibleCountByTime", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeImageXSensibleCountByTime"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeImageXSensibleCacheHitRateByTime", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeImageXSensibleCacheHitRateByTime"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeImageXSensibleTopSizeURL", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeImageXSensibleTopSizeURL"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeImageXSensibleTopResolutionURL", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeImageXSensibleTopResolutionURL"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeImageXSensibleTopRamURL", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeImageXSensibleTopRamURL"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeImageXSensibleTopUnknownURL", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeImageXSensibleTopUnknownURL"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("UpdateImageResourceStatus", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateImageResourceStatus"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("GetImageStorageFiles", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetImageStorageFiles"));
                                add(new BasicNameValuePair("Version", "2018-08-01"));
                            }
                        });
                    }
                }     
            ));
            put("DeleteImageUploadFiles", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DeleteImageUploadFiles"));
                                add(new BasicNameValuePair("Version", "2018-08-01"));
                            }
                        });
                    }
                }     
            ));
            put("UpdateImageUploadFiles", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateImageUploadFiles"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("CommitImageUpload", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "CommitImageUpload"));
                                add(new BasicNameValuePair("Version", "2018-08-01"));
                            }
                        });
                    }
                }     
            ));
            put("ApplyImageUpload", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ApplyImageUpload"));
                                add(new BasicNameValuePair("Version", "2018-08-01"));
                            }
                        });
                    }
                }     
            ));
            put("GetImageUploadFile", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetImageUploadFile"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("GetImageUploadFiles", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetImageUploadFiles"));
                                add(new BasicNameValuePair("Version", "2018-08-01"));
                            }
                        });
                    }
                }     
            ));
            put("GetImageUpdateFiles", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetImageUpdateFiles"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("PreviewImageUploadFile", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "PreviewImageUploadFile"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("GetImageService", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetImageService"));
                                add(new BasicNameValuePair("Version", "2018-08-01"));
                            }
                        });
                    }
                }     
            ));
            put("GetAllImageServices", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetAllImageServices"));
                                add(new BasicNameValuePair("Version", "2018-08-01"));
                            }
                        });
                    }
                }     
            ));
            put("CreateImageCompressTask", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "CreateImageCompressTask"));
                                add(new BasicNameValuePair("Version", "2018-08-01"));
                            }
                        });
                    }
                }     
            ));
            put("FetchImageUrl", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "FetchImageUrl"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("UpdateImageStorageTTL", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateImageStorageTTL"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("GetCompressTaskInfo", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetCompressTaskInfo"));
                                add(new BasicNameValuePair("Version", "2018-08-01"));
                            }
                        });
                    }
                }     
            ));
            put("GetUrlFetchTask", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetUrlFetchTask"));
                                add(new BasicNameValuePair("Version", "2018-08-01"));
                            }
                        });
                    }
                }     
            ));
            put("GetResourceURL", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetResourceURL"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("CreateImageFromUri", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "CreateImageFromUri"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("UpdateImageFileKey", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateImageFileKey"));
                                add(new BasicNameValuePair("Version", "2018-08-01"));
                            }
                        });
                    }
                }     
            ));
            put("CreateImageContentTask", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "CreateImageContentTask"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("GetImageContentTaskDetail", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetImageContentTaskDetail"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("GetImageContentBlockList", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetImageContentBlockList"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("CreateImageTranscodeQueue", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "CreateImageTranscodeQueue"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DeleteImageTranscodeQueue", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DeleteImageTranscodeQueue"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("UpdateImageTranscodeQueue", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateImageTranscodeQueue"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("UpdateImageTranscodeQueueStatus", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateImageTranscodeQueueStatus"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("GetImageTranscodeQueues", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetImageTranscodeQueues"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("CreateImageTranscodeTask", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "CreateImageTranscodeTask"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("GetImageTranscodeDetails", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetImageTranscodeDetails"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("CreateImageTranscodeCallback", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "CreateImageTranscodeCallback"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DeleteImageTranscodeDetail", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DeleteImageTranscodeDetail"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("GetImagePSDetection", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetImagePSDetection"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("GetImageEraseResult", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetImageEraseResult"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("GetImageSuperResolutionResult", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetImageSuperResolutionResult"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("GetImageDuplicateDetection", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetImageDuplicateDetection"));
                                add(new BasicNameValuePair("Version", "2018-08-01"));
                            }
                        });
                    }
                }     
            ));
            put("GetImageOCRV2", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetImageOCRV2"));
                                add(new BasicNameValuePair("Version", "2018-08-01"));
                            }
                        });
                    }
                }     
            ));
            put("GetImageBgFillResult", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetImageBgFillResult"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("GetSegmentImage", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetSegmentImage"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("GetImageSmartCropResult", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetImageSmartCropResult"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("GetImageComicResult", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetImageComicResult"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("GetImageEnhanceResult", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetImageEnhanceResult"));
                                add(new BasicNameValuePair("Version", "2018-08-01"));
                            }
                        });
                    }
                }     
            ));
            put("GetImageQuality", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetImageQuality"));
                                add(new BasicNameValuePair("Version", "2018-08-01"));
                            }
                        });
                    }
                }     
            ));
            put("GetPrivateImageType", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetPrivateImageType"));
                                add(new BasicNameValuePair("Version", "2018-08-01"));
                            }
                        });
                    }
                }     
            ));
            put("CreateHiddenWatermarkImage", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "CreateHiddenWatermarkImage"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("UpdateImageExifData", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateImageExifData"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("GetImageDetectResult", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetImageDetectResult"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("CreateImageHmExtract", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "CreateImageHmExtract"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("CreateImageHmEmbed", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "CreateImageHmEmbed"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("GetComprehensiveEnhanceImage", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetComprehensiveEnhanceImage"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("GetImageEraseModels", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetImageEraseModels"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("GetDedupTaskStatus", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetDedupTaskStatus"));
                                add(new BasicNameValuePair("Version", "2018-08-01"));
                            }
                        });
                    }
                }     
            ));
            put("CreateImageService", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "CreateImageService"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DeleteImageService", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DeleteImageService"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("UpdateImageAuthKey", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateImageAuthKey"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("UpdateServiceName", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateServiceName"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("UpdateImageObjectAccess", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateImageObjectAccess"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("UpdateImageMirrorConf", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateImageMirrorConf"));
                                add(new BasicNameValuePair("Version", "2018-08-01"));
                            }
                        });
                    }
                }     
            ));
            put("GetImageServiceSubscription", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetImageServiceSubscription"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("GetImageAuthKey", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetImageAuthKey"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("CreateImageAnalyzeTask", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "CreateImageAnalyzeTask"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DeleteImageAnalyzeTaskRun", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DeleteImageAnalyzeTaskRun"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DeleteImageAnalyzeTask", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DeleteImageAnalyzeTask"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("UpdateImageAnalyzeTaskStatus", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateImageAnalyzeTaskStatus"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("UpdateImageAnalyzeTask", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateImageAnalyzeTask"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("GetImageAnalyzeTasks", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetImageAnalyzeTasks"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("GetImageAnalyzeResult", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetImageAnalyzeResult"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("GetImageStyleResult", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetImageStyleResult"));
                                add(new BasicNameValuePair("Version", "2018-08-01"));
                            }
                        });
                    }
                }     
            ));
            put("CreateImageTemplate", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "CreateImageTemplate"));
                                add(new BasicNameValuePair("Version", "2018-08-01"));
                            }
                        });
                    }
                }     
            ));
            put("DeleteTemplatesFromBin", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DeleteTemplatesFromBin"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DeleteImageTemplate", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DeleteImageTemplate"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("CreateTemplatesFromBin", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "CreateTemplatesFromBin"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("GetImageTemplate", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetImageTemplate"));
                                add(new BasicNameValuePair("Version", "2018-08-01"));
                            }
                        });
                    }
                }     
            ));
            put("GetTemplatesFromBin", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetTemplatesFromBin"));
                                add(new BasicNameValuePair("Version", "2018-08-01"));
                            }
                        });
                    }
                }     
            ));
            put("GetAllImageTemplates", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetAllImageTemplates"));
                                add(new BasicNameValuePair("Version", "2018-08-01"));
                            }
                        });
                    }
                }     
            ));
            put("CreateImageAuditTask", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "CreateImageAuditTask"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("DeleteImageAuditResult", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DeleteImageAuditResult"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("UpdateImageAuditTaskStatus", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateImageAuditTaskStatus"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("UpdateImageAuditTask", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateImageAuditTask"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("UpdateAuditImageStatus", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateAuditImageStatus"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("GetImageAuditTasks", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetImageAuditTasks"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("CreateCVImageGenerateTask", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "CreateCVImageGenerateTask"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("GetCVTextGenerateImage", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetCVTextGenerateImage"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("GetCVImageGenerateTask", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetCVImageGenerateTask"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("GetCVAnimeGenerateImage", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetCVAnimeGenerateImage"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("GetCVImageGenerateResult", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetCVImageGenerateResult"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("GetImageAuditResult", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetImageAuditResult"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("GetAuditEntrysCount", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetAuditEntrysCount"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
            put("GetSyncAuditResult", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetSyncAuditResult"));
                                add(new BasicNameValuePair("Version", "2018-08-01"));
                            }
                        });
                    }
                }     
            ));
            put("CreateImageRetryAuditTask", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "CreateImageRetryAuditTask"));
                                add(new BasicNameValuePair("Version", "2023-05-01"));
                            }
                        });
                    }
                }     
            ));
        }
    };
}
