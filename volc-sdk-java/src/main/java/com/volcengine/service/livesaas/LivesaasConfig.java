package com.volcengine.service.livesaas;

import com.volcengine.helper.Const;
import com.volcengine.model.ApiInfo;
import com.volcengine.model.Credentials;
import com.volcengine.model.ServiceInfo;
import com.volcengine.model.*;

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
                            put(Const.SOCKET_TIMEOUT, 5000);
                            put(Const.Scheme, "https");
                            put(Const.Host, "livesaas.volcengineapi.com");
                            put(Const.Header, new ArrayList<Header>() {
                                {
                                    add(new Header("Accept", "application/json"));
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
            put(Const.CreateActivityAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.CreateActivityAPI));
                                    add(new NameValuePair("Version", "2020-06-01"));
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
                                    add(new NameValuePair("Action", Const.GetActivityAPI));
                                    add(new NameValuePair("Version", "2020-06-01"));
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
                                    add(new NameValuePair("Action", Const.GetStreamsAPI));
                                    add(new NameValuePair("Version", "2020-06-01"));
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
                                    add(new NameValuePair("Action", Const.GetAdvertisementDataAPI));
                                    add(new NameValuePair("Version", "2020-06-01"));
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
                                    add(new NameValuePair("Action", Const.GetRealTimeOnlineNumberAPI));
                                    add(new NameValuePair("Version", "2020-06-01"));
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
                                    add(new NameValuePair("Action", Const.DeleteActivityAPI));
                                    add(new NameValuePair("Version", "2020-06-01"));
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
                                    add(new NameValuePair("Action", Const.UpdateActivityBasicConfigAPI));
                                    add(new NameValuePair("Version", "2020-06-01"));
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
                                    add(new NameValuePair("Action", Const.GetActivityBasicConfigAPI));
                                    add(new NameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UploadLibAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.UploadLibAPI));
                                    add(new NameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetActivityMenuAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.GetActivityMenuAPI));
                                    add(new NameValuePair("Version", "2020-06-01"));
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
                                    add(new NameValuePair("Action", Const.UpdateActivityMenuAPI));
                                    add(new NameValuePair("Version", "2020-06-01"));
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
                                    add(new NameValuePair("Action", Const.GetActivityProductAPI));
                                    add(new NameValuePair("Version", "2020-06-01"));
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
                                    add(new NameValuePair("Action", Const.UpdateActivityProductAPI));
                                    add(new NameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ListActivityDetailStatusAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.ListActivityDetailStatusAPI));
                                    add(new NameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
        }
    };
}
