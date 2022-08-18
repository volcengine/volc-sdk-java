package com.volcengine.service.imagex;

import com.volcengine.helper.Const;
import com.volcengine.model.ApiInfo;
import com.volcengine.model.Credentials;
import com.volcengine.model.ServiceInfo;
import com.volcengine.model.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ImageXConfig {
    public static final String RESOURCE_SERVICE_ID_FORMAT = "trn:ImageX:*:*:ServiceId/%s";
    public static final String RESOURCE_STORE_KEY_FORMAT = "trn:ImageX:*:*:StoreKeys/%s";
    public static final Integer ACTION_REFRESH = 0;
    public static final Integer ACTION_DISABLE = 1;
    public static final Integer ACTION_ENABLE = 2;
    public static final Integer ACTION_PRELOAD = 4;
    public static final Integer ACTION_REFRESH_DIR = 5;

    public static Map<String, ServiceInfo> serviceInfoMap = new HashMap<String, ServiceInfo>() {
        {
            put(Const.REGION_CN_NORTH_1, new ServiceInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.CONNECTION_TIMEOUT, 5000);
                            put(Const.SOCKET_TIMEOUT, 5000);
                            put(Const.Scheme, "https");
                            put(Const.Host, "imagex.volcengineapi.com");
                            put(Const.Header, new ArrayList<Header>() {
                                {
                                    add(new Header("Accept", "application/json"));
                                }
                            });
                            put(Const.Credentials, new Credentials(Const.REGION_CN_NORTH_1, "ImageX"));
                        }
                    }
            ));
            put(Const.REGION_US_EASE_1, new ServiceInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.CONNECTION_TIMEOUT, 5000);
                            put(Const.SOCKET_TIMEOUT, 5000);
                            put(Const.Scheme, "https");
                            put(Const.Host, "imagex-us-east-1.volcengineapi.com");
                            put(Const.Header, new ArrayList<Header>() {
                                {
                                    add(new Header("Accept", "application/json"));
                                }
                            });
                            put(Const.Credentials, new Credentials(Const.REGION_US_EASE_1, "ImageX"));
                        }
                    }
            ));
            put(Const.REGION_AP_SINGAPORE_1, new ServiceInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.CONNECTION_TIMEOUT, 5000);
                            put(Const.SOCKET_TIMEOUT, 5000);
                            put(Const.Scheme, "https");
                            put(Const.Host, "imagex-ap-singapore-1.volcengineapi.com");
                            put(Const.Header, new ArrayList<Header>() {
                                {
                                    add(new Header("Accept", "application/json"));
                                }
                            });
                            put(Const.Credentials, new Credentials(Const.REGION_AP_SINGAPORE_1, "ImageX"));
                        }
                    }
            ));
        }
    };

    public static Map<String, ApiInfo> apiInfoList = new HashMap<String, ApiInfo>() {
        {
            // 模板管理
            put("CreateImageTemplate", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", "CreateImageTemplate"));
                                    add(new NameValuePair("Version", "2018-08-01"));
                                }
                            });
                        }
                    }
            ));
            put("DeleteImageTemplate", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", "DeleteImageTemplate"));
                                    add(new NameValuePair("Version", "2018-08-01"));
                                }
                            });
                        }
                    }
            ));
            put("PreviewImageTemplate", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", "PreviewImageTemplate"));
                                    add(new NameValuePair("Version", "2018-08-01"));
                                }
                            });
                        }
                    }
            ));
            put("GetImageTemplate", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", "GetImageTemplate"));
                                    add(new NameValuePair("Version", "2018-08-01"));
                                }
                            });
                        }
                    }
            ));
            put("GetAllImageTemplates", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", "GetAllImageTemplates"));
                                    add(new NameValuePair("Version", "2018-08-01"));
                                }
                            });
                        }
                    }
            ));
            // 资源管理相关
            put("ApplyImageUpload", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", "ApplyImageUpload"));
                                    add(new NameValuePair("Version", "2018-08-01"));
                                }
                            });
                        }
                    }
            ));
            put("CommitImageUpload", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", "CommitImageUpload"));
                                    add(new NameValuePair("Version", "2018-08-01"));
                                }
                            });
                        }
                    }
            ));
            put("DeleteImageUploadFiles", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", "DeleteImageUploadFiles"));
                                    add(new NameValuePair("Version", "2018-08-01"));
                                }
                            });
                        }
                    }
            ));
            put("UpdateImageUploadFiles", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", "UpdateImageUploadFiles"));
                                    add(new NameValuePair("Version", "2018-08-01"));
                                }
                            });
                        }
                    }
            ));
            put("GetImageUploadFile", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", "GetImageUploadFile"));
                                    add(new NameValuePair("Version", "2018-08-01"));
                                }
                            });
                        }
                    }
            ));
            put("GetImageUploadFiles", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", "GetImageUploadFiles"));
                                    add(new NameValuePair("Version", "2018-08-01"));
                                }
                            });
                        }
                    }
            ));
            put("PreviewImageUploadFile", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", "PreviewImageUploadFile"));
                                    add(new NameValuePair("Version", "2018-08-01"));
                                }
                            });
                        }
                    }
            ));
            put("GetImageUpdateFiles", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", "GetImageUpdateFiles"));
                                    add(new NameValuePair("Version", "2018-08-01"));
                                }
                            });
                        }
                    }
            ));
            put("GetImageOCR", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", "GetImageOCR"));
                                    add(new NameValuePair("Version", "2018-08-01"));
                                }
                            });
                        }
                    }
            ));
            put("CreateImageHmEmbed", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", "CreateImageHmEmbed"));
                                    add(new NameValuePair("Version", "2018-08-01"));
                                }
                            });
                        }
                    }
            ));
            put("CreateImageHmExtract", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", "CreateImageHmExtract"));
                                    add(new NameValuePair("Version", "2018-08-01"));
                                }
                            });
                        }
                    }
            ));
            put("GetSegmentImage", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", "GetSegmentImage"));
                                    add(new NameValuePair("Version", "2018-08-01"));
                                }
                            });
                        }
                    }
            ));
            put("GetImageEraseModels", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", "GetImageEraseModels"));
                                    add(new NameValuePair("Version", "2018-08-01"));
                                }
                            });
                        }
                    }
            ));
            put("GetImageEraseResult", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", "GetImageEraseResult"));
                                    add(new NameValuePair("Version", "2018-08-01"));
                                }
                            });
                        }
                    }
            ));
        }
    };
}
