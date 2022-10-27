package com.volcengine.example.rtc;

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

public class RtcConfig {
    public static ServiceInfo serviceInfo = new ServiceInfo(
            new HashMap<String, Object>() {
                {
                    put(Const.CONNECTION_TIMEOUT, 5000);
                    put(Const.SOCKET_TIMEOUT, 5000);
                    put(Const.Host, "open.volcengineapi.com");
                    put(Const.Header, new ArrayList<Header>() {
                        {
                            add(new BasicHeader("Accept", "application/json"));
                        }
                    });
                    put(Const.Credentials, new Credentials(Const.REGION_CN_NORTH_1, "rtc"));
                }
            }
    );
    public static Map<String, ApiInfo> apiInfoList = new HashMap<String, ApiInfo>() {
        {
            put("StartRecord", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "post");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "StartRecord"));
                                    add(new BasicNameValuePair("Version", "2022-06-01"));
                                }
                            });
                        }
                    }
            ));
            put("StopRecord", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "post");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "StopRecord"));
                                    add(new BasicNameValuePair("Version", "2022-06-01"));
                                }
                            });
                        }
                    }
            ));
            put("GetRecordTask", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "get");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "GetRecordTask"));
                                    add(new BasicNameValuePair("Version", "2022-06-01"));
                                }
                            });
                        }
                    }
            ));
        }
    };

}
