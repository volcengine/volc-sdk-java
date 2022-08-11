package com.volcengine.service.cms;

import com.volcengine.helper.Const;
import com.volcengine.model.ApiInfo;
import com.volcengine.model.Credentials;
import com.volcengine.model.ServiceInfo;
import com.volcengine.model.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CmsConfig {

    public static final String PlatformService = "volc_content_platform";
    public static final String ApiService = "volc_content_api";

    public static final Map<String, ServiceInfo> platformServiceInfoMap = new HashMap<String, ServiceInfo>() {
        {
            put(Const.REGION_CN_NORTH_1, new ServiceInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.CONNECTION_TIMEOUT, 5000);
                            put(Const.SOCKET_TIMEOUT, 5000);
                            put(Const.Scheme, "https");
                            put(Const.Host, "cms.volcengineapi.com");
                            put(Const.Header, new ArrayList<Header>() {
                                {
                                    add(new Header("Accept", "application/json"));
                                }
                            });
                            put(Const.Credentials, new Credentials(Const.REGION_CN_NORTH_1, PlatformService));
                        }
                    }
            ));
        }
    };

    public static final Map<String, ApiInfo> platformApiInfoMap = new HashMap<String, ApiInfo>() {
        {
            put(Const.BatchCreateSourceArticle, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.BatchCreateSourceArticle));
                                    add(new NameValuePair("Version", "2021-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetArticleBatchUploadDetail, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.GetArticleBatchUploadDetail));
                                    add(new NameValuePair("Version", "2021-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.DeleteSourceArticle, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.DeleteSourceArticle));
                                    add(new NameValuePair("Version", "2021-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.DeleteSourceArticleByOpenid, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.DeleteSourceArticleByOpenid));
                                    add(new NameValuePair("Version", "2021-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ArticleEventNotify, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.ArticleEventNotify));
                                    add(new NameValuePair("Version", "2021-01-01"));
                                }
                            });
                        }
                    }
            ));
        }
    };

    public static final Map<String, ServiceInfo> apiServiceInfoMap = new HashMap<String, ServiceInfo>() {
        {
            put(Const.REGION_CN_NORTH_1, new ServiceInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.CONNECTION_TIMEOUT, 5000);
                            put(Const.SOCKET_TIMEOUT, 5000);
                            put(Const.Scheme, "https");
                            put(Const.Host, "cms.volcengineapi.com");
                            put(Const.Header, new ArrayList<Header>() {
                                {
                                    add(new Header("Accept", "application/json"));
                                }
                            });
                            put(Const.Credentials, new Credentials(Const.REGION_CN_NORTH_1, ApiService));
                        }
                    }
            ));
        }
    };

    public static final Map<String, ApiInfo> apiApiInfoMap = new HashMap<String, ApiInfo>() {
        {
            put(Const.Feed, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.Feed));
                                    add(new NameValuePair("Version", "2021-06-17"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetVideoByVid, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.GetVideoByVid));
                                    add(new NameValuePair("Version", "2021-08-18"));
                                }
                            });
                        }
                    }
            ));
            put(Const.MGetVideoByVids, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.MGetVideoByVids));
                                    add(new NameValuePair("Version", "2021-09-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetGoodsRelatedArticles, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetGoodsRelatedArticles));
                                    add(new BasicNameValuePair("Version", "2021-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.MGetGoodsRelatedArticles, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.MGetGoodsRelatedArticles));
                                    add(new BasicNameValuePair("Version", "2021-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.CmsSearch, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.CmsSearch));
                                    add(new BasicNameValuePair("Version", "2022-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.RelatedFeed, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.RelatedFeed));
                                    add(new BasicNameValuePair("Version", "2022-01-01"));
                                }
                            });
                        }
                    }
            ));
        }
    };
}
