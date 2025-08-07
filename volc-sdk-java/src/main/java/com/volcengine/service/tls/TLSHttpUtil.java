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

    public RawResponse json(String api, List<NameValuePair> params, String body, Map<String, String> headers) {
        ApiInfo apiInfo = apiInfoList.get(api);
        if (apiInfo == null) {
            return new RawResponse(null, SdkError.ENOAPI.getNumber(), new Exception(SdkError.getErrorDesc(SdkError.ENOAPI)));
        }

        SignableRequest request = prepareRequest(api, params);
        if (headers != null && !headers.isEmpty()) {
            headers.forEach(request::setHeader);
        }
        request.setHeader("Content-Type", "application/json");
        request.setEntity(new StringEntity(body, "utf-8"));
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
                            put(Const.Method, Const.GET);
                            put(Const.Path, com.volcengine.model.tls.Const.DESCRIBE_CURSOR);
                            put(Const.Query, new ArrayList<NameValuePair>() {
                            });
                        }
                    }
            ));
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
                            put(Const.Method, Const.GET);
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
        }
    };
}
