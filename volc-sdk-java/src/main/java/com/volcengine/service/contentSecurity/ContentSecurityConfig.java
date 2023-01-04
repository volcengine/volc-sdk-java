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

public class ContentSecurityConfig {
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
    public static Map<String, ApiInfo> apiInfoList = new HashMap<String, ApiInfo>() {
        {
            put(Const.ImageContentRisk, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ImageContentRisk));
                                    add(new BasicNameValuePair("Version", "2021-11-29"));
                                }
                            });
                        }
                    }
            ));
            put(Const.AsyncImageRisk, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AsyncImageRisk));
                                    add(new BasicNameValuePair("Version", "2021-11-29"));
                                }
                            });
                        }
                    }
            ));
            put(Const.AsyncImageRiskV2, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "AsyncImageRisk"));
                                    add(new BasicNameValuePair("Version", "2022-08-26"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetImageResult, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetImageResult));
                                    add(new BasicNameValuePair("Version", "2021-11-29"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetImageResultV2, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "ImageResult"));
                                    add(new BasicNameValuePair("Version", "2022-08-26"));
                                }
                            });
                        }
                    }
            ));
            put(Const.AsyncVideoRisk, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AsyncVideoRisk));
                                    add(new BasicNameValuePair("Version", "2021-11-29"));
                                }
                            });
                        }
                    }
            ));
            put(Const.VideoResult, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.VideoResult));
                                    add(new BasicNameValuePair("Version", "2021-11-29"));
                                }
                            });
                        }
                    }
            ));
            put(Const.TextRisk, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.TextRisk));
                                    add(new BasicNameValuePair("Version", "2022-01-26"));
                                }
                            });
                        }
                    }
            ));
            put(Const.AsyncAudioRisk, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AsyncAudioRisk));
                                    add(new BasicNameValuePair("Version", "2022-04-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetAudioResult, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetAudioResult));
                                    add(new BasicNameValuePair("Version", "2022-04-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.CreateCustomContents, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.CreateCustomContents));
                                    add(new BasicNameValuePair("Version", "2022-01-22"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UploadCustomContents, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UploadCustomContents));
                                    add(new BasicNameValuePair("Version", "2022-02-07"));
                                }
                            });
                        }
                    }
            ));
            put(Const.AsyncLiveVideoRisk, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AsyncLiveVideoRisk));
                                    add(new BasicNameValuePair("Version", "2022-04-25"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetVideoLiveResult, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetVideoLiveResult));
                                    add(new BasicNameValuePair("Version", "2022-04-25"));
                                }
                            });
                        }
                    }
            ));
            put(Const.AsyncLiveAudioRisk, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AsyncLiveAudioRisk));
                                    add(new BasicNameValuePair("Version", "2022-04-25"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetAudioLiveResult, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetAudioLiveResult));
                                    add(new BasicNameValuePair("Version", "2022-04-25"));
                                }
                            });
                        }
                    }
            ));
            put(Const.TextSliceRisk, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.TextSliceRisk));
                                    add(new BasicNameValuePair("Version", "2022-11-07"));
                                }
                            });
                        }
                    }
            ));
        }

        ;
    };
}
