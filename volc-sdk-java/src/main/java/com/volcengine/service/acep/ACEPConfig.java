package com.volcengine.service.acep;

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

/**
 * Basic configuration for ACEP
 */
public class ACEPConfig {
    /**
     * Basic service configuration for ACEP
     */
    public static Map<String, ServiceInfo> serviceInfoMap = new HashMap<String, ServiceInfo>() {
        {
            put("cn-north-1", new ServiceInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.CONNECTION_TIMEOUT, 5000);
                            put(Const.SOCKET_TIMEOUT, 5000);
                            put(Const.Scheme, "https");
                            put(Const.Host, "open.volcengineapi.com");
                            put(Const.Header, new ArrayList<Header>() {
                                {
                                    add(new BasicHeader("Accept", "application/json"));
                                }
                            });
                            put(Const.Credentials, new Credentials("cn-north-1", "acep"));
                        }
                    }
            ));
        }
    };

    /**
     * Basic api configuration for ACEP
     */
    public static Map<String, ApiInfo> apiInfoList = new HashMap<String, ApiInfo>() {
        {
            put("PullFile", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "PullFile"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("UpdatePodProperty", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdatePodProperty"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("CloseApp", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "CloseApp"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("CreatePod", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "CreatePod"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("CreatePodOneStep", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "CreatePodOneStep"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("AddPropertyRule", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "AddPropertyRule"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("DeletePod", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DeletePod"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("RunSyncCommand", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "RunSyncCommand"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("LaunchApp", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "LaunchApp"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("LaunchApps", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "LaunchApps"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("PowerOffPod", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "PowerOffPod"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("PodStop", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "PodStop"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("PowerOnPod", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "PowerOnPod"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("CopyPod", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "CopyPod"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("PodDataTransfer", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "PodDataTransfer"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("RebootPod", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "RebootPod"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("ResetPod", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ResetPod"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("BanUser", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "BanUser"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("PushFile", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "PushFile"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("DistributeFile", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DistributeFile"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("StartRecording", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "StartRecording"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("ScreenShot", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ScreenShot"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("PodAdb", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "PodAdb"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("RunCommand", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "RunCommand"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("BatchScreenShot", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "BatchScreenShot"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("PodMute", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "PodMute"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("UpdatePod", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdatePod"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("ListDc", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ListDc"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("GetPodMetric", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetPodMetric"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("DetailPod", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DetailPod"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("ListPod", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ListPod"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("GetPodProperty", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetPodProperty"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("ListPropertyRule", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ListPropertyRule"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("PodDataDelete", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "PodDataDelete"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("RemovePropertyRule", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "RemovePropertyRule"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("StopRecording", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "StopRecording"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("GetPodAppList", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetPodAppList"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("SetProxy", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "SetProxy"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("ListTask", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ListTask"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("GetTaskInfo", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetTaskInfo"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("CreatePortMappingRule", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "CreatePortMappingRule"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("ListPortMappingRule", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ListPortMappingRule"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("DetailPortMappingRule", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DetailPortMappingRule"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("BindPortMappingRule", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "BindPortMappingRule"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("UnbindPortMappingRule", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UnbindPortMappingRule"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("AttachTag", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "AttachTag"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("ListTag", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ListTag"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("CreateTag", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "CreateTag"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("DeleteTag", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DeleteTag"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("UpdateTag", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateTag"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("UploadApp", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UploadApp"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("DetailApp", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DetailApp"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("UpdateApp", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateApp"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("ListApp", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ListApp"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("DeleteApp", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DeleteApp"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("UninstallApp", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UninstallApp"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("InstallApp", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "InstallApp"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("InstallApps", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "InstallApps"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("ListAppVersionDeploy", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ListAppVersionDeploy"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("AutoInstallApp", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "AutoInstallApp"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("GetAppCrashLog", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetAppCrashLog"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("CreateDisplayLayoutMini", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "CreateDisplayLayoutMini"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("DeleteDisplayLayout", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DeleteDisplayLayout"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("ListDisplayLayoutMini", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ListDisplayLayoutMini"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("DetailDisplayLayoutMini", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DetailDisplayLayoutMini"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("CreateAppImage", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "CreateAppImage"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("DetailAppVersionImage", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DetailAppVersionImage"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("CreateImageOneStep", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "CreateImageOneStep"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("ListImageResource", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ListImageResource"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("GetImagePreheating", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetImagePreheating"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("ListConfiguration", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ListConfiguration"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("ListPodResourceSet", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ListPodResourceSet"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("ListPodResource", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ListPodResource"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("ListResourceQuota", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ListResourceQuota"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("UpdatePodResourceApplyNum", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdatePodResourceApplyNum"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("SubscribeResourceAuto", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "SubscribeResourceAuto"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("RenewResourceAuto", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "RenewResourceAuto"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("UpdateProductResource", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateProductResource"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("GetProductResource", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetProductResource"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("UnsubscribeHostResource", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UnsubscribeHostResource"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("UpdateHost", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateHost"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("ListHost", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ListHost"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("DetailHost", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DetailHost"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("RebootHost", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "RebootHost"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
            put("ResetHost", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ResetHost"));
                                add(new BasicNameValuePair("Version", "2023-10-30"));
                            }
                        });
                    }
                }     
            ));
        }
    };
}
