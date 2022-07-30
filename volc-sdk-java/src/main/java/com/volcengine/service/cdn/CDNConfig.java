package com.volcengine.service.cdn;

import com.volcengine.helper.Const;
import com.volcengine.model.*;

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
                            add(new Header("Accept", "application/json"));
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
                                    add(new NameValuePair("Action", "AddCdnDomain"));
                                    add(new NameValuePair("Version", "2021-03-01"));
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
                                    add(new NameValuePair("Action", "StartCdnDomain"));
                                    add(new NameValuePair("Version", "2021-03-01"));
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
                                    add(new NameValuePair("Action", "StopCdnDomain"));
                                    add(new NameValuePair("Version", "2021-03-01"));
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
                                    add(new NameValuePair("Action", "DeleteCdnDomain"));
                                    add(new NameValuePair("Version", "2021-03-01"));
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
                                    add(new NameValuePair("Action", "ListCdnDomains"));
                                    add(new NameValuePair("Version", "2021-03-01"));
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
                                    add(new NameValuePair("Action", "DescribeCdnConfig"));
                                    add(new NameValuePair("Version", "2021-03-01"));
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
                                    add(new NameValuePair("Action", "UpdateCdnConfig"));
                                    add(new NameValuePair("Version", "2021-03-01"));
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
                                    add(new NameValuePair("Action", "DescribeCdnData"));
                                    add(new NameValuePair("Version", "2021-03-01"));
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
                                    add(new NameValuePair("Action", "DescribeEdgeNrtDataSummary"));
                                    add(new NameValuePair("Version", "2021-03-01"));
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
                                    add(new NameValuePair("Action", "DescribeCdnOriginData"));
                                    add(new NameValuePair("Version", "2021-03-01"));
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
                                    add(new NameValuePair("Action", "DescribeOriginNrtDataSummary"));
                                    add(new NameValuePair("Version", "2021-03-01"));
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
                                    add(new NameValuePair("Action", "DescribeCdnDataDetail"));
                                    add(new NameValuePair("Version", "2021-03-01"));
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
                                    add(new NameValuePair("Action", "DescribeEdgeStatisticalData"));
                                    add(new NameValuePair("Version", "2021-03-01"));
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
                                    add(new NameValuePair("Action", "DescribeEdgeTopNrtData"));
                                    add(new NameValuePair("Version", "2021-03-01"));
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
                                    add(new NameValuePair("Action", "DescribeOriginTopNrtData"));
                                    add(new NameValuePair("Version", "2021-03-01"));
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
                                    add(new NameValuePair("Action", "DescribeEdgeTopStatusCode"));
                                    add(new NameValuePair("Version", "2021-03-01"));
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
                                    add(new NameValuePair("Action", "DescribeOriginTopStatusCode"));
                                    add(new NameValuePair("Version", "2021-03-01"));
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
                                    add(new NameValuePair("Action", "DescribeEdgeTopStatisticalData"));
                                    add(new NameValuePair("Version", "2021-03-01"));
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
                                    add(new NameValuePair("Action", "DescribeCdnRegionAndIsp"));
                                    add(new NameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));
// （Deprecated）查询域名排行数据: https://www.volcengine.com/docs/6454/70447?type=preview
            put("DescribeCdnDomainTopData", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", "DescribeCdnDomainTopData"));
                                    add(new NameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));
// 查询账号计费方式: https://www.volcengine.com/docs/6454/78999
            put("DescribeCdnService", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", "DescribeCdnService"));
                                    add(new NameValuePair("Version", "2021-03-01"));
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
                                    add(new NameValuePair("Action", "DescribeAccountingData"));
                                    add(new NameValuePair("Version", "2021-03-01"));
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
                                    add(new NameValuePair("Action", "SubmitRefreshTask"));
                                    add(new NameValuePair("Version", "2021-03-01"));
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
                                    add(new NameValuePair("Action", "SubmitPreloadTask"));
                                    add(new NameValuePair("Version", "2021-03-01"));
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
                                    add(new NameValuePair("Action", "DescribeContentTasks"));
                                    add(new NameValuePair("Version", "2021-03-01"));
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
                                    add(new NameValuePair("Action", "DescribeContentQuota"));
                                    add(new NameValuePair("Version", "2021-03-01"));
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
                                    add(new NameValuePair("Action", "SubmitBlockTask"));
                                    add(new NameValuePair("Version", "2021-03-01"));
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
                                    add(new NameValuePair("Action", "SubmitUnblockTask"));
                                    add(new NameValuePair("Version", "2021-03-01"));
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
                                    add(new NameValuePair("Action", "DescribeContentBlockTasks"));
                                    add(new NameValuePair("Version", "2021-03-01"));
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
                                    add(new NameValuePair("Action", "DescribeCdnAccessLog"));
                                    add(new NameValuePair("Version", "2021-03-01"));
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
                                    add(new NameValuePair("Action", "DescribeIPInfo"));
                                    add(new NameValuePair("Version", "2021-03-01"));
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
                                    add(new NameValuePair("Action", "DescribeCdnUpperIp"));
                                    add(new NameValuePair("Version", "2021-03-01"));
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
                                    add(new NameValuePair("Action", "AddResourceTags"));
                                    add(new NameValuePair("Version", "2021-03-01"));
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
                                    add(new NameValuePair("Action", "UpdateResourceTags"));
                                    add(new NameValuePair("Version", "2021-03-01"));
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
                                    add(new NameValuePair("Action", "ListResourceTags"));
                                    add(new NameValuePair("Version", "2021-03-01"));
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
                                    add(new NameValuePair("Action", "DeleteResourceTags"));
                                    add(new NameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));
        }
    };
}
