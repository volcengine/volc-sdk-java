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
        }
    };
}
