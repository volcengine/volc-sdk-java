package com.volcengine.service.translate;

import com.volcengine.helper.Const;
import com.volcengine.model.ApiInfo;
import com.volcengine.model.Credentials;
import com.volcengine.model.ServiceInfo;
import com.volcengine.model.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TranslateConfig {
    public static ServiceInfo serviceInfo = new ServiceInfo(
            new HashMap<String, Object>() {
                {
                    put(Const.CONNECTION_TIMEOUT, 5000);
                    put(Const.SOCKET_TIMEOUT, 5000);
                    put(Const.Host, "open.volcengineapi.com");
                    put(Const.Header, new ArrayList<Header>() {
                        {
                            add(new Header("Accept", "application/json"));
                        }
                    });
                    put(Const.Credentials, new Credentials(Const.REGION_CN_NORTH_1, "translate"));
                }
            }
    );
    public static Map<String, ApiInfo> apiInfoList = new HashMap<String, ApiInfo>() {
        {
            put(Const.LangDetect, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.LangDetect));
                                    add(new NameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.TranslateText, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.TranslateText));
                                    add(new NameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.TranslateImage, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.TranslateImage));
                                    add(new NameValuePair("Version", "2020-07-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.TranslateAudioSubmit, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.TranslateAudioSubmit));
                                    add(new NameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.TranslateAudioQuery, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.TranslateAudioQuery));
                                    add(new NameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
        }
    };
}
