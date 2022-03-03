package com.volcengine.service.live;

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

public class LiveConfig {

    public static Map<String, ServiceInfo> serviceInfoMap = new HashMap<String, ServiceInfo>() {
        {
            put(Const.REGION_CN_NORTH_1, new ServiceInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.CONNECTION_TIMEOUT, 5000);
                            put(Const.SOCKET_TIMEOUT, 5000);
                            put(Const.Scheme, "https");
                            put(Const.Host, "volcengineapi-boe.byted.org");//boe
//                            put(Const.Host, "live.volcengineapi.com");
                            put(Const.Header, new ArrayList<Header>() {
                                {
                                    add(new BasicHeader("Accept", "application/json"));
                                }
                            });
                            put(Const.Credentials, new Credentials(Const.REGION_CN_NORTH_1, "live"));
                        }
                    }
            ));
        }
    };

    public static Map<String, ApiInfo> apiInfoList = new HashMap<String, ApiInfo>() {
        {
            put(Const.ListCommonTransPresetDetail, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListCommonTransPresetDetail));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateCallback, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateCallback));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.DescribeCallback, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DescribeCallback));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.DeleteCallback, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DeleteCallback));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.CreateDomain, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.CreateDomain));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.DeleteDomain, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DeleteDomain));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.ListDomainDetail, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListDomainDetail));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.DescribeDomain, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DescribeDomain));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.EnableDomain, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.EnableDomain));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.DisableDomain, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DisableDomain));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.ManagerPullPushDomainBind, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ManagerPullPushDomainBind));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateAuthKey, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateAuthKey));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.EnableAuth, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.EnableAuth));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.DisableAuth, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DisableAuth));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.DescribeAuth, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DescribeAuth));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateAllAuthUnder, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateAllAuthUnder));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.ForbidStream, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ForbidStream));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.ResumeStream, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ResumeStream));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.ListCert, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListCert));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.CreateCert, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.CreateCert));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.DescribeCertDetailSecret, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DescribeCertDetailSecret));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateCert, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateCert));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.BindCert, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.BindCert));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.UnbindCert, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UnbindCert));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.DeleteCert, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DeleteCert));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateReferer, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateReferer));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.DeleteReferer, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DeleteReferer));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.DescribeReferer, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DescribeReferer));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.CreateRecordPreset, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.CreateRecordPreset));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateRecordPreset, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateRecordPreset));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.DescribeRecordPreset, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DescribeRecordPreset));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.DescribeRecordPresetDetail, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DescribeRecordPresetDetail));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.DeleteRecordPreset, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DeleteRecordPreset));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.ListVhostRecordPreset, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListVhostRecordPreset));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.CreateTranscodePreset, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.CreateTranscodePreset));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateTranscodePreset, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateTranscodePreset));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.DescribeTranscodePreset, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DescribeTranscodePreset));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.DescribeTranscodePresetDetail, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DescribeTranscodePresetDetail));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion));

                                }
                            });
                        }
                    }
            ));
            put(Const.DeleteTranscodePreset, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DeleteTranscodePreset));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion));

                                }
                            });
                        }
                    }
            ));
            put(Const.CreateSnapshotPreset, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.CreateSnapshotPreset));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion));

                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateSnapshotPreset, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateSnapshotPreset));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion));

                                }
                            });
                        }
                    }
            ));
            put(Const.DescribeSnapshotPreset, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DescribeSnapshotPreset));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion));

                                }
                            });
                        }
                    }
            ));
            put(Const.DescribeSnapshotPresetDetail, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DescribeSnapshotPresetDetail));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion));

                                }
                            });
                        }
                    }
            ));
            put(Const.DeleteSnapshotPreset, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DeleteSnapshotPreset));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion));

                                }
                            });
                        }
                    }
            ));
            put(Const.ListVhostSnapshotPreset, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListVhostSnapshotPreset));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion));

                                }
                            });
                        }
                    }
            ));
        }
    };
}
