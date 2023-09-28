package com.volcengine.model.tls;

public class Const {
    //interface-project
    public static final String CREATE_PROJECT = "/CreateProject";
    public static final String MODIFY_PROJECT = "/ModifyProject";
    public static final String DESCRIBE_PROJECT = "/DescribeProject";
    public static final String DESCRIBE_PROJECTS = "/DescribeProjects";
    public static final String DELETE_PROJECT = "/DeleteProject";

    //interface-topic
    public static final String CREATE_TOPIC = "/CreateTopic";
    public static final String MODIFY_TOPIC = "/ModifyTopic";
    public static final String DESCRIBE_TOPIC = "/DescribeTopic";
    public static final String DESCRIBE_TOPICS = "/DescribeTopics";
    public static final String DELETE_TOPIC = "/DeleteTopic";
    public static final String DESCRIBE_SHARDS = "/DescribeShards";
    public static final String DESCRIBE_LOG_CONTEXT = "/DescribeLogContext";
    public static final String WEB_TRACKS = "/WebTracks";
    public static final String DESCRIBE_HISTOGRAM = "/DescribeHistogram";

    //interface-index
    public static final String CREATE_INDEX = "/CreateIndex";
    public static final String MODIFY_INDEX = "/ModifyIndex";
    public static final String DESCRIBE_INDEX = "/DescribeIndex";
    public static final String DELETE_INDEX = "/DeleteIndex";


    //interface-rule
    public static final String CREATE_RULE = "/CreateRule";
    public static final String MODIFY_RULE = "/ModifyRule";
    public static final String DESCRIBE_RULE = "/DescribeRule";
    public static final String DELETE_RULE = "/DeleteRule";
    public static final String DESCRIBE_RULES = "/DescribeRules";
    public static final String APPLY_RULE_TO_HOES_GROUPS = "/ApplyRuleToHostGroups";
    public static final String DELETE_RULE_FROM_HOST_GROUPS = "/DeleteRuleFromHostGroups";

    //interface-host group
    public static final String CREATE_HOST_GROUP = "/CreateHostGroup";
    public static final String MODIFY_HOST_GROUP = "/ModifyHostGroup";
    public static final String DESCRIBE_HOST_GROUP = "/DescribeHostGroup";
    public static final String DELETE_HOST_GROUP = "/DeleteHostGroup";
    public static final String DESCRIBE_HOST_GROUPS = "/DescribeHostGroups";
    public static final String DESCRIBE_HOSTS = "/DescribeHosts";
    public static final String DELETE_HOST = "/DeleteHost";
    public static final String DESCRIBE_HOST_GROUP_RULES = "/DescribeHostGroupRules";
    public static final String MODIFY_HOST_GROUPS_AUTO_UPDATE = "/ModifyHostGroupsAutoUpdate";


    //interface-logs
    public static final String PUT_LOGS = "/PutLogs";
    public static final String DESCRIBE_CURSOR = "/DescribeCursor";
    public static final String CONSUME_LOGS = "/ConsumeLogs";
    public static final String SEARCH_LOGS = "/SearchLogs";
    //alarm and group
    public static final String CREATE_ALARM = "/CreateAlarm";
    public static final String MODIFY_ALARM = "/ModifyAlarm";
    public static final String DELETE_ALARM = "/DeleteAlarm";
    public static final String DESCRIBE_ALARMS = "/DescribeAlarms";
    public static final String CREATE_ALARM_NOTIFY_GROUP = "/CreateAlarmNotifyGroup";
    public static final String MODIFY_ALARM_NOTIFY_GROUP = "/ModifyAlarmNotifyGroup";
    public static final String DELETE_ALARM_NOTIFY_GROUP = "/DeleteAlarmNotifyGroup";
    public static final String DESCRIBE_ALARM_NOTIFY_GROUPS = "/DescribeAlarmNotifyGroups";

    // kafka consumer
    public static final String OPEN_KAFKA_CONSUMER = "/OpenKafkaConsumer";
    public static final String CLOSE_KAFKA_CONSUMER = "/CloseKafkaConsumer";
    public static final String DESCRIBE_KAFKA_CONSUMER = "/DescribeKafkaConsumer";

    // download task
    public static final String CREATE_DOWNLOAD_TASK = "/CreateDownloadTask";
    public static final String DESCRIBE_DOWNLOAD_TASKS = "/DescribeDownloadTasks";
    public static final String DESCRIBE_DOWNLOAD_URL = "/DescribeDownloadUrl";

    public static final String TLS = "TLS";
    public static final int CONNECTION_TIMEOUT_MS = 5000;
    public static final int SOCKET_TIMEOUT_MS = 5000;

    public static final String REGION = "Region";
    public static final String X_TLS_REQUESTID = "X-Tls-Requestid";
    public static final String PROJECTS_LIST_KEY = "Projects";
    public static final String TOPICS_LIST_KEY = "Topics";
    public static final String TOTAL = "Total";


    //projectInfo
    public static final String PROJECT_ID = "ProjectId";
    public static final String IS_FULL_NAME = "IsFullName";
    public static final String PAGE_NUMBER = "PageNumber";
    public static final String PAGE_SIZE = "PageSize";
    public static final String PROJECT_NAME = "ProjectName";
    public static final String DESCRIPTION = "Description";
    public static final String CREATE_TIME = "CreateTime";
    public static final String TOPIC_CNT = "TopicCount";
    public static final String INNER_NET_DOMIN = "InnerNetDomain";
    public static final String EMPTY_JSON = "{}";
    public static final String TOTAL_KEY = "Total";

    //topicInfo
    public static final String TOPIC_NAME = "TopicName";
    public static final String TOPIC_ID = "TopicId";
    public static final String TTL = "Ttl";
    public static final String SHARD_COUNT = "ShardCount";
    public static final String AUTO_SPLIT = "AutoSplit";
    public static final String MAX_SPLIT_SHARD = "MaxSplitShard";
    public static final String ENABLE_TRACKING = "EnableTracking";

    //shard
    public static final String SHARDS = "Shards";
    public static final String SHARD_ID = "ShardId";
    public static final String INCLUSIVE_BEGIN_KEY = "InclusiveBeginKey";
    public static final String EXCLUSIVE_END_KEY = "ExclusiveEndKey";
    public static final String STOP_WRITE_TIME = "StopWriteTime";

    //indexInfo
    public static final String FULL_TEXT = "FullText";
    public static final String KEY_VALUE = "KeyValue";
    public static final String VALUE_TYPE = "ValueType";
    public static final String KEY = "Key";
    public static final String VALUE = "Value";
    public static final String DELIMITER = "Delimiter";
    public static final String CASE_SENSITIVE = "CaseSensitive";
    public static final String INCLUDE_CHINESE = "IncludeChinese";
    public static final String SQL_FLAG = "SqlFlag";
    public static final String MODIFY_TIME = "ModifyTime";
    // ruleInfo
    public static final String RULE_ID = "RuleId";
    public static final String RULE_INFO = "RuleInfo";
    public static final String RULE_INFOS = "RuleInfos";
    public static final String RULE_NAME = "RuleName";
    public static final String PATHS = "Paths";
    public static final String LOG_TYPE = "LogType";
    public static final String EXTRACT_RULE = "ExtractRule";
    public static final String EXCLUDE_PATHS = "ExcludePaths";
    public static final String USER_DEFINE_RULE = "UserDefineRule";
    public static final String LOG_SAMPLE = "LogSample";
    public static final String INPUT_TYPE = "InputType";
    public static final String TYPE = "Type";
    public static final String CONTAINER_RULE = "ContainerRule";
    public static final String KEYS = "Keys";
    public static final String TIME_KEY = "TimeKey";
    public static final String TIME_FORMAT = "TimeFormat";
    public static final String FILTER_KEY_REGEX = "FilterKeyRegex";
    public static final String REGEX = "Regex";
    public static final String UN_MATCH_UP_LOAD_SWITCH = "UnMatchUpLoadSwitch";
    public static final String UN_MATCH_LOG_KEY = "UnMatchLogKey";
    public static final String CONTAINER_NAME_REGEX = "ContainerNameRegex";
    public static final String INCLUDE_CONTAINER_LABEL_REGEX = "IncludeContainerLabelRegex";
    public static final String EXCLUDE_CONTAINER_LABEL_REGEX = "ExcludeContainerLabelRegex";
    public static final String INCLUDE_CONTAINER_ENV_REGEX = "IncludeContainerEnvRegex";
    public static final String EXCLUDE_CONTAINER_ENV_REGEX = "ExcludeContainerEnvRegex";
    public static final String KUBERNETES_RULE = "KubernetesRule";
    public static final String NAMESPACE_NAME_REGEX = "NamespaceNameRegex";
    public static final String WORKLOAD_TYPE = "WorkloadType";
    public static final String WORKLOAD_NAME_REGEX = "WorkloadNameRegex";
    public static final String INCLUDE_POD_LABEL_REGEX = "IncludePodLabelRegex";
    public static final String EXCLUDE_POD_LABEL_REGEX = "ExcludePodLabelRegex";
    public static final String POD_NAME_REGEX = "PodNameRegex";
    public static final String LABEL_TAG = "LabelTag";
    public static final String ENV_TAG = "EnvTag";
    public static final String BEGIN_REGEX = "BeginRegex";
    public static final String LOG_REGEX = "LogRegex";
    public static final String PARSE_PATH_RULE = "ParsePathRule";
    public static final String PATH_SAMPLE = "PathSample";
    public static final String STREAM = "Stream";
    public static final String HASH_KEY = "HashKey";
    public static final String FORMAT = "Format";
    public static final String SHARD_HASH_KEY = "ShardHashKey";
    public static final String ENABLE_RAW_LOG = "EnableRawLog";
    public static final String FIELDS = "Fields";
    public static final String LOG_TEMPLATE = "LogTemplate";


    //hostGroupInfo
    public static final String HOST_GROUP_INFOS = "HostGroupInfos";
    public static final String HOST_GROUP_INFO = "HostGroupInfo";
    public static final String HOST_GROUP_ID = "HostGroupId";
    public static final String HOST_GROUP_IDS = "HostGroupIds";
    public static final String HOST_GROUP_NAME = "HostGroupName";
    public static final String HOST_GROUP_TYPE = "HostGroupType";
    public static final String HOST_IP_LIST = "HostIpList";
    public static final String HOST_COUNT = "HostCount";
    public static final String HOST_IDENTIFIER = "HostIdentifier";
    public static final String NORMAL_HEARTBEAT_STATUS_COUNT = "NormalHeartbeatStatusCount";
    public static final String ABNORMAL_HEARTBEAT_STATUS_COUNT = "AbnormalHeartbeatStatusCount";
    public static final String RULE_COUNT = "RuleCount";
    public static final String HOST_GROUP_HOST_RULES_INFO = "HostGroupHostsRulesInfo";
    public static final String HOST_GROUP_HOSTS_RULES_INFOS = "HostGroupHostsRulesInfos";
    public static final String HOST_INFOS = "HostInfos";
    public static final String IP = "Ip";
    public static final String LOG_COLLECTOR_VERSION = "LogCollectorVersion";
    public static final String HEARTBEAT_STATUS = "HeartbeatStatus";
    public static final String AUTO_UPDATE = "AutoUpdate";
    public static final String UPDATE_START_TIME = "UpdateStartTime";
    public static final String UPDATE_END_TIME = "UpdateEndTime";
    public static final String AGENT_LATEST_VERSION = "AgentLatestVersion";

    //alarmNotifyGroup
    public static final String ALARM_ID = "AlarmId";
    public static final String ALARM_NAME = "AlarmName";
    public static final String STATUS = "Status";
    public static final String QUERY_REQUEST = "QueryRequest";
    public static final String REQUEST_CYCLE = "RequestCycle";
    public static final String CONDITION = "Condition";
    public static final String TRIGGER_PERIOD = "TriggerPeriod";
    public static final String ALARM_NOTIFY_GROUP = "AlarmNotifyGroup";
    public static final String USER_DEFINE_MSG = "UserDefineMsg";
    public static final String ALARM_NOTIFY_GROUP_ID = "AlarmNotifyGroupId";
    public static final String ALARM_NOTIFY_GROUP_NAME = "AlarmNotifyGroupName";
    public static final String NOTIFY_TYPE = "NotifyType";
    public static final String RECEIVERS = "Receivers";
    public static final String RECEIVER_TYPE = "ReceiverType";
    public static final String RECEIVER_NAMES = "ReceiverNames";
    public static final String RECEIVER_NAME = "ReceiverName";
    public static final String RECEIVER_CHANNELS = "ReceiverChannels";
    public static final String START_TIME = "StartTime";
    public static final String END_TIME = "EndTime";
    public static final String QUERY = "Query";
    public static final String NUMBER = "Number";
    public static final String START_TIME_OFFSET = "StartTimeOffset";
    public static final String END_TIME_OFFSET = "EndTimeOffset";
    public static final String TIME = "Time";
    public static final String ALARM_NOTIFY_GROUPS = "AlarmNotifyGroups";
    public static final String ALARM_PERIOD = "AlarmPeriod";
    public static final String ALARMS = "Alarms";
    public static final String X_TLS_HASHKEY = "x-tls-hashkey";
    public static final String X_TLS_COMPRESS_TYPE = "x-tls-compresstype";
    public static final String X_TLS_BODY_RAW_SIZE = "x-tls-bodyrawsize";
    public static final String WEBHOOK = "Webhook";
    public static final String CONSUME_TOPIC = "ConsumeTopic";
    public static final String INTERVAL = "Interval";
    public static final String TOTAL_COUNT = "TotalCount";
    public static final String HISTOGRAM_INFOS = "HistogramInfos";
    public static final String ALLOW_CONSUME = "AllowConsume";

    //log
    public static final String CURSOR = "Cursor";
    public static final String END_CURSOR = "EndCursor";
    public static final String FROM = "From";
    public static final String LOG_GROUP_COUNT = "LogGroupCount";
    public static final String COMPRESSION = "Compression";
    public static final String X_TLS_CURSOR = "X-Tls-Cursor";
    public static final String X_TLS_COUNT = "X-Tls-Count";
    public static final String LIMIT = "Limit";
    public static final String CONTEXT = "Context";
    public static final String SORT = "Sort";
    public static final String RESULT_STATUS = "ResultStatus";
    public static final String HIT_COUNT = "HitCount";
    public static final String LIST_OVER = "ListOver";
    public static final String ANALYSIS = "Analysis";
    public static final String COUNT = "Count";
    public static final String LOGS = "Logs";
    public static final String ANALYSIS_RESULT = "AnalysisResult";
    public static final String SCHEMA = "Schema";
    public static final String DATA = "Data";
    public static final String LZ4 = "lz4";
    public static final String MD5 = "MD5";
    public static final String HEADER_CONTENT_MD5 = "Content-MD5";
    public static final String SOURCE = "Source";
    public static final String PREV_OVER = "PrevOver";
    public static final String NEXT_OVER = "NextOver";
    public static final String LOG_CONTEXT_INFOS = "LogContextInfos";
    public static final String CONTEXT_FLOW = "ContextFlow";
    public static final String PACKAGE_OFFSET = "PackageOffset";
    public static final String PREV_LOGS = "PrevLogs";
    public static final String NEXT_LOGS = "NextLogs";

    //download task
    public static final String TASK_ID = "TaskId";
    public static final String TASK_NAME = "TaskName";
    public static final String DATA_FORMAT = "DataFormat";
    public static final String TASK_STATUS = "TaskStatus";
    public static final String LOG_SIZE = "LogSize";
    public static final String LOG_COUNT = "LogCount";
    public static final String DOWNLOAD_URL = "DownloadUrl";
    public static final String TASKS = "Tasks";


    public static final String ERROR_CODE = "ErrorCode";
    public static final String ERROR_MESSAGE = "ErrorMessage";
    public static final int HTTP_STATUS_OK = 200;
    public static final String TOPIC = "Topic";
    public static final String DATE_FORMAT = "yyyyMMdd";
    public static final String SEPARATOR = "-";
    public static final String HEADER_API_VERSION = "x-tls-apiversion";
    public static final String API_VERSION_V_0_3_0 = "0.3.0";
    public static final String API_VERSION_V_0_2_0 = "0.2.0";
}
