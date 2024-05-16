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
            put(Const.ImageContentRiskV2, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ImageContentRiskV2));
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
            put(Const.AudioRisk, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AudioRisk));
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
            put(Const.DeleteCustomContents, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DeleteCustomContents));
                                    add(new BasicNameValuePair("Version", "2022-04-28"));
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

            put(Const.CloseAudioLiveRisk, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "CloseAudioLive"));
                                    add(new BasicNameValuePair("Version", "2022-04-25"));
                                }
                            });
                        }
                    }
            ));

            put(Const.CloseVideoLiveRisk, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "CloseVideoLive"));
                                    add(new BasicNameValuePair("Version", "2022-04-25"));
                                }
                            });
                        }
                    }
            ));

            put(Const.CreateCustomLib, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "CreateCustomLib"));
                                    add(new BasicNameValuePair("Version", "2023-10-01"));
                                }
                            });
                        }
                    }
            ));

            put(Const.DeleteCustomLib, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DeleteCustomLib"));
                                    add(new BasicNameValuePair("Version", "2023-10-01"));
                                }
                            });
                        }
                    }
            ));

            put(Const.UpdateCustomLib, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "UpdateCustomLib"));
                                    add(new BasicNameValuePair("Version", "2023-10-01"));
                                }
                            });
                        }
                    }
            ));

            put(Const.ChangeCustomContentsStatus, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "ChangeCustomContentsStatus"));
                                    add(new BasicNameValuePair("Version", "2023-10-01"));
                                }
                            });
                        }
                    }
            ));

            put(Const.GetCustomLib, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "GetCustomLib"));
                                    add(new BasicNameValuePair("Version", "2023-10-01"));
                                }
                            });
                        }
                    }
            ));

            put(Const.CreateAccessConfig, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "CreateAccessConfig"));
                                    add(new BasicNameValuePair("Version", "2023-10-01"));
                                }
                            });
                        }
                    }
            ));

            put(Const.UpdateAccessConfig, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "UpdateAccessConfig"));
                                    add(new BasicNameValuePair("Version", "2023-10-01"));
                                }
                            });
                        }
                    }
            ));

            put(Const.UpdateConfigStatus, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "UpdateConfigStatus"));
                                    add(new BasicNameValuePair("Version", "2023-10-01"));
                                }
                            });
                        }
                    }
            ));

            put(Const.GetAccessConfig, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "GetAccessConfig"));
                                    add(new BasicNameValuePair("Version", "2023-10-01"));
                                }
                            });
                        }
                    }
            ));

            put(Const.GetTextLibContent, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "GetTextLibContent"));
                                    add(new BasicNameValuePair("Version", "2023-10-01"));
                                }
                            });
                        }
                    }
            ));

            put(Const.DeleteTextLibContent, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DeleteTextLibContent"));
                                    add(new BasicNameValuePair("Version", "2023-10-01"));
                                }
                            });
                        }
                    }
            ));

            put(Const.UploadTextLibContent, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "UploadTextLibContent"));
                                    add(new BasicNameValuePair("Version", "2023-10-01"));
                                }
                            });
                        }
                    }
            ));

            put(Const.GetImageLibContent, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "GetImageLibContent"));
                                    add(new BasicNameValuePair("Version", "2023-10-01"));
                                }
                            });
                        }
                    }
            ));

            put(Const.DeleteImageLibContent, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DeleteImageLibContent"));
                                    add(new BasicNameValuePair("Version", "2023-10-01"));
                                }
                            });
                        }
                    }
            ));

            put(Const.UploadImageLibContent, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "UploadImageLibContent"));
                                    add(new BasicNameValuePair("Version", "2023-10-01"));
                                }
                            });
                        }
                    }
            ));
        }
    };
}
