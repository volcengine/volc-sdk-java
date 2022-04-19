package com.volcengine.service.stream;

import com.volcengine.helper.Const;
import com.volcengine.model.ApiInfo;
import com.volcengine.model.Credentials;
import com.volcengine.model.ServiceInfo;
import com.volcengine.model.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StreamConfig {

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
            put(Const.WapRegister, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.WapRegister));
                                    add(new NameValuePair("Version", Const.ContentVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.ContentStream, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.ContentStream));
                                    add(new NameValuePair("Version", Const.ContentVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.Digg, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.Digg));
                                    add(new NameValuePair("Version", Const.ContentVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.Bury, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.Bury));
                                    add(new NameValuePair("Version", Const.ContentVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.UnDigg, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.UnDigg));
                                    add(new NameValuePair("Version", Const.ContentVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.UnBury, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.UnBury));
                                    add(new NameValuePair("Version", Const.ContentVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.SingleArticleInfo, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.SingleArticleInfo));
                                    add(new NameValuePair("Version", Const.ContentVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.MultiArticleInfo, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.MultiArticleInfo));
                                    add(new NameValuePair("Version", Const.ContentVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.Feedback, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.Feedback));
                                    add(new NameValuePair("Version", Const.ContentVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.Follow, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.Follow));
                                    add(new NameValuePair("Version", Const.ContentVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.Unfollow, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.Unfollow));
                                    add(new NameValuePair("Version", Const.ContentVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.CheckRelation, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.CheckRelation));
                                    add(new NameValuePair("Version", Const.ContentVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.FollowingList, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.FollowingList));
                                    add(new NameValuePair("Version", Const.ContentVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.RefreshTips, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.RefreshTips));
                                    add(new NameValuePair("Version", Const.ContentVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.FollowArticles, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.FollowArticles));
                                    add(new NameValuePair("Version", Const.ContentVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.RecommendRelatedUser, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.RecommendRelatedUser));
                                    add(new NameValuePair("Version", Const.ContentVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.RecommendCategoryUser, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.RecommendCategoryUser));
                                    add(new NameValuePair("Version", Const.ContentVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.RecommendCategoryInfo, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.RecommendCategoryInfo));
                                    add(new NameValuePair("Version", Const.ContentVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.RelatedArticle, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.RelatedArticle));
                                    add(new NameValuePair("Version", Const.ContentVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.DiggList, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.DiggList));
                                    add(new NameValuePair("Version", Const.ContentVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.VideoUrl, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.VideoUrl));
                                    add(new NameValuePair("Version", Const.ContentVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.UnionProduct, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.UnionProduct));
                                    add(new NameValuePair("Version", Const.ContentVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.HotBoard, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.HotBoard));
                                    add(new NameValuePair("Version", Const.ContentVersion));
                                }
                            });
                        }
                    }
            ));
        }
    };
}
