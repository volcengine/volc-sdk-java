package com.volcengine.service.imagex;

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

public class ImageXConfig {
    public static final String RESOURCE_SERVICE_ID_FORMAT = "trn:ImageX:*:*:ServiceId/%s";
    public static final String RESOURCE_STORE_KEY_FORMAT = "trn:ImageX:*:*:StoreKeys/%s";

    public static final int MIN_CHUNK_SIZE = 1024 * 1024 * 20;
    public static final int LARGE_FILE_SIZE = 1024 * 1024 * 1024;

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
                                    add(new BasicHeader("Accept", "application/json"));
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
                                    add(new BasicHeader("Accept", "application/json"));
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
                                    add(new BasicHeader("Accept", "application/json"));
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
            put("GetImageServiceSubscription", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "GetImageServiceSubscription"));
                                    add(new BasicNameValuePair("Version", "2018-08-01"));
                                }
                            });
                        }
                    }
            ));
            put("CreateImageService", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "CreateImageService"));
                                    add(new BasicNameValuePair("Version", "2018-08-01"));
                                }
                            });
                        }
                    }
            ));
            put("GetImageService", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "GetImageService"));
                                    add(new BasicNameValuePair("Version", "2018-08-01"));
                                }
                            });
                        }
                    }
            ));
            put("GetAllImageServices", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "GetAllImageServices"));
                                    add(new BasicNameValuePair("Version", "2018-08-01"));
                                }
                            });
                        }
                    }
            ));
            put("DeleteImageService", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DeleteImageService"));
                                    add(new BasicNameValuePair("Version", "2018-08-01"));
                                }
                            });
                        }
                    }
            ));
            put("UpdateImageAuthKey", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "UpdateImageAuthKey"));
                                    add(new BasicNameValuePair("Version", "2018-08-01"));
                                }
                            });
                        }
                    }
            ));
            put("GetImageAuthKey", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "GetImageAuthKey"));
                                    add(new BasicNameValuePair("Version", "2018-08-01"));
                                }
                            });
                        }
                    }
            ));
            put("UpdateImageObjectAccess", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "UpdateImageObjectAccess"));
                                    add(new BasicNameValuePair("Version", "2018-08-01"));
                                }
                            });
                        }
                    }
            ));
            put("UpdateImageMirrorConf", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "UpdateImageMirrorConf"));
                                    add(new BasicNameValuePair("Version", "2018-08-01"));
                                }
                            });
                        }
                    }
            ));
            put("DelDomain", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DelDomain"));
                                    add(new BasicNameValuePair("Version", "2018-08-01"));
                                }
                            });
                        }
                    }
            ));
            put("GetServiceDomains", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "GetServiceDomains"));
                                    add(new BasicNameValuePair("Version", "2018-08-01"));
                                }
                            });
                        }
                    }
            ));
            put("GetDomainConfig", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "GetDomainConfig"));
                                    add(new BasicNameValuePair("Version", "2018-08-01"));
                                }
                            });
                        }
                    }
            ));
            put("SetDefaultDomain", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "SetDefaultDomain"));
                                    add(new BasicNameValuePair("Version", "2018-08-01"));
                                }
                            });
                        }
                    }
            ));
            put("UpdateResponseHeader", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "UpdateResponseHeader"));
                                    add(new BasicNameValuePair("Version", "2018-08-01"));
                                }
                            });
                        }
                    }
            ));
            put("UpdateRefer", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "UpdateRefer"));
                                    add(new BasicNameValuePair("Version", "2018-08-01"));
                                }
                            });
                        }
                    }
            ));
            put("UpdateHttps", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "UpdateHttps"));
                                    add(new BasicNameValuePair("Version", "2018-08-01"));
                                }
                            });
                        }
                    }
            ));
            put("GetResponseHeaderValidateKeys", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "GetResponseHeaderValidateKeys"));
                                    add(new BasicNameValuePair("Version", "2018-08-01"));
                                }
                            });
                        }
                    }
            ));
            put("CreateImageTemplate", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "CreateImageTemplate"));
                                    add(new BasicNameValuePair("Version", "2018-08-01"));
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
                                    add(new BasicNameValuePair("Action", "DeleteImageTemplate"));
                                    add(new BasicNameValuePair("Version", "2018-08-01"));
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
                                    add(new BasicNameValuePair("Action", "GetImageTemplate"));
                                    add(new BasicNameValuePair("Version", "2018-08-01"));
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
                                    add(new BasicNameValuePair("Action", "GetAllImageTemplates"));
                                    add(new BasicNameValuePair("Version", "2018-08-01"));
                                }
                            });
                        }
                    }
            ));
            put("GetTemplatesFromBin", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "GetTemplatesFromBin"));
                                    add(new BasicNameValuePair("Version", "2018-08-01"));
                                }
                            });
                        }
                    }
            ));
            put("CreateTemplatesFromBin", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "CreateTemplatesFromBin"));
                                    add(new BasicNameValuePair("Version", "2018-08-01"));
                                }
                            });
                        }
                    }
            ));
            put("DeleteTemplatesFromBin", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DeleteTemplatesFromBin"));
                                    add(new BasicNameValuePair("Version", "2018-08-01"));
                                }
                            });
                        }
                    }
            ));
            put("ApplyImageUpload", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "ApplyImageUpload"));
                                    add(new BasicNameValuePair("Version", "2018-08-01"));
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
                                    add(new BasicNameValuePair("Action", "CommitImageUpload"));
                                    add(new BasicNameValuePair("Version", "2018-08-01"));
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
                                    add(new BasicNameValuePair("Action", "GetImageUploadFile"));
                                    add(new BasicNameValuePair("Version", "2018-08-01"));
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
                                    add(new BasicNameValuePair("Action", "GetImageUploadFiles"));
                                    add(new BasicNameValuePair("Version", "2018-08-01"));
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
                                    add(new BasicNameValuePair("Action", "DeleteImageUploadFiles"));
                                    add(new BasicNameValuePair("Version", "2018-08-01"));
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
                                    add(new BasicNameValuePair("Action", "PreviewImageUploadFile"));
                                    add(new BasicNameValuePair("Version", "2018-08-01"));
                                }
                            });
                        }
                    }
            ));
            put("CreateImageContentTask", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "CreateImageContentTask"));
                                    add(new BasicNameValuePair("Version", "2018-08-01"));
                                }
                            });
                        }
                    }
            ));
            put("GetImageContentTaskDetail", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "GetImageContentTaskDetail"));
                                    add(new BasicNameValuePair("Version", "2018-08-01"));
                                }
                            });
                        }
                    }
            ));
            put("GetImageContentBlockList", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "GetImageContentBlockList"));
                                    add(new BasicNameValuePair("Version", "2018-08-01"));
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
                                    add(new BasicNameValuePair("Action", "GetImageUpdateFiles"));
                                    add(new BasicNameValuePair("Version", "2018-08-01"));
                                }
                            });
                        }
                    }
            ));
            put("FetchImageUrl", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "FetchImageUrl"));
                                    add(new BasicNameValuePair("Version", "2018-08-01"));
                                }
                            });
                        }
                    }
            ));
            put("UpdateServiceName", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "UpdateServiceName"));
                                    add(new BasicNameValuePair("Version", "2018-08-01"));
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
                                    add(new BasicNameValuePair("Action", "GetImageOCR"));
                                    add(new BasicNameValuePair("Version", "2018-08-01"));
                                }
                            });
                        }
                    }
            ));
            put("GetImageQuality", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "GetImageQuality"));
                                    add(new BasicNameValuePair("Version", "2018-08-01"));
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
                                    add(new BasicNameValuePair("Action", "GetImageEraseModels"));
                                    add(new BasicNameValuePair("Version", "2018-08-01"));
                                }
                            });
                        }
                    }
            ));
            put("GetImageEnhanceResult", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "GetImageEnhanceResult"));
                                    add(new BasicNameValuePair("Version", "2018-08-01"));
                                }
                            });
                        }
                    }
            ));
            put("GetImageBgFillResult", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "GetImageBgFillResult"));
                                    add(new BasicNameValuePair("Version", "2018-08-01"));
                                }
                            });
                        }
                    }
            ));
            put("GetImageDuplicateDetection", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "GetImageDuplicateDetection"));
                                    add(new BasicNameValuePair("Version", "2018-08-01"));
                                }
                            });
                        }
                    }
            ));
            put("GetDenoisingImage", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "GetDenoisingImage"));
                                    add(new BasicNameValuePair("Version", "2018-08-01"));
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
                                    add(new BasicNameValuePair("Action", "GetSegmentImage"));
                                    add(new BasicNameValuePair("Version", "2018-08-01"));
                                }
                            });
                        }
                    }
            ));
            put("GetImageComicResult", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "GetImageComicResult"));
                                    add(new BasicNameValuePair("Version", "2018-08-01"));
                                }
                            });
                        }
                    }
            ));
            put("GetImageSuperResolutionResult", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "GetImageSuperResolutionResult"));
                                    add(new BasicNameValuePair("Version", "2018-08-01"));
                                }
                            });
                        }
                    }
            ));
            put("GetImageSmartCropResult", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "GetImageSmartCropResult"));
                                    add(new BasicNameValuePair("Version", "2018-08-01"));
                                }
                            });
                        }
                    }
            ));
            put("GetLicensePlateDetection", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "GetLicensePlateDetection"));
                                    add(new BasicNameValuePair("Version", "2018-08-01"));
                                }
                            });
                        }
                    }
            ));
            put("GetImagePSDetection", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "GetImagePSDetection"));
                                    add(new BasicNameValuePair("Version", "2018-08-01"));
                                }
                            });
                        }
                    }
            ));
            put("GetPrivateImageType", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "GetPrivateImageType"));
                                    add(new BasicNameValuePair("Version", "2018-08-01"));
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
                                    add(new BasicNameValuePair("Action", "CreateImageHmEmbed"));
                                    add(new BasicNameValuePair("Version", "2018-08-01"));
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
                                    add(new BasicNameValuePair("Action", "CreateImageHmExtract"));
                                    add(new BasicNameValuePair("Version", "2018-08-01"));
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
                                    add(new BasicNameValuePair("Action", "GetImageEraseResult"));
                                    add(new BasicNameValuePair("Version", "2018-08-01"));
                                }
                            });
                        }
                    }
            ));
            put("GetImageStyleResult", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "GetImageStyleResult"));
                                    add(new BasicNameValuePair("Version", "2018-08-01"));
                                }
                            });
                        }
                    }
            ));
        }

        {
            new ArrayList<String>() {
                {
                    add("DescribeImageXDomainTrafficData");
                    add("DescribeImageXDomainBandwidthData");
                    add("DescribeImageXBucketUsage");
                    add("DescribeImageXRequestCntUsage");
                    add("DescribeImageXBaseOpUsage");
                    add("DescribeImageXCompressUsage");
                    add("DescribeImageXEdgeRequest");
                    add("DescribeImageXHitRateTrafficData");
                    add("DescribeImageXHitRateRequestData");
                    add("DescribeImageXCDNTopRequestData");
                    add("DescribeImageXSummary");
                    add("DescribeImageXEdgeRequestBandwidth");
                    add("DescribeImageXEdgeRequestTraffic");
                    add("DescribeImageXEdgeRequestRegions");
                    add("DescribeImageXServiceQuality");
                    add("GetImageXQueryApps");
                    add("GetImageXQueryRegions");
                    add("GetImageXQueryDims");
                    add("GetImageXQueryVals");
                }
            }.forEach(it -> put(it, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", it));
                                    add(new BasicNameValuePair("Version", "2018-08-01"));
                                }
                            });
                        }
                    }
            )));
            new ArrayList<String>() {
                {
                    add("DescribeImageXMirrorRequestTraffic");
                    add("DescribeImageXMirrorRequestBandwidth");
                    add("DescribeImageXMirrorRequestHttpCodeByTime");
                    add("DescribeImageXMirrorRequestHttpCodeOverview");
                    add("DescribeImageXUploadSuccessRateByTime");
                    add("DescribeImageXUploadErrorCodeAll");
                    add("DescribeImageXUploadErrorCodeByTime");
                    add("DescribeImageXUploadCountByTime");
                    add("DescribeImageXUploadFileSize");
                    add("DescribeImageXUploadSpeed");
                    add("DescribeImageXUploadDuration");
                    add("DescribeImageXUploadSegmentSpeedByTime");
                    add("DescribeImageXCdnSuccessRateByTime");
                    add("DescribeImageXCdnSuccessRateAll");
                    add("DescribeImageXCdnErrorCodeByTime");
                    add("DescribeImageXCdnErrorCodeAll");
                    add("DescribeImageXCdnDurationDetailByTime");
                    add("DescribeImageXCdnDurationAll");
                    add("DescribeImageXCdnReuseRateByTime");
                    add("DescribeImageXCdnReuseRateAll");
                    add("DescribeImageXCdnProtocolRateByTime");
                    add("DescribeImageXClientErrorCodeAll");
                    add("DescribeImageXClientErrorCodeByTime");
                    add("DescribeImageXClientDecodeSuccessRateByTime");
                    add("DescribeImageXClientDecodeDurationByTime");
                    add("DescribeImageXClientQueueDurationByTime");
                    add("DescribeImageXClientLoadDurationAll");
                    add("DescribeImageXClientLoadDuration");
                    add("DescribeImageXClientFailureRate");
                    add("DescribeImageXClientSdkVerByTime");
                    add("DescribeImageXClientFileSize");
                    add("DescribeImageXClientTopFileSize");
                    add("DescribeImageXClientCountByTime");
                    add("DescribeImageXClientScoreByTime");
                    add("DescribeImageXClientDemotionRateByTime");
                    add("DescribeImageXClientTopDemotionURL");
                    add("DescribeImageXClientQualityRateByTime");
                    add("DescribeImageXClientTopQualityURL");
                    add("DescribeImageXSensibleCountByTime");
                    add("DescribeImageXSensibleCacheHitRateByTime");
                    add("DescribeImageXSensibleTopSizeURL");
                    add("DescribeImageXSensibleTopRamURL");
                    add("DescribeImageXSensibleTopResolutionURL");
                    add("DescribeImageXSensibleTopUnknownURL");
                }
            }.forEach(it -> put(it, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", it));
                                    add(new BasicNameValuePair("Version", "2018-08-01"));
                                }
                            });
                        }
                    }
            )));
        }
    };
}
