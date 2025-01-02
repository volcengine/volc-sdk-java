package com.volcengine.service.cdn;

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

public class CDNConfig {
    public static ServiceInfo serviceInfo = new ServiceInfo(
            new HashMap<String, Object>() {
                {
                    put(Const.CONNECTION_TIMEOUT, 30000);
                    put(Const.SOCKET_TIMEOUT, 30000);
                    put(Const.Host, "cdn.volcengineapi.com");
                    put(Const.Header, new ArrayList<Header>() {
                        {
                            add(new BasicHeader("Accept", "application/json"));
                        }
                    });
                    put(Const.Credentials, new Credentials(Const.REGION_CN_NORTH_1, "CDN"));
                }
            }
    );
    
    public static Map<String, ApiInfo> apiInfoList = new HashMap<String, ApiInfo>() {
        {
            // 添加加速域名: https://www.volcengine.com/docs/6454/97340
            put("AddCdnDomain", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "AddCdnDomain"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            // 上线加速域名: https://www.volcengine.com/docs/6454/74667
            put("StartCdnDomain", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "StartCdnDomain"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            // 下线加速域名: https://www.volcengine.com/docs/6454/75129
            put("StopCdnDomain", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "StopCdnDomain"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            // 删除加速域名: https://www.volcengine.com/docs/6454/75130
            put("DeleteCdnDomain", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DeleteCdnDomain"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            // 获取域名列表: https://www.volcengine.com/docs/6454/75269
            put("ListCdnDomains", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "ListCdnDomains"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            // 获取域名配置详情: https://www.volcengine.com/docs/6454/80320
            put("DescribeCdnConfig", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeCdnConfig"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            // 修改加速域名配置: https://www.volcengine.com/docs/6454/97266
            put("UpdateCdnConfig", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "UpdateCdnConfig"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            // 获取访问统计的细分数据: https://www.volcengine.com/docs/6454/70442
            put("DescribeCdnData", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeCdnData"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            // 获取访问统计的汇总数据: https://www.volcengine.com/docs/6454/96132
            put("DescribeEdgeNrtDataSummary", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeEdgeNrtDataSummary"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            // 获取回源统计的细分数据: https://www.volcengine.com/docs/6454/70443
            put("DescribeCdnOriginData", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeCdnOriginData"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            // 获取回源统计的汇总数据: https://www.volcengine.com/docs/6454/96133
            put("DescribeOriginNrtDataSummary", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeOriginNrtDataSummary"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            // 获取省份运营商的细分数据: https://www.volcengine.com/docs/6454/75159
            put("DescribeCdnDataDetail", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeCdnDataDetail"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            // 获取多个域名的省份和运营商的细分数据: https://www.volcengine.com/docs/6454/145577
            put("DescribeDistrictIspData", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeDistrictIspData"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            // 获取独立访客的细分数据: https://www.volcengine.com/docs/6454/79321
            put("DescribeEdgeStatisticalData", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeEdgeStatisticalData"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            // 获取访问统计的排行数据: https://www.volcengine.com/docs/6454/96145
            put("DescribeEdgeTopNrtData", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeEdgeTopNrtData"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            // 获取回源数据的统计排序: https://www.volcengine.com/docs/6454/104892
            put("DescribeOriginTopNrtData", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeOriginTopNrtData"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            // 获取访问状态码的统计排序: https://www.volcengine.com/docs/6454/104888
            put("DescribeEdgeTopStatusCode", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeEdgeTopStatusCode"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            // 获取回源状态码的统计排序: https://www.volcengine.com/docs/6454/104891
            put("DescribeOriginTopStatusCode", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeOriginTopStatusCode"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            // 获取热点及访客排行数据: https://www.volcengine.com/docs/6454/79322
            put("DescribeEdgeTopStatisticalData", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeEdgeTopStatisticalData"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            // 获取区域和 ISP 列表: https://www.volcengine.com/docs/6454/70445
            put("DescribeCdnRegionAndIsp", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeCdnRegionAndIsp"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            // 获取服务相关信息: https://www.volcengine.com/docs/6454/78999
            put("DescribeCdnService", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeCdnService"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            // 获取计费指标的细分数据: https://www.volcengine.com/docs/6454/96167
            put("DescribeAccountingData", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeAccountingData"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            // 提交刷新任务: https://www.volcengine.com/docs/6454/70438
            put("SubmitRefreshTask", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "SubmitRefreshTask"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            // 提交预热任务: https://www.volcengine.com/docs/6454/70436
            put("SubmitPreloadTask", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "SubmitPreloadTask"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            // 获取刷新预热任务信息: https://www.volcengine.com/docs/6454/70437
            put("DescribeContentTasks", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeContentTasks"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            // 获取刷新预热配额信息: https://www.volcengine.com/docs/6454/70439
            put("DescribeContentQuota", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeContentQuota"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            // 提交封禁任务: https://www.volcengine.com/docs/6454/79890
            put("SubmitBlockTask", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "SubmitBlockTask"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            // 提交解封任务: https://www.volcengine.com/docs/6454/79893
            put("SubmitUnblockTask", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "SubmitUnblockTask"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            // 获取封禁解封任务信息: https://www.volcengine.com/docs/6454/79906
            put("DescribeContentBlockTasks", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeContentBlockTasks"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            // 获取访问日志下载链接: https://www.volcengine.com/docs/6454/70446
            put("DescribeCdnAccessLog", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeCdnAccessLog"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            // 获取 IP 归属信息: https://www.volcengine.com/docs/6454/75233
            put("DescribeIPInfo", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeIPInfo"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            // 批量获取 IP 归属信息: https://www.volcengine.com/docs/6454/106852
            put("DescribeIPListInfo", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeIPListInfo"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            // 获取回源节点 IP 列表: https://www.volcengine.com/docs/6454/75273
            put("DescribeCdnUpperIp", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeCdnUpperIp"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            // 添加资源标签: https://www.volcengine.com/docs/6454/80308
            put("AddResourceTags", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "AddResourceTags"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            // 更新资源标签: https://www.volcengine.com/docs/6454/80313
            put("UpdateResourceTags", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "UpdateResourceTags"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            // 查询标签清单: https://www.volcengine.com/docs/6454/80315
            put("ListResourceTags", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "ListResourceTags"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            // 删除资源标签: https://www.volcengine.com/docs/6454/80316
            put("DeleteResourceTags", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DeleteResourceTags"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            // 上传证书: https://www.volcengine.com/docs/6454/125708
            put("AddCdnCertificate", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "AddCdnCertificate"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            // 查询CDN证书列表: https://www.volcengine.com/docs/6454/125709
            put("ListCertInfo", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "ListCertInfo"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            // 查询CDN有关联域名的证书列表: https://www.volcengine.com/docs/6454/125710
            put("ListCdnCertInfo", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "ListCdnCertInfo"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            // 获取特定证书的域名关联信息: https://www.volcengine.com/docs/6454/125711
            put("DescribeCertConfig", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeCertConfig"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            // 批量关联证书: https://www.volcengine.com/docs/6454/125712
            put("BatchDeployCert", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "BatchDeployCert"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            // 删除托管在内容分发网络的证书: https://www.volcengine.com/docs/6454/597589
            put("DeleteCdnCertificate", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DeleteCdnCertificate"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            // 查询计费结果数据: 
            put("DescribeAccountingSummary", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeAccountingSummary"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            // 获取访问统计的细分数据: 
            put("DescribeDistrictData", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeDistrictData"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            // 获取计费区域的细分数据: 
            put("DescribeEdgeData", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeEdgeData"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            // 获取访问统计的汇总数据: 
            put("DescribeDistrictSummary", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeDistrictSummary"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            // 获取计费区域的汇总数据: 
            put("DescribeEdgeSummary", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeEdgeSummary"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            // 获取回源统计的细分数据: 
            put("DescribeOriginData", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeOriginData"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            // 获取回源统计的汇总数据: 
            put("DescribeOriginSummary", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeOriginSummary"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            // 获取独立访客的细分数据: 
            put("DescribeUserData", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeUserData"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            // 获取访问数据的统计排名: 
            put("DescribeDistrictRanking", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeDistrictRanking"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            // 获取计费区域的统计排名: 
            put("DescribeEdgeRanking", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeEdgeRanking"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            // 获取回源数据的统计排名: 
            put("DescribeOriginRanking", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeOriginRanking"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            // 获取访问状态码排名数据: 
            put("DescribeEdgeStatusCodeRanking", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeEdgeStatusCodeRanking"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            // 获取回源状态码的统计排名: 
            put("DescribeOriginStatusCodeRanking", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeOriginStatusCodeRanking"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            // 获取热门对象的统计排名: 
            put("DescribeStatisticalRanking", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeStatisticalRanking"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            // 批量更新加速域名: 
            put("BatchUpdateCdnConfig", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "BatchUpdateCdnConfig"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            // 上传证书新版: 
            put("AddCertificate", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "AddCertificate"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            // 删除用量导出任务: 
            put("DeleteUsageReport", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DeleteUsageReport"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            // 创建用量导出任务: 
            put("CreateUsageReport", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "CreateUsageReport"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            // 获取用量导出任务列表: 
            put("ListUsageReports", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "ListUsageReports"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            // 查询全局配置: 
            put("DescribeSharedConfig", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeSharedConfig"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            // 查询全局配置列表: 
            put("ListSharedConfig", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "ListSharedConfig"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            // 删除全局配置: 
            put("DeleteSharedConfig", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DeleteSharedConfig"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            // 修改全局配置: 
            put("UpdateSharedConfig", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "UpdateSharedConfig"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            // 新增全局配置: 
            put("AddSharedConfig", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "AddSharedConfig"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            // 接入域名校验: 
            put("CheckDomain", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "CheckDomain"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            // DNS校验信息生成: 
            put("DescribeRetrieveInfo", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeRetrieveInfo"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));


        }
    };
}
