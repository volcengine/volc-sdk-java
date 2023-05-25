package com.volcengine.service.vms;

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

public class VmsConfig {
    
    private static final String ACTION = "Action";
    private static final String VERSION = "Version";

    private static final String DEFAULT_PATH = "/";
    private static final String DEFAULT_VERSION = "2022-01-01";

    public static Map<String, ServiceInfo> serviceInfoMap = new HashMap<String, ServiceInfo>() {
        {
            put(Const.REGION_CN_NORTH_1, new ServiceInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.CONNECTION_TIMEOUT, 5000);
                        put(Const.SOCKET_TIMEOUT, 5000);
                        put(Const.Scheme, Const.HTTPS);
                        put(Const.Host, "cloud-vms.volcengineapi.com");
                        put(Const.Header, new ArrayList<Header>() {
                            {
                                add(new BasicHeader(Const.ACCEPT, "application/json"));
                            }
                        });
                        put(Const.Credentials,
                            new Credentials(Const.REGION_CN_NORTH_1, "vms"));
                    }
                }
            ));
        }
    };

    public static Map<String, ApiInfo> apiInfoList = new HashMap<String, ApiInfo>() {
        {
            put("BindAXB", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, Const.POST);
                        put(Const.Path, DEFAULT_PATH);
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair(ACTION, "BindAXB"));
                                add(new BasicNameValuePair(VERSION, DEFAULT_VERSION));
                            }
                        });
                    }
                }
            ));
            put("SelectNumberAndBindAXB", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, Const.POST);
                        put(Const.Path, DEFAULT_PATH);
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair(ACTION, "SelectNumberAndBindAXB"));
                                add(new BasicNameValuePair(VERSION, DEFAULT_VERSION));
                            }
                        });
                    }
                }
            ));
            put("UnbindAXB", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, Const.POST);
                        put(Const.Path, DEFAULT_PATH);
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair(ACTION, "UnbindAXB"));
                                add(new BasicNameValuePair(VERSION, DEFAULT_VERSION));
                            }
                        });
                    }
                }
            ));
            put("QuerySubscription", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, Const.POST);
                        put(Const.Path, DEFAULT_PATH);
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair(ACTION, "QuerySubscription"));
                                add(new BasicNameValuePair(VERSION, DEFAULT_VERSION));
                            }
                        });
                    }
                }
            ));
            put("QuerySubscriptionForList", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, Const.POST);
                        put(Const.Path, DEFAULT_PATH);
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair(ACTION, "QuerySubscriptionForList"));
                                add(new BasicNameValuePair(VERSION, DEFAULT_VERSION));
                            }
                        });
                    }
                }
            ));
            put("UpgradeAXToAXB", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, Const.POST);
                        put(Const.Path, DEFAULT_PATH);
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair(ACTION, "UpgradeAXToAXB"));
                                add(new BasicNameValuePair(VERSION, DEFAULT_VERSION));
                            }
                        });
                    }
                }
            ));
            put("UpdateAXB", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, Const.POST);
                        put(Const.Path, DEFAULT_PATH);
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair(ACTION, "UpdateAXB"));
                                add(new BasicNameValuePair(VERSION, DEFAULT_VERSION));
                            }
                        });
                    }
                }
            ));
            put("BindAXN", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, Const.POST);
                        put(Const.Path, DEFAULT_PATH);
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair(ACTION, "BindAXN"));
                                add(new BasicNameValuePair(VERSION, DEFAULT_VERSION));
                            }
                        });
                    }
                }
            ));
            put("SelectNumberAndBindAXN", new ApiInfo(new HashMap<String, Object>() {
                {
                    put(Const.Method, Const.POST);
                    put(Const.Path, DEFAULT_PATH);
                    put(Const.Query, new ArrayList<NameValuePair>() {
                        {
                            add(new BasicNameValuePair(ACTION, "SelectNumberAndBindAXN"));
                            add(new BasicNameValuePair(VERSION, DEFAULT_VERSION));
                        }
                    });
                }
            }));
            put("UpdateAXN", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, Const.POST);
                        put(Const.Path, DEFAULT_PATH);
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair(ACTION, "UpdateAXN"));
                                add(new BasicNameValuePair(VERSION, DEFAULT_VERSION));
                            }
                        });
                    }
                }
            ));
            put("UnbindAXN", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, Const.POST);
                        put(Const.Path, DEFAULT_PATH);
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair(ACTION, "UnbindAXN"));
                                add(new BasicNameValuePair(VERSION, DEFAULT_VERSION));
                            }
                        });
                    }
                }
            ));
            put("Click2Call", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, Const.POST);
                        put(Const.Path, DEFAULT_PATH);
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair(ACTION, "Click2Call"));
                                add(new BasicNameValuePair(VERSION, DEFAULT_VERSION));
                            }
                        });
                    }
                }
            ));
            put("CancelClick2Call", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, Const.POST);
                        put(Const.Path, DEFAULT_PATH);
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair(ACTION, "CancelClick2Call"));
                                add(new BasicNameValuePair(VERSION, DEFAULT_VERSION));
                            }
                        });
                    }
                }
            ));
            put("BindAXNE", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, Const.POST);
                        put(Const.Path, DEFAULT_PATH);
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair(ACTION, "BindAXNE"));
                                add(new BasicNameValuePair(VERSION, DEFAULT_VERSION));
                            }
                        });
                    }
                }
            ));
            put("UnbindAXNE", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, Const.POST);
                        put(Const.Path, DEFAULT_PATH);
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair(ACTION, "UnbindAXNE"));
                                add(new BasicNameValuePair(VERSION, DEFAULT_VERSION));
                            }
                        });
                    }
                }
            ));
            put("UpdateAXNE", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, Const.POST);
                        put(Const.Path, DEFAULT_PATH);
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair(ACTION, "UpdateAXNE"));
                                add(new BasicNameValuePair(VERSION, DEFAULT_VERSION));
                            }
                        });
                    }
                }
            ));
            put("BindAXBForAXNE", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, Const.POST);
                        put(Const.Path, DEFAULT_PATH);
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair(ACTION, "BindAXBForAXNE"));
                                add(new BasicNameValuePair(VERSION, DEFAULT_VERSION));
                            }
                        });
                    }
                }
            ));
            put("BindAXYB", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, Const.POST);
                        put(Const.Path, DEFAULT_PATH);
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair(ACTION, "BindAXYB"));
                                add(new BasicNameValuePair(VERSION, DEFAULT_VERSION));
                            }
                        });
                    }
                }
            ));
            put("BindYBForAXYB", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, Const.POST);
                        put(Const.Path, DEFAULT_PATH);
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair(ACTION, "BindYBForAXYB"));
                                add(new BasicNameValuePair(VERSION, DEFAULT_VERSION));
                            }
                        });
                    }
                }
            ));
            put("UnbindAXYB", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, Const.POST);
                        put(Const.Path, DEFAULT_PATH);
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair(ACTION, "UnbindAXYB"));
                                add(new BasicNameValuePair(VERSION, DEFAULT_VERSION));
                            }
                        });
                    }
                }
            ));
            put("UpdateAXYB", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, Const.POST);
                        put(Const.Path, DEFAULT_PATH);
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair(ACTION, "UpdateAXYB"));
                                add(new BasicNameValuePair(VERSION, DEFAULT_VERSION));
                            }
                        });
                    }
                }
            ));
            put("NumberPoolList", new ApiInfo(new HashMap<String, Object>() {
                {
                    put(Const.Method, Const.POST);
                    put(Const.Path, DEFAULT_PATH);
                    put(Const.Query, new ArrayList<NameValuePair>() {
                        {
                            add(new BasicNameValuePair(ACTION, "NumberPoolList"));
                            add(new BasicNameValuePair(VERSION, DEFAULT_VERSION));
                        }
                    });
                }
            }));
            put("NumberList", new ApiInfo(new HashMap<String, Object>() {
                {
                    put(Const.Method, "GET");
                    put(Const.Path, DEFAULT_PATH);
                    put(Const.Query, new ArrayList<NameValuePair>() {
                        {
                            add(new BasicNameValuePair(ACTION, "NumberList"));
                            add(new BasicNameValuePair(VERSION, DEFAULT_VERSION));
                        }
                    });
                }
            }));
            put("CreateNumberPool", new ApiInfo(new HashMap<String, Object>() {
                {
                    put(Const.Method, Const.POST);
                    put(Const.Path, DEFAULT_PATH);
                    put(Const.Query, new ArrayList<NameValuePair>() {
                        {
                            add(new BasicNameValuePair(ACTION, "CreateNumberPool"));
                            add(new BasicNameValuePair(VERSION, DEFAULT_VERSION));
                        }
                    });
                }
            }));
            put("UpdateNumberPool", new ApiInfo(new HashMap<String, Object>() {
                {
                    put(Const.Method, Const.POST);
                    put(Const.Path, DEFAULT_PATH);
                    put(Const.Query, new ArrayList<NameValuePair>() {
                        {
                            add(new BasicNameValuePair(ACTION, "UpdateNumberPool"));
                            add(new BasicNameValuePair(VERSION, DEFAULT_VERSION));
                        }
                    });
                }
            }));
            put("EnableOrDisableNumber", new ApiInfo(new HashMap<String, Object>() {
                {
                    put(Const.Method, Const.POST);
                    put(Const.Path, DEFAULT_PATH);
                    put(Const.Query, new ArrayList<NameValuePair>() {
                        {
                            add(new BasicNameValuePair(ACTION, "EnableOrDisableNumber"));
                            add(new BasicNameValuePair(VERSION, DEFAULT_VERSION));
                        }
                    });
                }
            }));
            put("SelectNumber", new ApiInfo(new HashMap<String, Object>() {
                {
                    put(Const.Method, "GET");
                    put(Const.Path, DEFAULT_PATH);
                    put(Const.Query, new ArrayList<NameValuePair>() {
                        {
                            add(new BasicNameValuePair(ACTION, "SelectNumber"));
                            add(new BasicNameValuePair(VERSION, DEFAULT_VERSION));
                        }
                    });
                }
            }));
            put("QueryCallRecordMsg", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, Const.POST);
                        put(Const.Path, DEFAULT_PATH);
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair(ACTION, "QueryCallRecordMsg"));
                                add(new BasicNameValuePair(VERSION, DEFAULT_VERSION));
                            }
                        });
                    }
                }
            ));
            put("QueryAudioRecordFileUrl", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, Const.POST);
                        put(Const.Path, DEFAULT_PATH);
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair(ACTION, "QueryAudioRecordFileUrl"));
                                add(new BasicNameValuePair(VERSION, DEFAULT_VERSION));
                            }
                        });
                    }
                }
            ));
            put("QueryAudioRecordToTextFileUrl", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, Const.POST);
                        put(Const.Path, DEFAULT_PATH);
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair(ACTION, "QueryAudioRecordToTextFileUrl"));
                                add(new BasicNameValuePair(VERSION, DEFAULT_VERSION));
                            }
                        });
                    }
                }
            ));
            put("CreateTask", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, Const.POST);
                        put(Const.Path, DEFAULT_PATH);
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair(ACTION, "CreateTask"));
                                add(new BasicNameValuePair(VERSION, DEFAULT_VERSION));
                            }
                        });
                    }
                }
            ));
            put("BatchAppend", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, Const.POST);
                        put(Const.Path, DEFAULT_PATH);
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair(ACTION, "BatchAppend"));
                                add(new BasicNameValuePair(VERSION, DEFAULT_VERSION));
                            }
                        });
                    }
                }
            ));
            put("PauseTask", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, Const.POST);
                        put(Const.Path, DEFAULT_PATH);
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair(ACTION, "PauseTask"));
                                add(new BasicNameValuePair(VERSION, DEFAULT_VERSION));
                            }
                        });
                    }
                }
            ));
            put("ResumeTask", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, Const.POST);
                        put(Const.Path, DEFAULT_PATH);
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair(ACTION, "ResumeTask"));
                                add(new BasicNameValuePair(VERSION, DEFAULT_VERSION));
                            }
                        });
                    }
                }
            ));
            put("StopTask", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, Const.POST);
                        put(Const.Path, DEFAULT_PATH);
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair(ACTION, "StopTask"));
                                add(new BasicNameValuePair(VERSION, DEFAULT_VERSION));
                            }
                        });
                    }
                }
            ));
            put("UpdateTask", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, Const.POST);
                        put(Const.Path, DEFAULT_PATH);
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair(ACTION, "UpdateTask"));
                                add(new BasicNameValuePair(VERSION, DEFAULT_VERSION));
                            }
                        });
                    }
                }
            ));
            put("SingleBatchAppend", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, Const.POST);
                        put(Const.Path, DEFAULT_PATH);
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair(ACTION, "SingleBatchAppend"));
                                add(new BasicNameValuePair(VERSION, DEFAULT_VERSION));
                            }
                        });
                    }
                }
            ));
            put("SingleInfo", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, DEFAULT_PATH);
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair(ACTION, "SingleInfo"));
                                add(new BasicNameValuePair(VERSION, DEFAULT_VERSION));
                            }
                        });
                    }
                }
            ));
            put("SingleCancel", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, DEFAULT_PATH);
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair(ACTION, "SingleCancel"));
                                add(new BasicNameValuePair(VERSION, DEFAULT_VERSION));
                            }
                        });
                    }
                }
            ));
            put("FetchResource", new ApiInfo(
                new HashMap<String, Object>(){
                    {
                        put(Const.Method, Const.POST);
                        put(Const.Path, DEFAULT_PATH);
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair(ACTION, "FetchResource"));
                                add(new BasicNameValuePair(VERSION, DEFAULT_VERSION));
                            }
                        });
                    }
                }
            ));

            put("OpenCreateTts", new ApiInfo(
                new HashMap<String, Object>(){
                    {
                        put(Const.Method, Const.POST);
                        put(Const.Path, DEFAULT_PATH);
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair(ACTION, "OpenCreateTts"));
                                add(new BasicNameValuePair(VERSION, DEFAULT_VERSION));
                            }
                        });
                    }
                }
            ));

            put("OpenDeleteResource", new ApiInfo(
                new HashMap<String, Object>(){
                    {
                        put(Const.Method, Const.POST);
                        put(Const.Path, DEFAULT_PATH);
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair(ACTION, "OpenDeleteResource"));
                                add(new BasicNameValuePair(VERSION, DEFAULT_VERSION));
                            }
                        });
                    }
                }
            ));

            put("GetResourceUploadUrl", new ApiInfo(
                new HashMap<String, Object>(){
                    {
                        put(Const.Method, Const.POST);
                        put(Const.Path, DEFAULT_PATH);
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair(ACTION, "GetResourceUploadUrl"));
                                add(new BasicNameValuePair(VERSION, DEFAULT_VERSION));
                            }
                        });
                    }
                }
            ));

            put("CommitResourceUpload", new ApiInfo(
                new HashMap<String, Object>(){
                    {
                        put(Const.Method, Const.POST);
                        put(Const.Path, DEFAULT_PATH);
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair(ACTION, "CommitResourceUpload"));
                                add(new BasicNameValuePair(VERSION, DEFAULT_VERSION));
                            }
                        });
                    }
                }
            ));

            put("OpenUpdateResource", new ApiInfo(
                new HashMap<String, Object>(){
                    {
                        put(Const.Method, Const.POST);
                        put(Const.Path, DEFAULT_PATH);
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair(ACTION, "OpenUpdateResource"));
                                add(new BasicNameValuePair(VERSION, DEFAULT_VERSION));
                            }
                        });
                    }
                }
            ));

            put("QueryUsableResource", new ApiInfo(
                new HashMap<String, Object>(){
                    {
                        put(Const.Method, Const.POST);
                        put(Const.Path, DEFAULT_PATH);
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair(ACTION, "QueryUsableResource"));
                                add(new BasicNameValuePair(VERSION, DEFAULT_VERSION));
                            }
                        });
                    }
                }
            ));

            put("QueryOpenGetResource", new ApiInfo(
                new HashMap<String, Object>(){
                    {
                        put(Const.Method, Const.POST);
                        put(Const.Path, DEFAULT_PATH);
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair(ACTION, "QueryOpenGetResource"));
                                add(new BasicNameValuePair(VERSION, DEFAULT_VERSION));
                            }
                        });
                    }
                }
            ));

            put("QueryCanCall", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, Const.POST);
                        put(Const.Path, DEFAULT_PATH);
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair(ACTION, "QueryCanCall"));
                                add(new BasicNameValuePair(VERSION, DEFAULT_VERSION));
                            }
                        });
                    }
                }
            ));
        }
    };
}
