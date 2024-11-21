package com.volcengine.service.tls;

import com.volcengine.model.tls.ClientConfig;
import com.volcengine.model.tls.DescribeRulesRequest;
import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.request.*;
import com.volcengine.model.tls.response.*;

public interface TLSLogClient {
    /**
     * client配置，key和超时
     */
    void configClient(ClientConfig config);

    void resetAccessKeyToken(String accessKeyID, String accessKeySecret, String securityToken);

    void setTimeout(int socketTimeout, int connectionTimeout);

    /**
     * 日志管理
     * @param request
     */
    PutLogsResponse putLogs(PutLogsRequest request) throws LogException;

    PutLogsResponse putLogsV2(PutLogsRequestV2 request) throws LogException;

    DescribeCursorResponse describeCursor(DescribeCursorRequest request) throws LogException;

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

    /**
     * 采集配置
     */

    CreateRuleResponse createRule(CreateRuleRequest request) throws LogException;

    DeleteRuleResponse deleteRule(DeleteRuleRequest request) throws LogException;

    ModifyRuleResponse modifyRule(ModifyRuleRequest request) throws LogException;

    DescribeRuleResponse describeRule(DescribeRuleRequest request) throws LogException;

    DescribeRulesResponse describeRules(DescribeRulesRequest request) throws LogException;

    ApplyRuleToHostGroupsResponse applyRuleToHostGroups(ApplyRuleToHostGroupsRequest request) throws LogException;

    DeleteRuleFromHostGroupsResponse deleteRuleFromHostGroups(DeleteRuleFromHostGroupsRequest request) throws LogException;

    /**
     * 机器组
     */
    CreateHostGroupResponse createHostGroup(CreateHostGroupRequest request) throws LogException;

    DeleteHostGroupResponse deleteHostGroup(DeleteHostGroupRequest request) throws LogException;

    ModifyHostGroupResponse modifyHostGroup(ModifyHostGroupRequest request) throws LogException;

    DescribeHostGroupResponse describeHostGroup(DescribeHostGroupRequest request) throws LogException;

    DescribeHostGroupsResponse describeHostGroups(DescribeHostGroupsRequest request) throws LogException;

    DescribeHostsResponse describeHosts(DescribeHostsRequest request) throws LogException;

    DeleteHostResponse deleteHost(DeleteHostRequest request) throws LogException;

    DescribeHostGroupRulesResponse describeHostGroupRules(DescribeHostGroupRulesRequest request) throws LogException;

    ModifyHostGroupsAutoUpdateResponse modifyHostGroupsAutoUpdate(ModifyHostGroupsAutoUpdateRequest request) throws LogException;

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

    DescribeDownloadTasksResponse describeDownloadTasks(DescribeDownloadTasksRequest request) throws LogException;

    DescribeDownloadUrlResponse describeDownloadUrl(DescribeDownloadUrlRequest request) throws LogException;

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
}
