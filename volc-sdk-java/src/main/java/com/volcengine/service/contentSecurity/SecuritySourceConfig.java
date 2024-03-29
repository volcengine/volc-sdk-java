package com.volcengine.service.contentSecurity;

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

public class SecuritySourceConfig {

    public static ServiceInfo serviceInfo = new ServiceInfo(
            new HashMap<String, Object>() {
                {
                    put(Const.CONNECTION_TIMEOUT, 60 * 1000);
                    put(Const.Host, "contentservice.zijieapi.com");
                    put(Const.Scheme, Const.HTTPS);
                    put(Const.Credentials, new Credentials(Const.REGION_CN_NORTH_1, "BusinessSecurity"));
                }
            }
    );


    public static Map<String, ApiInfo> apiInfoList = new HashMap<String, ApiInfo>() {
        {
            put(Const.SecuritySource, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/openapi/v1/sse/security_source");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.SecuritySource));
                                    add(new BasicNameValuePair("Version", "2022-08-26"));
                                }
                            });
                            put(Const.Header, new ArrayList<Header>() {
                                {
                                    add(new BasicHeader("Accept", "application/json"));
                                }
                            });
                            put(Const.SOCKET_TIMEOUT, 3 * 60 * 1000);
                        }
                    }
            ));
            put(Const.SecuritySourceStream, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/openapi/v1/sse/security_source_stream");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.SecuritySourceStream));
                                    add(new BasicNameValuePair("Version", "2022-08-26"));
                                }
                            });
                            put(Const.Header, new ArrayList<Header>() {
                                {
                                    add(new BasicHeader("Accept", "text/event-stream"));
                                }
                            });
                            put(Const.SOCKET_TIMEOUT, 3 * 60 * 1000);
                        }
                    }
            ));
        }
    };

}
