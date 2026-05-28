package com.volcengine.model.tls;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.volcengine.model.tls.BackendConfig;
import com.volcengine.model.tls.NoticeRule;
import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.request.ConsumeLogsRequest;
import com.volcengine.model.tls.request.CreateDownloadTaskRequest;
import com.volcengine.model.tls.request.CreateAppInstanceRequest;
import com.volcengine.model.tls.request.CreateAppSceneMetaRequest;
import com.volcengine.model.tls.request.CreateHostGroupRequest;
import com.volcengine.model.tls.request.CreateLogBackFlowTaskRequest;
import com.volcengine.model.tls.request.CreateScheduleSqlTaskRequest;
import com.volcengine.model.tls.request.CreateTraceInstanceRequest;
import com.volcengine.model.tls.request.DeleteAppInstanceRequest;
import com.volcengine.model.tls.request.DeleteAppSceneMetaRequest;
import com.volcengine.model.tls.request.DeleteLogBackFlowTaskRequest;
import com.volcengine.model.tls.request.DeleteScheduleSqlTaskRequest;
import com.volcengine.model.tls.request.DescribeAlarmNotifyGroupsRequest;
import com.volcengine.model.tls.request.DescribeAlarmContentTemplatesRequest;
import com.volcengine.model.tls.request.DescribeAlarmWebhookIntegrationsRequest;
import com.volcengine.model.tls.request.DescribeAlarmsRequest;
import com.volcengine.model.tls.request.DescribeAppInstancesRequest;
import com.volcengine.model.tls.request.DescribeAppSceneMetaRequest;
import com.volcengine.model.tls.request.DescribeAppSceneMetasRequest;
import com.volcengine.model.tls.request.DescribeBoundHostGroupsRequest;
import com.volcengine.model.tls.request.DescribeCursorTimeRequest;
import com.volcengine.model.tls.request.DescribeHostGroupRequestV2;
import com.volcengine.model.tls.request.DescribeHostGroupsRequestV2;
import com.volcengine.model.tls.request.DescribeLogBackFlowTasksRequest;
import com.volcengine.model.tls.request.DescribeRuleRequestV2;
import com.volcengine.model.tls.request.DescribeSessionAnswerRequest;
import com.volcengine.model.tls.request.DescribeTraceInstancesRequest;
import com.volcengine.model.tls.request.ModifyAlarmNotifyGroupRequest;
import com.volcengine.model.tls.request.ModifyAppInstanceRequest;
import com.volcengine.model.tls.request.ModifyAppSceneMetaRequest;
import com.volcengine.model.tls.request.ModifyLogBackFlowTaskRequest;
import com.volcengine.model.tls.request.ModifyTraceInstanceRequest;
import com.volcengine.model.tls.request.PutLogsRequest;
import com.volcengine.model.tls.response.ConsumeLogsResponse;
import com.volcengine.model.tls.response.DescribeConsumerGroupsResponse;
import com.volcengine.model.tls.response.DescribeIndexResponse;
import com.volcengine.model.tls.response.DescribeTopicsResponse;
import com.volcengine.service.tls.TLSLogClient;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Method;

public class ContractSurfaceTest {
    @Test
    public void clientInterfaceIncludesOfficialContractGaps() throws LogException {
        assertOfficialContractGapClientSurface(null);
    }

    private static void assertOfficialContractGapClientSurface(TLSLogClient client) throws LogException {
        if (client == null) {
            return;
        }
        client.createLogBackFlowTask(new CreateLogBackFlowTaskRequest());
        client.deleteLogBackFlowTask(new DeleteLogBackFlowTaskRequest());
        client.describeLogBackFlowTasks(new DescribeLogBackFlowTasksRequest());
        client.modifyLogBackFlowTask(new ModifyLogBackFlowTaskRequest());
        client.describeCursorTime(new DescribeCursorTimeRequest());
        client.describeHostGroupV2(new DescribeHostGroupRequestV2());
        client.describeHostGroupsV2(new DescribeHostGroupsRequestV2());
        client.describeBoundHostGroups(new DescribeBoundHostGroupsRequest());
        client.describeRuleV2(new DescribeRuleRequestV2());
    }

    @Test
    public void officialContractGapRequestsSerializeExpectedKeys() {
        DescribeCursorTimeRequest cursorTime = new DescribeCursorTimeRequest("topic-id", 0, "cursor");
        JSONObject cursorTimeBody = JSON.parseObject(JSON.toJSONString(cursorTime));
        Assert.assertFalse(cursorTimeBody.containsKey("TopicId"));
        Assert.assertFalse(cursorTimeBody.containsKey("ShardId"));
        Assert.assertFalse(cursorTimeBody.containsKey("Cursor"));

        CreateLogBackFlowTaskRequest create = new CreateLogBackFlowTaskRequest();
        create.setTaskName("task");
        create.setLogBackFlowTaskSource(new LogBackFlowTaskSource());
        create.setQueryParams(new LogBackFlowQueryParams());
        JSONObject createBody = JSON.parseObject(JSON.toJSONString(create));
        Assert.assertTrue(createBody.containsKey("TaskName"));
        Assert.assertTrue(createBody.containsKey("LogBackFlowTaskSource"));
        Assert.assertTrue(createBody.containsKey("QueryParams"));

        DescribeLogBackFlowTasksRequest describe = new DescribeLogBackFlowTasksRequest();
        describe.setTopicIDList(java.util.Arrays.asList("topic-a", "topic-b"));
        Assert.assertEquals(2, describe.getTopicIDList().size());
    }

    @Test
    public void newlyAddedClientMethodsRemainSourceCompatibleDefaults() throws Exception {
        assertDefaultMethod("setHttpClientConnectionManager", org.apache.http.conn.HttpClientConnectionManager.class, boolean.class);
        assertDefaultMethod("setCustomHeaders", java.util.Map.class);
        assertDefaultMethod("addCustomHeader", String.class, String.class);
        assertDefaultMethod("getCustomHeaders");
        assertDefaultMethod("describeCursorTime", DescribeCursorTimeRequest.class);
        assertDefaultMethod("describeRuleV2", DescribeRuleRequestV2.class);
        assertDefaultMethod("describeBoundHostGroups", DescribeBoundHostGroupsRequest.class);
        assertDefaultMethod("describeHostGroupV2", DescribeHostGroupRequestV2.class);
        assertDefaultMethod("describeHostGroupsV2", DescribeHostGroupsRequestV2.class);
        assertDefaultMethod("createLogBackFlowTask", CreateLogBackFlowTaskRequest.class);
        assertDefaultMethod("deleteLogBackFlowTask", DeleteLogBackFlowTaskRequest.class);
        assertDefaultMethod("describeLogBackFlowTasks", DescribeLogBackFlowTasksRequest.class);
        assertDefaultMethod("modifyLogBackFlowTask", ModifyLogBackFlowTaskRequest.class);
        assertDefaultMethod("createAppInstance", CreateAppInstanceRequest.class);
        assertDefaultMethod("modifyAppInstance", ModifyAppInstanceRequest.class);
        assertDefaultMethod("deleteAppInstance", DeleteAppInstanceRequest.class);
        assertDefaultMethod("describeAppInstances", DescribeAppInstancesRequest.class);
        assertDefaultMethod("createAppSceneMeta", CreateAppSceneMetaRequest.class);
        assertDefaultMethod("modifyAppSceneMeta", ModifyAppSceneMetaRequest.class);
        assertDefaultMethod("deleteAppSceneMeta", DeleteAppSceneMetaRequest.class);
        assertDefaultMethod("describeAppSceneMetas", DescribeAppSceneMetasRequest.class);
        assertDefaultMethod("describeAppSceneMeta", DescribeAppSceneMetaRequest.class);
        assertDefaultMethod("describeSessionAnswer", DescribeSessionAnswerRequest.class);
    }

    private static void assertDefaultMethod(String methodName, Class<?>... parameterTypes) throws Exception {
        Method method = TLSLogClient.class.getMethod(methodName, parameterTypes);
        Assert.assertTrue(methodName + " must be a default method to avoid breaking external TLSLogClient implementations",
                method.isDefault());
    }

    @Test
    public void goBaselineRequestFieldsAreAvailable() {
        ConsumeLogsRequest consume = new ConsumeLogsRequest();
        consume.setOriginal(true);
        Assert.assertTrue(consume.getOriginal());
        Assert.assertTrue(consume.isOrigin());
        try {
            Assert.assertEquals(Boolean.TRUE, ConsumeLogsRequest.class.getMethod("getOrigin").invoke(consume));
        } catch (NoSuchMethodException e) {
            Assert.fail("ConsumeLogsRequest.getOrigin() must remain available for binary/source compatibility");
        } catch (ReflectiveOperationException e) {
            throw new AssertionError(e);
        }

        CreateDownloadTaskRequest download = new CreateDownloadTaskRequest();
        download.setMustComplete(true);
        JSONObject downloadBody = JSON.parseObject(JSON.toJSONString(download));
        Assert.assertTrue(downloadBody.containsKey("MustComplete"));

        CreateScheduleSqlTaskRequest schedule = new CreateScheduleSqlTaskRequest();
        schedule.setTopicId("topic");
        schedule.setTaskType(0);
        JSONObject scheduleBody = JSON.parseObject(JSON.toJSONString(schedule));
        Assert.assertEquals("topic", scheduleBody.getString("TopicID"));
        Assert.assertFalse(scheduleBody.containsKey("TopicId"));
        Assert.assertEquals(Integer.valueOf(0), scheduleBody.getInteger("TaskType"));

        DescribeAlarmNotifyGroupsRequest notifyGroups = new DescribeAlarmNotifyGroupsRequest();
        notifyGroups.setGroupName("group");
        notifyGroups.setNotifyGroupID("notify");
        notifyGroups.setUserName("user");
        Assert.assertEquals("group", notifyGroups.getGroupName());
        Assert.assertEquals("notify", notifyGroups.getNotifyGroupID());
        Assert.assertEquals("user", notifyGroups.getUserName());

        DescribeAlarmContentTemplatesRequest templates = new DescribeAlarmContentTemplatesRequest();
        templates.setOrderField("CreateTime");
        templates.setASC(true);
        Assert.assertEquals("CreateTime", templates.getOrderField());
        Assert.assertTrue(templates.getASC());

        DescribeAlarmsRequest alarms = new DescribeAlarmsRequest();
        alarms.setProjectName("project-name");
        alarms.setAlarmPolicyID("alarm");
        alarms.setAlarmDisabled(false);
        alarms.setSeverity("warning");
        alarms.setIamProjectName("default");
        Assert.assertEquals("project-name", alarms.getProjectName());
        Assert.assertEquals("alarm", alarms.getAlarmPolicyID());
        Assert.assertFalse(alarms.getAlarmDisabled());
        Assert.assertEquals("warning", alarms.getSeverity());
        Assert.assertEquals("default", alarms.getIamProjectName());

        DescribeAppSceneMetaRequest appMeta = new DescribeAppSceneMetaRequest();
        appMeta.setName("name");
        appMeta.setAPPMetaType("type");
        Assert.assertEquals("name", appMeta.getName());
        Assert.assertEquals("type", appMeta.getAPPMetaType());

        PutLogsRequest putLogs = new PutLogsRequest();
        putLogs.setEnableNanosecond(true);
        Assert.assertTrue(putLogs.getEnableNanosecond());

        CreateHostGroupRequest hostGroup = new CreateHostGroupRequest();
        hostGroup.setIamProjectName("default");
        hostGroup.setServiceLogging(true);
        Assert.assertEquals("default", hostGroup.getIamProjectName());
        Assert.assertTrue(hostGroup.getServiceLogging());

        BackendConfig backendConfig = new BackendConfig();
        CreateTraceInstanceRequest createTrace = new CreateTraceInstanceRequest();
        createTrace.setBackendConfig(backendConfig);
        Assert.assertSame(backendConfig, createTrace.getBackendConfig());

        ModifyTraceInstanceRequest modifyTrace = new ModifyTraceInstanceRequest();
        modifyTrace.setBackendConfig(backendConfig);
        Assert.assertSame(backendConfig, modifyTrace.getBackendConfig());

        DeleteScheduleSqlTaskRequest deleteSchedule = new DeleteScheduleSqlTaskRequest();
        deleteSchedule.setTaskId("task");
        Assert.assertEquals("task", deleteSchedule.getTaskId());

        DescribeAlarmWebhookIntegrationsRequest webhooks = new DescribeAlarmWebhookIntegrationsRequest();
        webhooks.setWebhookID("webhook");
        Assert.assertEquals("webhook", webhooks.getWebhookID());

        DescribeAppSceneMetasRequest appMetas = new DescribeAppSceneMetasRequest();
        appMetas.setDescribeAPPMetaType("type");
        Assert.assertEquals("type", appMetas.getDescribeAPPMetaType());

        DescribeSessionAnswerRequest sessionAnswer = new DescribeSessionAnswerRequest();
        sessionAnswer.setAccept("text/event-stream");
        Assert.assertEquals("text/event-stream", sessionAnswer.getAccept());

        DescribeTraceInstancesRequest traceInstances = new DescribeTraceInstancesRequest();
        traceInstances.setCsAccountChannel("cs");
        Assert.assertEquals("cs", traceInstances.getCsAccountChannel());

        ModifyAlarmNotifyGroupRequest modifyNotify = new ModifyAlarmNotifyGroupRequest();
        modifyNotify.setNoticeRules(java.util.Collections.<NoticeRule>emptyList());
        Assert.assertTrue(modifyNotify.getNoticeRules().isEmpty());
    }

    @Test
    public void goBaselineResponseFieldsAreAvailable() {
        ConsumeLogsResponse consume = new ConsumeLogsResponse();
        consume.setXTlsCursor("cursor");
        consume.setXTlsCount(3);
        Assert.assertEquals("cursor", consume.getCursor());
        Assert.assertEquals(3, consume.getCount());
        Assert.assertSame(consume.getLogGroupList(), consume.getLogs());

        DescribeIndexResponse index = new DescribeIndexResponse();
        index.setEnableAutoIndex(true);
        index.setMaxTextLen(2048);
        index.setUserInnerKeyValue(java.util.Collections.<KeyValueInfo>emptyList());
        Assert.assertTrue(index.getEnableAutoIndex());
        Assert.assertEquals(Integer.valueOf(2048), index.getMaxTextLen());
        Assert.assertTrue(index.getUserInnerKeyValue().isEmpty());

        DescribeConsumerGroupsResponse groups = new DescribeConsumerGroupsResponse();
        groups.setDashboardId("dashboard");
        Assert.assertEquals("dashboard", groups.getDashboardId());

        DescribeTopicsResponse topics = new DescribeTopicsResponse();
        topics.setTopic(java.util.Collections.<TopicInfo>emptyList());
        Assert.assertSame(topics.getTopic(), topics.getTopics());
    }
}
