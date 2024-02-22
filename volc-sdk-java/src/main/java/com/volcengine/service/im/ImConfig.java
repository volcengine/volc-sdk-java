package com.volcengine.service.im;

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
 * Basic configuration for Im
 */
public class ImConfig {
    /**
     * Basic service configuration for Im
     */
    public static Map<String, ServiceInfo> serviceInfoMap = new HashMap<String, ServiceInfo>() {
        {
            put("cn-north-1", new ServiceInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.CONNECTION_TIMEOUT, 5000);
                            put(Const.SOCKET_TIMEOUT, 5000);
                            put(Const.Scheme, "https");
                            put(Const.Host, "rtc.volcengineapi.com");
                            put(Const.Header, new ArrayList<Header>() {
                                {
                                    add(new BasicHeader("Accept", "application/json"));
                                }
                            });
                            put(Const.Credentials, new Credentials("cn-north-1", "rtc"));
                        }
                    }
            ));
            put("ap-southeast-1", new ServiceInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.CONNECTION_TIMEOUT, 5000);
                            put(Const.SOCKET_TIMEOUT, 5000);
                            put(Const.Scheme, "https");
                            put(Const.Host, "rtc.volcengineapi.com");
                            put(Const.Header, new ArrayList<Header>() {
                                {
                                    add(new BasicHeader("Accept", "application/json"));
                                }
                            });
                            put(Const.Credentials, new Credentials("ap-southeast-1", "rtc"));
                        }
                    }
            ));
        }
    };

    /**
     * Basic api configuration for Im
     */
    public static Map<String, ApiInfo> apiInfoList = new HashMap<String, ApiInfo>() {
        {
            put("GetConversationMarks", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetConversationMarks"));
                                add(new BasicNameValuePair("Version", "2020-12-01"));
                            }
                        });
                    }
                }     
            ));
            put("MarkConversation", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "MarkConversation"));
                                add(new BasicNameValuePair("Version", "2020-12-01"));
                            }
                        });
                    }
                }     
            ));
            put("ModifyParticipantReadIndex", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ModifyParticipantReadIndex"));
                                add(new BasicNameValuePair("Version", "2020-12-01"));
                            }
                        });
                    }
                }     
            ));
            put("ScanConversationParticipantList", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ScanConversationParticipantList"));
                                add(new BasicNameValuePair("Version", "2020-12-01"));
                            }
                        });
                    }
                }     
            ));
            put("BatchGetBlockParticipants", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "BatchGetBlockParticipants"));
                                add(new BasicNameValuePair("Version", "2020-12-01"));
                            }
                        });
                    }
                }     
            ));
            put("IsUserInConversation", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "IsUserInConversation"));
                                add(new BasicNameValuePair("Version", "2020-12-01"));
                            }
                        });
                    }
                }     
            ));
            put("BatchModifyConversationParticipant", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "BatchModifyConversationParticipant"));
                                add(new BasicNameValuePair("Version", "2020-12-01"));
                            }
                        });
                    }
                }     
            ));
            put("BatchDeleteConversationParticipant", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "BatchDeleteConversationParticipant"));
                                add(new BasicNameValuePair("Version", "2020-12-01"));
                            }
                        });
                    }
                }     
            ));
            put("BatchDeleteBlockParticipants", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "BatchDeleteBlockParticipants"));
                                add(new BasicNameValuePair("Version", "2020-12-01"));
                            }
                        });
                    }
                }     
            ));
            put("BatchGetConversationParticipant", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "BatchGetConversationParticipant"));
                                add(new BasicNameValuePair("Version", "2020-12-01"));
                            }
                        });
                    }
                }     
            ));
            put("BatchGetWhitelistParticipant", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "BatchGetWhitelistParticipant"));
                                add(new BasicNameValuePair("Version", "2020-12-01"));
                            }
                        });
                    }
                }     
            ));
            put("BatchAddWhitelistParticipant", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "BatchAddWhitelistParticipant"));
                                add(new BasicNameValuePair("Version", "2020-12-01"));
                            }
                        });
                    }
                }     
            ));
            put("BatchAddManager", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "BatchAddManager"));
                                add(new BasicNameValuePair("Version", "2020-12-01"));
                            }
                        });
                    }
                }     
            ));
            put("BatchAddConversationParticipant", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "BatchAddConversationParticipant"));
                                add(new BasicNameValuePair("Version", "2020-12-01"));
                            }
                        });
                    }
                }     
            ));
            put("BatchAddBlockParticipants", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "BatchAddBlockParticipants"));
                                add(new BasicNameValuePair("Version", "2020-12-01"));
                            }
                        });
                    }
                }     
            ));
            put("BatchRemoveWhitelistParticipant", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "BatchRemoveWhitelistParticipant"));
                                add(new BasicNameValuePair("Version", "2020-12-01"));
                            }
                        });
                    }
                }     
            ));
            put("BatchRemoveManager", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "BatchRemoveManager"));
                                add(new BasicNameValuePair("Version", "2020-12-01"));
                            }
                        });
                    }
                }     
            ));
            put("BatchUpdateLiveParticipants", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "BatchUpdateLiveParticipants"));
                                add(new BasicNameValuePair("Version", "2020-12-01"));
                            }
                        });
                    }
                }     
            ));
            put("GetParticipantReadIndex", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetParticipantReadIndex"));
                                add(new BasicNameValuePair("Version", "2020-12-01"));
                            }
                        });
                    }
                }     
            ));
            put("GetConversationUserCount", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetConversationUserCount"));
                                add(new BasicNameValuePair("Version", "2020-12-01"));
                            }
                        });
                    }
                }     
            ));
            put("QueryLiveParticipantStatus", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "QueryLiveParticipantStatus"));
                                add(new BasicNameValuePair("Version", "2020-12-01"));
                            }
                        });
                    }
                }     
            ));
            put("ModifyConversation", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ModifyConversation"));
                                add(new BasicNameValuePair("Version", "2020-12-01"));
                            }
                        });
                    }
                }     
            ));
            put("ModifyConversationSetting", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ModifyConversationSetting"));
                                add(new BasicNameValuePair("Version", "2020-12-01"));
                            }
                        });
                    }
                }     
            ));
            put("CreateConversation", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "CreateConversation"));
                                add(new BasicNameValuePair("Version", "2020-12-01"));
                            }
                        });
                    }
                }     
            ));
            put("BatchGetConversations", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "BatchGetConversations"));
                                add(new BasicNameValuePair("Version", "2020-12-01"));
                            }
                        });
                    }
                }     
            ));
            put("GetConversationSetting", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetConversationSetting"));
                                add(new BasicNameValuePair("Version", "2020-12-01"));
                            }
                        });
                    }
                }     
            ));
            put("GetUserConversations", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetUserConversations"));
                                add(new BasicNameValuePair("Version", "2020-12-01"));
                            }
                        });
                    }
                }     
            ));
            put("DestroyConversation", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DestroyConversation"));
                                add(new BasicNameValuePair("Version", "2020-12-01"));
                            }
                        });
                    }
                }     
            ));
            put("ModifyMessage", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ModifyMessage"));
                                add(new BasicNameValuePair("Version", "2020-12-01"));
                            }
                        });
                    }
                }     
            ));
            put("GetConversationMessages", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetConversationMessages"));
                                add(new BasicNameValuePair("Version", "2020-12-01"));
                            }
                        });
                    }
                }     
            ));
            put("DeleteConversationMessage", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DeleteConversationMessage"));
                                add(new BasicNameValuePair("Version", "2020-12-01"));
                            }
                        });
                    }
                }     
            ));
            put("DeleteMessage", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DeleteMessage"));
                                add(new BasicNameValuePair("Version", "2020-12-01"));
                            }
                        });
                    }
                }     
            ));
            put("SendMessage", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "SendMessage"));
                                add(new BasicNameValuePair("Version", "2020-12-01"));
                            }
                        });
                    }
                }     
            ));
            put("GetMessages", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetMessages"));
                                add(new BasicNameValuePair("Version", "2020-12-01"));
                            }
                        });
                    }
                }     
            ));
            put("RecallMessage", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "RecallMessage"));
                                add(new BasicNameValuePair("Version", "2020-12-01"));
                            }
                        });
                    }
                }     
            ));
            put("DeleteFriend", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DeleteFriend"));
                                add(new BasicNameValuePair("Version", "2020-12-01"));
                            }
                        });
                    }
                }     
            ));
            put("UpdateFriend", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateFriend"));
                                add(new BasicNameValuePair("Version", "2020-12-01"));
                            }
                        });
                    }
                }     
            ));
            put("UpdateBlackList", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateBlackList"));
                                add(new BasicNameValuePair("Version", "2020-12-01"));
                            }
                        });
                    }
                }     
            ));
            put("ListFriend", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ListFriend"));
                                add(new BasicNameValuePair("Version", "2020-12-01"));
                            }
                        });
                    }
                }     
            ));
            put("QueryOnlineStatus", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "QueryOnlineStatus"));
                                add(new BasicNameValuePair("Version", "2020-12-01"));
                            }
                        });
                    }
                }     
            ));
            put("GetBlackList", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetBlackList"));
                                add(new BasicNameValuePair("Version", "2020-12-01"));
                            }
                        });
                    }
                }     
            ));
            put("IsFriend", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "IsFriend"));
                                add(new BasicNameValuePair("Version", "2020-12-01"));
                            }
                        });
                    }
                }     
            ));
            put("IsInBlackList", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "IsInBlackList"));
                                add(new BasicNameValuePair("Version", "2020-12-01"));
                            }
                        });
                    }
                }     
            ));
            put("AddFriend", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "AddFriend"));
                                add(new BasicNameValuePair("Version", "2020-12-01"));
                            }
                        });
                    }
                }     
            ));
            put("AddBlackList", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "AddBlackList"));
                                add(new BasicNameValuePair("Version", "2020-12-01"));
                            }
                        });
                    }
                }     
            ));
            put("GetAppToken", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetAppToken"));
                                add(new BasicNameValuePair("Version", "2020-12-01"));
                            }
                        });
                    }
                }     
            ));
            put("RemoveBlackList", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "RemoveBlackList"));
                                add(new BasicNameValuePair("Version", "2020-12-01"));
                            }
                        });
                    }
                }     
            ));
            put("UserBroadcast", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UserBroadcast"));
                                add(new BasicNameValuePair("Version", "2020-12-01"));
                            }
                        });
                    }
                }     
            ));
            put("BatchUpdateUserTags", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "BatchUpdateUserTags"));
                                add(new BasicNameValuePair("Version", "2020-12-01"));
                            }
                        });
                    }
                }     
            ));
            put("RegisterUsers", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "RegisterUsers"));
                                add(new BasicNameValuePair("Version", "2020-12-01"));
                            }
                        });
                    }
                }     
            ));
            put("UnRegisterUsers", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UnRegisterUsers"));
                                add(new BasicNameValuePair("Version", "2020-12-01"));
                            }
                        });
                    }
                }     
            ));
            put("BatchGetUser", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "BatchGetUser"));
                                add(new BasicNameValuePair("Version", "2020-12-01"));
                            }
                        });
                    }
                }     
            ));
            put("BatchUpdateUser", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "BatchUpdateUser"));
                                    add(new BasicNameValuePair("Version", "2020-12-01"));
                                }
                            });
                        }
                    }
            ));
        }
    };
}
