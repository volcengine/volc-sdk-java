package com.volcengine.service.vod;

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

public class VodServiceConfig {

    public static Map<String, ServiceInfo> ServiceInfoMap = new HashMap<String, ServiceInfo>() {
        {
            put(com.volcengine.helper.Const.REGION_CN_NORTH_1, new ServiceInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.CONNECTION_TIMEOUT, 5000);
                            put(com.volcengine.helper.Const.SOCKET_TIMEOUT, 5000);
                            put(com.volcengine.helper.Const.Scheme, "https");
                            put(com.volcengine.helper.Const.Host, "vod.volcengineapi.com");
                            put(com.volcengine.helper.Const.Header, new ArrayList<Header>() {
                                {
                                    add(new BasicHeader("Accept", "application/json"));
                                }
                            });
                            put(com.volcengine.helper.Const.Credentials, new Credentials(com.volcengine.helper.Const.REGION_CN_NORTH_1, "vod"));
                        }
                    }
            ));
            put(com.volcengine.helper.Const.REGION_AP_SOUTHEAST_1, new ServiceInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.CONNECTION_TIMEOUT, 5000);
                            put(com.volcengine.helper.Const.SOCKET_TIMEOUT, 5000);
                            put(com.volcengine.helper.Const.Scheme, "https");
                            put(com.volcengine.helper.Const.Host, "vod.ap-southeast-1.volcengineapi.com");
                            put(com.volcengine.helper.Const.Header, new ArrayList<Header>() {
                                {
                                    add(new BasicHeader("Accept", "application/json"));
                                }
                            });
                            put(com.volcengine.helper.Const.Credentials, new Credentials(com.volcengine.helper.Const.REGION_AP_SOUTHEAST_1, "vod"));
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
                                    add(new BasicNameValuePair("Action", Const.GetPlayInfo));
                                    add(new BasicNameValuePair("Version", "2020-08-01"));
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
                                    add(new BasicNameValuePair("Action", Const.GetAllPlayInfo));
                                    add(new BasicNameValuePair("Version", "2022-01-01"));
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
                                    add(new BasicNameValuePair("Action", Const.GetPrivateDrmPlayAuth));
                                    add(new BasicNameValuePair("Version", "2020-08-01"));
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
                                    add(new BasicNameValuePair("Action", Const.GetHlsDecryptionKey));
                                    add(new BasicNameValuePair("Version", "2020-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.DescribeDrmDataKey, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DescribeDrmDataKey));
                                    add(new BasicNameValuePair("Version", "2023-07-01"));
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
                                    add(new BasicNameValuePair("Action", Const.GetPlayInfoWithLiveTimeShiftScene));
                                    add(new BasicNameValuePair("Version", "2021-11-01"));
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
                                    add(new BasicNameValuePair("Action", Const.UploadMediaByUrl));
                                    add(new BasicNameValuePair("Version", "2020-08-01"));
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
                                    add(new BasicNameValuePair("Action", Const.QueryUploadTaskInfo));
                                    add(new BasicNameValuePair("Version", "2020-08-01"));
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
                                    add(new BasicNameValuePair("Action", Const.ApplyUploadInfo));
                                    add(new BasicNameValuePair("Version", "2022-01-01"));
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
                                    add(new BasicNameValuePair("Action", Const.CommitUploadInfo));
                                    add(new BasicNameValuePair("Version", "2022-01-01"));
                                }
                            });
                            put(com.volcengine.helper.Const.CONNECTION_TIMEOUT, 30000);
                            put(com.volcengine.helper.Const.SOCKET_TIMEOUT, 30000);
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
                                    add(new BasicNameValuePair("Action", Const.UpdateMediaInfo));
                                    add(new BasicNameValuePair("Version", "2020-08-01"));
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
                                    add(new BasicNameValuePair("Action", Const.UpdateMediaPublishStatus));
                                    add(new BasicNameValuePair("Version", "2020-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateMediaStorageClass, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateMediaStorageClass));
                                    add(new BasicNameValuePair("Version", "2022-12-01"));
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
                                    add(new BasicNameValuePair("Action", Const.GetMediaInfos));
                                    add(new BasicNameValuePair("Version", "2022-12-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetMediaInfos20230701, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetMediaInfos20230701));
                                    add(new BasicNameValuePair("Version", "2023-07-01"));
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
                                    add(new BasicNameValuePair("Action", Const.GetRecommendedPoster));
                                    add(new BasicNameValuePair("Version", "2020-08-01"));
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
                                    add(new BasicNameValuePair("Action", Const.DeleteMedia));
                                    add(new BasicNameValuePair("Version", "2020-08-01"));
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
                                    add(new BasicNameValuePair("Action", Const.DeleteTranscodes));
                                    add(new BasicNameValuePair("Version", "2020-08-01"));
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
                                    add(new BasicNameValuePair("Action", Const.GetMediaList));
                                    add(new BasicNameValuePair("Version", "2022-12-01"));
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
                                    add(new BasicNameValuePair("Action", Const.GetSubtitleInfoList));
                                    add(new BasicNameValuePair("Version", "2020-08-01"));
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
                                    add(new BasicNameValuePair("Action", Const.UpdateSubtitleStatus));
                                    add(new BasicNameValuePair("Version", "2020-08-01"));
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
                                    add(new BasicNameValuePair("Action", Const.UpdateSubtitleInfo));
                                    add(new BasicNameValuePair("Version", "2020-08-01"));
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
                                    add(new BasicNameValuePair("Action", Const.GetAuditFramesForAudit));
                                    add(new BasicNameValuePair("Version", "2021-11-01"));
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
                                    add(new BasicNameValuePair("Action", Const.GetMLFramesForAudit));
                                    add(new BasicNameValuePair("Version", "2021-11-01"));
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
                                    add(new BasicNameValuePair("Action", Const.GetBetterFramesForAudit));
                                    add(new BasicNameValuePair("Version", "2021-11-01"));
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
                                    add(new BasicNameValuePair("Action", Const.GetAudioInfoForAudit));
                                    add(new BasicNameValuePair("Version", "2021-11-01"));
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
                                    add(new BasicNameValuePair("Action", Const.GetAutomaticSpeechRecognitionForAudit));
                                    add(new BasicNameValuePair("Version", "2021-11-01"));
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
                                    add(new BasicNameValuePair("Action", Const.GetAudioEventDetectionForAudit));
                                    add(new BasicNameValuePair("Version", "2021-11-01"));
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
                                    add(new BasicNameValuePair("Action", Const.CreateVideoClassification));
                                    add(new BasicNameValuePair("Version", "2021-01-01"));
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
                                    add(new BasicNameValuePair("Action", Const.UpdateVideoClassification));
                                    add(new BasicNameValuePair("Version", "2021-01-01"));
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
                                    add(new BasicNameValuePair("Action", Const.DeleteVideoClassification));
                                    add(new BasicNameValuePair("Version", "2021-01-01"));
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
                                    add(new BasicNameValuePair("Action", Const.ListVideoClassifications));
                                    add(new BasicNameValuePair("Version", "2021-01-01"));
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
                                    add(new BasicNameValuePair("Action", Const.ListSnapshots));
                                    add(new BasicNameValuePair("Version", "2021-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ExtractMediaMetaTask, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ExtractMediaMetaTask));
                                    add(new BasicNameValuePair("Version", "2022-01-01"));
                                }
                            });
                        }
                    }
            ));

            put(Const.DeleteMediaTosFile, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "POST");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DeleteMediaTosFile));
                                    add(new BasicNameValuePair("Version", "2022-12-01"));
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
                                    add(new BasicNameValuePair("Action", Const.StartWorkflow));
                                    add(new BasicNameValuePair("Version", "2020-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.RetrieveTranscodeResult, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.RetrieveTranscodeResult));
                                    add(new BasicNameValuePair("Version", "2020-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetWorkflowExecution, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetWorkflowExecution));
                                    add(new BasicNameValuePair("Version", "2020-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetWorkflowExecutionResult, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetWorkflowExecutionResult));
                                    add(new BasicNameValuePair("Version", "2022-12-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetTaskTemplate, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetTaskTemplate));
                                    add(new BasicNameValuePair("Version", "2023-07-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.CreateTaskTemplate, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "POST");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.CreateTaskTemplate));
                                    add(new BasicNameValuePair("Version", "2023-07-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateTaskTemplate, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "POST");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateTaskTemplate));
                                    add(new BasicNameValuePair("Version", "2023-07-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ListTaskTemplate, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListTaskTemplate));
                                    add(new BasicNameValuePair("Version", "2023-07-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.DeleteTaskTemplate, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "POST");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DeleteTaskTemplate));
                                    add(new BasicNameValuePair("Version", "2023-07-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetWorkflowTemplate, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetWorkflowTemplate));
                                    add(new BasicNameValuePair("Version", "2023-07-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.CreateWorkflowTemplate, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "POST");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.CreateWorkflowTemplate));
                                    add(new BasicNameValuePair("Version", "2023-07-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateWorkflowTemplate, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "POST");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateWorkflowTemplate));
                                    add(new BasicNameValuePair("Version", "2023-07-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ListWorkflowTemplate, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListWorkflowTemplate));
                                    add(new BasicNameValuePair("Version", "2023-07-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.DeleteWorkflowTemplate, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "POST");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DeleteWorkflowTemplate));
                                    add(new BasicNameValuePair("Version", "2023-07-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetWatermarkTemplate, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetWatermarkTemplate));
                                    add(new BasicNameValuePair("Version", "2023-07-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.CreateWatermarkTemplate, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "POST");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.CreateWatermarkTemplate));
                                    add(new BasicNameValuePair("Version", "2023-07-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateWatermarkTemplate, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "POST");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateWatermarkTemplate));
                                    add(new BasicNameValuePair("Version", "2023-07-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ListWatermarkTemplate, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListWatermarkTemplate));
                                    add(new BasicNameValuePair("Version", "2023-07-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.DeleteWatermarkTemplate, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "POST");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DeleteWatermarkTemplate));
                                    add(new BasicNameValuePair("Version", "2023-07-01"));
                                }
                            });
                        }
                    }
            ));

            // **********************************************************************
            // 视频编辑
            // **********************************************************************
            put(Const.SubmitDirectEditTaskAsync, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "POST");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.SubmitDirectEditTaskAsync));
                                    add(new BasicNameValuePair("Version", "2018-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetDirectEditResult, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "POST");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetDirectEditResult));
                                    add(new BasicNameValuePair("Version", "2018-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetDirectEditProgress, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetDirectEditProgress));
                                    add(new BasicNameValuePair("Version", "2018-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.CancelDirectEditTask, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "POST");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.CancelDirectEditTask));
                                    add(new BasicNameValuePair("Version", "2018-01-01"));
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
                                    add(new BasicNameValuePair("Action", Const.CreateSpace));
                                    add(new BasicNameValuePair("Version", "2021-01-01"));
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
                                    add(new BasicNameValuePair("Action", Const.ListSpace));
                                    add(new BasicNameValuePair("Version", "2021-01-01"));
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
                                    add(new BasicNameValuePair("Action", Const.GetSpaceDetail));
                                    add(new BasicNameValuePair("Version", "2022-01-01"));
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
                                    add(new BasicNameValuePair("Action", Const.UpdateSpace));
                                    add(new BasicNameValuePair("Version", "2021-01-01"));
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
                                    add(new BasicNameValuePair("Action", Const.UpdateSpaceUploadConfig));
                                    add(new BasicNameValuePair("Version", "2022-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.DescribeVodSpaceStorageData, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DescribeVodSpaceStorageData));
                                    add(new BasicNameValuePair("Version", "2023-07-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.DeleteSpace, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DeleteSpace));
                                    add(new BasicNameValuePair("Version", "2023-07-01"));
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
                                    add(new BasicNameValuePair("Action", Const.ListDomain));
                                    add(new BasicNameValuePair("Version", "2023-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.StartDomain, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.StartDomain));
                                    add(new BasicNameValuePair("Version", "2023-07-01"));
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
                                    add(new BasicNameValuePair("Action", Const.CreateCdnRefreshTask));
                                    add(new BasicNameValuePair("Version", "2021-01-01"));
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
                                    add(new BasicNameValuePair("Action", Const.CreateCdnPreloadTask));
                                    add(new BasicNameValuePair("Version", "2021-01-01"));
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
                                    add(new BasicNameValuePair("Action", Const.ListCdnTasks));
                                    add(new BasicNameValuePair("Version", "2022-01-01"));
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
                                    add(new BasicNameValuePair("Action", Const.ListCdnAccessLog));
                                    add(new BasicNameValuePair("Version", "2022-01-01"));

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
                                    add(new BasicNameValuePair("Action", Const.ListCdnTopAccessUrl));
                                    add(new BasicNameValuePair("Version", "2022-01-01"));

                                }
                            });
                        }
                    }
            ));
            put(Const.ListCdnTopAccess, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListCdnTopAccess));
                                    add(new BasicNameValuePair("Version", "2023-07-01"));

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
                                    add(new BasicNameValuePair("Action", Const.DescribeVodDomainBandwidthData));
                                    add(new BasicNameValuePair("Version", "2023-07-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.DescribeVodDomainTrafficData, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DescribeVodDomainTrafficData));
                                    add(new BasicNameValuePair("Version", "2023-07-01"));
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
                                    add(new BasicNameValuePair("Action", Const.ListCdnUsageData));
                                    add(new BasicNameValuePair("Version", "2022-12-01"));

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
                                    add(new BasicNameValuePair("Action", Const.ListCdnStatusData));
                                    add(new BasicNameValuePair("Version", "2022-01-01"));

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
                                    add(new BasicNameValuePair("Action", Const.DescribeIpInfo));
                                    add(new BasicNameValuePair("Version", "2022-01-01"));

                                }
                            });
                        }
                    }
            ));
            put(Const.ListCdnPvData, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListCdnPvData));
                                    add(new BasicNameValuePair("Version", "2022-01-01"));

                                }
                            });
                        }
                    }
            ));
            put(Const.SubmitBlockTasks, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "POST");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.SubmitBlockTasks));
                                    add(new BasicNameValuePair("Version", "2022-01-01"));

                                }
                            });
                        }
                    }
            ));
            put(Const.GetContentBlockTasks, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "POST");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetContentBlockTasks));
                                    add(new BasicNameValuePair("Version", "2022-01-01"));

                                }
                            });
                        }
                    }
            ));
            put(Const.ListFileMetaInfosByFileNames, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "POST");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListFileMetaInfosByFileNames));
                                    add(new BasicNameValuePair("Version", "2023-07-01"));

                                }
                            });
                        }
                    }
            ));
            put(Const.SubmitBlockObjectTasks, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "POST");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.SubmitBlockObjectTasks));
                                    add(new BasicNameValuePair("Version", "2023-07-01"));

                                }
                            });
                        }
                    }
            ));
            put(Const.ListBlockObjectTasks, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "POST");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListBlockObjectTasks));
                                    add(new BasicNameValuePair("Version", "2023-07-01"));

                                }
                            });
                        }
                    }
            ));
            put(Const.CreateDomain, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.CreateDomain));
                                    add(new BasicNameValuePair("Version", "2023-02-01"));

                                }
                            });
                        }
                    }
            ));
            put(Const.StopDomain, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.StopDomain));
                                    add(new BasicNameValuePair("Version", "2023-07-01"));

                                }
                            });
                        }
                    }
            ));
            put(Const.DeleteDomain, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DeleteDomain));
                                    add(new BasicNameValuePair("Version", "2023-07-01"));

                                }
                            });
                        }
                    }
            ));
            put(Const.AddDomainToScheduler, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AddDomainToScheduler));
                                    add(new BasicNameValuePair("Version", "2023-07-01"));

                                }
                            });
                        }
                    }
            ));
            put(Const.RemoveDomainFromScheduler, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.RemoveDomainFromScheduler));
                                    add(new BasicNameValuePair("Version", "2023-07-01"));

                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateDomainPlayRule, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateDomainPlayRule));
                                    add(new BasicNameValuePair("Version", "2023-07-01"));

                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateDomainExpire, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateDomainExpire));
                                    add(new BasicNameValuePair("Version", "2023-02-01"));

                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateDomainAuthConfig, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateDomainAuthConfig));
                                    add(new BasicNameValuePair("Version", "2023-02-01"));

                                }
                            });
                        }
                    }
            ));
            put(Const.AddOrUpdateCertificate, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "POST");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AddOrUpdateCertificate));
                                    add(new BasicNameValuePair("Version", "2023-07-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateDomainUrlAuthConfig, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "POST");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateDomainUrlAuthConfig));
                                    add(new BasicNameValuePair("Version", "2023-07-01"));

                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateDomainConfig, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "POST");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateDomainConfig));
                                    add(new BasicNameValuePair("Version", "2023-07-01"));

                                }
                            });
                        }
                    }
            ));
            put(Const.DescribeDomainConfig, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DescribeDomainConfig));
                                    add(new BasicNameValuePair("Version", "2023-07-01"));

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
                                    add(new BasicNameValuePair("Action", Const.AddCallbackSubscription));
                                    add(new BasicNameValuePair("Version", "2021-12-01"));
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
                                    add(new BasicNameValuePair("Action", Const.SetCallbackEvent));
                                    add(new BasicNameValuePair("Version", "2022-01-01"));
                                }
                            });
                        }
                    }
            ));
            // **********************************************************************
            // 计量计费
            // **********************************************************************
            put(Const.DescribeVodSpaceTranscodeData, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DescribeVodSpaceTranscodeData));
                                    add(new BasicNameValuePair("Version", "2023-07-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.DescribeVodSpaceAIStatisData, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DescribeVodSpaceAIStatisData));
                                    add(new BasicNameValuePair("Version", "2023-07-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.DescribeVodSpaceSubtitleStatisData, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DescribeVodSpaceSubtitleStatisData));
                                    add(new BasicNameValuePair("Version", "2023-07-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.DescribeVodSpaceDetectStatisData, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DescribeVodSpaceDetectStatisData));
                                    add(new BasicNameValuePair("Version", "2023-07-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.DescribeVodSnapshotData, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DescribeVodSnapshotData));
                                    add(new BasicNameValuePair("Version", "2023-07-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.DescribeVodSpaceWorkflowDetailData, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DescribeVodSpaceWorkflowDetailData));
                                    add(new BasicNameValuePair("Version", "2023-07-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.DescribeVodSpaceEditDetailData, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DescribeVodSpaceEditDetailData));
                                    add(new BasicNameValuePair("Version", "2023-07-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.DescribeVodEnhanceImageData, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DescribeVodEnhanceImageData));
                                    add(new BasicNameValuePair("Version", "2023-07-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.DescribeVodSpaceEditStatisData, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DescribeVodSpaceEditStatisData));
                                    add(new BasicNameValuePair("Version", "2023-07-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.DescribeVodPlayedStatisData, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DescribeVodPlayedStatisData));
                                    add(new BasicNameValuePair("Version", "2023-07-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.DescribeVodMostPlayedStatisData, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DescribeVodMostPlayedStatisData));
                                    add(new BasicNameValuePair("Version", "2023-07-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.DescribeVodRealtimeMediaData, new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(com.volcengine.helper.Const.Method, "GET");
                        put(com.volcengine.helper.Const.Path, "/");
                        put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", Const.DescribeVodRealtimeMediaData));
                                add(new BasicNameValuePair("Version", "2023-07-01"));
                            }
                        });
                    }
                }
            ));
            put(Const.DescribeVodRealtimeMediaDetailData, new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(com.volcengine.helper.Const.Method, "GET");
                        put(com.volcengine.helper.Const.Path, "/");
                        put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", Const.DescribeVodRealtimeMediaDetailData));
                                add(new BasicNameValuePair("Version", "2023-07-01"));
                            }
                        });
                    }
                }
            ));
        }
    };
}
