package com.volcengine.service.visual;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.volcengine.helper.Const;
import com.volcengine.model.ApiInfo;
import com.volcengine.model.Credentials;
import com.volcengine.model.ServiceInfo;

import org.apache.http.Header;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicNameValuePair;

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
            put(Const.BankCard, new ApiInfo(
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
            put(Const.VatInvoice, new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", Const.VatInvoice));
                                add(new BasicNameValuePair("Version", "2020-08-26"));
                            }
                        });
                    }
                }
            ));
        }
    };
}