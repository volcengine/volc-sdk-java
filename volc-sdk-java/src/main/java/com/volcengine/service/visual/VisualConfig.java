package com.volcengine.service.visual;

import com.volcengine.helper.Const;
import com.volcengine.model.*;

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
                            put(Const.SOCKET_TIMEOUT, 5000);
                            put(Const.Scheme, "https");
                            put(Const.Host, "visual.volcengineapi.com");
                            put(Const.Header, new ArrayList<Header>() {
                                {
                                    add(new Header("Accept", "application/json"));
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
                                    add(new Header("Accept", "application/json"));
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
                                    add(new NameValuePair("Action", Const.SkySegment));
                                    add(new NameValuePair("Version", "2020-08-26"));
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
                                    add(new NameValuePair("Action", Const.HumanSegment));
                                    add(new NameValuePair("Version", "2020-08-26"));
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
                                    add(new NameValuePair("Action", Const.GeneralSegment));
                                    add(new NameValuePair("Version", "2020-08-26"));
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
                                    add(new NameValuePair("Action", Const.CarDetection));
                                    add(new NameValuePair("Version", "2020-08-26"));
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
                                    add(new NameValuePair("Action", Const.CarSegment));
                                    add(new NameValuePair("Version", "2020-08-26"));
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
                                    add(new NameValuePair("Action", Const.CarPlateDetection));
                                    add(new NameValuePair("Version", "2020-08-26"));
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
                                    add(new NameValuePair("Action", Const.PoemMaterial));
                                    add(new NameValuePair("Version", "2020-08-26"));
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
                                    add(new NameValuePair("Action", Const.ImageFlow));
                                    add(new NameValuePair("Version", "2020-08-26"));
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
                                    add(new NameValuePair("Action", Const.ImageScore));
                                    add(new NameValuePair("Version", "2020-08-26"));
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
                                    add(new NameValuePair("Action", Const.FaceSwap));
                                    add(new NameValuePair("Version", "2020-08-26"));
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
                                    add(new NameValuePair("Action", Const.JPCartoon));
                                    add(new NameValuePair("Version", "2020-08-26"));
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
                                    add(new NameValuePair("Action", Const.EyeClose2Open));
                                    add(new NameValuePair("Version", "2020-08-26"));
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
                                    add(new NameValuePair("Action", Const.EmoticonEdit));
                                    add(new NameValuePair("Version", "2020-08-26"));
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
                                    add(new NameValuePair("Action", Const.StretchRecovery));
                                    add(new NameValuePair("Version", "2020-08-26"));
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
                                    add(new NameValuePair("Action", Const.DistortionFree));
                                    add(new NameValuePair("Version", "2020-08-26"));
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
                                    add(new NameValuePair("Action", Const.EnhancePhoto));
                                    add(new NameValuePair("Version", "2020-08-26"));
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
                                add(new NameValuePair("Action", Const.ConvertPhoto));
                                add(new NameValuePair("Version", "2020-08-26"));
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
                                add(new NameValuePair("Action", Const.OCRNormal));
                                add(new NameValuePair("Version", "2020-08-26"));
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
                                add(new NameValuePair("Action", Const.BankCard));
                                add(new NameValuePair("Version", "2020-08-26"));
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
                                add(new NameValuePair("Action", Const.IDCard));
                                add(new NameValuePair("Version", "2020-08-26"));
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
                                add(new NameValuePair("Action", Const.DrivingLicense));
                                add(new NameValuePair("Version", "2020-08-26"));
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
                                add(new NameValuePair("Action", Const.VehicleLicense));
                                add(new NameValuePair("Version", "2020-08-26"));
                            }
                        });
                    }
                }
            ));
            put(Const.VatInvoice, new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new NameValuePair("Action", Const.VatInvoice));
                                add(new NameValuePair("Version", "2020-08-26"));
                            }
                        });
                    }
                }
            ));
        }
    };
}