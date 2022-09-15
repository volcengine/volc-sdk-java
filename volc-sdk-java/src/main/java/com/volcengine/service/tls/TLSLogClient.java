package com.volcengine.service.tls;

import com.volcengine.model.tls.ClientConfig;
import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.request.DescribeAlarmsRequest;
import com.volcengine.model.tls.DescribeRulesRequest;
import com.volcengine.model.tls.request.*;
import com.volcengine.model.tls.response.*;

public interface TLSLogClient {
    /**
     * client配置，key和超时
     */
    void configClient(ClientConfig config);

    void resetAccessKeyToken(String accessKeyID, String accessKeySecret, String securityToken);

    void setTimeout(int socketTimeout,int connectionTimeout);

    /**
     * 日志写入、读取
     * @param request
     */
    PutLogsResponse putLogs(PutLogsRequest request) throws LogException;

    DescribeCursorResponse describeCursor(DescribeCursorRequest request) throws LogException;

    ConsumeLogsResponse consumeLogs(ConsumeLogsRequest request) throws LogException;

    SearchLogsResponse searchLogs(SearchLogsRequest request) throws LogException;

    DescribeShardsResponse describeShards(DescribeShardsRequest request) throws LogException;

    /**
     * project
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
}
