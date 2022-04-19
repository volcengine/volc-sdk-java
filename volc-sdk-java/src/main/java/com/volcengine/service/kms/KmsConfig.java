package com.volcengine.service.kms;

import com.volcengine.helper.Const;
import com.volcengine.model.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class KmsConfig {
    public static ServiceInfo serviceInfo = new ServiceInfo(
            new HashMap<String, Object>() {
                {
                    put(Const.CONNECTION_TIMEOUT, 5000);
                    put(Const.SOCKET_TIMEOUT, 5000);
                    put(Const.Host, "kms.volcengineapi.com");
                    put(Const.Header, new ArrayList<Header>() {
                        {
                            add(new Header("Accept", "application/json"));
                        }
                    });
                    put(Const.Credentials, new Credentials("cn-beijing", "kms"));
                }
            }
    );
    public static Map<String, ApiInfo> apiInfoList = new HashMap<String, ApiInfo>() {
        {
            put(Const.CreateKeyring, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.CreateKeyring));
                                    add(new NameValuePair("Version", Const.KmsServiceVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.DescribeKeyrings, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.DescribeKeyrings));
                                    add(new NameValuePair("Version", Const.KmsServiceVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateKeyring, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.UpdateKeyring));
                                    add(new NameValuePair("Version", Const.KmsServiceVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.QueryKeyring, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.QueryKeyring));
                                    add(new NameValuePair("Version", Const.KmsServiceVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.CreateKey, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.CreateKey));
                                    add(new NameValuePair("Version", Const.KmsServiceVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.DescribeKeys, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.DescribeKeys));
                                    add(new NameValuePair("Version", Const.KmsServiceVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateKey, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.UpdateKey));
                                    add(new NameValuePair("Version", Const.KmsServiceVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.GenerateDataKey, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.GenerateDataKey));
                                    add(new NameValuePair("Version", Const.KmsServiceVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.Encrypt, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.Encrypt));
                                    add(new NameValuePair("Version", Const.KmsServiceVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.Decrypt, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.Decrypt));
                                    add(new NameValuePair("Version", Const.KmsServiceVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.EnableKey, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.EnableKey));
                                    add(new NameValuePair("Version", Const.KmsServiceVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.DisableKey, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.DisableKey));
                                    add(new NameValuePair("Version", Const.KmsServiceVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.ScheduleKeyDeletion, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.ScheduleKeyDeletion));
                                    add(new NameValuePair("Version", Const.KmsServiceVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.CancelKeyDeletion, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new NameValuePair("Action", Const.CancelKeyDeletion));
                                    add(new NameValuePair("Version", Const.KmsServiceVersion));
                                }
                            });
                        }
                    }
            ));
        }
    };
}
