package com.volcengine.service.stream;

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

public class LogConfig {
    public static ServiceInfo serviceInfo = new ServiceInfo(
            new HashMap<String, Object>() {
                {
                    put(Const.CONNECTION_TIMEOUT, 5000);
                    put(Const.SOCKET_TIMEOUT, 5000);
                    put(Const.Host, "mercury.volcengineapi.com");
                    put(Const.Header, new ArrayList<Header>() {
                        {
                            add(new BasicHeader("Accept", "application/json"));
                        }
                    });
                    put(Const.Credentials, new Credentials(Const.REGION_CN_NORTH_1, "content"));
                    put(Const.Scheme, "https");
                }
            }
    );
    public static Map<String, ApiInfo> apiInfoList = new HashMap<String, ApiInfo>() {
        {
            put(Const.ClickLog, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ClickLog));
                                    add(new BasicNameValuePair("Version", Const.ContentVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.VideoPlayLog, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.VideoPlayLog));
                                    add(new BasicNameValuePair("Version", Const.ContentVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.VideoOverLog, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.VideoOverLog));
                                    add(new BasicNameValuePair("Version", Const.ContentVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.StayLog, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.StayLog));
                                    add(new BasicNameValuePair("Version", Const.ContentVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.SingleShowLog, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.SingleShowLog));
                                    add(new BasicNameValuePair("Version", Const.ContentVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.MultiShowLog, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.MultiShowLog));
                                    add(new BasicNameValuePair("Version", Const.ContentVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.ShareLog, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ShareLog));
                                    add(new BasicNameValuePair("Version", Const.ContentVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.FavouriteLog, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.FavouriteLog));
                                    add(new BasicNameValuePair("Version", Const.ContentVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.VerifyLog, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.VerifyLog));
                                    add(new BasicNameValuePair("Version", Const.ContentVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.FollowLog, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.FollowLog));
                                    add(new BasicNameValuePair("Version", Const.ContentVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.UnfollowLog, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UnfollowLog));
                                    add(new BasicNameValuePair("Version", Const.ContentVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.FollowCardLog, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.FollowCardLog));
                                    add(new BasicNameValuePair("Version", Const.ContentVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.DislikeLog, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DislikeLog));
                                    add(new BasicNameValuePair("Version", Const.ContentVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.VideoPlayDrawLog, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.VideoPlayDrawLog));
                                    add(new BasicNameValuePair("Version", Const.ContentVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.VideoOverDrawLog, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.VideoOverDrawLog));
                                    add(new BasicNameValuePair("Version", Const.ContentVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.ProductShowLog, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ProductShowLog));
                                    add(new BasicNameValuePair("Version", Const.ContentVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.PushLog, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.PushLog));
                                    add(new BasicNameValuePair("Version", Const.ContentVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.ProductClickLog, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ProductClickLog));
                                    add(new BasicNameValuePair("Version", Const.ContentVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.VideoPlayAutoLog, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.VideoPlayAutoLog));
                                    add(new BasicNameValuePair("Version", Const.ContentVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.VideoOverAutoLog, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.VideoOverAutoLog));
                                    add(new BasicNameValuePair("Version", Const.ContentVersion));
                                }
                            });
                        }
                    }
            ));
        }
    };
}
