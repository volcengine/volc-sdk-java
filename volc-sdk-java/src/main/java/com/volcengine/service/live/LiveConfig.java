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
                            put(Const.Host, "live.volcengineapi.com");
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
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2023));
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
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2023));
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
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2023));
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
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2023));
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
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2023));
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
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2023));
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
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2023));
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
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2023));
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
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2023));
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
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2023));
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
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2023));
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
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2023));
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
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2023));
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
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2023));
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
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2023));
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
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2023));
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
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2023));
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
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2023));
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
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2023));
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
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2020));
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
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2023));
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
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2023));
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
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2023));
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
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2023));
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
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2023));
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
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2023));
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
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2023));
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
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2023));
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
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2023));
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
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2023));
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
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2023));
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
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2023));
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
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2023));
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
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2023));

                                }
                            });
                        }
                    }
            ));
            put(Const.ListVhostTransCodePreset, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListVhostTransCodePreset));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2023));

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
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2023));

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
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2023));

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
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2023));

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
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2023));

                                }
                            });
                        }
                    }
            ));
            put(Const.DescribeLiveBandwidthData, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DescribeLiveBandwidthData));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2020));

                                }
                            });
                        }
                    }
            ));
            put(Const.DescribeLiveTrafficData, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DescribeLiveTrafficData));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2020));

                                }
                            });
                        }
                    }
            ));
            put(Const.DescribeLiveP95PeakBandwidthData, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DescribeLiveP95PeakBandwidthData));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2020));

                                }
                            });
                        }
                    }
            ));
            put(Const.DescribeTranscodeData, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DescribeTranscodeData));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2020));

                                }
                            });
                        }
                    }
            ));
            put(Const.DescribeSnapshotData, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DescribeSnapshotData));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2020));

                                }
                            });
                        }
                    }
            ));
            put(Const.DescribeRecordData, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DescribeRecordData));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2020));

                                }
                            });
                        }
                    }
            ));
            put(Const.DescribeLiveTimeShiftData, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DescribeLiveTimeShiftData));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2023));

                                }
                            });
                        }
                    }
            ));
            put(Const.DescribePushStreamMetrics, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DescribePushStreamMetrics));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2020));

                                }
                            });
                        }
                    }
            ));
            put(Const.DescribeLiveStreamSessions, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DescribeLiveStreamSessions));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2020));

                                }
                            });
                        }
                    }
            ));
            put(Const.DescribePlayResponseStatusStat, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DescribePlayResponseStatusStat));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2020));

                                }
                            });
                        }
                    }
            ));
            put(Const.DescribeLiveDomainLog, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DescribeLiveDomainLog));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2020));

                                }
                            });
                        }
                    }
            ));
            put(Const.DescribeLiveMetricTrafficData, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DescribeLiveMetricTrafficData));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2020));

                                }
                            });
                        }
                    }
            ));
            put(Const.DescribeLiveMetricBandwidthData, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DescribeLiveMetricBandwidthData));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2020));

                                }
                            });
                        }
                    }
            ));
            put(Const.DescribePlayStreamList, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DescribePlayStreamList));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2020));

                                }
                            });
                        }
                    }
            ));
            put(Const.DescribePullToPushBandwidthData, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DescribePullToPushBandwidthData));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2020));

                                }
                            });
                        }
                    }
            ));
            put(Const.CreateSnapshotAuditPreset, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.CreateSnapshotAuditPreset));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2023));

                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateSnapshotAuditPreset, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateSnapshotAuditPreset));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2023));

                                }
                            });
                        }
                    }
            ));
            put(Const.DeleteSnapshotAuditPreset, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DeleteSnapshotAuditPreset));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2023));

                                }
                            });
                        }
                    }
            ));
            put(Const.ListVhostSnapshotAuditPreset, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListVhostSnapshotAuditPreset));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2023));

                                }
                            });
                        }
                    }
            ));
            put(Const.DescribeLiveAuditData, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DescribeLiveAuditData));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2020));

                                }
                            });
                        }
                    }
            ));
            put(Const.DescribeCDNSnapshotHistory, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DescribeCDNSnapshotHistory));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2023));

                                }
                            });
                        }
                    }
            ));
            put(Const.DescribeRecordTaskFileHistory, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DescribeRecordTaskFileHistory));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2023));

                                }
                            });
                        }
                    }
            ));
            put(Const.DescribeLiveStreamInfoByPage, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DescribeLiveStreamInfoByPage));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2023));

                                }
                            });
                        }
                    }
            ));
            put(Const.KillStream, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.KillStream));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2023));

                                }
                            });
                        }
                    }
            ));
            put(Const.DescribeClosedStreamInfoByPage, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DescribeClosedStreamInfoByPage));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2023));

                                }
                            });
                        }
                    }
            ));
            put(Const.DescribeLiveStreamState, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DescribeLiveStreamState));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2023));

                                }
                            });
                        }
                    }
            ));
            put(Const.DescribeForbiddenStreamInfoByPage, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DescribeForbiddenStreamInfoByPage));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2023));

                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateRelaySourceV2, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateRelaySourceV2));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2023));

                                }
                            });
                        }
                    }
            ));
            put(Const.DeleteRelaySourceV2, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DeleteRelaySourceV2));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2023));

                                }
                            });
                        }
                    }
            ));
            put(Const.DescribeRelaySourceV2, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DescribeRelaySourceV2));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2023));

                                }
                            });
                        }
                    }
            ));
            put(Const.CreateVQScoreTask, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.CreateVQScoreTask));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2023));

                                }
                            });
                        }
                    }
            ));
            put(Const.DescribeVQScoreTask, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DescribeVQScoreTask));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2023));

                                }
                            });
                        }
                    }
            ));
            put(Const.ListVQScoreTask, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListVQScoreTask));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2023));

                                }
                            });
                        }
                    }
            ));
            put(Const.GeneratePlayURL, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GeneratePlayURL));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2023));

                                }
                            });
                        }
                    }
            ));
            put(Const.GeneratePushURL, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GeneratePushURL));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2023));

                                }
                            });
                        }
                    }
            ));
            put(Const.CreatePullToPushTask, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.CreatePullToPushTask));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2023));

                                }
                            });
                        }
                    }
            ));
            put(Const.ListPullToPushTask, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListPullToPushTask));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2023));

                                }
                            });
                        }
                    }
            ));
            put(Const.UpdatePullToPushTask, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdatePullToPushTask));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2023));

                                }
                            });
                        }
                    }
            ));
            put(Const.StopPullToPushTask, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.StopPullToPushTask));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2023));

                                }
                            });
                        }
                    }
            ));
            put(Const.RestartPullToPushTask, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.RestartPullToPushTask));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2023));

                                }
                            });
                        }
                    }
            ));
            put(Const.DeletePullToPushTask, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DeletePullToPushTask));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2023));

                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateDenyConfig, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateDenyConfig));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2023));

                                }
                            });
                        }
                    }
            ));
            put(Const.DescribeDenyConfig, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DescribeDenyConfig));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2023));

                                }
                            });
                        }
                    }
            ));
            put(Const.DeleteDenyConfig, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DeleteDenyConfig));
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion2023));

                                }
                            });
                        }
                    }
            ));
            put("DescribeLiveSnapshotData", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeLiveSnapshotData"));
                                    add(new BasicNameValuePair("Version", "2023-01-01"));
                                }
                            });
                        }
                    }
            ));
            put("DescribeLiveRecordData", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeLiveRecordData"));
                                    add(new BasicNameValuePair("Version", "2023-01-01"));
                                }
                            });
                        }
                    }
            ));
            put("DescribeLiveTranscodeData", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeLiveTranscodeData"));
                                    add(new BasicNameValuePair("Version", "2023-01-01"));
                                }
                            });
                        }
                    }
            ));
            put("DescribeLivePullToPushData", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeLivePullToPushData"));
                                    add(new BasicNameValuePair("Version", "2023-01-01"));
                                }
                            });
                        }
                    }
            ));
        }
    };
}
