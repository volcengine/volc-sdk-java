package com.volcengine.service.sms;

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

public class SmsConfig {
    public static Map<String, ServiceInfo> serviceInfoMap = new HashMap<String, ServiceInfo>() {
        {
            put(Const.REGION_CN_NORTH_1, new ServiceInfo(new HashMap<String, Object>() {
                {
                    put(Const.CONNECTION_TIMEOUT, 5000);
                    put(Const.SOCKET_TIMEOUT, 5000);
                    put(Const.Scheme, "https");
                    put(Const.Host, "sms.volcengineapi.com");
                    put(Const.Header, new ArrayList<Header>() {
                        {
                            add(new BasicHeader("Accept", "application/json"));
                        }
                    });
                    put(Const.Credentials, new Credentials(Const.REGION_CN_NORTH_1, "volcSMS"));
                }
            }));
            put(Const.REGION_AP_SINGAPORE_1, new ServiceInfo(new HashMap<String, Object>() {
                {
                    put(Const.CONNECTION_TIMEOUT, 5000);
                    put(Const.SOCKET_TIMEOUT, 5000);
                    put(Const.Scheme, "https");
                    put(Const.Host, "sms.byteplusapi.com");
                    put(Const.Header, new ArrayList<Header>() {
                        {
                            add(new BasicHeader("Accept", "application/json"));
                        }
                    });
                    put(Const.Credentials, new Credentials(Const.REGION_AP_SINGAPORE_1, "volcSMS"));
                }
            }));
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
                                    add(new BasicNameValuePair("Action", "SendSms"));
                                    add(new BasicNameValuePair("Version", "2020-01-01"));
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
                                    add(new BasicNameValuePair("Action", "SendBatchSms"));
                                    add(new BasicNameValuePair("Version", "2021-01-01"));
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
                                    add(new BasicNameValuePair("Action", "SendSmsVerifyCode"));
                                    add(new BasicNameValuePair("Version", "2020-01-01"));
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
                                    add(new BasicNameValuePair("Action", "CheckSmsVerifyCode"));
                                    add(new BasicNameValuePair("Version", "2020-01-01"));
                                }
                            });
                        }
                    }
            ));
            put("Conversion", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "Conversion"));
                                    add(new BasicNameValuePair("Version", "2020-01-01"));
                                }
                            });
                        }
                    }
            ));
            put("GetSmsTemplateAndOrderList", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "GetSmsTemplateAndOrderList"));
                                    add(new BasicNameValuePair("Version", "2021-01-11"));
                                }
                            });
                        }
                    }
            ));
            put("GetVmsTemplateStatus", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "GetVmsTemplateStatus"));
                                    add(new BasicNameValuePair("Version", "2021-01-11"));
                                }
                            });
                        }
                    }
            ));
            put("ApplySmsTemplate", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "ApplySmsTemplate"));
                                    add(new BasicNameValuePair("Version", "2021-01-11"));
                                }
                            });
                        }
                    }
            ));
            put("ApplyVmsTemplate", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "ApplyVmsTemplate"));
                                    add(new BasicNameValuePair("Version", "2021-01-11"));
                                }
                            });
                        }
                    }
            ));
            put("DeleteSmsTemplate", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DeleteSmsTemplate"));
                                    add(new BasicNameValuePair("Version", "2021-01-11"));
                                }
                            });
                        }
                    }
            ));
            put("GetSubAccountList", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "GetSubAccountList"));
                                    add(new BasicNameValuePair("Version", "2021-01-11"));
                                }
                            });
                        }
                    }
            ));
            put("GetSubAccountDetail", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "GetSubAccountDetail"));
                                    add(new BasicNameValuePair("Version", "2021-01-11"));
                                }
                            });
                        }
                    }
            ));
            put("GetSignatureAndOrderList", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "GetSignatureAndOrderList"));
                                    add(new BasicNameValuePair("Version", "2025-01-01"));
                                }
                            });
                        }
                    }
            ));
            put("GetTotalSendCountStatV5", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "GetTotalSendCountStatV5"));
                                    add(new BasicNameValuePair("Version", "2021-01-11"));
                                }
                            });
                        }
                    }
            ));
            put("ApplySmsSignature", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "ApplySmsSignature"));
                                    add(new BasicNameValuePair("Version", "2021-01-11"));
                                }
                            });
                        }
                    }
            ));
            put("ApplySmsSignatureV2", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "ApplySmsSignatureV2"));
                                    add(new BasicNameValuePair("Version", "2025-01-01"));
                                }
                            });
                        }
                    }
            ));
            put("UpdateSmsSignature", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "UpdateSmsSignature"));
                                    add(new BasicNameValuePair("Version", "2025-01-01"));
                                }
                            });
                        }
                    }
            ));
            put("DeleteSignature", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DeleteSignature"));
                                    add(new BasicNameValuePair("Version", "2025-01-01"));
                                }
                            });
                        }
                    }
            ));
            put("InsertSubAccount", new ApiInfo(new HashMap<String, Object>() {
                {
                    put(Const.Method, "POST");
                    put(Const.Path, "/");
                    put(Const.Query, new ArrayList<NameValuePair>() {
                        {
                            add(new BasicNameValuePair("Action", "InsertSubAccount"));
                            add(new BasicNameValuePair("Version", "2021-01-11"));
                        }
                    });
                }
            }));
            put("EditMultiReplyConfig", new ApiInfo(new HashMap<String, Object>() {
                {
                    put(Const.Method, "POST");
                    put(Const.Path, "/");
                    put(Const.Query, new ArrayList<NameValuePair>() {
                        {
                            add(new BasicNameValuePair("Action", "EditMultiReplyConfig"));
                            add(new BasicNameValuePair("Version", "2021-01-11"));
                        }
                    });
                }
            }));
            put("GetRelyConfig", new ApiInfo(new HashMap<String, Object>() {
                {
                    put(Const.Method, "GET");
                    put(Const.Path, "/");
                    put(Const.Query, new ArrayList<NameValuePair>() {
                        {
                            add(new BasicNameValuePair("Action", "GetRelyConfig"));
                            add(new BasicNameValuePair("Version", "2021-01-11"));
                        }
                    });
                }
            }));

            put("GetSmsSendDetails", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "GetSmsSendDetails"));
                                    add(new BasicNameValuePair("Version", "2021-01-11"));
                                }
                            });
                        }
                    }
            ));

            put("GetSignatureIdentList", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "GetSignatureIdentList"));
                                    add(new BasicNameValuePair("Version", "2021-01-11"));
                                }
                            });
                        }
                    }
            ));

            put("BatchBindSignatureIdent", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "BatchBindSignatureIdent"));
                                    add(new BasicNameValuePair("Version", "2021-01-11"));
                                }
                            });
                        }
                    }
            ));

            put("ApplySignatureIdent", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "ApplySignatureIdent"));
                                    add(new BasicNameValuePair("Version", "2021-01-11"));
                                }
                            });
                        }
                    }
            ));

            put("UpdateSignatureIdent", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "UpdateSignatureIdent"));
                                    add(new BasicNameValuePair("Version", "2021-01-11"));
                                }
                            });
                        }
                    }
            ));

            put("GetTobTrafficDrivingPhoneList", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "GetTobTrafficDrivingPhoneList"));
                                    add(new BasicNameValuePair("Version", "2021-01-11"));
                                }
                            });
                        }
                    }
            ));

            put("BulkCreateTobTrafficDrivingPhone", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "BulkCreateTobTrafficDrivingPhone"));
                                    add(new BasicNameValuePair("Version", "2021-01-11"));
                                }
                            });
                        }
                    }
            ));

            put("UpdateTobTrafficDrivingPhone", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "UpdateTobTrafficDrivingPhoneSDK"));
                                    add(new BasicNameValuePair("Version", "2021-01-11"));
                                }
                            });
                        }
                    }
            ));

            put("DeleteTobTrafficDrivingPhone", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DeleteTobTrafficDrivingPhoneSDK"));
                                    add(new BasicNameValuePair("Version", "2021-01-11"));
                                }
                            });
                        }
                    }
            ));

            put("GetTobTrafficDrivingLinkList", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "GetTobTrafficDrivingLinkList"));
                                    add(new BasicNameValuePair("Version", "2021-01-11"));
                                }
                            });
                        }
                    }
            ));

            put("BulkCreateTobTrafficDrivingLink", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "BulkCreateTobTrafficDrivingLink"));
                                    add(new BasicNameValuePair("Version", "2021-01-11"));
                                }
                            });
                        }
                    }
            ));

            put("DeleteTobTrafficDrivingLink", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DeleteTobTrafficDrivingLinkSDK"));
                                    add(new BasicNameValuePair("Version", "2021-01-11"));
                                }
                            });
                        }
                    }
            ));

            put("ListRelationTemplate", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "ListRelationTemplateSDK"));
                                    add(new BasicNameValuePair("Version", "2021-01-11"));
                                }
                            });
                        }
                    }
            ));

            put("BindTrafficDrivingParamsSDK", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "BindTrafficDrivingParamsSDK"));
                                    add(new BasicNameValuePair("Version", "2021-01-11"));
                                }
                            });
                        }
                    }
            ));

            put("ListSmsTemplateV2SDK", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "ListSmsTemplateV2SDK"));
                                    add(new BasicNameValuePair("Version", "2021-01-11"));
                                }
                            });
                        }
                    }
            ));

            put("ApplySmsTemplateV2SDK", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "ApplySmsTemplateV2SDK"));
                                    add(new BasicNameValuePair("Version", "2021-01-11"));
                                }
                            });
                        }
                    }
            ));

            put("BindSignatures", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "BindSignaturesSDK"));
                                    add(new BasicNameValuePair("Version", "2021-01-11"));
                                }
                            });
                        }
                    }
            ));

            put("ListSecondTemplate", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "ListSecondTemplate"));
                                    add(new BasicNameValuePair("Version", "2021-01-11"));
                                }
                            });
                        }
                    }
            ));

            put("ListSubContent", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "ListSubContent"));
                                    add(new BasicNameValuePair("Version", "2021-01-11"));
                                }
                            });
                        }
                    }
            ));
        }
    };
}
