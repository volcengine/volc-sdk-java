package com.volcengine.service.livesaas;

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

public class LivesaasConfig {
    public static Map<String, ServiceInfo> serviceInfoMap = new HashMap<String, ServiceInfo>() {
        {
            put(Const.REGION_CN_NORTH_1, new ServiceInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.CONNECTION_TIMEOUT, 5000);
                            put(Const.SOCKET_TIMEOUT, 10000);
                            put(Const.Scheme, "https");
                            put(Const.Host, "livesaas.volcengineapi.com");
                            put(Const.Header, new ArrayList<Header>() {
                                {
                                    add(new BasicHeader("Accept", "application/json"));
                                }
                            });
                            put(Const.Credentials, new Credentials(Const.REGION_CN_NORTH_1, "livesaas"));
                        }
                    }
            ));
        }
    };

    public static Map<String, ApiInfo> apiInfoList = new HashMap<String, ApiInfo>() {
        {
            put(Const.ListSiteTagAPIV2, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListSiteTagAPIV2));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateSiteTagAPIV2, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateSiteTagAPIV2));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetPageWatchDataAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetPageWatchDataAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ListUserBehaviorDataAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListUserBehaviorDataAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.CreateActivityAPIV2, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.CreateActivityAPIV2));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.DeleteActivityAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DeleteActivityAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ListActivityAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListActivityAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetDownloadLiveClientAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetDownloadLiveClientAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetWebPushLiveClientAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetWebPushLiveClientAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ListActivityByCacheAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListActivityByCacheAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateActivityStatusAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateActivityStatusAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdatePullToPushAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdatePullToPushAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetActivityAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetActivityAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetStreamsAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetStreamsAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateActivityBasicConfigAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateActivityBasicConfigAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetActivityBasicConfigAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetActivityBasicConfigAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateLoopVideoAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateLoopVideoAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateLoopVideoStatusAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateLoopVideoStatusAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetTemporaryLoginTokenAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetTemporaryLoginTokenAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetCustomActMsgAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetCustomActMsgAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UploadReplayAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UploadReplayAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ListMediasAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListMediasAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateMediaOnlineStatusAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateMediaOnlineStatusAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetAdvertisementDataAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetAdvertisementDataAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ListQuestionnaireAnswerDataAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListQuestionnaireAnswerDataAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ListQuestionnaireDataAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListQuestionnaireDataAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetRealTimeOnlineNumberAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetRealTimeOnlineNumberAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetAccountRealTimeOnlineNumber, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetAccountRealTimeOnlineNumber));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetInPageAdvertisement, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetInPageAdvertisement));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateInPageAdvertisement, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "UpdateInPageAdvertisement"));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetAccountCustomLinkConfig, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetAccountCustomLinkConfig));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ListAnActivityStartAndEndTimeAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListAnActivityStartAndEndTimeAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put("UpdateAccountCustomLinkConfig", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateAccountCustomLinkConfig));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetActivityReservationAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetActivityReservationAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ListPosterInviteAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListPosterInviteAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.PresenterChatAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.PresenterChatAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.PresenterChatAPIV2, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.PresenterChatAPIV2));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.PollingChatAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.PollingChatAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetHotChatAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetHotChatAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetTopChatAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetTopChatAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.DeleteChatAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DeleteChatAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.LikeChatAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.LikeChatAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.TopChatAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.TopChatAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.EmptyChatAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.EmptyChatAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateChatReviewStatusAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateChatReviewStatusAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ConfirmReviewChatAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ConfirmReviewChatAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.SilenceUserAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.SilenceUserAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetSilenceUserListAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetSilenceUserListAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetActivityMenuAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "Get");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetActivityMenuAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateActivityMenuAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateActivityMenuAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetActivityProductAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetActivityProductAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateActivityProductAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateActivityProductAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.DeleteGraphicMessageAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DeleteGraphicMessageAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdatePresenterNameAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdatePresenterNameAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateBulletScreensSwitchAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateBulletScreensSwitchAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.EnableProductAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.EnableProductAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ListCallbackEvents, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListCallbackEvents));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ListCallbackConfigs, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListCallbackConfigs));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.AddCallbackConfig, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AddCallbackConfig));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateCallbackConfig, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateCallbackConfig));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.DeleteCallbackConfig, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DeleteCallbackConfig));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ExplainProductAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ExplainProductAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateActivityEmbeddedUrlAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateActivityEmbeddedUrlAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetActivityEmbeddedUrlAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetActivityEmbeddedUrlAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateCustomizationViewPermissionAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateCustomizationViewPermissionAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ListLivePromotionsAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListLivePromotionsAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.AddLivePromotionsAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AddLivePromotionsAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateLivePromotionsStatusAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateLivePromotionsStatusAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.DeleteLivePromotionsAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DeleteLivePromotionsAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ListHostAccountAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListHostAccountAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetLiveLinkDurationData, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetLiveLinkDurationData));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetBusinessAccountInfoAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetBusinessAccountInfoAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateSingleActivityProduct, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateSingleActivityProduct));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateProductOutOfStock, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateProductOutOfStock));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.HideProductPrice, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.HideProductPrice));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UploadMediaByURL, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UploadMediaByURL));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.QueryUploadMediaByURL, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.QueryUploadMediaByURL));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.TempToMediaActivityMediaAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.TempToMediaActivityMediaAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ListActivityMediaAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListActivityMediaAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ListUserSubmitEnterReviewAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListUserSubmitEnterReviewAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ReviewUserEnterFormAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ReviewUserEnterFormAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetActivityAntidirtAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetActivityAntidirtAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.AddActivityAntidirtAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AddActivityAntidirtAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.DelActivityAntidirtAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DelActivityAntidirtAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.SendCustomSystemMessageAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.SendCustomSystemMessageAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetSDKTokenAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetSDKTokenAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetAllStreamPullInfoAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetAllStreamPullInfoAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetUserTaskAwardResultAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetUserTaskAwardResultAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.AnalysisUserBehaviorPeople, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AnalysisUserBehaviorPeople));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetAwardRecordStatisticsAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetAwardRecordStatisticsAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ListQuizRecordAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListQuizRecordAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ListQuizStatisticsAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListQuizStatisticsAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetQuizDataAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetQuizDataAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateActivityQuizConfig, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateActivityQuizConfig));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ListActivityQuizConfigs, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListActivityQuizConfigs));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetTaskAwardItemListAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetTaskAwardItemListAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetTaskAwardRecordStatisticsAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetTaskAwardRecordStatisticsAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetCheckInListAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetCheckInListAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetCheckInRecordStatisticsAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetCheckInRecordStatisticsAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ListRedPacketDataAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListRedPacketDataAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ListRedPacketRecordAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListRedPacketRecordAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetAwardConfigListAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetAwardConfigListAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetVoteListAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetVoteListAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetVoteStatisticsAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetVoteStatisticsAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetAccountTemplateAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetAccountTemplateAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateAccountTemplateStatusAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateAccountTemplateStatusAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateDefaultTemplateStatusAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateDefaultTemplateStatusAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetPageWatchDataAPIV2, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetPageWatchDataAPIV2));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetActivityReservationAPIV2, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetActivityReservationAPIV2));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ListQuestionnaireDataAPIV2, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListQuestionnaireDataAPIV2));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ListQuestionnaireAnswerDataAPIV2, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListQuestionnaireAnswerDataAPIV2));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.AnalysisUserBehaviorPeopleV2, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AnalysisUserBehaviorPeopleV2));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetAdvertisementDataAPIV2, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetAdvertisementDataAPIV2));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ListUserBehaviorDataAPIV2, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListUserBehaviorDataAPIV2));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ListChannelAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListChannelAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetCustomViewingRestrictionInfoAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetCustomViewingRestrictionInfoAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateActivityViewPermissionAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateActivityViewPermissionAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.DeleteMediaLibraryVideoAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DeleteMediaLibraryVideoAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.AddWebSDKDomain, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AddWebSDKDomain));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.DeleteWebSDKDomain, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DeleteWebSDKDomain));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ListWebSDKDomainConfigs, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListWebSDKDomainConfigs));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.MediasMergeAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.MediasMergeAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetPopularitySettingsAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetPopularitySettingsAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdatePopularitySettingsAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdatePopularitySettingsAPI));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetActivityMenus, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetActivityMenus));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ModifyActivityMenus, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ModifyActivityMenus));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetActivityEmbeddedUrls, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetActivityEmbeddedUrls));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetActivityProducts, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetActivityProducts));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateActivityProduct, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateActivityProduct));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.DeleteActivityProduct, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DeleteActivityProduct));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateActivityEmbeddedUrl, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateActivityEmbeddedUrl));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.DeleteActivityEmbeddedUrl, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DeleteActivityEmbeddedUrl));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateActivityBand, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateActivityBand));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.DeleteActivityBand, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DeleteActivityBand));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetActivityBands, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetActivityBands));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetAccountAggregatedStatistics, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetAccountAggregatedStatistics));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ListAccountActivityData, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListAccountActivityData));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ListAccountUserData, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListAccountUserData));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetAccountUserTrackData, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetAccountUserTrackData));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetVQUserDataAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetVQUserDataAPI));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.CreateHostAcceleratePackOrder, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.CreateHostAcceleratePackOrder));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateHostAcceleratePackOrder, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateHostAcceleratePackOrder));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.DeleteHostAcceleratePackOrder, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DeleteHostAcceleratePackOrder));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UnsubscribeHostAcceleratePackOrder, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UnsubscribeHostAcceleratePackOrder));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ModifyHostAcceleratePackOrder, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ModifyHostAcceleratePackOrder));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ListHostAcceleratePackOrder, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListHostAcceleratePackOrder));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetAttentionDetectionConfig, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetAttentionDetectionConfig));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateAttentionDetectionConfig, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateAttentionDetectionConfig));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.CheckUidMatch, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.CheckUidMatch));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetTeachAssistantConfig, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetTeachAssistantConfig));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateTeachAssistantConfig, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateTeachAssistantConfig));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ListTeachAssistantAccounts, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListTeachAssistantAccounts));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateTeachAssistantAccount, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateTeachAssistantAccount));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.DeleteTeachAssistantAccount, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DeleteTeachAssistantAccount));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetAdvertisementDataDetailAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetAdvertisementDataDetailAPI));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetActivityCommentConfig, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetActivityCommentConfig));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateActivityCommentConfig, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateActivityCommentConfig));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ListActivityCustomEmojiSets, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListActivityCustomEmojiSets));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetActivityCustomEmojiSetDetail, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetActivityCustomEmojiSetDetail));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ModifyActivityCustomEmojiSets, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ModifyActivityCustomEmojiSets));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.DeleteActivityCustomEmojiSet, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DeleteActivityCustomEmojiSet));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.CreateOrUpdateActivityCustomEmojiSet, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.CreateOrUpdateActivityCustomEmojiSet));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateActivityCustomEmojiSetStatus, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateActivityCustomEmojiSetStatus));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetSecurityControlConfig, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetSecurityControlConfig));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateSecurityControlConfig, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateSecurityControlConfig));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetActivityLinks, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetActivityLinks));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ListAwardConfigs, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListAwardConfigs));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ListAwardRecordStatistics, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListAwardRecordStatistics));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetLiveTrafficPostPayData, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetLiveTrafficPostPayData));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetActivityLivePromotionData, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetActivityLivePromotionData));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetActivityLivePromotionDetail, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetActivityLivePromotionDetail));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ListAccountActivityHistoryData, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListAccountActivityHistoryData));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateVodPlayerConfig, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateVodPlayerConfig));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.DeleteVodPlayerConfig, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DeleteVodPlayerConfig));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetVodPlayerConfig, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetVodPlayerConfig));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ListVodPlayerConfig, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListVodPlayerConfig));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateDefaultVodPlayerConfig, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateDefaultVodPlayerConfig));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetVodPlayerToken, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetVodPlayerToken));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetVideoLibraryFolderTree, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetVideoLibraryFolderTree));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.SearchVideoLibraryFolderTree, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.SearchVideoLibraryFolderTree));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ListLoopVideos, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListLoopVideos));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateLoopVideoStatus, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateLoopVideoStatus));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateLoopVideos, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateLoopVideos));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ListPrograms, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListPrograms));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateProgram, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateProgram));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.DeleteProgram, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DeleteProgram));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.MediaCut, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.MediaCut));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.DeleteHostAccount, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DeleteHostAccount));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateHostAccount, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateHostAccount));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateActivityHostAccount, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateActivityHostAccount));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateFloatingAdvertisement, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateFloatingAdvertisement));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ListHostAccounts, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListHostAccounts));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetBusinessAccountInfo, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetBusinessAccountInfo));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetAudienceGroupConfig, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetAudienceGroupConfig));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateAudienceGroupConfig, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateAudienceGroupConfig));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ListAudienceGroupUser, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListAudienceGroupUser));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.AddAudienceGroup, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AddAudienceGroup));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateAudienceGroupUserConfig, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateAudienceGroupUserConfig));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.DeleteAudienceGroup, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DeleteAudienceGroup));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ModifyAudienceGroup, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ModifyAudienceGroup));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.AddActivityPartnerRebroadcast, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AddActivityPartnerRebroadcast));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.DeleteActivityPartnerRebroadcast, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DeleteActivityPartnerRebroadcast));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetActivityPartnerRebroadcast, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetActivityPartnerRebroadcast));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetDownloadLiveClient, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetDownloadLiveClient));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateLiveChannelConfig, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateLiveChannelConfig));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.CreateLiveChannelConfig, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.CreateLiveChannelConfig));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.DeleteLiveChannelConfig, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DeleteLiveChannelConfig));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ListLiveChannelConfig, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListLiveChannelConfig));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetLoginLivesaasSts, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetLoginLivesaasSts));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GenerateActivityStreamSlice, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GenerateActivityStreamSlice));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ListActivityUsers, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListActivityUsers));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetMediaStoragePayData, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetMediaStoragePayData));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetVideoTrafficPayData, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetVideoTrafficPayData));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ListRobotNickNames, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListRobotNickNames));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.DeleteRobotComments, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DeleteRobotComments));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.AddRobotComments, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AddRobotComments));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ListRobotComments, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListRobotComments));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.DeleteRobotNickNames, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DeleteRobotNickNames));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.AddRobotNickNames, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AddRobotNickNames));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetActivityRobotCommentConfig, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetActivityRobotCommentConfig));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateActivityRobotCommentConfig, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateActivityRobotCommentConfig));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetViewingRestrictionInfo,new ApiInfo(
               new HashMap<String, Object>() {
                   {
                       put(Const.Method, "GET");
                       put(Const.Path, "/");
                       put(Const.Query, new ArrayList<NameValuePair>() {
                           {
                               add(new BasicNameValuePair("Action",Const.GetViewingRestrictionInfo));
                               add(new BasicNameValuePair("Version", "2023-08-01"));
                           }
                       });
                   }
               }
            ));
            put(Const.UpdateViewingRestriction, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateViewingRestriction));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.InsertWhiteList, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.InsertWhiteList));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetWhiteList,new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action",Const.GetWhiteList));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.DeleteWhiteList, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DeleteWhiteList));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.InsertPhoneList, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.InsertPhoneList));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetPhoneList,new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action",Const.GetPhoneList));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.DeletePhoneList, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DeletePhoneList));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateAccountBanStatus, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateAccountBanStatus));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                }
            ));
            put(Const.CreateLLMTask, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.CreateLLMTask));
                                    add(new BasicNameValuePair("Version", "2024-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ListLLMTasks, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListLLMTasks));
                                    add(new BasicNameValuePair("Version", "2024-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetLLMReport, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetLLMReport));
                                    add(new BasicNameValuePair("Version", "2024-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetLarkSubAccountInfo, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetLarkSubAccountInfo));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateAnswerRepetition,new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateAnswerRepetition));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetAwardItemList, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetAwardItemList));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateAwardItem, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateAwardItem));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.DeleteAwardItem, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DeleteAwardItem));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.CreateCoupons,new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", Const.CreateCoupons));
                                add(new BasicNameValuePair("Version", "2023-08-01"));
                            }
                        });
                    }
                }
            ));
            put(Const.UpdateCoupon,new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", Const.UpdateCoupon));
                                add(new BasicNameValuePair("Version", "2023-08-01"));
                            }
                        });
                    }
                }
            ));
            put(Const.DeleteCoupons,new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", Const.DeleteCoupons));
                                add(new BasicNameValuePair("Version", "2023-08-01"));
                            }
                        });
                    }
                }
            ));
            put(Const.ListCoupons,new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", Const.ListCoupons));
                                add(new BasicNameValuePair("Version", "2023-08-01"));
                            }
                        });
                    }
                }
            ));
            put(Const.GetCoupon,new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", Const.GetCoupon));
                                add(new BasicNameValuePair("Version", "2023-08-01"));
                            }
                        });
                    }
                }
            ));
            put(Const.CreateActivityCoupons,new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.CreateActivityCoupons));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateActivityCoupon,new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateActivityCoupon));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.DeleteActivityCoupons,new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DeleteActivityCoupons));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ListActivityCoupons,new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListActivityCoupons));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.SendActivityCoupon,new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.SendActivityCoupon));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.StopActivityCoupon,new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.StopActivityCoupon));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetActivityCouponPickData,new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetActivityCouponPickData));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetActivityAllCouponsPickData,new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetActivityAllCouponsPickData));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.CreateSubAccount, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.CreateSubAccount));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateSubAccount, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateSubAccount));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.DeleteSubAccount, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DeleteSubAccount));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ListSubAccounts,new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action",Const.ListSubAccounts));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetSubAccount,new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action",Const.GetSubAccount));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ListSubAccountRoles,new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action",Const.ListSubAccountRoles));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ListSubAccountOrganizations,new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action",Const.ListSubAccountOrganizations));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ExportActivityData, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ExportActivityData));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetActivityExportFile,new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action",Const.GetActivityExportFile));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));

            put(Const.ListAreaConfig,new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action",Const.ListAreaConfig));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.CreateAreaConfig,new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action",Const.CreateAreaConfig));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateAreaConfig,new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action",Const.UpdateAreaConfig));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.DeleteAreaConfig,new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action",Const.DeleteAreaConfig));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ListOfficeConfig,new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action",Const.ListOfficeConfig));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.CreateOfficeConfig,new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action",Const.CreateOfficeConfig));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateOfficeConfig,new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action",Const.UpdateOfficeConfig));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.DeleteOfficeConfig,new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action",Const.DeleteOfficeConfig));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetActivityPoster,new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action",Const.GetActivityPoster));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateActivityPoster,new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action",Const.UpdateActivityPoster));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetLinkUserAmount, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetLinkUserAmount));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ListWaitLinkAudience, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListWaitLinkAudience));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetInviterToken, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetInviterToken));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.SendActivityRobotComment,new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action",Const.SendActivityRobotComment));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.BatchSendActivityRobotComment,new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action",Const.BatchSendActivityRobotComment));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateProductReminderInfo,new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action",Const.UpdateProductReminderInfo));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.SendProductOrderMessage,new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action",Const.SendProductOrderMessage));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetActivityMessageConfig, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetActivityMessageConfig));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateActivityMessageConfig, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateActivityMessageConfig));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetActivityReplayPlayerConfig, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetActivityReplayPlayerConfig));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateActivityReplayPlayerConfig,new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action",Const.UpdateActivityReplayPlayerConfig));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateActivityUserBanStatus,new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action",Const.UpdateActivityUserBanStatus));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetActivityBanUsers,new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action",Const.GetActivityBanUsers));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateActivityIpBanStatus,new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action",Const.UpdateActivityIpBanStatus));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetActivityBanIps,new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action",Const.GetActivityBanIps));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ListInteractionScriptComments,new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action",Const.ListInteractionScriptComments));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.CreateInteractionScript,new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action",Const.CreateInteractionScript));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.AddInteractionScriptComments,new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action",Const.AddInteractionScriptComments));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.EditInteractionScriptComment,new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action",Const.EditInteractionScriptComment));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.DeleteInteractionScriptComment,new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action",Const.DeleteInteractionScriptComment));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateActivityMediaInfo,new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action",Const.UpdateActivityMediaInfo));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ListActivityRobotCommentRepository,new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action",Const.ListActivityRobotCommentRepository));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.AddActivityRobotCommentRepository,new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action",Const.AddActivityRobotCommentRepository));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.DeleteActivityRobotCommentRepository,new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action",Const.DeleteActivityRobotCommentRepository));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateRobotComment,new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action",Const.UpdateRobotComment));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateRobotNickName,new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action",Const.UpdateRobotNickName));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.CreateActivityRedPacket,new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action",Const.CreateActivityRedPacket));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateActivityRedPacket,new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action",Const.UpdateActivityRedPacket));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.DeleteActivityRedPacket,new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action",Const.DeleteActivityRedPacket));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ListActivityRedPacket,new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action",Const.ListActivityRedPacket));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetActivityRedPacket,new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action",Const.GetActivityRedPacket));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.CreateVipOrBlackListUserInfo, new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", Const.CreateVipOrBlackListUserInfo));
                                add(new BasicNameValuePair("Version", "2023-08-01"));
                            }
                        });
                    }
                }
            ));
            put(Const.GetVipOrBlackListUserInfo, new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", Const.GetVipOrBlackListUserInfo));
                                add(new BasicNameValuePair("Version", "2023-08-01"));
                            }
                        });
                    }
                }
            ));
            put(Const.DeleteVipOrBlackListUserInfo, new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", Const.DeleteVipOrBlackListUserInfo));
                                add(new BasicNameValuePair("Version", "2023-08-01"));
                            }
                        });
                    }
                }
            ));
            put(Const.ResendActivityCoupon, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ResendActivityCoupon));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetInteractionScriptRecordConfig, new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", Const.GetInteractionScriptRecordConfig));
                                add(new BasicNameValuePair("Version", "2023-08-01"));
                            }
                        });
                    }
                }
            ));
            put(Const.UpdateInteractionScriptRecordConfig, new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", Const.UpdateInteractionScriptRecordConfig));
                                add(new BasicNameValuePair("Version", "2023-08-01"));
                            }
                        });
                    }
                }
            ));
            put(Const.EnableActivityMultiProductExplain, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.EnableActivityMultiProductExplain));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetMergedReport, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetMergedReport));
                                    add(new BasicNameValuePair("Version", "2024-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ListTasks, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListTasks));
                                    add(new BasicNameValuePair("Version", "2024-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.CreateTask, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.CreateTask));
                                    add(new BasicNameValuePair("Version", "2024-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetReport, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetReport));
                                    add(new BasicNameValuePair("Version", "2024-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ListScenarios, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListScenarios));
                                    add(new BasicNameValuePair("Version", "2024-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ListProjects, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListProjects));
                                    add(new BasicNameValuePair("Version", "2024-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.CreateViewerLevelConfig, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.CreateViewerLevelConfig));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateViewerLevelConfig, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateViewerLevelConfig));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ReorderViewerLevelConfig, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ReorderViewerLevelConfig));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.DeleteViewerLevelConfig, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DeleteViewerLevelConfig));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetViewerLevelConfig, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetViewerLevelConfig));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.DeleteViewerLevelGroup, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DeleteViewerLevelGroup));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ListAccountViewerLevelGroup, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListAccountViewerLevelGroup));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateViewerLevelGroupConfig, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateViewerLevelGroupConfig));
                                    add(new BasicNameValuePair("Version", "2023-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetBMReport, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetBMReport));
                                    add(new BasicNameValuePair("Version", "2024-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetTask, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetTask));
                                    add(new BasicNameValuePair("Version", "2024-08-01"));
                                }
                            });
                        }
                    }
            ));
        }
    };
}
