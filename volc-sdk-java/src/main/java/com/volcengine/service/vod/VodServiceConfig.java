package com.volcengine.service.vod;

import com.volcengine.model.ApiInfo;
import com.volcengine.model.Credentials;
import com.volcengine.model.ServiceInfo;
import com.volcengine.model.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class VodServiceConfig {

    public static Map<String, ServiceInfo> ServiceInfoMap = new HashMap<String, ServiceInfo>() {
        {
            put(com.volcengine.helper.Const.REGION_CN_NORTH_1, new ServiceInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.CONNECTION_TIMEOUT, 5000);
                            put(com.volcengine.helper.Const.SOCKET_TIMEOUT, 5000);
                            put(com.volcengine.helper.Const.Host, "vod.volcengineapi.com");
                            put(com.volcengine.helper.Const.Header, new ArrayList<Header>() {
                                {
                                    add(new Header("Accept", "application/json"));
                                }
                            });
                            put(com.volcengine.helper.Const.Credentials, new Credentials(com.volcengine.helper.Const.REGION_CN_NORTH_1, "vod"));
                        }
                    }
            ));
        }
    };

    public static Map<String, ApiInfo> apiInfoList = new HashMap<String, ApiInfo>() {
        {
            // **********************************************************************
            // 播放
            // **********************************************************************
            put(Const.GetPlayInfo, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.GetPlayInfo));
                                    add(new NameValuePair("Version", "2020-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetAllPlayInfo, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.GetAllPlayInfo));
                                    add(new NameValuePair("Version", "2022-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetPrivateDrmPlayAuth, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.GetPrivateDrmPlayAuth));
                                    add(new NameValuePair("Version", "2020-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetHlsDecryptionKey, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.GetHlsDecryptionKey));
                                    add(new NameValuePair("Version", "2020-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetPlayInfoWithLiveTimeShiftScene, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.GetPlayInfoWithLiveTimeShiftScene));
                                    add(new NameValuePair("Version", "2021-11-01"));
                                }
                            });
                        }
                    }
            ));

            // **********************************************************************
            // 上传
            // **********************************************************************
            put(Const.UploadMediaByUrl, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.UploadMediaByUrl));
                                    add(new NameValuePair("Version", "2020-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.QueryUploadTaskInfo, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.QueryUploadTaskInfo));
                                    add(new NameValuePair("Version", "2020-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ApplyUploadInfo, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.ApplyUploadInfo));
                                    add(new NameValuePair("Version", "2020-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.CommitUploadInfo, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.CommitUploadInfo));
                                    add(new NameValuePair("Version", "2020-08-01"));
                                }
                            });
                            put(com.volcengine.helper.Const.CONNECTION_TIMEOUT, 8000);
                            put(com.volcengine.helper.Const.SOCKET_TIMEOUT, 8000);
                        }
                    }
            ));

            // **********************************************************************
            // 媒资
            // **********************************************************************
            put(Const.UpdateMediaInfo, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.UpdateMediaInfo));
                                    add(new NameValuePair("Version", "2020-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateMediaPublishStatus, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.UpdateMediaPublishStatus));
                                    add(new NameValuePair("Version", "2020-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetMediaInfos, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.GetMediaInfos));
                                    add(new NameValuePair("Version", "2020-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetRecommendedPoster, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.GetRecommendedPoster));
                                    add(new NameValuePair("Version", "2020-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.DeleteMedia, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.DeleteMedia));
                                    add(new NameValuePair("Version", "2020-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.DeleteTranscodes, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.DeleteTranscodes));
                                    add(new NameValuePair("Version", "2020-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetMediaList, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.GetMediaList));
                                    add(new NameValuePair("Version", "2020-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetSubtitleInfoList, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.GetSubtitleInfoList));
                                    add(new NameValuePair("Version", "2020-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateSubtitleStatus, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.UpdateSubtitleStatus));
                                    add(new NameValuePair("Version", "2020-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateSubtitleInfo, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.UpdateSubtitleInfo));
                                    add(new NameValuePair("Version", "2020-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetAuditFramesForAudit, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.GetAuditFramesForAudit));
                                    add(new NameValuePair("Version", "2021-11-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetMLFramesForAudit, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.GetMLFramesForAudit));
                                    add(new NameValuePair("Version", "2021-11-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetBetterFramesForAudit, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.GetBetterFramesForAudit));
                                    add(new NameValuePair("Version", "2021-11-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetAudioInfoForAudit, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.GetAudioInfoForAudit));
                                    add(new NameValuePair("Version", "2021-11-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetAutomaticSpeechRecognitionForAudit, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.GetAutomaticSpeechRecognitionForAudit));
                                    add(new NameValuePair("Version", "2021-11-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetAudioEventDetectionForAudit, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.GetAudioEventDetectionForAudit));
                                    add(new NameValuePair("Version", "2021-11-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.CreateVideoClassification, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.CreateVideoClassification));
                                    add(new NameValuePair("Version", "2021-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateVideoClassification, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.UpdateVideoClassification));
                                    add(new NameValuePair("Version", "2021-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.DeleteVideoClassification, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.DeleteVideoClassification));
                                    add(new NameValuePair("Version", "2021-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ListVideoClassifications, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.ListVideoClassifications));
                                    add(new NameValuePair("Version", "2021-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ListSnapshots, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.ListSnapshots));
                                    add(new NameValuePair("Version", "2021-01-01"));
                                }
                            });
                        }
                    }
            ));

            // **********************************************************************
            // 转码
            // **********************************************************************
            put(Const.StartWorkflow, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "POST");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.StartWorkflow));
                                    add(new NameValuePair("Version", "2020-08-01"));
                                }
                            });
                        }
                    }
            ));

            // **********************************************************************
            // 空间管理
            // **********************************************************************
            put(Const.CreateSpace, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.CreateSpace));
                                    add(new NameValuePair("Version", "2021-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ListSpace, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.ListSpace));
                                    add(new NameValuePair("Version", "2021-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetSpaceDetail, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.GetSpaceDetail));
                                    add(new NameValuePair("Version", "2022-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateSpace, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.UpdateSpace));
                                    add(new NameValuePair("Version", "2021-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateSpaceUploadConfig, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.UpdateSpaceUploadConfig));
                                    add(new NameValuePair("Version", "2022-01-01"));
                                }
                            });
                        }
                    }
            ));
            // **********************************************************************
            // 分发加速管理
            // **********************************************************************
            put(Const.ListDomain, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.ListDomain));
                                    add(new NameValuePair("Version", "2021-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.CreateCdnRefreshTask, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.CreateCdnRefreshTask));
                                    add(new NameValuePair("Version", "2021-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.CreateCdnPreloadTask, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.CreateCdnPreloadTask));
                                    add(new NameValuePair("Version", "2021-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ListCdnTasks, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.ListCdnTasks));
                                    add(new NameValuePair("Version", "2022-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ListCdnAccessLog, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.ListCdnAccessLog));
                                    add(new NameValuePair("Version", "2022-01-01"));

                                }
                            });
                        }
                    }
            ));
            put(Const.ListCdnTopAccessUrl, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.ListCdnTopAccessUrl));
                                    add(new NameValuePair("Version", "2022-01-01"));

                                }
                            });
                        }
                    }
            ));
            put(Const.DescribeVodDomainBandwidthData, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.DescribeVodDomainBandwidthData));
                                    add(new NameValuePair("Version", "2020-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ListCdnUsageData, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.ListCdnUsageData));
                                    add(new NameValuePair("Version", "2022-01-01"));

                                }
                            });
                        }
                    }
            ));
            put(Const.ListCdnStatusData, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.ListCdnStatusData));
                                    add(new NameValuePair("Version", "2022-01-01"));

                                }
                            });
                        }
                    }
            ));
            put(Const.DescribeIpInfo, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.DescribeIpInfo));
                                    add(new NameValuePair("Version", "2022-01-01"));

                                }
                            });
                        }
                    }
            ));
            // **********************************************************************
            // 回调管理
            // **********************************************************************
            put(Const.AddCallbackSubscription, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.AddCallbackSubscription));
                                    add(new NameValuePair("Version", "2021-12-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.SetCallbackEvent, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.SetCallbackEvent));
                                    add(new NameValuePair("Version", "2022-01-01"));
                                }
                            });
                        }
                    }
            ));

        }
    };
}
