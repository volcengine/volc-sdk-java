package com.volcengine.service.iam;

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

public class IamConfig {

    public static ServiceInfo serviceInfo = new ServiceInfo(
            new HashMap<String, Object>() {
                {
                    put(Const.CONNECTION_TIMEOUT, 5000);
                    put(Const.SOCKET_TIMEOUT, 5000);
                    put(Const.Host, "iam.volcengineapi.com");
                    put(Const.Header, new ArrayList<Header>() {
                        {
                            add(new BasicHeader("Accept", "application/json"));
                        }
                    });
                    put(Const.Credentials, new Credentials(Const.REGION_CN_NORTH_1, "iam"));
                }
            }
    );
    public static Map<String, ApiInfo> apiInfoList = new HashMap<String, ApiInfo>() {
        {
            put(Const.CreateUser, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.CreateUser));
                                    add(new BasicNameValuePair("Version", "2018-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.DeleteUser, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DeleteUser));
                                    add(new BasicNameValuePair("Version", "2018-01-01"));
                                }
                            });
                        }
                    }));
            put(Const.ListUsers, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListUsers));
                                    add(new BasicNameValuePair("Version", "2018-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.CreateRole, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.CreateRole));
                                    add(new BasicNameValuePair("Version", "2018-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateRole, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateRole));
                                    add(new BasicNameValuePair("Version", "2018-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ListRoles, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListRoles));
                                    add(new BasicNameValuePair("Version", "2018-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.DeleteRole, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DeleteRole));
                                    add(new BasicNameValuePair("Version", "2018-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetRole, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetRole));
                                    add(new BasicNameValuePair("Version", "2018-01-01"));
                                }
                            });
                        }
                    }
            ));
        }
    };
}
