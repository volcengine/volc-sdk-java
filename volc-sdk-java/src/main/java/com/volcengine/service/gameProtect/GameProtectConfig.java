package com.volcengine.service.gameProtect;

import com.volcengine.helper.Const;
import com.volcengine.model.ApiInfo;
import com.volcengine.model.Credentials;
import com.volcengine.model.ServiceInfo;
import com.volcengine.model.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GameProtectConfig {
    public static ServiceInfo serviceInfo = new ServiceInfo (
            new HashMap<String, Object>() {
                {
                    put(Const.CONNECTION_TIMEOUT, 5000);
                    put(Const.SOCKET_TIMEOUT, 5000);
                    put(Const.Host, "gameprotect.volcengineapi.com");
                    put(Const.Header, new ArrayList<Header>() {
                        {
                            add(new Header("Accept", "application/json"));
                        }
                });
                   put(Const.Credentials, new Credentials(Const.REGION_CN_NORTH_1, "game_protect"));
                }
            }
    );

    public static Map<String, ApiInfo> apiInfoList = new HashMap<String, ApiInfo>() {
        {
            put(Const.GameProtect, new ApiInfo (
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path,  "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", "riskResult"));
                                    add(new NameValuePair("Version", "2021-04-25"));
                                }
                            });
                        }
                    }
            ));
        }
    };

}
