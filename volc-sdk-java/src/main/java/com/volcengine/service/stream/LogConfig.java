package com.volcengine.service.stream;

import com.volcengine.helper.Const;
import com.volcengine.model.ApiInfo;
import com.volcengine.model.Credentials;
import com.volcengine.model.ServiceInfo;
import com.volcengine.model.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LogConfig {
    public static ServiceInfo serviceInfo = new ServiceInfo(
            new HashMap<String, Object>() {
                {
                    put(Const.CONNECTION_TIMEOUT, 5000);
                    put(Const.SOCKET_TIMEOUT, 5000);
                    put(Const.Host, "open.volcengineapi.com");
                    put(Const.Header, new ArrayList<Header>() {
                        {
                            add(new Header("Accept", "application/json"));
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
                                    add(new NameValuePair("Action", Const.ClickLog));
                                    add(new NameValuePair("Version", Const.ContentVersion));
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
                                    add(new NameValuePair("Action", Const.VideoPlayLog));
                                    add(new NameValuePair("Version", Const.ContentVersion));
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
                                    add(new NameValuePair("Action", Const.VideoOverLog));
                                    add(new NameValuePair("Version", Const.ContentVersion));
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
                                    add(new NameValuePair("Action", Const.StayLog));
                                    add(new NameValuePair("Version", Const.ContentVersion));
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
                                    add(new NameValuePair("Action", Const.SingleShowLog));
                                    add(new NameValuePair("Version", Const.ContentVersion));
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
                                    add(new NameValuePair("Action", Const.MultiShowLog));
                                    add(new NameValuePair("Version", Const.ContentVersion));
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
                                    add(new NameValuePair("Action", Const.ShareLog));
                                    add(new NameValuePair("Version", Const.ContentVersion));
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
                                    add(new NameValuePair("Action", Const.FavouriteLog));
                                    add(new NameValuePair("Version", Const.ContentVersion));
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
                                    add(new NameValuePair("Action", Const.VerifyLog));
                                    add(new NameValuePair("Version", Const.ContentVersion));
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
                                    add(new NameValuePair("Action", Const.FollowLog));
                                    add(new NameValuePair("Version", Const.ContentVersion));
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
                                    add(new NameValuePair("Action", Const.UnfollowLog));
                                    add(new NameValuePair("Version", Const.ContentVersion));
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
                                    add(new NameValuePair("Action", Const.FollowCardLog));
                                    add(new NameValuePair("Version", Const.ContentVersion));
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
                                    add(new NameValuePair("Action", Const.DislikeLog));
                                    add(new NameValuePair("Version", Const.ContentVersion));
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
                                    add(new NameValuePair("Action", Const.VideoPlayDrawLog));
                                    add(new NameValuePair("Version", Const.ContentVersion));
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
                                    add(new NameValuePair("Action", Const.VideoOverDrawLog));
                                    add(new NameValuePair("Version", Const.ContentVersion));
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
                                    add(new NameValuePair("Action", Const.ProductShowLog));
                                    add(new NameValuePair("Version", Const.ContentVersion));
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
                                    add(new NameValuePair("Action", Const.PushLog));
                                    add(new NameValuePair("Version", Const.ContentVersion));
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
                                    add(new NameValuePair("Action", Const.ProductClickLog));
                                    add(new NameValuePair("Version", Const.ContentVersion));
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
                                    add(new NameValuePair("Action", Const.VideoPlayAutoLog));
                                    add(new NameValuePair("Version", Const.ContentVersion));
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
                                    add(new NameValuePair("Action", Const.VideoOverAutoLog));
                                    add(new NameValuePair("Version", Const.ContentVersion));
                                }
                            });
                        }
                    }
            ));
        }
    };
}
