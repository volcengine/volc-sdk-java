package com.volcengine.service.vod;

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

public class VodConfig {

    public static Map<String, ServiceInfo> ServiceInfoMap = new HashMap<String, ServiceInfo>() {
        {
            put(Const.REGION_CN_NORTH_1, new ServiceInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.CONNECTION_TIMEOUT, 5000);
                            put(Const.SOCKET_TIMEOUT, 5000);
                            put(Const.Host, "vod.volcengineapi.com");
                            put(Const.Header, new ArrayList<Header>() {
                                {
                                    add(new BasicHeader("Accept", "application/json"));
                                }
                            });
                            put(Const.Credentials, new Credentials(Const.REGION_CN_NORTH_1, "vod"));
                        }
                    }
            ));
            put(Const.REGION_AP_SINGAPORE_1, new ServiceInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.CONNECTION_TIMEOUT, 5000);
                            put(Const.SOCKET_TIMEOUT, 5000);
                            put(Const.Host, "vod.ap-singapore-1.volcengineapi.com");
                            put(Const.Header, new ArrayList<Header>() {
                                {
                                    add(new BasicHeader("Accept", "application/json"));
                                }
                            });
                            put(Const.Credentials, new Credentials(Const.REGION_AP_SINGAPORE_1, "vod"));
                        }
                    }
            ));
            put(Const.REGION_US_EASE_1, new ServiceInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.CONNECTION_TIMEOUT, 5000);
                            put(Const.SOCKET_TIMEOUT, 5000);
                            put(Const.Host, "vod.us-east-1.volcengineapi.com");
                            put(Const.Header, new ArrayList<Header>() {
                                {
                                    add(new BasicHeader("Accept", "application/json"));
                                }
                            });
                            put(Const.Credentials, new Credentials(Const.REGION_US_EASE_1, "vod"));
                        }
                    }
            ));
        }
    };

    public static Map<String, ApiInfo> apiInfoList = new HashMap<String, ApiInfo>() {
        {
            put(Const.GetPlayInfo, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetPlayInfo));
                                    add(new BasicNameValuePair("Version", "2020-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.StartWorkflow, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.StartWorkflow));
                                    add(new BasicNameValuePair("Version", "2020-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UploadMediaByUrl, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UploadMediaByUrl));
                                    add(new BasicNameValuePair("Version", "2020-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ApplyUploadInfo, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ApplyUploadInfo));
                                    add(new BasicNameValuePair("Version", "2020-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.CommitUploadInfo, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.CommitUploadInfo));
                                    add(new BasicNameValuePair("Version", "2020-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.QueryUploadTaskInfo, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.QueryUploadTaskInfo));
                                    add(new BasicNameValuePair("Version", "2020-08-01"));
                                }
                            });
                        }
                    }
            ));

            put(Const.UpdateMediaPublishStatus, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateMediaPublishStatus));
                                    add(new BasicNameValuePair("Version", "2020-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateMediaInfo, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateMediaInfo));
                                    add(new BasicNameValuePair("Version", "2020-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetMediaInfos, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetMediaInfos));
                                    add(new BasicNameValuePair("Version", "2020-08-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetRecommendedPoster, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetRecommendedPoster));
                                    add(new BasicNameValuePair("Version", "2020-08-01"));
                                }
                            });
                        }
                    }
            ));
        }
    };
}
