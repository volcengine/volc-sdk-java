package com.volcengine.service.kms;

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

public class KmsConfig {
    public static ServiceInfo serviceInfo = new ServiceInfo(
            new HashMap<String, Object>() {
                {
                    put(Const.CONNECTION_TIMEOUT, 5000);
                    put(Const.SOCKET_TIMEOUT, 5000);
                    put(Const.Host, "kms.volcengineapi.com");
                    put(Const.Header, new ArrayList<Header>() {
                        {
                            add(new BasicHeader("Accept", "application/json"));
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
                                    add(new BasicNameValuePair("Action", Const.CreateKeyring));
                                    add(new BasicNameValuePair("Version", Const.KmsServiceVersion));
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
                                    add(new BasicNameValuePair("Action", Const.DescribeKeyrings));
                                    add(new BasicNameValuePair("Version", Const.KmsServiceVersion));
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
                                    add(new BasicNameValuePair("Action", Const.UpdateKeyring));
                                    add(new BasicNameValuePair("Version", Const.KmsServiceVersion));
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
                                    add(new BasicNameValuePair("Action", Const.QueryKeyring));
                                    add(new BasicNameValuePair("Version", Const.KmsServiceVersion));
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
                                    add(new BasicNameValuePair("Action", Const.CreateKey));
                                    add(new BasicNameValuePair("Version", Const.KmsServiceVersion));
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
                                    add(new BasicNameValuePair("Action", Const.DescribeKeys));
                                    add(new BasicNameValuePair("Version", Const.KmsServiceVersion));
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
                                    add(new BasicNameValuePair("Action", Const.UpdateKey));
                                    add(new BasicNameValuePair("Version", Const.KmsServiceVersion));
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
                                    add(new BasicNameValuePair("Action", Const.GenerateDataKey));
                                    add(new BasicNameValuePair("Version", Const.KmsServiceVersion));
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
                                    add(new BasicNameValuePair("Action", Const.Encrypt));
                                    add(new BasicNameValuePair("Version", Const.KmsServiceVersion));
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
                                    add(new BasicNameValuePair("Action", Const.Decrypt));
                                    add(new BasicNameValuePair("Version", Const.KmsServiceVersion));
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
                                    add(new BasicNameValuePair("Action", Const.EnableKey));
                                    add(new BasicNameValuePair("Version", Const.KmsServiceVersion));
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
                                    add(new BasicNameValuePair("Action", Const.DisableKey));
                                    add(new BasicNameValuePair("Version", Const.KmsServiceVersion));
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
                                    add(new BasicNameValuePair("Action", Const.ScheduleKeyDeletion));
                                    add(new BasicNameValuePair("Version", Const.KmsServiceVersion));
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
                                    add(new BasicNameValuePair("Action", Const.CancelKeyDeletion));
                                    add(new BasicNameValuePair("Version", Const.KmsServiceVersion));
                                }
                            });
                        }
                    }
            ));
        }
    };
}
