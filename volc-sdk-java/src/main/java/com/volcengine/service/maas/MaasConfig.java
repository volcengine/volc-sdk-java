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
    public static ServiceInfo getServiceInfo(String host, String region) {
        return new ServiceInfo(new HashMap<String, Object>() {
            {
                put(Const.CONNECTION_TIMEOUT, 60_000);
                put(Const.SOCKET_TIMEOUT, 60_000);
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

    public static Map<String, ApiInfo> apiInfoList = new HashMap<String, ApiInfo>() {
        {
            put(Const.MaasApiChat, new ApiInfo(new HashMap<String, Object>() {
                {
                    put(Const.Method, "post");
                    put(Const.Path, "/api/v1/chat");
                }
            }));
        }
    };
}
