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

public class StreamConfig {

    public static ServiceInfo serviceInfo = new ServiceInfo(
            new HashMap<String, Object>() {
                {
                    put(Const.CONNECTION_TIMEOUT, 5000);
                    put(Const.SOCKET_TIMEOUT, 5000);
                    put(Const.Host, "open.volcengineapi.com");
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
            put(Const.WapRegister, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.WapRegister));
                                    add(new BasicNameValuePair("Version", Const.ContentVersion));
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
                                    add(new BasicNameValuePair("Action", Const.ContentStream));
                                    add(new BasicNameValuePair("Version", Const.ContentVersion));
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
                                    add(new BasicNameValuePair("Action", Const.Digg));
                                    add(new BasicNameValuePair("Version", Const.ContentVersion));
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
                                    add(new BasicNameValuePair("Action", Const.Bury));
                                    add(new BasicNameValuePair("Version", Const.ContentVersion));
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
                                    add(new BasicNameValuePair("Action", Const.UnDigg));
                                    add(new BasicNameValuePair("Version", Const.ContentVersion));
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
                                    add(new BasicNameValuePair("Action", Const.UnBury));
                                    add(new BasicNameValuePair("Version", Const.ContentVersion));
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
                                    add(new BasicNameValuePair("Action", Const.SingleArticleInfo));
                                    add(new BasicNameValuePair("Version", Const.ContentVersion));
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
                                    add(new BasicNameValuePair("Action", Const.MultiArticleInfo));
                                    add(new BasicNameValuePair("Version", Const.ContentVersion));
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
                                    add(new BasicNameValuePair("Action", Const.Feedback));
                                    add(new BasicNameValuePair("Version", Const.ContentVersion));
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
                                    add(new BasicNameValuePair("Action", Const.Follow));
                                    add(new BasicNameValuePair("Version", Const.ContentVersion));
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
                                    add(new BasicNameValuePair("Action", Const.Unfollow));
                                    add(new BasicNameValuePair("Version", Const.ContentVersion));
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
                                    add(new BasicNameValuePair("Action", Const.CheckRelation));
                                    add(new BasicNameValuePair("Version", Const.ContentVersion));
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
                                    add(new BasicNameValuePair("Action", Const.FollowingList));
                                    add(new BasicNameValuePair("Version", Const.ContentVersion));
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
                                    add(new BasicNameValuePair("Action", Const.RefreshTips));
                                    add(new BasicNameValuePair("Version", Const.ContentVersion));
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
                                    add(new BasicNameValuePair("Action", Const.FollowArticles));
                                    add(new BasicNameValuePair("Version", Const.ContentVersion));
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
                                    add(new BasicNameValuePair("Action", Const.RecommendRelatedUser));
                                    add(new BasicNameValuePair("Version", Const.ContentVersion));
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
                                    add(new BasicNameValuePair("Action", Const.RecommendCategoryUser));
                                    add(new BasicNameValuePair("Version", Const.ContentVersion));
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
                                    add(new BasicNameValuePair("Action", Const.RecommendCategoryInfo));
                                    add(new BasicNameValuePair("Version", Const.ContentVersion));
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
                                    add(new BasicNameValuePair("Action", Const.RelatedArticle));
                                    add(new BasicNameValuePair("Version", Const.ContentVersion));
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
                                    add(new BasicNameValuePair("Action", Const.DiggList));
                                    add(new BasicNameValuePair("Version", Const.ContentVersion));
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
                                    add(new BasicNameValuePair("Action", Const.VideoUrl));
                                    add(new BasicNameValuePair("Version", Const.ContentVersion));
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
                                    add(new BasicNameValuePair("Action", Const.UnionProduct));
                                    add(new BasicNameValuePair("Version", Const.ContentVersion));
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
                                    add(new BasicNameValuePair("Action", Const.HotBoard));
                                    add(new BasicNameValuePair("Version", Const.ContentVersion));
                                }
                            });
                        }
                    }
            ));
        }
    };
}
