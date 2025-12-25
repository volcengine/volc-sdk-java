package com.volcengine.service.businessSecurity;

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

public class BusinessSecurityConfig {
    private static ArrayList<BasicHeader> headers = new ArrayList<BasicHeader>();
    
    public static ServiceInfo serviceInfo = new ServiceInfo(
            new HashMap<String, Object>() {
                {
                    put(Const.CONNECTION_TIMEOUT, 5000);
                    put(Const.SOCKET_TIMEOUT, 5000);
                    put(Const.Host, "riskcontrol.volcengineapi.com");
                    put(Const.Header, new ArrayList<Header>() {
                        {
                            add(new BasicHeader("Accept", "application/json"));
                        }
                    });
                    put(Const.Credentials, new Credentials(Const.REGION_CN_NORTH_1, "BusinessSecurity"));
                }
            }
    );
    public static ServiceInfo serviceInfoOpenApi = new ServiceInfo(
            new HashMap<String, Object>() {
                {
                    put(Const.CONNECTION_TIMEOUT, 5000);
                    put(Const.SOCKET_TIMEOUT, 10000);
                    put(Const.Host, "riskcontrol.volcengineapi.com");
                    put(Const.Header, new ArrayList<Header>() {
                        {
                            add(new BasicHeader("Accept", "application/json"));
                        }
                    });
                    put(Const.Credentials, new Credentials(Const.REGION_CN_NORTH_1, "risk_console"));
                }
            }
    );
    public static HashMap<String, ServiceInfo> serviceInfoMapping = new HashMap<String, ServiceInfo>() {
        {
            put("risk_console", serviceInfoOpenApi);
            put("BusinessSecurity", serviceInfo);
        }
    };
    public static Map<String, ApiInfo> apiInfoList = new HashMap<String, ApiInfo>() {
        {
            put(Const.RiskDetection, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.RiskDetection));
                                    add(new BasicNameValuePair("Version", "2021-02-02"));
                                }
                            });
                        }
                    }
            ));
            put(Const.DeviceId, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DeviceId));
                                    add(new BasicNameValuePair("Version", "2021-02-02"));
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
                                    add(new BasicNameValuePair("Action", Const.AsyncRiskDetection));
                                    add(new BasicNameValuePair("Version", "2021-02-25"));
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
                                    add(new BasicNameValuePair("Action", Const.RiskResult));
                                    add(new BasicNameValuePair("Version", "2021-03-10"));
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
                                    add(new BasicNameValuePair("Action", Const.DataReport));
                                    add(new BasicNameValuePair("Version", "2021-08-31"));
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
                                    add(new BasicNameValuePair("Action", Const.AccountRisk));
                                    add(new BasicNameValuePair("Version", "2020-12-25"));
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
                                    add(new BasicNameValuePair("Action", Const.MobileStatus));
                                    add(new BasicNameValuePair("Version", "2020-12-25"));
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
                                    add(new BasicNameValuePair("Action", Const.ElementVerify));
                                    add(new BasicNameValuePair("Version", "2021-11-23"));
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
                                    add(new BasicNameValuePair("Action", "MobileStatus"));
                                    add(new BasicNameValuePair("Version", "2022-04-13"));
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
                                    add(new BasicNameValuePair("Action", "ElementVerify"));
                                    add(new BasicNameValuePair("Version", "2022-04-13"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ActivateRiskSampleData,new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "ActivateRiskSampleData"));
                                    add(new BasicNameValuePair("Version", "2023-10-01"));
                                }
                            });
                            put(Const.Header, headers);
                        }
                    }
            ));
            put(Const.ActivateRiskBasePackage,new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "ActivateRiskBasePackage"));
                                    add(new BasicNameValuePair("Version", "2023-10-01"));
                                }
                            });
                            put(Const.Header, headers);
                        }
                    }
            ));


            put(Const.ActivateRiskResult,new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "ActivateRiskResult"));
                                    add(new BasicNameValuePair("Version", "2023-10-01"));
                                }
                            });
                            put(Const.Header, headers);
                        }
                    }
            ));
            put(Const.CancelActivateRiskResult,new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "CancelActivateRiskResult"));
                                    add(new BasicNameValuePair("Version", "2023-10-01"));
                                }
                            });
                            put(Const.Header, headers);
                        }
                    }
            ));

            //
            put(Const.ActivationRiskUploadBasePackage,new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "ActivationRiskUploadBasePackage"));
                                    add(new BasicNameValuePair("Version", "2025-01-01"));
                                }
                            });
                            put(Const.Header, headers);
                        }
                    }
            ));
            put(Const.ActivationRiskUploadSampleData,new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "ActivationRiskUploadSampleData"));
                                    add(new BasicNameValuePair("Version", "2025-01-01"));
                                }
                            });
                            put(Const.Header, headers);
                        }
                    }
            ));
            put(Const.ActivationRiskCompleteBasePackage,new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ActivationRiskCompleteBasePackage"));
                                add(new BasicNameValuePair("Version", "2025-01-01"));
                            }
                        });
                        put(Const.Header, headers);
                    }
                }
            ));
            put(Const.ActivationRiskCompleteSampleData,new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ActivationRiskCompleteSampleData"));
                                add(new BasicNameValuePair("Version", "2025-01-01"));
                            }
                        });
                        put(Const.Header, headers);
                    }
                }
            ));
            put(Const.ActivationRiskDetectRisk,new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ActivationRiskDetectRisk"));
                                add(new BasicNameValuePair("Version", "2025-01-01"));
                            }
                        });
                        put(Const.Header, headers);
                    }
                }
            ));
            put(Const.ActivationRiskAsyncDetectRisk,new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ActivationRiskAsyncDetectRisk"));
                                add(new BasicNameValuePair("Version", "2025-01-01"));
                            }
                        });
                        put(Const.Header, headers);
                    }
                }
            ));
            put(Const.ActivationRiskCancelAsyncDetectRisk,new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ActivationRiskCancelAsyncDetectRisk"));
                                add(new BasicNameValuePair("Version", "2025-01-01"));
                            }
                        });
                        put(Const.Header, headers);
                    }
                }
            ));
            put(Const.ActivationRiskConfirmAsyncDetectRisk,new ApiInfo(
                    new  HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "ActivationRiskConfirmAsyncDetectRisk"));
                                    add(new BasicNameValuePair("Version", "2025-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ActivationRiskListBasePackagePart,new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "ActivationRiskListBasePackagePart"));
                                    add(new BasicNameValuePair("Version", "2025-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ActivationRiskListSampleDataPart,new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "ListSampleDataPart"));
                                    add(new BasicNameValuePair("Version", "2025-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ActivationRiskAbortUploadSampleData,new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "AbortUploadSampleData"));
                                    add(new BasicNameValuePair("Version", "2025-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ActivationRiskAbortUploadBasePackage,new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "AbortUploadBasePackage"));
                                    add(new BasicNameValuePair("Version", "2025-01-01"));
                                }
                            });
                        }
                    }
            ));

            put(Const.SimpleRiskStat, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "SimpleRiskStat"));
                                    add(new BasicNameValuePair("Version", "2022-12-23"));
                                }
                            });
                            put(Const.Header, headers);
                        }
                    }
            ));
            put(Const.ContentRiskStat, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "ContentRiskStat"));
                                    add(new BasicNameValuePair("Version", "2022-12-23"));
                                }
                            });
                            put(Const.Header, headers);
                        }
                    }
            ));
            put(Const.GetUploadId,new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.CONNECTION_TIMEOUT, 30000);
                            put(Const.SOCKET_TIMEOUT, 30000);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "GetUploadId"));
                                    add(new BasicNameValuePair("Version", "2022-12-23"));
                                }
                            });
                            put(Const.Header, headers);
                        }
                    }
            ));
            put(Const.CompleteUploadFile,new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "CompleteUploadFile"));
                                    add(new BasicNameValuePair("Version", "2022-12-23"));
                                }
                            });
                            put(Const.Header, headers);
                        }
                    }
            ));
            put(Const.UploadFile,new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "UploadFile"));
                                    add(new BasicNameValuePair("Version", "2022-12-23"));
                                }
                            });
                            put(Const.Header, headers);
                        }
                    }
            ));
            put(Const.GetUploadedPartList,new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "GetUploadedPartList"));
                                    add(new BasicNameValuePair("Version", "2022-12-23"));
                                }
                            });
                            put(Const.Header, headers);
                        }
                    }
            ));
            put(Const.GetDailyMarketingPackage,new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "GetDailyMarketingPackage"));
                                    add(new BasicNameValuePair("Version", "2024-01-24"));
                                }
                            });
                            put(Const.Header, headers);
                        }
                    }
            ));
            put(Const.CreateApp,new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "CreateApp"));
                                    add(new BasicNameValuePair("Version", "2022-12-23"));
                                }
                            });
                            put(Const.Header, headers);
                        }
                    }
            ));
            put(Const.ListApps,new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "ListApps"));
                                    add(new BasicNameValuePair("Version", "2022-12-23"));
                                }
                            });
                            put(Const.Header, headers);
                        }
                    }
            ));



        }
    };

    public static void init() {
        
    }
}
