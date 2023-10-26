package com.volcengine.service.maas;

import com.volcengine.helper.Const;
import com.volcengine.model.ApiInfo;
import com.volcengine.model.Credentials;
import com.volcengine.model.ServiceInfo;
import org.apache.http.Header;
import org.apache.http.message.BasicHeader;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MaasConfig {
    public static ServiceInfo getServiceInfo(String host, String region, int connectionTimeout, int socketTimeout) {
        return new ServiceInfo(new HashMap<String, Object>() {
            {
                put(Const.CONNECTION_TIMEOUT, connectionTimeout);
                put(Const.SOCKET_TIMEOUT, socketTimeout);
                put(Const.Scheme, Const.HTTPS);
                put(Const.Host, host);
                put(Const.Header, new ArrayList<Header>() {
                    {
                        add(new BasicHeader("Accept", "application/json"));
                    }
                });
                put(Const.Credentials, new Credentials(region, "ml_maas"));
            }
        });
    }

    public static Map<String, ApiInfo> getApiInfoList() {
        return new HashMap<String, ApiInfo>() {
            {
                put(Const.MaasApiChat, new ApiInfo(new HashMap<String, Object>() {
                    {
                        put(Const.Method, "post");
                        put(Const.Path, "/api/v1/chat");
                    }
                }));

                put(Const.MaasApiTokenization, new ApiInfo(new HashMap<String, Object>() {
                    {
                        put(Const.Method, "post");
                        put(Const.Path, "/api/v1/tokenization");
                    }
                }));

                put(Const.MaasApiClassification, new ApiInfo(new HashMap<String, Object>() {
                    {
                        put(Const.Method, "post");
                        put(Const.Path, "/api/v1/classification");
                    }
                }));
            }
        };
    }
}
