package com.volcengine.service.sms;

import com.volcengine.helper.Const;
import com.volcengine.model.ApiInfo;
import com.volcengine.model.Credentials;
import com.volcengine.model.ServiceInfo;
import com.volcengine.model.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SmsConfig {
    public static Map<String, ServiceInfo> serviceInfoMap = new HashMap<String, ServiceInfo>() {
        {
            put(Const.REGION_CN_NORTH_1, new ServiceInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.CONNECTION_TIMEOUT, 5000);
                            put(Const.SOCKET_TIMEOUT, 5000);
                            put(Const.Scheme, "https");
                            put(Const.Host, "sms.volcengineapi.com");
                            put(Const.Header, new ArrayList<Header>() {
                                {
                                    add(new Header("Accept", "application/json"));
                                }
                            });
                            put(Const.Credentials, new Credentials(Const.REGION_CN_NORTH_1, "volcSMS"));
                        }
                    }
            ));
            put(Const.REGION_AP_SINGAPORE_1, new ServiceInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.CONNECTION_TIMEOUT, 5000);
                            put(Const.SOCKET_TIMEOUT, 5000);
                            put(Const.Scheme, "https");
                            put(Const.Host, "sms.byteplusapi.com");
                            put(Const.Header, new ArrayList<Header>() {
                                {
                                    add(new Header("Accept", "application/json"));
                                }
                            });
                            put(Const.Credentials, new Credentials(Const.REGION_AP_SINGAPORE_1, "volcSMS"));
                        }
                    }
            ));
        }
    };

    public static Map<String, ApiInfo> apiInfoList = new HashMap<String, ApiInfo>() {
        {
            put("SendSms", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", "SendSms"));
                                    add(new NameValuePair("Version", "2020-01-01"));
                                }
                            });
                        }
                    }
            ));
            put("SendBatchSms", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", "SendBatchSms"));
                                    add(new NameValuePair("Version", "2021-01-01"));
                                }
                            });
                        }
                    }
            ));
            put("SendSmsVerifyCode", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", "SendSmsVerifyCode"));
                                    add(new NameValuePair("Version", "2020-01-01"));
                                }
                            });
                        }
                    }
            ));
            put("CheckSmsVerifyCode", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", "CheckSmsVerifyCode"));
                                    add(new NameValuePair("Version", "2020-01-01"));
                                }
                            });
                        }
                    }
            ));
        }
    };
}
