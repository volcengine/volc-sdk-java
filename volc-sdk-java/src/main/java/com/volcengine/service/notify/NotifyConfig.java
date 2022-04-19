package com.volcengine.service.notify;

import com.volcengine.helper.Const;
import com.volcengine.model.ApiInfo;
import com.volcengine.model.Credentials;
import com.volcengine.model.ServiceInfo;
import com.volcengine.model.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class NotifyConfig {
    public static Map<String, ServiceInfo> serviceInfoMap = new HashMap<String, ServiceInfo>() {
        {
            put(Const.REGION_CN_NORTH_1, new ServiceInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.CONNECTION_TIMEOUT, 5000);
                            put(Const.SOCKET_TIMEOUT, 5000);
                            put(Const.Scheme, "https");
                            put(Const.Host, "cloud-vms.volcengineapi.com");
                            put(Const.Header, new ArrayList<Header>() {
                                {
                                    add(new Header("Accept", "application/json"));
                                }
                            });
                            put(Const.Credentials,
                                    new Credentials(Const.REGION_CN_NORTH_1, "volc_voice_notify"));
                        }
                    }
            ));
        }
    };

    public static Map<String, ApiInfo> apiInfoList = new HashMap<String, ApiInfo>() {
        {
            put("CreateTask", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", "CreateTask"));
                                    add(new NameValuePair("Version", "2021-01-01"));
                                }
                            });
                        }
                    }
            ));
            put("BatchAppend", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", "BatchAppend"));
                                    add(new NameValuePair("Version", "2021-01-01"));
                                }
                            });
                        }
                    }
            ));
            put("PauseTask", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", "PauseTask"));
                                    add(new NameValuePair("Version", "2021-01-01"));
                                }
                            });
                        }
                    }
            ));
            put("ResumeTask", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", "ResumeTask"));
                                    add(new NameValuePair("Version", "2021-01-01"));
                                }
                            });
                        }
                    }
            ));
            put("StopTask", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", "StopTask"));
                                    add(new NameValuePair("Version", "2021-01-01"));
                                }
                            });
                        }
                    }
            ));
            put("UpdateTask", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", "UpdateTask"));
                                    add(new NameValuePair("Version", "2021-01-01"));
                                }
                            });
                        }
                    }
            ));
            put("SingleBatchAppend", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", "SingleBatchAppend"));
                                    add(new NameValuePair("Version", "2021-01-01"));
                                }
                            });
                        }
                    }
            ));
            put("SingleInfo", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", "SingleInfo"));
                                    add(new NameValuePair("Version", "2021-01-01"));
                                }
                            });
                        }
                    }
            ));
            put("SingleCancel", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", "SingleCancel"));
                                    add(new NameValuePair("Version", "2021-01-01"));
                                }
                            });
                        }
                    }
            ));
            put("FetchResource", new ApiInfo(
                    new HashMap<String, Object>(){
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", "FetchResource"));
                                    add(new NameValuePair("Version", "2021-01-01"));
                                }
                            });
                        }
                    }
            ));

            put("OpenCreateTts", new ApiInfo(
                    new HashMap<String, Object>(){
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", "OpenCreateTts"));
                                    add(new NameValuePair("Version", "2021-01-01"));
                                }
                            });
                        }
                    }
            ));

            put("OpenDeleteResource", new ApiInfo(
                    new HashMap<String, Object>(){
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", "OpenDeleteResource"));
                                    add(new NameValuePair("Version", "2021-01-01"));
                                }
                            });
                        }
                    }
            ));

            put("GetResourceUploadUrl", new ApiInfo(
                    new HashMap<String, Object>(){
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", "GetResourceUploadUrl"));
                                    add(new NameValuePair("Version", "2021-01-01"));
                                }
                            });
                        }
                    }
            ));

            put("CommitResourceUpload", new ApiInfo(
                    new HashMap<String, Object>(){
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", "CommitResourceUpload"));
                                    add(new NameValuePair("Version", "2021-01-01"));
                                }
                            });
                        }
                    }
            ));
        }
    };
}
