package com.volcengine.service.billing;

import com.volcengine.helper.Const;
import com.volcengine.model.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BillingConfig {

    public static ServiceInfo serviceInfo = new ServiceInfo(
            new HashMap<String, Object>() {
                {
                    put(Const.CONNECTION_TIMEOUT, 5000);
                    put(Const.SOCKET_TIMEOUT, 5000);
                    put(Const.Host, "billing.volcengineapi.com");
                    put(Const.Header, new ArrayList<Header>() {
                        {
                            add(new Header("Accept", "application/json"));
                        }
                    });
                    put(Const.Credentials, new Credentials(Const.REGION_CN_NORTH_1, "billing"));
                }
            }
    );
    public static Map<String, ApiInfo> apiInfoList = new HashMap<String, ApiInfo>() {
        {
            put(Const.ListBill, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.ListBill));
                                    add(new NameValuePair("Version", "2022-01-01"));
                                }
                            });
                        }
                    }
            ));

            put(Const.ListBillDetail, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.ListBillDetail));
                                    add(new NameValuePair("Version", "2022-01-01"));
                                }
                            });
                        }
                    }
            ));

            put(Const.ListBillOverviewByProd, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.ListBillOverviewByProd));
                                    add(new NameValuePair("Version", "2022-01-01"));
                                }
                            });
                        }
                    }
            ));
        }
    };
}
