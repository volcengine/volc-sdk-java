package com.volcengine.service.visual;

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

public class VisualConfig {
    
    public static Map<String, ServiceInfo> serviceInfoMap = new HashMap<String, ServiceInfo>() {
        {
            put(Const.REGION_CN_NORTH_1, new ServiceInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.CONNECTION_TIMEOUT, 5000);
                            put(Const.SOCKET_TIMEOUT, 5000 * 12);
                            put(Const.Scheme, "https");
                            put(Const.Host, "visual.volcengineapi.com");
                            put(Const.Header, new ArrayList<Header>() {
                                {
                                    add(new BasicHeader("Accept", "application/json"));
                                }
                            });
                            put(Const.Credentials, new Credentials(Const.REGION_CN_NORTH_1, "cv"));
                        }
                    }
            ));
            put(Const.REGION_AP_SINGAPORE_1, new ServiceInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.CONNECTION_TIMEOUT, 5000);
                            put(Const.SOCKET_TIMEOUT, 5000);
                            put(Const.Scheme, "https");
                            put(Const.Host, "open-ap-singapore-1.volcengineapi.com");
                            put(Const.Header, new ArrayList<Header>() {
                                {
                                    add(new BasicHeader("Accept", "application/json"));
                                }
                            });
                            put(Const.Credentials, new Credentials(Const.REGION_AP_SINGAPORE_1, "cv"));
                        }
                    }
            ));
        }
    };
    
    public static Map<String, ApiInfo> apiInfoList = new HashMap<String, ApiInfo>() {
        {
            put(Const.SkySegment, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.SkySegment));
                                    add(new BasicNameValuePair("Version", "2020-08-26"));
                                }
                            });
                        }
                    }
            ));
            put(Const.HumanSegment, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.HumanSegment));
                                    add(new BasicNameValuePair("Version", "2020-08-26"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GeneralSegment, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GeneralSegment));
                                    add(new BasicNameValuePair("Version", "2020-08-26"));
                                }
                            });
                        }
                    }
            ));
            put(Const.CarDetection, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.CarDetection));
                                    add(new BasicNameValuePair("Version", "2020-08-26"));
                                }
                            });
                        }
                    }
            ));
            put(Const.CarSegment, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.CarSegment));
                                    add(new BasicNameValuePair("Version", "2020-08-26"));
                                }
                            });
                        }
                    }
            ));
            put(Const.CarPlateDetection, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.CarPlateDetection));
                                    add(new BasicNameValuePair("Version", "2020-08-26"));
                                }
                            });
                        }
                    }
            ));
            put(Const.PoemMaterial, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.PoemMaterial));
                                    add(new BasicNameValuePair("Version", "2020-08-26"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ImageFlow, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ImageFlow));
                                    add(new BasicNameValuePair("Version", "2020-08-26"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ImageScore, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ImageScore));
                                    add(new BasicNameValuePair("Version", "2020-08-26"));
                                }
                            });
                        }
                    }
            ));
            put(Const.FaceSwap, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.FaceSwap));
                                    add(new BasicNameValuePair("Version", "2020-08-26"));
                                }
                            });
                        }
                    }
            ));
            put(Const.FaceSwapV2, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.FaceSwapV2));
                                    add(new BasicNameValuePair("Version", "2022-08-31"));
                                }
                            });
                        }
                    }
            ));
            put(Const.FaceswapAI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.FaceswapAI));
                                    add(new BasicNameValuePair("Version", "2022-08-31"));
                                }
                            });
                        }
                    }
            ));
            put(Const.JPCartoon, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.JPCartoon));
                                    add(new BasicNameValuePair("Version", "2020-08-26"));
                                }
                            });
                        }
                    }
            ));
            put(Const.EyeClose2Open, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.EyeClose2Open));
                                    add(new BasicNameValuePair("Version", "2020-08-26"));
                                }
                            });
                        }
                    }
            ));
            put(Const.EmoticonEdit, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.EmoticonEdit));
                                    add(new BasicNameValuePair("Version", "2020-08-26"));
                                }
                            });
                        }
                    }
            ));
            put(Const.StretchRecovery, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.StretchRecovery));
                                    add(new BasicNameValuePair("Version", "2020-08-26"));
                                }
                            });
                        }
                    }
            ));
            put(Const.DistortionFree, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DistortionFree));
                                    add(new BasicNameValuePair("Version", "2020-08-26"));
                                }
                            });
                        }
                    }
            ));
            put(Const.EnhancePhoto, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.EnhancePhoto));
                                    add(new BasicNameValuePair("Version", "2020-08-26"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ConvertPhoto, new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", Const.ConvertPhoto));
                                add(new BasicNameValuePair("Version", "2020-08-26"));
                            }
                        });
                    }
                }
            ));
            put(Const.PotraitEffect, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.PotraitEffect));
                                    add(new BasicNameValuePair("Version", "2020-08-26"));
                                }
                            });
                        }
                    }
            ));
            put(Const.DollyZoom, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DollyZoom));
                                    add(new BasicNameValuePair("Version", "2020-08-26"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ImageCut, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ImageCut));
                                    add(new BasicNameValuePair("Version", "2020-08-26"));
                                }
                            });
                        }
                    }
            ));
            put(Const.FacePretty, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.FacePretty));
                                    add(new BasicNameValuePair("Version", "2020-08-26"));
                                }
                            });
                        }
                    }
            ));
            put(Const.HairStyle, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.HairStyle));
                                    add(new BasicNameValuePair("Version", "2020-08-26"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ImageAnimation, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ImageAnimation));
                                    add(new BasicNameValuePair("Version", "2020-08-26"));
                                }
                            });
                        }
                    }
            ));
            put(Const.CertToken, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.CertToken));
                                    add(new BasicNameValuePair("Version", "2022-08-31"));
                                }
                            });
                        }
                    }
            ));
            put(Const.CertVerifyQuery, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.CertVerifyQuery));
                                    add(new BasicNameValuePair("Version", "2022-08-31"));
                                }
                            });
                        }
                    }
            ));
            put(Const.CertConfigInit, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.CertConfigInit));
                                    add(new BasicNameValuePair("Version", "2022-08-31"));
                                }
                            });
                        }
                    }
            ));
            put(Const.CertConfigGet, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.CertConfigGet));
                                    add(new BasicNameValuePair("Version", "2022-08-31"));
                                }
                            });
                        }
                    }
            ));
            put(Const.CertVerifyPro, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.CertVerifyPro));
                                    add(new BasicNameValuePair("Version", "2022-08-31"));
                                }
                            });
                        }
                    }
            ));
            put(Const.Img2Video3D, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.Img2Video3D));
                                    add(new BasicNameValuePair("Version", "2022-08-31"));
                                }
                            });
                        }
                    }
            ));
            put(Const.T2ILDM, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.T2ILDM));
                                    add(new BasicNameValuePair("Version", "2022-08-31"));
                                }
                            });
                        }
                    }
            ));
            put(Const.Img2ImgStyle, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.Img2ImgStyle));
                                    add(new BasicNameValuePair("Version", "2022-08-31"));
                                }
                            });
                        }
                    }
            ));
            put(Const.Img2ImgAnime, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.Img2ImgAnime));
                                    add(new BasicNameValuePair("Version", "2022-08-31"));
                                }
                            });
                        }
                    }
            ));
            put(Const.FaceFusionMovieSubmitTask, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.FaceFusionMovieSubmitTask));
                                    add(new BasicNameValuePair("Version", "2022-08-31"));
                                }
                            });
                        }
                    }
            ));
            put(Const.FaceFusionMovieGetResult, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.FaceFusionMovieGetResult));
                                    add(new BasicNameValuePair("Version", "2022-08-31"));
                                }
                            });
                        }
                    }
            ));
            put(Const.FaceFusionMovieSync, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.FaceFusionMovieSync));
                                    add(new BasicNameValuePair("Version", "2022-08-31"));
                                }
                            });
                        }
                    }
            ));
            put(Const.EnhancePhotoV2, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.EnhancePhotoV2));
                                    add(new BasicNameValuePair("Version", "2022-08-31"));
                                }
                            });
                        }
                    }
            ));
            put(Const.AllAgeGeneration, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AllAgeGeneration));
                                    add(new BasicNameValuePair("Version", "2022-08-31"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ConvertPhotoV2, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ConvertPhotoV2));
                                    add(new BasicNameValuePair("Version", "2022-08-31"));
                                }
                            });
                        }
                    }
            ));
            put(Const.AIGufeng, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AIGufeng));
                                    add(new BasicNameValuePair("Version", "2022-08-31"));
                                }
                            });
                        }
                    }
            ));
            put(Const.LensVidaVideoSubmitTaskV2, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.LensVidaVideoSubmitTaskV2));
                                    add(new BasicNameValuePair("Version", "2022-08-31"));
                                }
                            });
                        }
                    }
            ));
            put(Const.LensVidaVideoGetResultV2, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.LensVidaVideoGetResultV2));
                                    add(new BasicNameValuePair("Version", "2022-08-31"));
                                }
                            });
                        }
                    }
            ));
            put(Const.VideoOverResolutionSubmitTaskV2, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.VideoOverResolutionSubmitTaskV2));
                                    add(new BasicNameValuePair("Version", "2022-08-31"));
                                }
                            });
                        }
                    }
            ));
            put(Const.VideoOverResolutionQueryTaskV2, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.VideoOverResolutionQueryTaskV2));
                                    add(new BasicNameValuePair("Version", "2022-08-31"));
                                }
                            });
                        }
                    }
            ));
            put(Const.OCRNormal, new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", Const.OCRNormal));
                                add(new BasicNameValuePair("Version", "2020-08-26"));
                            }
                        });
                    }
                }
            ));
            put(Const.MultilangOCR, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.MultilangOCR));
                                    add(new BasicNameValuePair("Version", "2022-08-31"));
                                }
                            });
                        }
                    }
            ));
            put(Const.BankCard, new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", Const.BankCard));
                                add(new BasicNameValuePair("Version", "2020-08-26"));
                            }
                        });
                    }
                }
            ));
            put(Const.IDCard, new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", Const.IDCard));
                                add(new BasicNameValuePair("Version", "2020-08-26"));
                            }
                        });
                    }
                }
            ));
            put(Const.DrivingLicense, new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", Const.DrivingLicense));
                                add(new BasicNameValuePair("Version", "2020-08-26"));
                            }
                        });
                    }
                }
            ));
            put(Const.VehicleLicense, new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", Const.VehicleLicense));
                                add(new BasicNameValuePair("Version", "2020-08-26"));
                            }
                        });
                    }
                }
            ));
            put(Const.OcrTaibao, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.OcrTaibao));
                                    add(new BasicNameValuePair("Version", "2021-08-23"));
                                }
                            });
                        }
                    }
            ));
            put(Const.OcrVatInvoice, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.OcrVatInvoice));
                                    add(new BasicNameValuePair("Version", "2020-08-26"));
                                }
                            });
                        }
                    }
            ));
            put(Const.OcrTaxiInvoice, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.OcrTaxiInvoice));
                                    add(new BasicNameValuePair("Version", "2020-08-26"));
                                }
                            });
                        }
                    }
            ));
            put(Const.OcrQuotaInvoice, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.OcrQuotaInvoice));
                                    add(new BasicNameValuePair("Version", "2020-08-26"));
                                }
                            });
                        }
                    }
            ));
            put(Const.OcrTrainTicket, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.OcrTrainTicket));
                                    add(new BasicNameValuePair("Version", "2020-08-26"));
                                }
                            });
                        }
                    }
            ));
            put(Const.OcrFlightInvoice, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.OcrFlightInvoice));
                                    add(new BasicNameValuePair("Version", "2020-08-26"));
                                }
                            });
                        }
                    }
            ));
            put(Const.OcrFinance, new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", Const.OcrFinance));
                                add(new BasicNameValuePair("Version", "2021-08-23"));
                            }
                        });
                    }
                }
            ));
            put(Const.OcrRollInvoice, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.OcrRollInvoice));
                                    add(new BasicNameValuePair("Version", "2021-08-23"));
                                }
                            });
                        }
                    }
            ));
            put(Const.OcrPassInvoice, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.OcrPassInvoice));
                                    add(new BasicNameValuePair("Version", "2021-08-23"));
                                }
                            });
                        }
                    }
            ));
            put(Const.OcrFoodProduction, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.OcrFoodProduction));
                                    add(new BasicNameValuePair("Version", "2021-08-23"));
                                }
                            });
                        }
                    }
            ));
            put(Const.OcrFoodBusiness, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.OcrFoodBusiness));
                                    add(new BasicNameValuePair("Version", "2020-08-26"));
                                }
                            });
                        }
                    }
            ));
            put(Const.OcrClueLicense, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.OcrClueLicense));
                                    add(new BasicNameValuePair("Version", "2020-08-26"));
                                }
                            });
                        }
                    }
            ));
            put(Const.OCRTrade, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.OCRTrade));
                                    add(new BasicNameValuePair("Version", "2020-12-21"));
                                }
                            });
                        }
                    }
            ));
            put(Const.OCRRuanzhu, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.OCRRuanzhu));
                                    add(new BasicNameValuePair("Version", "2020-12-21"));
                                }
                            });
                        }
                    }
            ));
            put(Const.OCRCosmeticProduct, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.OCRCosmeticProduct));
                                    add(new BasicNameValuePair("Version", "2020-12-21"));
                                }
                            });
                        }
                    }
            ));
            put(Const.OcrSeal, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.OcrSeal));
                                    add(new BasicNameValuePair("Version", "2021-08-23"));
                                }
                            });
                        }
                    }
            ));
            put(Const.OcrTextAlignment, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.OcrTextAlignment));
                                    add(new BasicNameValuePair("Version", "2021-08-23"));
                                }
                            });
                        }
                    }
            ));
            put(Const.OCRPdf, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.OCRPdf));
                                    add(new BasicNameValuePair("Version", "2021-08-23"));
                                }
                            });
                        }
                    }
            ));
            put(Const.OCRTable, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.OCRTable));
                                    add(new BasicNameValuePair("Version", "2021-08-23"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ImageStyleConversion, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ImageStyleConversion));
                                    add(new BasicNameValuePair("Version", "2020-08-26"));
                                }
                            });
                        }
                    }
            ));
            put(Const.CertSrcFaceComp, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.CertSrcFaceComp));
                                    add(new BasicNameValuePair("Version", "2022-08-31"));
                                }
                            });
                        }
                    }
            ));
            put(Const.FaceCompare, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.FaceCompare));
                                    add(new BasicNameValuePair("Version", "2022-08-31"));
                                }
                            });
                        }
                    }
            ));
            put(Const.StillLivenessImg, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.StillLivenessImg));
                                    add(new BasicNameValuePair("Version", "2022-08-31"));
                                }
                            });
                        }
                    }
            ));
            put(Const.OverResolutionV2, new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", Const.OverResolutionV2));
                                add(new BasicNameValuePair("Version", "2022-08-31"));
                            }
                        });
                    }
                }
            ));
            put(Const.TupoCartoon, new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", Const.TupoCartoon));
                                add(new BasicNameValuePair("Version", "2022-08-31"));
                            }
                        });
                    }
                }
            ));
            put(Const.OCRPdfSubmitTask, new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", Const.OCRPdfSubmitTask));
                                add(new BasicNameValuePair("Version", "2021-08-23"));
                            }
                        });
                    }
                }
            ));
            put(Const.OCRPdfQueryTask, new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", Const.OCRPdfQueryTask));
                                add(new BasicNameValuePair("Version", "2021-08-23"));
                            }
                        });
                    }
                }
            ));
            put(Const.CertH5Token, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.CertH5Token));
                                    add(new BasicNameValuePair("Version", "2022-08-31"));
                                }
                            });
                        }
                    }
            ));
            put(Const.CertH5ConfigInit, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.CertH5ConfigInit));
                                    add(new BasicNameValuePair("Version", "2022-08-31"));
                                }
                            });
                        }
                    }
            ));
            put(Const.HighAesSmartDrawing, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.HighAesSmartDrawing));
                                    add(new BasicNameValuePair("Version", "2022-08-31"));
                                }
                            });
                        }
                    }
            ));
            put(Const.Img2ImgInpainting, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.Img2ImgInpainting));
                                    add(new BasicNameValuePair("Version", "2022-08-31"));
                                }
                            });
                        }
                    }
            ));
            put(Const.Img2ImgInpaintingEdit, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.Img2ImgInpaintingEdit));
                                    add(new BasicNameValuePair("Version", "2022-08-31"));
                                }
                            });
                        }
                    }
            ));
            put(Const.Img2ImgOutpainting, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.Img2ImgOutpainting));
                                    add(new BasicNameValuePair("Version", "2022-08-31"));
                                }
                            });
                        }
                    }
            ));
            put(Const.MultiPhotoPortraitSubmitTaskCreateAIModel, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.MultiPhotoPortraitSubmitTaskCreateAIModel));
                                    add(new BasicNameValuePair("Version", "2022-08-31"));
                                }
                            });
                        }
                    }
            ));
            put(Const.MultiPhotoPortraitSubmitTaskGenerateImage, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.MultiPhotoPortraitSubmitTaskGenerateImage));
                                    add(new BasicNameValuePair("Version", "2022-08-31"));
                                }
                            });
                        }
                    }
            ));
            put(Const.MultiPhotoPortraitGetTaskResult, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.MultiPhotoPortraitGetTaskResult));
                                    add(new BasicNameValuePair("Version", "2022-08-31"));
                                }
                            });
                        }
                    }
            ));
            put(Const.MultiPhotoPortraitManageTask, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.MultiPhotoPortraitManageTask));
                                    add(new BasicNameValuePair("Version", "2022-08-31"));
                                }
                            });
                        }
                    }
            ));
            put(Const.Img2ImgAnimeAcceleratedMaintainID, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.Img2ImgAnimeAcceleratedMaintainID));
                                    add(new BasicNameValuePair("Version", "2022-08-31"));
                                }
                            });
                        }
                    }
            ));
            put(Const.EntitySegment, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.EntitySegment));
                                    add(new BasicNameValuePair("Version", "2022-08-31"));
                                }
                            });
                        }
                    }
            ));
            put(Const.Img2ImgAnimeAcceleratedMaintainIDForSmartDrawingAnime, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.Img2ImgAnimeAcceleratedMaintainIDForSmartDrawingAnime));
                                    add(new BasicNameValuePair("Version", "2022-08-31"));
                                }
                            });
                        }
                    }
            ));
            put(Const.Text2ImgXLSft, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.Text2ImgXLSft));
                                    add(new BasicNameValuePair("Version", "2022-08-31"));
                                }
                            });
                        }
                    }
            ));
            put(Const.Img2ImgXLSft, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.Img2ImgXLSft));
                                    add(new BasicNameValuePair("Version", "2022-08-31"));
                                }
                            });
                        }
                    }
            ));
            put(Const.SaliencySeg, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.SaliencySeg));
                                    add(new BasicNameValuePair("Version", "2022-08-31"));
                                }
                            });
                        }
                    }
            ));
        }
    };
}