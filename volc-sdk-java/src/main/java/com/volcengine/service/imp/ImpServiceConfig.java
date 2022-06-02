package com.volcengine.service.imp;

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

public class ImpServiceConfig {

    public static Map<String, ServiceInfo> ServiceInfoMap = new HashMap<String, ServiceInfo>() {
        {
            put(com.volcengine.helper.Const.REGION_CN_NORTH_1, new ServiceInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.CONNECTION_TIMEOUT, 5000);
                            put(com.volcengine.helper.Const.SOCKET_TIMEOUT, 5000);
                            //put(com.volcengine.helper.Const.Host, "open.volcengineapi.com");
                            put(com.volcengine.helper.Const.Host, "volcengineapi-boe.byted.org");
                            put(com.volcengine.helper.Const.Header, new ArrayList<Header>() {
                                {
                                    add(new BasicHeader("Accept", "application/json"));
                                }
                            });
                            put(com.volcengine.helper.Const.Credentials, new Credentials(com.volcengine.helper.Const.REGION_CN_NORTH_1, "imp"));
                        }
                    }
            ));
        }
    };

    public static Map<String, ApiInfo> apiInfoList = new HashMap<String, ApiInfo>() {
        {
            // **********************************************************************
            // 提交任务
            // **********************************************************************
            put(Const.SubmitJob, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.SubmitJob));
                                    add(new BasicNameValuePair("Version", "2021-06-11"));
                                }
                            });
                        }
                    }
            ));

            // **********************************************************************
            // 获取任务
            // **********************************************************************
            put(Const.RetrieveJob, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.RetrieveJob));
                                    add(new BasicNameValuePair("Version", "2021-06-11"));
                                }
                            });
                        }
                    }
            ));

            // **********************************************************************
            // 删除任务
            // **********************************************************************
            put(Const.KillJob, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.volcengine.helper.Const.Method, "GET");
                            put(com.volcengine.helper.Const.Path, "/");
                            put(com.volcengine.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.KillJob));
                                    add(new BasicNameValuePair("Version", "2021-06-11"));
                                }
                            });
                        }
                    }
            ));
        }
    };
}
