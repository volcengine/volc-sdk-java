package com.volcengine.service.cms;

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

public class CmsConfig {

    public static final Map<String, ServiceInfo> platformServiceInfoMap = new HashMap<String, ServiceInfo>() {
        {
            put(Const.REGION_CN_NORTH_1, new ServiceInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.CONNECTION_TIMEOUT, 5000);
                            put(Const.SOCKET_TIMEOUT, 5000);
                            put(Const.Scheme, "https");
                            put(Const.Host, "cms.volcengineapi.com");
                            put(Const.Header, new ArrayList<Header>() {
                                {
                                    add(new BasicHeader("Accept", "application/json"));
                                }
                            });
                            put(Const.Credentials, new Credentials(Const.REGION_CN_NORTH_1, "volc_content_platform"));
                        }
                    }
            ));
        }
    };

    public static final Map<String, ApiInfo> platformApiInfoMap = new HashMap<String, ApiInfo>() {
        {
            put("BatchCreateSourceArticle", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "BatchCreateSourceArticle"));
                                    add(new BasicNameValuePair("Version", "2021-01-01"));
                                }
                            });
                        }
                    }
            ));
            put("GetArticleBatchUploadDetail", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "GetArticleBatchUploadDetail"));
                                    add(new BasicNameValuePair("Version", "2021-01-01"));
                                }
                            });
                        }
                    }
            ));
        }
    };

    public static final Map<String, ServiceInfo> apiServiceInfoMap = new HashMap<String, ServiceInfo>() {
        {
            put(Const.REGION_CN_NORTH_1, new ServiceInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.CONNECTION_TIMEOUT, 5000);
                            put(Const.SOCKET_TIMEOUT, 5000);
                            put(Const.Scheme, "https");
                            put(Const.Host, "cms.volcengineapi.com");
                            put(Const.Header, new ArrayList<Header>() {
                                {
                                    add(new BasicHeader("Accept", "application/json"));
                                }
                            });
                            put(Const.Credentials, new Credentials(Const.REGION_CN_NORTH_1, "volc_content_api"));
                        }
                    }
            ));
        }
    };

    public static final Map<String, ApiInfo> apiApiInfoMap = new HashMap<String, ApiInfo>() {
        {
            put("Feed", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "Feed"));
                                    add(new BasicNameValuePair("Version", "2021-06-17"));
                                }
                            });
                        }
                    }
            ));
        }
    };
}
