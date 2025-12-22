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
    public static final String DESCRIBE_HISTOGRAM_V1 = "/DescribeHistogramV1";


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
    public static final String DELETE_ABNORMAL_HOSTS = "/DeleteAbnormalHosts";


    //interface-logs
    public static final String PUT_LOGS = "/PutLogs";
    public static final String DESCRIBE_CURSOR = "/DescribeCursor";
    public static final String CONSUME_LOGS = "/ConsumeLogs";
    public static final String CONSUME_ORIGIN_LOGS = "/ConsumeOriginalLogs";
    public static final String TLS_ORIGINAL_HEADER = "x-tls-original";
    public static final String SEARCH_LOGS = "/SearchLogs";
    public static final String MANUAL_SHARD_SPLIT = "/ManualShardSplit";
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
    public static final String CANCEL_DOWNLOAD_TASK = "/CancelDownloadTask";
    public static final String DESCRIBE_DOWNLOAD_TASKS = "/DescribeDownloadTasks";
    public static final String DESCRIBE_DOWNLOAD_URL = "/DescribeDownloadUrl";

    // import task
    public static final String DESCRIBE_IMPORT_TASKS = "/DescribeImportTasks";
    public static final String MODIFY_IMPORT_TASK = "/ModifyImportTask";
    public static final String IMPORT_SOURCE_INFO = "ImportSourceInfo";
    public static final String SOURCE_TYPE = "SourceType";
    public static final String TARGET_INFO = "TargetInfo";
    public static final String TOS_SOURCE_INFO = "TosSourceInfo";
    public static final String KAFKA_SOURCE_INFO = "KafkaSourceInfo";
    public static final String BUCKET = "bucket";
    public static final String PREFIX = "prefix";
    public static final String COMPRESS_TYPE = "compress_type";
    public static final String HOST = "host";
    public static final String GROUP = "group";
    public static final String KAFKA_TOPIC = "topic";
    public static final String ENCODE = "encode";
    public static final String PASSWORD = "password";
    public static final String PROTOCOL = "protocol";
    public static final String USERNAME = "username";
    public static final String MECHANISM = "mechanism";
    public static final String INSTANCE_ID = "instance_id";
    public static final String IS_NEED_AUTH = "is_need_auth";
    public static final String INITIAL_OFFSET = "initial_offset";
    public static final String TIME_SOURCE_DEFAULT = "time_source_default";

    // Consumer group
    public static final String CREATE_CONSUMER_GROUP = "/CreateConsumerGroup";
    public static final String DELETE_CONSUMER_GROUP = "/DeleteConsumerGroup";
    public static final String MODIFY_CONSUMER_GROUP = "/ModifyConsumerGroup";
    public static final String DESCRIBE_CONSUMER_GROUPS = "/DescribeConsumerGroups";
    public static final String CONSUMER_HEARTBEAT = "/ConsumerHeartbeat";
    public static final String DESCRIBE_CHECKPOINT = "/DescribeCheckPoint";
    public static final String MODIFY_CHECKPOINT = "/ModifyCheckPoint";
    public static final String GET_ACCOUNT_STATUS = "/GetAccountStatus";

    // trace instance
    public static final String TRACE_INSTANCE_ID = "TraceInstanceId";
    public static final String MODIFY_TRACE_INSTANCE = "/ModifyTraceInstance";
    public static final String DELETE_TRACE_INSTANCE = "/DeleteTraceInstance";
    public static final String CREATE_TRACE_INSTANCE = "/CreateTraceInstance";
    public static final String DESCRIBE_TRACE_INSTANCE = "/DescribeTraceInstance";

    public static final String ACTIVE_TLS_ACCOUNT = "/ActiveTlsAccount";
    public static final String TLS = "TLS";
    public static final int CONNECTION_TIMEOUT_MS = 60000;
    public static final int SOCKET_TIMEOUT_MS = 60000;

    public static final String REGION = "Region";
    public static final String X_TLS_REQUESTID = "X-Tls-Requestid";
    public static final String PROJECTS_LIST_KEY = "Projects";
    public static final String TOPICS_LIST_KEY = "Topics";
    public static final String TOTAL = "Total";
    public static final String IMPORT_CONFIG = "ImportConfig";
    public static final String IMPORT_TYPE = "ImportType";
    public static final String SOURCE_CONFIG = "SourceConfig";
    public static final String DESTINATION_CONFIG = "DestinationConfig";
    public static final String PROGRESS = "Progress";
    public static final String IMPORTED_LOG_COUNT = "ImportedLogCount";
    public static final String TOTAL_LOG_COUNT = "TotalLogCount";
    public static final String PERCENTAGE = "Percentage";


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
    public static final String PROJECT_TAGS = "Tags";

    //topicInfo
    public static final String TOPIC_NAME = "TopicName";
    public static final String TOPIC_ID = "TopicId";
    public static final String TTL = "Ttl";
    public static final String SHARD_COUNT = "ShardCount";
    public static final String AUTO_SPLIT = "AutoSplit";
    public static final String MAX_SPLIT_SHARD = "MaxSplitShard";
    public static final String ENABLE_TRACKING = "EnableTracking";
    public static final String TAGS = "Tags";
    public static final String LOG_PUBLIC_IP = "LogPublicIP";
    public static final String ENABLE_HOT_TTL = "EnableHotTtl";
    public static final String HOT_TTL = "HotTtl";
    public static final String COLD_TTL = "ColdTtl";
    public static final String ARCHIVE_TTL = "ArchiveTtl";
    public static final String KMS_ENCRYPT_CONF = "EncryptConf";
    public static final String KMS_ENABLE = "enable";
    public static final String KMS_ENCRYPT_TYPE = "encrypt_type";
    public static final String KMS_ENCRYPT_USER_CMK_CONF = "user_cmk_info";
    public static final String KMS_ENCRYPT_USER_CMK_CONF_USER_CMK_ID = "user_cmk_id";
    public static final String KMS_ENCRYPT_USER_CMK_CONF_TRN = "trn";
    public static final String KMS_ENCRYPT_USER_CMK_CONF_REGION_ID = "region_id";

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
    public static final String JSON_KEYS = "JsonKeys";
    public static final String INDEX_ALL = "IndexAll";
    public static final String USER_INNER_KEY_VALUE = "UserInnerKeyValue";
    public static final String MAX_TEXT_LEN = "MaxTextLen";
    public static final String ENABLE_AUTO_INDEX = "EnableAutoIndex";

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
    public static final String SKIP_LINE_COUNT = "SkipLineCount";
    public static final String TIME_SAMPLE = "TimeSample";
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
    public static final String ANNOTATION_TAG = "AnnotationTag";
    public static final String ENV_TAG = "EnvTag";
    public static final String QUOTE = "Quote";
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
    public static final String PLUGIN = "Plugin";
    public static final String PROCESSORS = "processors";
    public static final String ADVANCED = "Advanced";
    public static final String TAIL_FILES = "TailFiles";
    public static final String CLOSE_INACTIVE = "CloseInactive";
    public static final String CLOSE_REMOVED = "CloseRemoved";
    public static final String CLOSE_RENAMED = "CloseRenamed";
    public static final String CLOSE_EOF = "CloseEOF";
    public static final String CLOSE_TIMEOUT = "CloseTimeout";
    public static final String PAUSE = "Pause";


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
    public static final String SERVICE_LOGGING = "ServiceLogging";
    public static final String AGENT_LATEST_VERSION = "AgentLatestVersion";
    public static final String TIME_ZONE = "TimeZone";
    public static final String TIME_EXTRACT_REGEX = "TimeExtractRegex";
    public static final String ENABLE_NANOSECOND = "EnableNanosecond";
    public static final String EXCLUDE_POD_ANNOTATION_REGEX = "ExcludePodAnnotationRegex";
    public static final String INCLUDE_POD_ANNOTATION_REGEX = "IncludePodAnnotationRegex";
    public static final String ENABLE_ALL_LABEL_TAG = "EnableAllLabelTag";
    public static final String NO_LINE_TERMINATOR_EOF_MAX_TIME = "NoLineTerminatorEOFMaxTime";
    public static final String RAW_LOG_KEY = "RawLogKey";
    public static final String HOSTNAME_KEY = "HostnameKey";
    public static final String ENABLE_HOSTNAME = "EnableHostname";
    public static final String HOST_GROUP_LABEL_KEY = "HostGroupLabelKey";
    public static final String ENABLE_HOST_GROUP_LABEL = "EnableHostGroupLabel";
    public static final String TAIL_SIZE_KB = "TailSizeKb";
    public static final String IGNORE_OLDER = "IgnoreOlder";
    public static final String MULTI_COLLECTS_TYPE = "MultiCollectsType";

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
    public static final String SEVERITY = "Severity";
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
    public static final String IAM_PROJECT_NAME = "IamProjectName";
    public static final String QUERY = "Query";
    public static final String NUMBER = "Number";
    public static final String START_TIME_OFFSET = "StartTimeOffset";
    public static final String END_TIME_OFFSET = "EndTimeOffset";
    public static final String TIME_SPAN_TYPE = "TimeSpanType";
    public static final String TRUNCATED_TIME = "TruncatedTime";
    public static final String TIME = "Time";
    public static final String ALARM_NOTIFY_GROUPS = "AlarmNotifyGroups";
    public static final String ALARM_PERIOD = "AlarmPeriod";
    public static final String ALARMS = "Alarms";
    public static final String ALARM_PERIOD_DETAIL = "AlarmPeriodDetail";
    public static final String SMS = "SMS";
    public static final String PHONE = "Phone";
    public static final String EMAIL = "Email";
    public static final String GENERAL_WEBHOOK = "GeneralWebhook";
    public static final String X_TLS_HASHKEY = "x-tls-hashkey";
    public static final String X_TLS_COMPRESS_TYPE = "x-tls-compresstype";
    public static final String X_TLS_BODY_RAW_SIZE = "x-tls-bodyrawsize";
    public static final String Log_Count_Header = "log-count";
    public static final String Earliest_Log_Time_Header = "earliest-log-time";
    public static final String Latest_Log_Time_Header = "latest-log-time";
    public static final String WEBHOOK = "Webhook";
    public static final String CONSUME_TOPIC = "ConsumeTopic";
    public static final String INTERVAL = "Interval";
    public static final String TOTAL_COUNT = "TotalCount";
    public static final String HISTOGRAM = "Histogram";
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
    public static final String HIGH_LIGHT = "HighLight";
    public static final String ACCURATE_QUERY = "AccurateQuery";
    public static final String ELAPSED_MILLISECOND = "ElapsedMillisecond";
    public static final String LZ4 = "lz4";
    public static final String ZLIB = "zlib";
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

    // 消费组消费
    public static final String PROJECT_ID_UPPERCASE = "ProjectID";
    public static final String TOPIC_ID_UPPERCASE = "TopicID";
    public static final String SHARD_ID_UPPERCASE = "ShardID";
    public static final String TOPIC_ID_LIST = "TopicIDList";
    public static final String CONSUMER_GROUP_NAME = "ConsumerGroupName";
    public static final String CONSUMER_NAME = "ConsumerName";
    public static final String HEARTBEAT_TTL = "HeartbeatTTL";
    public static final String ORDERED_CONSUME = "OrderedConsume";
    public static final String CONSUMER = "Consumer";
    public static final String SHARD_IDS = "ShardIDs";
    public static final String CONSUMER_GROUPS = "ConsumerGroups";
    public static final String CHECKPOINT = "Checkpoint";
    public static final String UPDATE_TIME = "UpdateTime";
    public static final String CONSUME_FROM = "ConsumeFrom";
    public static final String HEARTBEAT_INTERVAL_IN_SECOND = "HeartbeatIntervalInSecond";
    public static final String DATA_FETCH_INTERVAL_IN_MILLISECOND = "DataFetchIntervalInMillisecond";
    public static final String FLUSH_CHECKPOINT_INTERVAL_IN_SECOND = "FlushCheckpointIntervalInSecond";
    public static final String MAX_FETCH_LOG_GROUP_COUNT = "MaxFetchLogGroupCount";
    public static final String STOP_TIMEOUT = "StopTimeout";

    // 公用常量
    public static final String ERROR_CODE = "ErrorCode";
    public static final String ERROR_MESSAGE = "ErrorMessage";
    public static final String INVALID_ARGUMENT = "InvalidArgument";
    public static final String ERROR_CONSUMER_GROUP_ALREADY_EXISTS = "ConsumerGroupAlreadyExists";
    public static final String ERROR_CONSUMER_HEARTBEAT_EXPIRED = "ConsumerHeartbeatExpired";
    public static final int HTTP_STATUS_OK = 200;
    public static final String TOPIC = "Topic";
    public static final String DATE_FORMAT = "yyyyMMdd";
    public static final String SEPARATOR = "-";
    public static final String HEADER_API_VERSION = "x-tls-apiversion";
    public static final String API_VERSION_V_0_3_0 = "0.3.0";
    public static final String API_VERSION_V_0_2_0 = "0.2.0";
}
