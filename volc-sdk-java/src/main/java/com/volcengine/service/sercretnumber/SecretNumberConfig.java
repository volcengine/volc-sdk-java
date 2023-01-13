package com.volcengine.service.sercretnumber;

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

public class SecretNumberConfig {

  public static Map<String, ServiceInfo> serviceInfoMap = new HashMap<String, ServiceInfo>() {
    {
      put(Const.REGION_CN_NORTH_1, new ServiceInfo(
          new HashMap<String, Object>() {
            {
              put(Const.CONNECTION_TIMEOUT, 5000);
              put(Const.SOCKET_TIMEOUT, 5000);
              put(Const.Scheme, "https");
              put(Const.Host, "cloud-vms.volcengineapi.com");
              put(Const.Header, new ArrayList<Header>() {
                {
                  add(new BasicHeader("Accept", "application/json"));
                }
              });
              put(Const.Credentials,
                  new Credentials(Const.REGION_CN_NORTH_1, "volc_secret_number"));
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
              put(Const.Method, "POST");
              put(Const.Path, "/");
              put(Const.Query, new ArrayList<NameValuePair>() {
                {
                  add(new BasicNameValuePair("Action", "BindAXB"));
                  add(new BasicNameValuePair("Version", "2020-09-01"));
                }
              });
            }
          }
      ));
      put("SelectNumberAndBindAXB", new ApiInfo(
          new HashMap<String, Object>() {
            {
              put(Const.Method, "POST");
              put(Const.Path, "/");
              put(Const.Query, new ArrayList<NameValuePair>() {
                {
                  add(new BasicNameValuePair("Action", "SelectNumberAndBindAXB"));
                  add(new BasicNameValuePair("Version", "2020-09-01"));
                }
              });
            }
          }
      ));
      put("UnbindAXB", new ApiInfo(
          new HashMap<String, Object>() {
            {
              put(Const.Method, "POST");
              put(Const.Path, "/");
              put(Const.Query, new ArrayList<NameValuePair>() {
                {
                  add(new BasicNameValuePair("Action", "UnbindAXB"));
                  add(new BasicNameValuePair("Version", "2020-09-01"));
                }
              });
            }
          }
      ));
      put("QuerySubscription", new ApiInfo(
          new HashMap<String, Object>() {
            {
              put(Const.Method, "POST");
              put(Const.Path, "/");
              put(Const.Query, new ArrayList<NameValuePair>() {
                {
                  add(new BasicNameValuePair("Action", "QuerySubscription"));
                  add(new BasicNameValuePair("Version", "2020-09-01"));
                }
              });
            }
          }
      ));
      put("QuerySubscriptionForList", new ApiInfo(
          new HashMap<String, Object>() {
            {
              put(Const.Method, "POST");
              put(Const.Path, "/");
              put(Const.Query, new ArrayList<NameValuePair>() {
                {
                  add(new BasicNameValuePair("Action", "QuerySubscriptionForList"));
                  add(new BasicNameValuePair("Version", "2020-09-01"));
                }
              });
            }
          }
      ));
      put("UpgradeAXToAXB", new ApiInfo(
          new HashMap<String, Object>() {
            {
              put(Const.Method, "POST");
              put(Const.Path, "/");
              put(Const.Query, new ArrayList<NameValuePair>() {
                {
                  add(new BasicNameValuePair("Action", "UpgradeAXToAXB"));
                  add(new BasicNameValuePair("Version", "2020-09-01"));
                }
              });
            }
          }
      ));
      put("UpdateAXB", new ApiInfo(
          new HashMap<String, Object>() {
            {
              put(Const.Method, "POST");
              put(Const.Path, "/");
              put(Const.Query, new ArrayList<NameValuePair>() {
                {
                  add(new BasicNameValuePair("Action", "UpdateAXB"));
                  add(new BasicNameValuePair("Version", "2020-09-01"));
                }
              });
            }
          }
      ));
      put("BindAXN", new ApiInfo(
          new HashMap<String, Object>() {
            {
              put(Const.Method, "POST");
              put(Const.Path, "/");
              put(Const.Query, new ArrayList<NameValuePair>() {
                {
                  add(new BasicNameValuePair("Action", "BindAXN"));
                  add(new BasicNameValuePair("Version", "2020-09-01"));
                }
              });
            }
          }
      ));
        put("SelectNumberAndBindAXN", new ApiInfo(new HashMap<String, Object>() {
            {
                put(Const.Method, "POST");
                put(Const.Path, "/");
                put(Const.Query, new ArrayList<NameValuePair>() {
                    {
                        add(new BasicNameValuePair("Action", "SelectNumberAndBindAXN"));
                        add(new BasicNameValuePair("Version", "2020-09-01"));
                    }
                });
            }
        }));
      put("UpdateAXN", new ApiInfo(
          new HashMap<String, Object>() {
            {
              put(Const.Method, "POST");
              put(Const.Path, "/");
              put(Const.Query, new ArrayList<NameValuePair>() {
                {
                  add(new BasicNameValuePair("Action", "UpdateAXN"));
                  add(new BasicNameValuePair("Version", "2020-09-01"));
                }
              });
            }
          }
      ));
      put("UnbindAXN", new ApiInfo(
          new HashMap<String, Object>() {
            {
              put(Const.Method, "POST");
              put(Const.Path, "/");
              put(Const.Query, new ArrayList<NameValuePair>() {
                {
                  add(new BasicNameValuePair("Action", "UnbindAXN"));
                  add(new BasicNameValuePair("Version", "2020-09-01"));
                }
              });
            }
          }
      ));
      put("Click2Call", new ApiInfo(
            new HashMap<String, Object>() {
                {
                    put(Const.Method, "POST");
                    put(Const.Path, "/");
                    put(Const.Query, new ArrayList<NameValuePair>() {
                        {
                            add(new BasicNameValuePair("Action", "Click2Call"));
                            add(new BasicNameValuePair("Version", "2021-09-01"));
                        }
                    });
                }
            }
      ));
      put("CancelClick2Call", new ApiInfo(
            new HashMap<String, Object>() {
                {
                    put(Const.Method, "POST");
                    put(Const.Path, "/");
                    put(Const.Query, new ArrayList<NameValuePair>() {
                        {
                            add(new BasicNameValuePair("Action", "CancelClick2Call"));
                            add(new BasicNameValuePair("Version", "2021-09-01"));
                        }
                    });
                }
            }
      ));
        put("BindAXNE", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "BindAXNE"));
                                add(new BasicNameValuePair("Version", "2020-09-01"));
                            }
                        });
                    }
                }
        ));
        put("UnbindAXNE", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UnbindAXNE"));
                                add(new BasicNameValuePair("Version", "2020-09-01"));
                            }
                        });
                    }
                }
        ));
        put("UpdateAXNE", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateAXNE"));
                                add(new BasicNameValuePair("Version", "2020-09-01"));
                            }
                        });
                    }
                }
        ));
        put("BindAXBForAXNE", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "BindAXBForAXNE"));
                                add(new BasicNameValuePair("Version", "2020-09-01"));
                            }
                        });
                    }
                }
        ));
        put("BindAXYB", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "BindAXYB"));
                                add(new BasicNameValuePair("Version", "2020-09-01"));
                            }
                        });
                    }
                }
        ));
        put("BindYBForAXYB", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "BindYBForAXYB"));
                                add(new BasicNameValuePair("Version", "2020-09-01"));
                            }
                        });
                    }
                }
        ));
        put("UnbindAXYB", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UnbindAXYB"));
                                add(new BasicNameValuePair("Version", "2020-09-01"));
                            }
                        });
                    }
                }
        ));
        put("UpdateAXYB", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateAXYB"));
                                add(new BasicNameValuePair("Version", "2020-09-01"));
                            }
                        });
                    }
                }
        ));
    }
  };
}
