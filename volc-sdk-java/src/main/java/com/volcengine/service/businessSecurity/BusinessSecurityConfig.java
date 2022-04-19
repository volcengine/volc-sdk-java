package com.volcengine.service.businessSecurity;

import com.volcengine.helper.Const;
import com.volcengine.model.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BusinessSecurityConfig {
    public static ServiceInfo serviceInfo = new ServiceInfo(
            new HashMap<String, Object>() {
                {
                    put(Const.CONNECTION_TIMEOUT, 5000);
                    put(Const.SOCKET_TIMEOUT, 5000);
                    put(Const.Host, "riskcontrol.volcengineapi.com");
                    put(Const.Header, new ArrayList<Header>() {
                        {
                            add(new Header("Accept", "application/json"));
                        }
                    });
                    put(Const.Credentials, new Credentials(Const.REGION_CN_NORTH_1, "BusinessSecurity"));
                }
            }
    );
    public static Map<String, ApiInfo> apiInfoList = new HashMap<String, ApiInfo>() {
        {
            put(Const.RiskDetection, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.RiskDetection));
                                    add(new NameValuePair("Version", "2021-02-02"));
                                }
                            });
                        }
                    }
            ));
            put(Const.AsyncRiskDetection, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.AsyncRiskDetection));
                                    add(new NameValuePair("Version", "2021-02-25"));
                                }
                            });
                        }
                    }
            ));
            put(Const.RiskResult, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.RiskResult));
                                    add(new NameValuePair("Version", "2021-03-10"));
                                }
                            });
                        }
                    }
            ));
            put(Const.DataReport, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.DataReport));
                                    add(new NameValuePair("Version", "2021-08-31"));
                                }
                            });
                        }
                    }
            ));
            put(Const.AccountRisk, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.AccountRisk));
                                    add(new NameValuePair("Version", "2020-12-25"));
                                }
                            });
                        }
                    }
            ));
            put(Const.MobileStatus, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.MobileStatus));
                                    add(new NameValuePair("Version", "2020-12-25"));
                                }
                            });
                        }
                    }
            ));

            put(Const.ElementVerify, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.ElementVerify));
                                    add(new NameValuePair("Version", "2021-11-23"));
                                }
                            });
                        }
                    }
            ));
            put(Const.MobileStatusV2, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", "MobileStatus"));
                                    add(new NameValuePair("Version", "2022-04-13"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ElementVerifyV2, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", "ElementVerify"));
                                    add(new NameValuePair("Version", "2022-04-13"));
                                }
                            });
                        }
                    }
            ));
        }
    };
}
