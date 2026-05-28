package com.volcengine.service.tls;

import com.volcengine.model.tls.ClientConfig;
import com.volcengine.model.tls.DescribeRulesRequest;
import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.request.*;
import com.volcengine.model.tls.response.*;
import com.volcengine.model.tls.request.DeleteShipperRequest;
import com.volcengine.model.tls.response.DeleteShipperResponse;
import com.volcengine.model.tls.request.TagResourcesRequest;
import com.volcengine.model.tls.response.TagResourcesResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.conn.HttpClientConnectionManager;

import java.util.Map;

public interface TLSLogClient {
    static UnsupportedOperationException unsupportedOperation(String method) {
        return new UnsupportedOperationException(method + " is not supported by this TLSLogClient implementation");
    }

    /**
     * client配置，key和超时
     */
    void configClient(ClientConfig config);

    void close();

    void setHttpClient(HttpClient httpClient);

    default void setHttpClientConnectionManager(HttpClientConnectionManager connectionManager,
                                                boolean disableContentCompression) {
        throw unsupportedOperation("setHttpClientConnectionManager");
    }

    void resetAccessKeyToken(String accessKeyID, String accessKeySecret, String securityToken);

    void setApiKey(String apiKey);

    void setTimeout(int socketTimeout, int connectionTimeout);

    /**
     * L4-D10：与 Go SDK CommonRequest.Headers 对齐的实例级自定义 header。
     * 合并语义：user-first → SDK overrides（SDK 内部 header 后写优先）。
     */
    default void setCustomHeaders(Map<String, String> headers) {
        throw unsupportedOperation("setCustomHeaders");
    }

    default void addCustomHeader(String key, String value) {
        throw unsupportedOperation("addCustomHeader");
    }

    default Map<String, String> getCustomHeaders() {
        return java.util.Collections.emptyMap();
    }

    /**
     * 日志管理
     * @param request
     */
    PutLogsResponse putLogs(PutLogsRequest request) throws LogException;

    /**
     * 标签管理
     * @param request
     */
    TagResourcesResponse tagResources(TagResourcesRequest request) throws LogException;

    PutLogsResponse putLogsV2(PutLogsRequestV2 request) throws LogException;

    DescribeCursorResponse describeCursor(DescribeCursorRequest request) throws LogException;

    default DescribeCursorTimeResponse describeCursorTime(DescribeCursorTimeRequest request) throws LogException {
        throw unsupportedOperation("describeCursorTime");
    }

    ConsumeLogsResponse consumeLogs(ConsumeLogsRequest request) throws LogException;

    SearchLogsResponse searchLogs(SearchLogsRequest request) throws LogException;

    SearchLogsResponseV2 searchLogsV2(SearchLogsRequest request) throws LogException;

    DescribeShardsResponse describeShards(DescribeShardsRequest request) throws LogException;

    DescribeLogContextResponse describeLogContext(DescribeLogContextRequest request) throws LogException;

    WebTracksResponse webTracks(WebTracksRequest request) throws LogException;

    @Deprecated
    DescribeHistogramResponse describeHistogram(DescribeHistogramRequest request) throws LogException;

    DescribeHistogramV1Response describeHistogramV1(DescribeHistogramV1Request request) throws LogException;

    /**
     * project
     *
     * @param request
     */
    CreateProjectResponse createProject(CreateProjectRequest request) throws LogException;

    DeleteProjectResponse deleteProject(DeleteProjectRequest request) throws LogException;

    ModifyProjectResponse modifyProject(ModifyProjectRequest request) throws LogException;

    DescribeProjectResponse describeProject(DescribeProjectRequest request) throws LogException;

    DescribeProjectsResponse describeProjects(DescribeProjectsRequest request) throws LogException;

    /**
     * topic
     */
    CreateTopicResponse createTopic(CreateTopicRequest request) throws LogException;

    DeleteTopicResponse deleteTopic(DeleteTopicRequest request) throws LogException;

    ModifyTopicResponse modifyTopic(ModifyTopicRequest request) throws LogException;

    DescribeTopicResponse describeTopic(DescribeTopicRequest request) throws LogException;

    DescribeTopicsResponse describeTopics(DescribeTopicsRequest request) throws LogException;

    /**
     * index
     *
     * @param request
     */
    CreateIndexResponse createIndex(CreateIndexRequest request) throws LogException;

    DeleteIndexResponse deleteIndex(DeleteIndexRequest request) throws LogException;

    ModifyIndexResponse modifyIndex(ModifyIndexRequest request) throws LogException;

    DescribeIndexResponse describeIndex(DescribeIndexRequest request) throws LogException;

    CreateProcessorResponse createProcessor(CreateProcessorRequest request) throws LogException;

    DeleteProcessorResponse deleteProcessor(DeleteProcessorRequest request) throws LogException;

    ModifyProcessorResponse modifyProcessor(ModifyProcessorRequest request) throws LogException;

    DescribeProcessorResponse describeProcessor(DescribeProcessorRequest request) throws LogException;

    DescribeProcessorsResponse describeProcessors(DescribeProcessorsRequest request) throws LogException;

    ExecProcessorResponse execProcessor(ExecProcessorRequest request) throws LogException;

    OperateProcessorResponse operateProcessor(OperateProcessorRequest request) throws LogException;

    DescribeTopicsByProcessorResponse describeTopicsByProcessor(DescribeTopicsByProcessorRequest request) throws LogException;

    BindTopicProcessorResponse bindTopicProcessor(BindTopicProcessorRequest request) throws LogException;

    BatchBindTopicsResponse batchBindTopics(BatchBindTopicsRequest request) throws LogException;

    UnbindTopicProcessorResponse unbindTopicProcessor(UnbindTopicProcessorRequest request) throws LogException;

    DescribeProcessorResponse describeProcessorByTopic(DescribeProcessorByTopicRequest request) throws LogException;

    DescribeProcessorBindingsResponse describeProcessorBindings(DescribeProcessorBindingsRequest request) throws LogException;

    DescribeProcessorFunctionsResponse describeProcessorFunctions(DescribeProcessorFunctionsRequest request) throws LogException;

    /**
     * 采集配置
     */

    CreateRuleResponse createRule(CreateRuleRequest request) throws LogException;

    DeleteRuleResponse deleteRule(DeleteRuleRequest request) throws LogException;

    ModifyRuleResponse modifyRule(ModifyRuleRequest request) throws LogException;

    DescribeRuleResponse describeRule(DescribeRuleRequest request) throws LogException;

    default DescribeRuleResponseV2 describeRuleV2(DescribeRuleRequestV2 request) throws LogException {
        throw unsupportedOperation("describeRuleV2");
    }

    default DescribeBoundHostGroupsResponse describeBoundHostGroups(DescribeBoundHostGroupsRequest request) throws LogException {
        throw unsupportedOperation("describeBoundHostGroups");
    }

    DescribeRulesResponse describeRules(DescribeRulesRequest request) throws LogException;

    ApplyRuleToHostGroupsResponse applyRuleToHostGroups(ApplyRuleToHostGroupsRequest request) throws LogException;

    DeleteRuleFromHostGroupsResponse deleteRuleFromHostGroups(DeleteRuleFromHostGroupsRequest request) throws LogException;

    ModifyETLTaskResponse modifyETLTask(ModifyETLTaskRequest request) throws LogException;

    /**
     * 机器组
     */
    CreateHostGroupResponse createHostGroup(CreateHostGroupRequest request) throws LogException;

    DeleteHostGroupResponse deleteHostGroup(DeleteHostGroupRequest request) throws LogException;

    ModifyHostGroupResponse modifyHostGroup(ModifyHostGroupRequest request) throws LogException;

    DescribeHostGroupResponse describeHostGroup(DescribeHostGroupRequest request) throws LogException;

    DescribeHostGroupsResponse describeHostGroups(DescribeHostGroupsRequest request) throws LogException;

    default DescribeHostGroupResponseV2 describeHostGroupV2(DescribeHostGroupRequestV2 request) throws LogException {
        throw unsupportedOperation("describeHostGroupV2");
    }

    default DescribeHostGroupsResponseV2 describeHostGroupsV2(DescribeHostGroupsRequestV2 request) throws LogException {
        throw unsupportedOperation("describeHostGroupsV2");
    }

    DescribeHostsResponse describeHosts(DescribeHostsRequest request) throws LogException;

    DeleteHostResponse deleteHost(DeleteHostRequest request) throws LogException;

    DescribeHostGroupRulesResponse describeHostGroupRules(DescribeHostGroupRulesRequest request) throws LogException;

    ModifyHostGroupsAutoUpdateResponse modifyHostGroupsAutoUpdate(ModifyHostGroupsAutoUpdateRequest request) throws LogException;

    DeleteAbnormalHostsResponse deleteAbnormalHosts(DeleteAbnormalHostsRequest request) throws LogException;

    /**
     * 告警
     */

    CreateAlarmResponse createAlarm(CreateAlarmRequest request) throws LogException;

    DeleteAlarmResponse deleteAlarm(DeleteAlarmRequest request) throws LogException;

    ModifyAlarmResponse modifyAlarm(ModifyAlarmRequest request) throws LogException;

    DescribeAlarmsResponse describeAlarms(DescribeAlarmsRequest request) throws LogException;

    CreateAlarmNotifyGroupResponse createAlarmNotifyGroup(CreateAlarmNotifyGroupRequest request) throws LogException;

    DeleteAlarmNotifyGroupResponse deleteAlarmNotifyGroup(DeleteAlarmNotifyGroupRequest request) throws LogException;

    ModifyAlarmNotifyGroupResponse modifyAlarmNotifyGroup(ModifyAlarmNotifyGroupRequest request) throws LogException;

    DescribeAlarmNotifyGroupsResponse describeAlarmNotifyGroups(DescribeAlarmNotifyGroupsRequest request) throws LogException;

    CreateAlarmContentTemplateResponse createAlarmContentTemplate(CreateAlarmContentTemplateRequest request) throws LogException;

    CreateAlarmWebhookIntegrationResponse createAlarmWebhookIntegration(CreateAlarmWebhookIntegrationRequest request) throws LogException;

    DeleteAlarmContentTemplateResponse deleteAlarmContentTemplate(DeleteAlarmContentTemplateRequest request) throws LogException;

    DeleteAlarmWebhookIntegrationResponse deleteAlarmWebhookIntegration(DeleteAlarmWebhookIntegrationRequest request) throws LogException;

    DescribeAlarmContentTemplatesResponse describeAlarmContentTemplates(DescribeAlarmContentTemplatesRequest request) throws LogException;

    DescribeAlarmWebhookIntegrationsResponse describeAlarmWebhookIntegrations(DescribeAlarmWebhookIntegrationsRequest request) throws LogException;

    ModifyAlarmContentTemplateResponse modifyAlarmContentTemplate(ModifyAlarmContentTemplateRequest request) throws LogException;

    /**
     * 告警Webhook集成
     */
    ModifyAlarmWebhookIntegrationResponse modifyAlarmWebhookIntegration(ModifyAlarmWebhookIntegrationRequest request) throws LogException;

    /**
     * Kafka协议消费
     */
    OpenKafkaConsumerResponse openKafkaConsumer(OpenKafkaConsumerRequest request) throws LogException;

    CloseKafkaConsumerResponse closeKafkaConsumer(CloseKafkaConsumerRequest request) throws LogException;

    DescribeKafkaConsumerResponse describeKafkaConsumer(DescribeKafkaConsumerRequest request) throws LogException;

    /**
     * 日志下载
     */
    CreateDownloadTaskResponse createDownloadTask(CreateDownloadTaskRequest request) throws LogException;

    CancelDownloadTaskResponse cancelDownloadTask(CancelDownloadTaskRequest request) throws LogException;

    DescribeDownloadTasksResponse describeDownloadTasks(DescribeDownloadTasksRequest request) throws LogException;

    DescribeDownloadUrlResponse describeDownloadUrl(DescribeDownloadUrlRequest request) throws LogException;

    default CreateLogBackFlowTaskResponse createLogBackFlowTask(CreateLogBackFlowTaskRequest request) throws LogException {
        throw unsupportedOperation("createLogBackFlowTask");
    }

    default DeleteLogBackFlowTaskResponse deleteLogBackFlowTask(DeleteLogBackFlowTaskRequest request) throws LogException {
        throw unsupportedOperation("deleteLogBackFlowTask");
    }

    default DescribeLogBackFlowTasksResponse describeLogBackFlowTasks(DescribeLogBackFlowTasksRequest request) throws LogException {
        throw unsupportedOperation("describeLogBackFlowTasks");
    }

    default ModifyLogBackFlowTaskResponse modifyLogBackFlowTask(ModifyLogBackFlowTaskRequest request) throws LogException {
        throw unsupportedOperation("modifyLogBackFlowTask");
    }

    /**
     * 数据导入任务
     */
    CreateImportTaskResponse createImportTask(CreateImportTaskRequest request) throws LogException;

    DescribeImportTaskResponse describeImportTask(DescribeImportTaskRequest request) throws LogException;

    DescribeImportTasksResponse describeImportTasks(DescribeImportTasksRequest request) throws LogException;

    DeleteImportTaskResponse deleteImportTask(DeleteImportTaskRequest request) throws LogException;

    DescribeShippersResponse describeShippers(DescribeShippersRequest request) throws LogException;

    /**
     * 消费组消费
     */
    CreateConsumerGroupResponse createConsumerGroup(CreateConsumerGroupRequest request) throws LogException;

    DeleteConsumerGroupResponse deleteConsumerGroup(DeleteConsumerGroupRequest request) throws LogException;

    ModifyConsumerGroupResponse modifyConsumerGroup(ModifyConsumerGroupRequest request) throws LogException;

    DescribeConsumerGroupsResponse describeConsumerGroups(DescribeConsumerGroupsRequest request) throws LogException;

    ConsumerHeartbeatResponse consumerHeartbeat(ConsumerHeartbeatRequest request) throws LogException;

    DescribeCheckpointResponse describeCheckPoint(DescribeCheckpointRequest request) throws LogException;

    ModifyCheckpointResponse modifyCheckPoint(ModifyCheckpointRequest request) throws LogException;

    ResetCheckPointResponse resetCheckPoint(ResetCheckPointRequest request) throws LogException;

    ManualShardSplitResponse manualShardSplit(ManualShardSplitRequest request) throws LogException;

    ModifyImportTaskResponse modifyImportTask(ModifyImportTaskRequest request) throws LogException;

    DescribeETLTasksResponse describeETLTasks(DescribeETLTasksRequest request) throws LogException;

    DescribeETLTaskResponse describeETLTask(DescribeETLTaskRequest request) throws LogException;

    DeleteETLTaskResponse deleteETLTask(DeleteETLTaskRequest request) throws LogException;

    ModifyETLTaskStatusResponse modifyETLTaskStatus(ModifyETLTaskStatusRequest request) throws LogException;

    CreateETLTaskResponse createETLTask(CreateETLTaskRequest request) throws LogException;

    DeleteShipperResponse deleteShipper(DeleteShipperRequest request) throws LogException;

    DescribeShipperResponse describeShipper(DescribeShipperRequest request) throws LogException;

    ModifyShipperResponse modifyShipper(ModifyShipperRequest request) throws LogException;

    CreateShipperResponse createShipper(CreateShipperRequest request) throws LogException;

    AddTagsToResourceResponse addTagsToResource(AddTagsToResourceRequest request) throws LogException;
 
    RemoveTagsFromResourceResponse removeTagsFromResource(RemoveTagsFromResourceRequest request) throws LogException;
 
    ListTagsForResourcesResponse listTagsForResources(ListTagsForResourcesRequest request) throws LogException;

    UntagResourcesResponse untagResources(UntagResourcesRequest request) throws LogException;

    DescribeTraceInstancesResponse describeTraceInstances(DescribeTraceInstancesRequest request) throws LogException;

    ModifyTraceInstanceResponse modifyTraceInstance(ModifyTraceInstanceRequest request) throws LogException;
    
    CreateTraceInstanceResponse createTraceInstance(CreateTraceInstanceRequest request) throws LogException;
    
    DescribeTraceInstanceResponse describeTraceInstance(DescribeTraceInstanceRequest request) throws LogException;

    DeleteTraceInstanceResponse deleteTraceInstance(DeleteTraceInstanceRequest request) throws LogException;

    DescribeTraceResponse describeTrace(DescribeTraceRequest request) throws LogException;

    SearchTracesResponse searchTraces(SearchTracesRequest request) throws LogException;

    /**
     * 获取账户状态
     */
    GetAccountStatusResponse getAccountStatus(GetAccountStatusRequest request) throws LogException;

    /**
     * 激活TLS账户
     */
    ActiveTlsAccountResponse activeTlsAccount(ActiveTlsAccountRequest request) throws LogException;

    /**
     * 定时SQL任务
     */
    CreateScheduleSqlTaskResponse createScheduleSqlTask(CreateScheduleSqlTaskRequest request) throws LogException;

    ModifyScheduleSqlTaskResponse modifyScheduleSqlTask(ModifyScheduleSqlTaskRequest request) throws LogException;

    DeleteScheduleSqlTaskResponse deleteScheduleSqlTask(DeleteScheduleSqlTaskRequest request) throws LogException;

    DescribeScheduleSqlTaskResponse describeScheduleSqlTask(DescribeScheduleSqlTaskRequest request) throws LogException;

    DescribeScheduleSqlTasksResponse describeScheduleSqlTasks(DescribeScheduleSqlTasksRequest request) throws LogException;

    /**
     * 文本分析（智能分析）应用实例 / 场景元数据 / 会话问答
     */
    default CreateAppInstanceResponse createAppInstance(CreateAppInstanceRequest request) throws LogException {
        throw unsupportedOperation("createAppInstance");
    }

    default ModifyAppInstanceResponse modifyAppInstance(ModifyAppInstanceRequest request) throws LogException {
        throw unsupportedOperation("modifyAppInstance");
    }

    default DeleteAppInstanceResponse deleteAppInstance(DeleteAppInstanceRequest request) throws LogException {
        throw unsupportedOperation("deleteAppInstance");
    }

    default DescribeAppInstancesResponse describeAppInstances(DescribeAppInstancesRequest request) throws LogException {
        throw unsupportedOperation("describeAppInstances");
    }

    default CreateAppSceneMetaResponse createAppSceneMeta(CreateAppSceneMetaRequest request) throws LogException {
        throw unsupportedOperation("createAppSceneMeta");
    }

    default ModifyAppSceneMetaResponse modifyAppSceneMeta(ModifyAppSceneMetaRequest request) throws LogException {
        throw unsupportedOperation("modifyAppSceneMeta");
    }

    default DeleteAppSceneMetaResponse deleteAppSceneMeta(DeleteAppSceneMetaRequest request) throws LogException {
        throw unsupportedOperation("deleteAppSceneMeta");
    }

    default DescribeAppSceneMetasResponse describeAppSceneMetas(DescribeAppSceneMetasRequest request) throws LogException {
        throw unsupportedOperation("describeAppSceneMetas");
    }

    default DescribeAppSceneMetaResponse describeAppSceneMeta(DescribeAppSceneMetaRequest request) throws LogException {
        throw unsupportedOperation("describeAppSceneMeta");
    }

    /**
     * DescribeSessionAnswer 是 SSE 流式接口，当前 SDK 不通过阻塞 JSON 请求路径暴露该流。
     */
    default DescribeSessionAnswerResponse describeSessionAnswer(DescribeSessionAnswerRequest request) throws LogException {
        throw unsupportedOperation("describeSessionAnswer");
    }
}
