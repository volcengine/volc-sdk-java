package com.volcengine.service.live;

import com.volcengine.helper.Const;
import com.volcengine.model.*;

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
                                    add(new Header("Accept", "application/json"));
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
                                    add(new NameValuePair("Action", Const.ListCommonTransPresetDetail));
                                    add(new NameValuePair("Version", Const.LiveSDKVersion));
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
                                    add(new NameValuePair("Action", Const.UpdateCallback));
                                    add(new NameValuePair("Version", Const.LiveSDKVersion));
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
                                    add(new NameValuePair("Action", Const.DescribeCallback));
                                    add(new NameValuePair("Version", Const.LiveSDKVersion));
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
                                    add(new NameValuePair("Action", Const.DeleteCallback));
                                    add(new NameValuePair("Version", Const.LiveSDKVersion));
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
                                    add(new NameValuePair("Action", Const.CreateDomain));
                                    add(new NameValuePair("Version", Const.LiveSDKVersion));
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
                                    add(new NameValuePair("Action", Const.DeleteDomain));
                                    add(new NameValuePair("Version", Const.LiveSDKVersion));
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
                                    add(new NameValuePair("Action", Const.ListDomainDetail));
                                    add(new NameValuePair("Version", Const.LiveSDKVersion));
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
                                    add(new NameValuePair("Action", Const.DescribeDomain));
                                    add(new NameValuePair("Version", Const.LiveSDKVersion));
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
                                    add(new NameValuePair("Action", Const.EnableDomain));
                                    add(new NameValuePair("Version", Const.LiveSDKVersion));
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
                                    add(new NameValuePair("Action", Const.DisableDomain));
                                    add(new NameValuePair("Version", Const.LiveSDKVersion));
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
                                    add(new NameValuePair("Action", Const.ManagerPullPushDomainBind));
                                    add(new NameValuePair("Version", Const.LiveSDKVersion));
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
                                    add(new NameValuePair("Action", Const.UpdateAuthKey));
                                    add(new NameValuePair("Version", Const.LiveSDKVersion));
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
                                    add(new NameValuePair("Action", Const.EnableAuth));
                                    add(new NameValuePair("Version", Const.LiveSDKVersion));
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
                                    add(new NameValuePair("Action", Const.DisableAuth));
                                    add(new NameValuePair("Version", Const.LiveSDKVersion));
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
                                    add(new NameValuePair("Action", Const.DescribeAuth));
                                    add(new NameValuePair("Version", Const.LiveSDKVersion));
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
                                    add(new NameValuePair("Action", Const.ForbidStream));
                                    add(new NameValuePair("Version", Const.LiveSDKVersion));
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
                                    add(new NameValuePair("Action", Const.ResumeStream));
                                    add(new NameValuePair("Version", Const.LiveSDKVersion));
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
                                    add(new NameValuePair("Action", Const.ListCert));
                                    add(new NameValuePair("Version", Const.LiveSDKVersion));
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
                                    add(new NameValuePair("Action", Const.CreateCert));
                                    add(new NameValuePair("Version", Const.LiveSDKVersion));
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
                                    add(new NameValuePair("Action", Const.DescribeCertDetailSecret));
                                    add(new NameValuePair("Version", Const.LiveSDKVersion));
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
                                    add(new NameValuePair("Action", Const.UpdateCert));
                                    add(new NameValuePair("Version", Const.LiveSDKVersion));
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
                                    add(new NameValuePair("Action", Const.BindCert));
                                    add(new NameValuePair("Version", Const.LiveSDKVersion));
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
                                    add(new NameValuePair("Action", Const.UnbindCert));
                                    add(new NameValuePair("Version", Const.LiveSDKVersion));
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
                                    add(new NameValuePair("Action", Const.DeleteCert));
                                    add(new NameValuePair("Version", Const.LiveSDKVersion));
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
                                    add(new NameValuePair("Action", Const.UpdateReferer));
                                    add(new NameValuePair("Version", Const.LiveSDKVersion));
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
                                    add(new NameValuePair("Action", Const.DeleteReferer));
                                    add(new NameValuePair("Version", Const.LiveSDKVersion));
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
                                    add(new NameValuePair("Action", Const.DescribeReferer));
                                    add(new NameValuePair("Version", Const.LiveSDKVersion));
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
                                    add(new NameValuePair("Action", Const.CreateRecordPreset));
                                    add(new NameValuePair("Version", Const.LiveSDKVersion));
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
                                    add(new NameValuePair("Action", Const.UpdateRecordPreset));
                                    add(new NameValuePair("Version", Const.LiveSDKVersion));
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
                                    add(new NameValuePair("Action", Const.DeleteRecordPreset));
                                    add(new NameValuePair("Version", Const.LiveSDKVersion));
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
                                    add(new NameValuePair("Action", Const.ListVhostRecordPreset));
                                    add(new NameValuePair("Version", Const.LiveSDKVersion));
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
                                    add(new NameValuePair("Action", Const.CreateTranscodePreset));
                                    add(new NameValuePair("Version", Const.LiveSDKVersion));
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
                                    add(new NameValuePair("Action", Const.UpdateTranscodePreset));
                                    add(new NameValuePair("Version", Const.LiveSDKVersion));
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
                                    add(new NameValuePair("Action", Const.DeleteTranscodePreset));
                                    add(new NameValuePair("Version", Const.LiveSDKVersion));

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
                                    add(new NameValuePair("Action", Const.ListVhostTransCodePreset));
                                    add(new NameValuePair("Version", Const.LiveSDKVersion));

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
                                    add(new NameValuePair("Action", Const.CreateSnapshotPreset));
                                    add(new NameValuePair("Version", Const.LiveSDKVersion));

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
                                    add(new NameValuePair("Action", Const.UpdateSnapshotPreset));
                                    add(new NameValuePair("Version", Const.LiveSDKVersion));

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
                                    add(new NameValuePair("Action", Const.DeleteSnapshotPreset));
                                    add(new NameValuePair("Version", Const.LiveSDKVersion));

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
                                    add(new NameValuePair("Action", Const.ListVhostSnapshotPreset));
                                    add(new NameValuePair("Version", Const.LiveSDKVersion));

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
                                    add(new NameValuePair("Action", Const.DescribeLiveBandwidthData));
                                    add(new NameValuePair("Version", Const.LiveSDKVersion));

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
                                    add(new NameValuePair("Action", Const.DescribeLiveTrafficData));
                                    add(new NameValuePair("Version", Const.LiveSDKVersion));

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
                                    add(new NameValuePair("Action", Const.DescribeLiveP95PeakBandwidthData));
                                    add(new NameValuePair("Version", Const.LiveSDKVersion));

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
                                    add(new NameValuePair("Action", Const.DescribeTranscodeData));
                                    add(new NameValuePair("Version", Const.LiveSDKVersion));

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
                                    add(new NameValuePair("Action", Const.DescribeSnapshotData));
                                    add(new NameValuePair("Version", Const.LiveSDKVersion));

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
                                    add(new NameValuePair("Action", Const.DescribeRecordData));
                                    add(new NameValuePair("Version", Const.LiveSDKVersion));

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
                                    add(new NameValuePair("Action", Const.DescribeLiveTimeShiftData));
                                    add(new NameValuePair("Version", Const.LiveSDKVersion));

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
                                    add(new NameValuePair("Action", Const.DescribePushStreamMetrics));
                                    add(new NameValuePair("Version", Const.LiveSDKVersion));

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
                                    add(new NameValuePair("Action", Const.DescribeLiveStreamSessions));
                                    add(new NameValuePair("Version", Const.LiveSDKVersion));

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
                                    add(new NameValuePair("Action", Const.DescribePlayResponseStatusStat));
                                    add(new NameValuePair("Version", Const.LiveSDKVersion));

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
                                    add(new NameValuePair("Action", Const.DescribeLiveDomainLog));
                                    add(new NameValuePair("Version", Const.LiveSDKVersion));

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
                                    add(new NameValuePair("Action", Const.DescribeLiveMetricTrafficData));
                                    add(new NameValuePair("Version", Const.LiveSDKVersion));

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
                                    add(new NameValuePair("Action", Const.DescribeLiveMetricBandwidthData));
                                    add(new NameValuePair("Version", Const.LiveSDKVersion));

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
                                    add(new NameValuePair("Action", Const.DescribePlayStreamList));
                                    add(new NameValuePair("Version", Const.LiveSDKVersion));

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
                                    add(new BasicNameValuePair("Version", Const.LiveSDKVersion));

                                }
                            });
                        }
                    }
            ));
        }
    };
}
