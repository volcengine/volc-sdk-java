package com.volcengine.service.tls;

import com.volcengine.error.SdkError;
import com.volcengine.helper.Const;
import com.volcengine.model.ApiInfo;
import com.volcengine.model.ServiceInfo;
import com.volcengine.model.response.RawResponse;
import com.volcengine.service.BaseServiceImpl;
import com.volcengine.service.SignableRequest;
import org.apache.http.Header;
import org.apache.http.NameValuePair;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicHeader;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class TLSHttpUtil extends BaseServiceImpl {
    public TLSHttpUtil(ServiceInfo info, Map<String, ApiInfo> apiInfoList) {
        super(info, apiInfoList);
    }

    public static ServiceInfo serviceInfo;

    private static ApiInfo jsonApiInfo(String method, String path) {
        return new ApiInfo(new HashMap<String, Object>() {
            {
                put(Const.Method, method);
                put(Const.Path, path);
                put(Const.Query, new ArrayList<NameValuePair>() {
                });
            }
        });
    }

    public RawResponse json(String api, List<NameValuePair> params, String body, Map<String, String> headers) {
        ApiInfo apiInfo = apiInfoList.get(api);
        if (apiInfo == null) {
            return new RawResponse(null, SdkError.ENOAPI.getNumber(), new Exception(SdkError.getErrorDesc(SdkError.ENOAPI)));
        }

        SignableRequest request = prepareRequest(api, params);
        if (headers != null && !headers.isEmpty()) {
            headers.forEach(request::setHeader);
        }
        if (body != null) {
            request.setHeader("Content-Type", "application/json");
            request.setEntity(new StringEntity(body, "utf-8"));
        }
        return makeRequest(api, request);
    }


    public final static Map<String, ApiInfo> API_INFO_LIST = new HashMap<String, ApiInfo>() {
        {
            //config for project create modify describe search delete
            put(com.volcengine.model.tls.Const.CREATE_PROJECT, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.POST);
                            put(Const.Path, com.volcengine.model.tls.Const.CREATE_PROJECT);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.MODIFY_PROJECT, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.PUT);
                            put(Const.Path, com.volcengine.model.tls.Const.MODIFY_PROJECT);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.DESCRIBE_PROJECT, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.GET);
                            put(Const.Path, com.volcengine.model.tls.Const.DESCRIBE_PROJECT);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.DESCRIBE_PROJECTS, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.GET);
                            put(Const.Path, com.volcengine.model.tls.Const.DESCRIBE_PROJECTS);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.DELETE_PROJECT, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.DELETE);
                            put(Const.Path, com.volcengine.model.tls.Const.DELETE_PROJECT);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            //config for topic create modify describe search delete
            put(com.volcengine.model.tls.Const.CREATE_TOPIC, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.POST);
                            put(Const.Path, com.volcengine.model.tls.Const.CREATE_TOPIC);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.MODIFY_TOPIC, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.PUT);
                            put(Const.Path, com.volcengine.model.tls.Const.MODIFY_TOPIC);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.DESCRIBE_TOPIC, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.GET);
                            put(Const.Path, com.volcengine.model.tls.Const.DESCRIBE_TOPIC);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.DESCRIBE_TOPICS, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.GET);
                            put(Const.Path, com.volcengine.model.tls.Const.DESCRIBE_TOPICS);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.DELETE_TOPIC, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.DELETE);
                            put(Const.Path, com.volcengine.model.tls.Const.DELETE_TOPIC);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.DESCRIBE_SHARDS, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.GET);
                            put(Const.Path, com.volcengine.model.tls.Const.DESCRIBE_SHARDS);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            //config for index create modify describe delete
            put(com.volcengine.model.tls.Const.CREATE_INDEX, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.POST);
                            put(Const.Path, com.volcengine.model.tls.Const.CREATE_INDEX);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.MODIFY_INDEX, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.PUT);
                            put(Const.Path, com.volcengine.model.tls.Const.MODIFY_INDEX);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.DESCRIBE_INDEX, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.GET);
                            put(Const.Path, com.volcengine.model.tls.Const.DESCRIBE_INDEX);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.DELETE_INDEX, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.DELETE);
                            put(Const.Path, com.volcengine.model.tls.Const.DELETE_INDEX);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));

            //config for processor create modify describe bind operate
            put(com.volcengine.model.tls.Const.CREATE_PROCESSOR,
                    jsonApiInfo(Const.POST, com.volcengine.model.tls.Const.CREATE_PROCESSOR));
            put(com.volcengine.model.tls.Const.DELETE_PROCESSOR,
                    jsonApiInfo(Const.DELETE, com.volcengine.model.tls.Const.DELETE_PROCESSOR));
            put(com.volcengine.model.tls.Const.MODIFY_PROCESSOR,
                    jsonApiInfo(Const.PUT, com.volcengine.model.tls.Const.MODIFY_PROCESSOR));
            put(com.volcengine.model.tls.Const.DESCRIBE_PROCESSOR,
                    jsonApiInfo(Const.GET, com.volcengine.model.tls.Const.DESCRIBE_PROCESSOR));
            put(com.volcengine.model.tls.Const.DESCRIBE_PROCESSORS,
                    jsonApiInfo(Const.GET, com.volcengine.model.tls.Const.DESCRIBE_PROCESSORS));
            put(com.volcengine.model.tls.Const.EXEC_PROCESSOR,
                    jsonApiInfo(Const.POST, com.volcengine.model.tls.Const.EXEC_PROCESSOR));
            put(com.volcengine.model.tls.Const.OPERATE_PROCESSOR,
                    jsonApiInfo(Const.PUT, com.volcengine.model.tls.Const.OPERATE_PROCESSOR));
            put(com.volcengine.model.tls.Const.DESCRIBE_TOPICS_BY_PROCESSOR,
                    jsonApiInfo(Const.GET, com.volcengine.model.tls.Const.DESCRIBE_TOPICS_BY_PROCESSOR));
            put(com.volcengine.model.tls.Const.BIND_TOPIC_PROCESSOR,
                    jsonApiInfo(Const.PUT, com.volcengine.model.tls.Const.BIND_TOPIC_PROCESSOR));
            put(com.volcengine.model.tls.Const.BATCH_BIND_TOPICS,
                    jsonApiInfo(Const.PUT, com.volcengine.model.tls.Const.BATCH_BIND_TOPICS));
            put(com.volcengine.model.tls.Const.UNBIND_TOPIC_PROCESSOR,
                    jsonApiInfo(Const.DELETE, com.volcengine.model.tls.Const.UNBIND_TOPIC_PROCESSOR));
            put(com.volcengine.model.tls.Const.DESCRIBE_PROCESSOR_BY_TOPIC,
                    jsonApiInfo(Const.GET, com.volcengine.model.tls.Const.DESCRIBE_PROCESSOR_BY_TOPIC));
            put(com.volcengine.model.tls.Const.DESCRIBE_PROCESSOR_BINDINGS,
                    jsonApiInfo(Const.GET, com.volcengine.model.tls.Const.DESCRIBE_PROCESSOR_BINDINGS));
            put(com.volcengine.model.tls.Const.DESCRIBE_PROCESSOR_FUNCTIONS,
                    jsonApiInfo(Const.GET, com.volcengine.model.tls.Const.DESCRIBE_PROCESSOR_FUNCTIONS));

            //config for rule create modify describe search delete apply unapply
            put(com.volcengine.model.tls.Const.CREATE_RULE, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.POST);
                            put(Const.Path, com.volcengine.model.tls.Const.CREATE_RULE);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.MODIFY_RULE, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.PUT);
                            put(Const.Path, com.volcengine.model.tls.Const.MODIFY_RULE);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.DESCRIBE_RULE, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.GET);
                            put(Const.Path, com.volcengine.model.tls.Const.DESCRIBE_RULE);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.DESCRIBE_RULE_V2,
                    jsonApiInfo(Const.GET, com.volcengine.model.tls.Const.DESCRIBE_RULE_V2));
            put(com.volcengine.model.tls.Const.DESCRIBE_BOUND_HOST_GROUPS,
                    jsonApiInfo(Const.GET, com.volcengine.model.tls.Const.DESCRIBE_BOUND_HOST_GROUPS));
            put(com.volcengine.model.tls.Const.DESCRIBE_RULES, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.GET);
                            put(Const.Path, com.volcengine.model.tls.Const.DESCRIBE_RULES);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.DELETE_RULE, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.DELETE);
                            put(Const.Path, com.volcengine.model.tls.Const.DELETE_RULE);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.APPLY_RULE_TO_HOES_GROUPS, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.PUT);
                            put(Const.Path, com.volcengine.model.tls.Const.APPLY_RULE_TO_HOES_GROUPS);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.DELETE_RULE_FROM_HOST_GROUPS, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.PUT);
                            put(Const.Path, com.volcengine.model.tls.Const.DELETE_RULE_FROM_HOST_GROUPS);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));

            // resource tag management
            put(com.volcengine.model.tls.Const.TAG_RESOURCES, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.POST);
                            put(Const.Path, com.volcengine.model.tls.Const.TAG_RESOURCES);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.ADD_TAGS_TO_RESOURCE, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.POST);
                            put(Const.Path, com.volcengine.model.tls.Const.ADD_TAGS_TO_RESOURCE);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.LIST_TAGS_FOR_RESOURCES, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.POST);
                            put(Const.Path, com.volcengine.model.tls.Const.LIST_TAGS_FOR_RESOURCES);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.UNTAG_RESOURCES, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.POST);
                            put(Const.Path, com.volcengine.model.tls.Const.UNTAG_RESOURCES);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.REMOVE_TAGS_FROM_RESOURCE, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.POST);
                            put(Const.Path, com.volcengine.model.tls.Const.REMOVE_TAGS_FROM_RESOURCE);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));

            //config for hostGroup create modify describe search delete host rule
            put(com.volcengine.model.tls.Const.CREATE_HOST_GROUP, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.POST);
                            put(Const.Path, com.volcengine.model.tls.Const.CREATE_HOST_GROUP);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.MODIFY_HOST_GROUP, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.PUT);
                            put(Const.Path, com.volcengine.model.tls.Const.MODIFY_HOST_GROUP);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.DESCRIBE_HOST_GROUP, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.GET);
                            put(Const.Path, com.volcengine.model.tls.Const.DESCRIBE_HOST_GROUP);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.DESCRIBE_HOST_GROUP_V2,
                    jsonApiInfo(Const.GET, com.volcengine.model.tls.Const.DESCRIBE_HOST_GROUP_V2));
            put(com.volcengine.model.tls.Const.DESCRIBE_HOST_GROUPS, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.GET);
                            put(Const.Path, com.volcengine.model.tls.Const.DESCRIBE_HOST_GROUPS);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.DESCRIBE_HOST_GROUPS_V2,
                    jsonApiInfo(Const.GET, com.volcengine.model.tls.Const.DESCRIBE_HOST_GROUPS_V2));
            put(com.volcengine.model.tls.Const.DELETE_HOST_GROUP, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.DELETE);
                            put(Const.Path, com.volcengine.model.tls.Const.DELETE_HOST_GROUP);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.DELETE_HOST, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.DELETE);
                            put(Const.Path, com.volcengine.model.tls.Const.DELETE_HOST);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.DELETE_ABNORMAL_HOSTS, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.DELETE);
                            put(Const.Path, com.volcengine.model.tls.Const.DELETE_ABNORMAL_HOSTS);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.DESCRIBE_HOST_GROUP_RULES, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.GET);
                            put(Const.Path, com.volcengine.model.tls.Const.DESCRIBE_HOST_GROUP_RULES);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.DESCRIBE_HOSTS, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.GET);
                            put(Const.Path, com.volcengine.model.tls.Const.DESCRIBE_HOSTS);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.CREATE_ALARM_NOTIFY_GROUP, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.POST);
                            put(Const.Path, com.volcengine.model.tls.Const.CREATE_ALARM_NOTIFY_GROUP);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.MODIFY_ALARM_NOTIFY_GROUP, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.PUT);
                            put(Const.Path, com.volcengine.model.tls.Const.MODIFY_ALARM_NOTIFY_GROUP);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.DESCRIBE_ALARM_NOTIFY_GROUPS, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.GET);
                            put(Const.Path, com.volcengine.model.tls.Const.DESCRIBE_ALARM_NOTIFY_GROUPS);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.DELETE_ALARM_NOTIFY_GROUP, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.DELETE);
                            put(Const.Path, com.volcengine.model.tls.Const.DELETE_ALARM_NOTIFY_GROUP);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.CREATE_ALARM, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.POST);
                            put(Const.Path, com.volcengine.model.tls.Const.CREATE_ALARM);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.MODIFY_ALARM, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.PUT);
                            put(Const.Path, com.volcengine.model.tls.Const.MODIFY_ALARM);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.DESCRIBE_ALARMS, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.GET);
                            put(Const.Path, com.volcengine.model.tls.Const.DESCRIBE_ALARMS);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.DELETE_ALARM, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.DELETE);
                            put(Const.Path, com.volcengine.model.tls.Const.DELETE_ALARM);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.CREATE_ALARM_CONTENT_TEMPLATE, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.POST);
                            put(Const.Path, com.volcengine.model.tls.Const.CREATE_ALARM_CONTENT_TEMPLATE);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.MODIFY_ALARM_CONTENT_TEMPLATE, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.PUT);
                            put(Const.Path, com.volcengine.model.tls.Const.MODIFY_ALARM_CONTENT_TEMPLATE);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.DELETE_ALARM_CONTENT_TEMPLATE, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.DELETE);
                            put(Const.Path, com.volcengine.model.tls.Const.DELETE_ALARM_CONTENT_TEMPLATE);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.DESCRIBE_ALARM_CONTENT_TEMPLATES, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.GET);
                            put(Const.Path, com.volcengine.model.tls.Const.DESCRIBE_ALARM_CONTENT_TEMPLATES);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.CREATE_ALARM_WEBHOOK_INTEGRATION, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.POST);
                            put(Const.Path, com.volcengine.model.tls.Const.CREATE_ALARM_WEBHOOK_INTEGRATION);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.MODIFY_ALARM_WEBHOOK_INTEGRATION, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.PUT);
                            put(Const.Path, com.volcengine.model.tls.Const.MODIFY_ALARM_WEBHOOK_INTEGRATION);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.DELETE_ALARM_WEBHOOK_INTEGRATION, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.DELETE);
                            put(Const.Path, com.volcengine.model.tls.Const.DELETE_ALARM_WEBHOOK_INTEGRATION);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.DESCRIBE_ALARM_WEBHOOK_INTEGRATIONS, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.GET);
                            put(Const.Path, com.volcengine.model.tls.Const.DESCRIBE_ALARM_WEBHOOK_INTEGRATIONS);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.PUT_LOGS, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.POST);
                            put(Const.Path, com.volcengine.model.tls.Const.PUT_LOGS);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.DESCRIBE_CURSOR, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.POST);
                            put(Const.Path, com.volcengine.model.tls.Const.DESCRIBE_CURSOR);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.DESCRIBE_CURSOR_TIME,
                    jsonApiInfo(Const.GET, com.volcengine.model.tls.Const.DESCRIBE_CURSOR_TIME));
            put(com.volcengine.model.tls.Const.CONSUME_LOGS, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.GET);
                            put(Const.Path, com.volcengine.model.tls.Const.CONSUME_LOGS);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.CONSUME_ORIGIN_LOGS, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.GET);
                            put(Const.Path, com.volcengine.model.tls.Const.CONSUME_ORIGIN_LOGS);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.SEARCH_LOGS, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.POST);
                            put(Const.Path, com.volcengine.model.tls.Const.SEARCH_LOGS);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.MANUAL_SHARD_SPLIT, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.POST);
                            put(Const.Path, com.volcengine.model.tls.Const.MANUAL_SHARD_SPLIT);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.OPEN_KAFKA_CONSUMER, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.PUT);
                            put(Const.Path, com.volcengine.model.tls.Const.OPEN_KAFKA_CONSUMER);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.CLOSE_KAFKA_CONSUMER, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.PUT);
                            put(Const.Path, com.volcengine.model.tls.Const.CLOSE_KAFKA_CONSUMER);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.DESCRIBE_KAFKA_CONSUMER, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.GET);
                            put(Const.Path, com.volcengine.model.tls.Const.DESCRIBE_KAFKA_CONSUMER);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.CREATE_DOWNLOAD_TASK, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.POST);
                            put(Const.Path, com.volcengine.model.tls.Const.CREATE_DOWNLOAD_TASK);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.DESCRIBE_DOWNLOAD_TASKS, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.GET);
                            put(Const.Path, com.volcengine.model.tls.Const.DESCRIBE_DOWNLOAD_TASKS);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.DESCRIBE_DOWNLOAD_URL, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.GET);
                            put(Const.Path, com.volcengine.model.tls.Const.DESCRIBE_DOWNLOAD_URL);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.CANCEL_DOWNLOAD_TASK, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.POST);
                            put(Const.Path, com.volcengine.model.tls.Const.CANCEL_DOWNLOAD_TASK);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.CREATE_LOG_BACK_FLOW_TASK,
                    jsonApiInfo(Const.POST, com.volcengine.model.tls.Const.CREATE_LOG_BACK_FLOW_TASK));
            put(com.volcengine.model.tls.Const.DELETE_LOG_BACK_FLOW_TASK,
                    jsonApiInfo(Const.DELETE, com.volcengine.model.tls.Const.DELETE_LOG_BACK_FLOW_TASK));
            put(com.volcengine.model.tls.Const.DESCRIBE_LOG_BACK_FLOW_TASKS,
                    jsonApiInfo(Const.GET, com.volcengine.model.tls.Const.DESCRIBE_LOG_BACK_FLOW_TASKS));
            put(com.volcengine.model.tls.Const.MODIFY_LOG_BACK_FLOW_TASK,
                    jsonApiInfo(Const.PUT, com.volcengine.model.tls.Const.MODIFY_LOG_BACK_FLOW_TASK));
            put(com.volcengine.model.tls.Const.CREATE_IMPORT_TASK, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.POST);
                            put(Const.Path, com.volcengine.model.tls.Const.CREATE_IMPORT_TASK);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.DESCRIBE_IMPORT_TASKS, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.GET);
                            put(Const.Path, com.volcengine.model.tls.Const.DESCRIBE_IMPORT_TASKS);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.MODIFY_IMPORT_TASK, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.PUT);
                            put(Const.Path, com.volcengine.model.tls.Const.MODIFY_IMPORT_TASK);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.DELETE_IMPORT_TASK, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.DELETE);
                            put(Const.Path, com.volcengine.model.tls.Const.DELETE_IMPORT_TASK);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.DESCRIBE_IMPORT_TASK, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.GET);
                            put(Const.Path, com.volcengine.model.tls.Const.DESCRIBE_IMPORT_TASK);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.CREATE_ETL_TASK, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.POST);
                            put(Const.Path, com.volcengine.model.tls.Const.CREATE_ETL_TASK);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.DESCRIBE_ETL_TASKS, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.GET);
                            put(Const.Path, com.volcengine.model.tls.Const.DESCRIBE_ETL_TASKS);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.DESCRIBE_ETL_TASK, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.GET);
                            put(Const.Path, com.volcengine.model.tls.Const.DESCRIBE_ETL_TASK);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.MODIFY_ETL_TASK, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.PUT);
                            put(Const.Path, com.volcengine.model.tls.Const.MODIFY_ETL_TASK);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.DELETE_ETL_TASK, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.DELETE);
                            put(Const.Path, com.volcengine.model.tls.Const.DELETE_ETL_TASK);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.MODIFY_ETL_TASK_STATUS, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.PUT);
                            put(Const.Path, com.volcengine.model.tls.Const.MODIFY_ETL_TASK_STATUS);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.CREATE_SHIPPER, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.POST);
                            put(Const.Path, com.volcengine.model.tls.Const.CREATE_SHIPPER);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.DESCRIBE_SHIPPERS, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.GET);
                            put(Const.Path, com.volcengine.model.tls.Const.DESCRIBE_SHIPPERS);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.DESCRIBE_SHIPPER, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.GET);
                            put(Const.Path, com.volcengine.model.tls.Const.DESCRIBE_SHIPPER);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.DELETE_SHIPPER, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.DELETE);
                            put(Const.Path, com.volcengine.model.tls.Const.DELETE_SHIPPER);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.MODIFY_SHIPPER, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.PUT);
                            put(Const.Path, com.volcengine.model.tls.Const.MODIFY_SHIPPER);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.MODIFY_SCHEDULE_SQL_TASK, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.PUT);
                            put(Const.Path, com.volcengine.model.tls.Const.MODIFY_SCHEDULE_SQL_TASK);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.DESCRIBE_HISTOGRAM, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.POST);
                            put(Const.Path, com.volcengine.model.tls.Const.DESCRIBE_HISTOGRAM);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.DESCRIBE_HISTOGRAM_V1, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.POST);
                            put(Const.Path, com.volcengine.model.tls.Const.DESCRIBE_HISTOGRAM_V1);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.MODIFY_HOST_GROUPS_AUTO_UPDATE, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.PUT);
                            put(Const.Path, com.volcengine.model.tls.Const.MODIFY_HOST_GROUPS_AUTO_UPDATE);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.DESCRIBE_LOG_CONTEXT, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.POST);
                            put(Const.Path, com.volcengine.model.tls.Const.DESCRIBE_LOG_CONTEXT);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.WEB_TRACKS, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.POST);
                            put(Const.Path, com.volcengine.model.tls.Const.WEB_TRACKS);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.CREATE_CONSUMER_GROUP, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.POST);
                            put(Const.Path, com.volcengine.model.tls.Const.CREATE_CONSUMER_GROUP);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.DELETE_CONSUMER_GROUP, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.DELETE);
                            put(Const.Path, com.volcengine.model.tls.Const.DELETE_CONSUMER_GROUP);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.MODIFY_CONSUMER_GROUP, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.PUT);
                            put(Const.Path, com.volcengine.model.tls.Const.MODIFY_CONSUMER_GROUP);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.DESCRIBE_CONSUMER_GROUPS, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.GET);
                            put(Const.Path, com.volcengine.model.tls.Const.DESCRIBE_CONSUMER_GROUPS);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.CONSUMER_HEARTBEAT, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.POST);
                            put(Const.Path, com.volcengine.model.tls.Const.CONSUMER_HEARTBEAT);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.DESCRIBE_CHECKPOINT, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.POST);
                            put(Const.Path, com.volcengine.model.tls.Const.DESCRIBE_CHECKPOINT);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.MODIFY_CHECKPOINT, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.PUT);
                            put(Const.Path, com.volcengine.model.tls.Const.MODIFY_CHECKPOINT);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.RESET_CHECKPOINT, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.PUT);
                            put(Const.Path, com.volcengine.model.tls.Const.RESET_CHECKPOINT);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.GET_ACCOUNT_STATUS, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.GET);
                            put(Const.Path, com.volcengine.model.tls.Const.GET_ACCOUNT_STATUS);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));

            put(com.volcengine.model.tls.Const.DESCRIBE_TRACE_INSTANCE, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.GET);
                            put(Const.Path, com.volcengine.model.tls.Const.DESCRIBE_TRACE_INSTANCE);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.CREATE_TRACE_INSTANCE, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.POST);
                            put(Const.Path, com.volcengine.model.tls.Const.CREATE_TRACE_INSTANCE);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.MODIFY_TRACE_INSTANCE, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.PUT);
                            put(Const.Path, com.volcengine.model.tls.Const.MODIFY_TRACE_INSTANCE);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.DELETE_TRACE_INSTANCE, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.DELETE);
                            put(Const.Path, com.volcengine.model.tls.Const.DELETE_TRACE_INSTANCE);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.DESCRIBE_TRACE_INSTANCES, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.GET);
                            put(Const.Path, com.volcengine.model.tls.Const.DESCRIBE_TRACE_INSTANCES);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.DESCRIBE_TRACE, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.GET);
                            put(Const.Path, com.volcengine.model.tls.Const.DESCRIBE_TRACE);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
            put(com.volcengine.model.tls.Const.ACTIVE_TLS_ACCOUNT, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, Const.POST);
                            put(Const.Path, com.volcengine.model.tls.Const.ACTIVE_TLS_ACCOUNT);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));

            // text_analysis (AppInstance / AppSceneMeta / SessionAnswer)
            put(com.volcengine.model.tls.Const.CREATE_APP_INSTANCE,
                    jsonApiInfo(Const.POST, com.volcengine.model.tls.Const.CREATE_APP_INSTANCE));
            put(com.volcengine.model.tls.Const.MODIFY_APP_INSTANCE,
                    jsonApiInfo(Const.PUT, com.volcengine.model.tls.Const.MODIFY_APP_INSTANCE));
            put(com.volcengine.model.tls.Const.DELETE_APP_INSTANCE,
                    jsonApiInfo(Const.DELETE, com.volcengine.model.tls.Const.DELETE_APP_INSTANCE));
            put(com.volcengine.model.tls.Const.DESCRIBE_APP_INSTANCES,
                    jsonApiInfo(Const.GET, com.volcengine.model.tls.Const.DESCRIBE_APP_INSTANCES));
            put(com.volcengine.model.tls.Const.CREATE_APP_SCENE_META,
                    jsonApiInfo(Const.POST, com.volcengine.model.tls.Const.CREATE_APP_SCENE_META));
            put(com.volcengine.model.tls.Const.MODIFY_APP_SCENE_META,
                    jsonApiInfo(Const.PUT, com.volcengine.model.tls.Const.MODIFY_APP_SCENE_META));
            put(com.volcengine.model.tls.Const.DELETE_APP_SCENE_META,
                    jsonApiInfo(Const.DELETE, com.volcengine.model.tls.Const.DELETE_APP_SCENE_META));
            put(com.volcengine.model.tls.Const.DESCRIBE_APP_SCENE_METAS,
                    jsonApiInfo(Const.GET, com.volcengine.model.tls.Const.DESCRIBE_APP_SCENE_METAS));
            put(com.volcengine.model.tls.Const.DESCRIBE_APP_SCENE_META,
                    jsonApiInfo(Const.GET, com.volcengine.model.tls.Const.DESCRIBE_APP_SCENE_META));
            put(com.volcengine.model.tls.Const.DESCRIBE_SESSION_ANSWER,
                    jsonApiInfo(Const.POST, com.volcengine.model.tls.Const.DESCRIBE_SESSION_ANSWER));
        }

    };
}
